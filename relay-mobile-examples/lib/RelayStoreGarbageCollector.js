/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayStoreGarbageCollector
 * 
 * @typechecks
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var GraphQLStoreDataHandler = require('./GraphQLStoreDataHandler');
var RelayBufferedNeglectionStateMap = require('./RelayBufferedNeglectionStateMap');

var RelayNeglectionStateMap = require('./RelayNeglectionStateMap');

var RelayProfiler = require('./RelayProfiler');

var RelayTaskScheduler = require('./RelayTaskScheduler');

var forEachObject = require('fbjs/lib/forEachObject');
var resolveImmediate = require('fbjs/lib/resolveImmediate');

var RANGE = '__range__';

/**
 * @internal
 *
 * Provides a garbage collector.
 */

var RelayStoreGarbageCollector = (function () {
  function RelayStoreGarbageCollector(relayStoreData) {
    _classCallCheck(this, RelayStoreGarbageCollector);

    this._directNeglectionStates = new RelayNeglectionStateMap();
    this._bufferedNeglectionStates = new RelayBufferedNeglectionStateMap(this._directNeglectionStates);
    this._neglectionStates = this._bufferedNeglectionStates;
    this._relayStoreData = relayStoreData;

    this._cycles = 0;
  }

  /**
   * Checks if the given object is a linked record with a client-site DataID
   */

  /**
   * Removes all data for registered dataIDs that are set to collectible and
   * have no subscriptions
   */

  RelayStoreGarbageCollector.prototype.scheduleCollection = function scheduleCollection(stepLength) {
    var _this = this;

    this._bufferedNeglectionStates.flushBuffer();
    var iterator = this._neglectionStates.values();
    var currentCycle = ++this._cycles;
    // During garbage collection we don't want to buffer any changes.
    this._neglectionStates = this._directNeglectionStates;
    RelayTaskScheduler.await(function () {
      return _this._collectGarbageStep(currentCycle, iterator, iterator.next(), stepLength);
    });
  };

  /**
   * Removes registered DataIDs that are eligible for removal in steps of length
   * `stepLength`, starting with the record referenced by the `NeglectionState`
   * in `offset`.
   *
   * `_collectGarbageInSteps` will invoke itself using `RelayTaskScheduler`
   * until all registered DataIDs have been processed (either removed or flagged
   * as collectible). If `collect` is invoked before a run of
   * `_collectGarbageInSteps` has recursively processed all DataIDs the
   * remaining DataIDs will only be marked as collectible and no attempt to
   * remove these DataID will be done.
   */

  RelayStoreGarbageCollector.prototype._collectGarbageStep = function _collectGarbageStep(currentCycle, remainingDataIDs, offset, stepLength) {
    var _this2 = this;

    var iterator = offset;
    var neglectionState;
    // Check if the current collection cycle is still the most recent one. If
    // there was a subsequent call to `collect` we mark all not yet processed
    // DataIDs as collectible.
    if (currentCycle !== this._cycles) {
      for (iterator = offset; !iterator.done; iterator = remainingDataIDs.next()) {
        var _iterator = iterator;
        neglectionState = _iterator.value;

        if (neglectionState) {
          neglectionState.collectible = true;
        }
      }
      return;
    }

    // Iterate over registered DataIDs until `_stepLength` records were seen or
    // all registered records were processed.
    iterator = offset;
    var profileState = {
      count: -1,
      stepLength: stepLength
    };
    var profile = RelayProfiler.profile('RelayStoreGarbageCollector.collect', profileState);
    var recordsBefore = this._neglectionStates.size();
    var seenRecords = 0;
    for (iterator = offset; !iterator.done && (stepLength == null || seenRecords < stepLength); iterator = remainingDataIDs.next()) {
      var _iterator2 = iterator;
      neglectionState = _iterator2.value;

      if (neglectionState) {
        if (this._isCollectible(neglectionState)) {
          seenRecords += this._removeRecordAndDescendentClientRecords(neglectionState.dataID);
        } else {
          seenRecords++;
        }
        neglectionState.collectible = true;
      }
    }
    var recordsAfter = this._neglectionStates.size();
    profileState.count = recordsBefore - recordsAfter;
    profile.stop();

    // Schedule next run if there are records left that have not been processed.
    if (!iterator.done) {
      resolveImmediate(function () {
        return RelayTaskScheduler.await(function () {
          return _this2._collectGarbageStep(currentCycle, remainingDataIDs, iterator, stepLength);
        });
      });
    } else {
      this._neglectionStates = this._bufferedNeglectionStates;
    }
  };

  /**
   * Decreases the number of subscriptions for the given dataID by 1
   */

  RelayStoreGarbageCollector.prototype.decreaseSubscriptionsFor = function decreaseSubscriptionsFor(dataID) {
    this._neglectionStates.decreaseSubscriptionsFor(dataID);
  };

  /**
   * Increases the number of subscriptions for the given dataID by 1. If the
   * dataID is not yet registered it will be registered.
   */

  RelayStoreGarbageCollector.prototype.increaseSubscriptionsFor = function increaseSubscriptionsFor(dataID) {
    this._neglectionStates.increaseSubscriptionsFor(dataID);
  };

  /**
   * Makes the Garbage Collector aware of dataID and make it its responsibility
   * to clean the data if possible.
   */

  RelayStoreGarbageCollector.prototype.register = function register(dataID) {
    this._neglectionStates.register(dataID);
  };

  /**
   * Checks if a record can be garbage collected based on its neglection state.
   *
   * A record is collectible if the collectible flag is set to true and there
   * are no active subscriptions to the record. Due to current limitations we
   * are further limited to only collecting records that are refetchable. (I.e.
   * have a server ID or are a range of records.)
   */

  RelayStoreGarbageCollector.prototype._isCollectible = function _isCollectible(neglectionState) {
    var isEligibleForCollection = neglectionState.collectible && !neglectionState.subscriptions;
    var queuedStore = this._relayStoreData.getQueuedStore();

    return isEligibleForCollection && (!GraphQLStoreDataHandler.isClientID(neglectionState.dataID) || queuedStore.hasRange(neglectionState.dataID));
  };

  /**
   * Removes the record identified by the given DataID and any descendent
   * records that have client-site DataIDs.
   */

  RelayStoreGarbageCollector.prototype._removeRecordAndDescendentClientRecords = function _removeRecordAndDescendentClientRecords(dataID) {
    var records = this._relayStoreData.getNodeData();
    var queuedRecords = this._relayStoreData.getQueuedData();
    var cachedRecords = this._relayStoreData.getCachedData();

    var removalStatusMap = {};
    removalStatusMap[dataID] = 'pending';
    var removedRecords = 0;

    // Since the descendant records in the different stores might differ we
    // extract the client-site DataIDs for the record out of all stores.
    var remainingRecords = [records[dataID], queuedRecords[dataID], cachedRecords[dataID]];

    // If `field` contains a linked record and the linked record has a
    // client-site DataID the record will be added to `remainingRecords` and
    // it's DataID will be set to `true` in `removalStatusMap`.
    function enqueueField(field) {
      var dataID = getClientIDFromLinkedRecord(field);
      // If we have a dataID we haven't seen before we add it to the remaining
      // records
      if (dataID && !removalStatusMap[dataID]) {
        removalStatusMap[dataID] = 'pending';
        remainingRecords.push(records[dataID], queuedRecords[dataID], cachedRecords[dataID]);
      }
    }

    while (remainingRecords.length) {
      var currentRecord = remainingRecords.shift();
      if (currentRecord && typeof currentRecord === 'object') {
        // Special handling for `GraphQLRange` data, which isn't stored like
        // other node data.
        var range = currentRecord[RANGE];
        if (range) {
          // Wrapping each dataID in a object that resembles an record so
          // `enqueueField` can handle it.
          range.getEdgeIDs().forEach(function (id) {
            return enqueueField({ __dataID__: id });
          });
        } else {
          // Walk all fields of the record, skipping meta-fields and adding any
          // linked records with a client-site DataID to `remainingRecords`.
          forEachObject(currentRecord, function (field, fieldName) {
            if (GraphQLStoreDataHandler.isMetadataKey(fieldName)) {
              return;
            }

            // Handling plural linked fields
            if (Array.isArray(field)) {
              field.forEach(enqueueField);
            } else {
              enqueueField(field);
            }
          });
        }

        var currentDataID = GraphQLStoreDataHandler.getID(currentRecord);
        if (currentDataID && removalStatusMap[currentDataID] === 'pending') {
          this._removeRecord(currentRecord);
          removalStatusMap[currentDataID] = 'removed';
          removedRecords++;
        }
      }
    }
    return removedRecords;
  };

  /**
   * Removes the records identified by `dataID` from the queued-store, the
   * query-tracker, and the garbage-collector itself.
   */

  RelayStoreGarbageCollector.prototype._removeRecord = function _removeRecord(record) {
    var dataID = record.__dataID__;
    this._relayStoreData.getQueryTracker().untrackNodesForID(dataID);
    this._relayStoreData.getQueuedStore().removeRecord(dataID);
    this._neglectionStates.remove(dataID);
  };

  return RelayStoreGarbageCollector;
})();

function getClientIDFromLinkedRecord(field) {
  if (!field || typeof field !== 'object') {
    return null;
  }

  // Downcast to `any`-type since it can be upcasted to any other type.
  // We checked field is an object before and can be sure this cast is safe.
  var dataID = GraphQLStoreDataHandler.getID(field);
  if (dataID && GraphQLStoreDataHandler.isClientID(dataID)) {
    return dataID;
  }
  return null;
}

RelayProfiler.instrumentMethods(RelayStoreGarbageCollector.prototype, {
  decreaseSubscriptionsFor: 'RelayStoreGarbageCollector.prototype.decreaseSubscriptionsFor',
  increaseSubscriptionsFor: 'RelayStoreGarbageCollector.prototype.increaseSubscriptionsFor',
  register: 'RelayStoreGarbageCollector.prototype.register'
});

module.exports = RelayStoreGarbageCollector;