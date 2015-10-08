/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayStoreData
 * 
 * @typechecks
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _Object$keys = require('babel-runtime/core-js/object/keys')['default'];

var GraphQLStoreChangeEmitter = require('./GraphQLStoreChangeEmitter');
var GraphQLStoreDataHandler = require('./GraphQLStoreDataHandler');
var RelayChangeTracker = require('./RelayChangeTracker');
var RelayConnectionInterface = require('./RelayConnectionInterface');

var RelayNodeInterface = require('./RelayNodeInterface');
var RelayProfiler = require('./RelayProfiler');
var RelayQuery = require('./RelayQuery');
var RelayQueryTracker = require('./RelayQueryTracker');
var RelayQueryWriter = require('./RelayQueryWriter');
var RelayRecordStore = require('./RelayRecordStore');

var RelayStoreGarbageCollector = require('./RelayStoreGarbageCollector');

var forEachObject = require('fbjs/lib/forEachObject');
var invariant = require('fbjs/lib/invariant');
var generateForceIndex = require('./generateForceIndex');
var refragmentRelayQuery = require('./refragmentRelayQuery');
var resolveImmediate = require('fbjs/lib/resolveImmediate');
var warning = require('fbjs/lib/warning');
var writeRelayQueryPayload = require('./writeRelayQueryPayload');
var writeRelayUpdatePayload = require('./writeRelayUpdatePayload');

var CLIENT_MUTATION_ID = RelayConnectionInterface.CLIENT_MUTATION_ID;

// The source of truth for application data.
var _instance;

/**
 * @internal
 *
 * Wraps the data caches and associated metadata tracking objects used by
 * GraphQLStore/RelayStore.
 */

var RelayStoreData = (function () {

  /**
   * Get the data set backing actual Relay operations. Used in GraphQLStore.
   */

  RelayStoreData.getDefaultInstance = function getDefaultInstance() {
    if (!_instance) {
      _instance = new RelayStoreData();
    }
    return _instance;
  };

  function RelayStoreData() {
    _classCallCheck(this, RelayStoreData);

    var cachedRecords = {};
    var cachedRootCallMap = {};
    var queuedRecords = {};
    var records = {};
    var rootCallMap = {};
    var nodeRangeMap = {};

    this._cacheManager = null;
    this._cachePopulated = true;
    this._cachedRecords = cachedRecords;
    this._cachedRootCalls = cachedRootCallMap;
    this._nodeRangeMap = nodeRangeMap;
    this._records = records;
    this._queuedRecords = queuedRecords;
    this._queuedStore = new RelayRecordStore({ cachedRecords: cachedRecords, queuedRecords: queuedRecords, records: records }, { cachedRootCallMap: cachedRootCallMap, rootCallMap: rootCallMap }, nodeRangeMap);
    this._recordStore = new RelayRecordStore({ records: records }, { rootCallMap: rootCallMap }, nodeRangeMap);
    this._queryTracker = new RelayQueryTracker();
    this._rootCalls = rootCallMap;
  }

  /**
   * Creates a garbage collector for this instance. After initialization all
   * newly added DataIDs will be registered in the created garbage collector.
   * This will show a warning if data has already been added to the instance.
   */

  RelayStoreData.prototype.initializeGarbageCollector = function initializeGarbageCollector() {
    !!this._garbageCollector ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayStoreData: Garbage collector is already initialized.') : invariant(false) : undefined;
    var shouldInitialize = this._isStoreDataEmpty();
    process.env.NODE_ENV !== 'production' ? warning(shouldInitialize, 'RelayStoreData: Garbage collection can only be initialized when no ' + 'data is present.') : undefined;
    if (shouldInitialize) {
      this._garbageCollector = new RelayStoreGarbageCollector(this);
    }
  };

  /**
   * Sets/clears the cache manager that is used to cache changes written to
   * the store.
   */

  RelayStoreData.prototype.injectCacheManager = function injectCacheManager(cacheManager) {
    var cachedRecords = this._cachedRecords;
    var cachedRootCallMap = this._cachedRootCalls;
    var rootCallMap = this._rootCalls;
    var queuedRecords = this._queuedRecords;
    var records = this._records;

    this._cacheManager = cacheManager;
    this._cachePopulated = false;
    this._queuedStore = new RelayRecordStore({ cachedRecords: cachedRecords, queuedRecords: queuedRecords, records: records }, { cachedRootCallMap: cachedRootCallMap, rootCallMap: rootCallMap }, this._nodeRangeMap, cacheManager);
    this._recordStore = new RelayRecordStore({ records: records }, { rootCallMap: rootCallMap }, this._nodeRangeMap, cacheManager);
  };

  /**
   * Runs the callback after all data has been read out from diskc cache into
   * cachedRecords
   */

  RelayStoreData.prototype.runWithDiskCache = function runWithDiskCache(callback) {
    var _this = this;

    if (this._cachePopulated || !this._cacheManager) {
      resolveImmediate(callback);
    } else {
      this._cacheManager.readAllData(this._cachedRecords, this._cachedRootCalls, function () {
        _this._cachePopulated = true;
        callback();
      });
    }
  };

  /**
   * Write the results of a query into the base record store.
   */

  RelayStoreData.prototype.handleQueryPayload = function handleQueryPayload(query, response, forceIndex) {
    var changeTracker = new RelayChangeTracker();
    var writer = new RelayQueryWriter(this._recordStore, this._queryTracker, changeTracker, {
      forceIndex: forceIndex,
      updateTrackedQueries: true
    });
    writeRelayQueryPayload(writer, query, response);
    this._handleChangedAndNewDataIDs(changeTracker.getChangeSet());
  };

  /**
   * Write the results of an update into the base record store.
   */

  RelayStoreData.prototype.handleUpdatePayload = function handleUpdatePayload(operation, payload, _ref) {
    var configs = _ref.configs;
    var isOptimisticUpdate = _ref.isOptimisticUpdate;

    var changeTracker = new RelayChangeTracker();
    var store;
    if (isOptimisticUpdate) {
      var clientMutationID = payload[CLIENT_MUTATION_ID];
      !(typeof clientMutationID === 'string') ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayStoreData.handleUpdatePayload(): Expected optimistic payload ' + 'to have a valid `%s`.', CLIENT_MUTATION_ID) : invariant(false) : undefined;
      store = this.getRecordStoreForOptimisticMutation(clientMutationID);
    } else {
      store = this._recordStore;
    }
    var writer = new RelayQueryWriter(store, this._queryTracker, changeTracker, {
      forceIndex: generateForceIndex(),
      updateTrackedQueries: false
    });
    writeRelayUpdatePayload(writer, operation, payload, { configs: configs, isOptimisticUpdate: isOptimisticUpdate });
    this._handleChangedAndNewDataIDs(changeTracker.getChangeSet());
  };

  /**
   * Given a query fragment and a data ID, returns a root query that applies
   * the fragment to the object specified by the data ID.
   */

  RelayStoreData.prototype.buildFragmentQueryForDataID = function buildFragmentQueryForDataID(fragment, dataID) {
    if (GraphQLStoreDataHandler.isClientID(dataID)) {
      var path = this._queuedStore.getPathToRecord(dataID);
      !path ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayStoreData.buildFragmentQueryForDataID(): Cannot refetch ' + 'record `%s` without a path.', dataID) : invariant(false) : undefined;
      var query = refragmentRelayQuery(path.getQuery(fragment));
      !query ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayStoreData.buildFragmentQueryForDataID(): Expected a query for ' + 'record `%s`.', dataID) : invariant(false) : undefined;
      return query;
    }
    // Fragment fields cannot be spread directly into the root because they
    // may not exist on the `Node` type.
    return RelayQuery.Node.buildRoot(RelayNodeInterface.NODE, dataID, [fragment], { rootArg: RelayNodeInterface.ID }, fragment.getDebugName() || 'UnknownQuery');
  };

  RelayStoreData.prototype.getNodeData = function getNodeData() {
    return this._records;
  };

  RelayStoreData.prototype.getQueuedData = function getQueuedData() {
    return this._queuedRecords;
  };

  RelayStoreData.prototype.clearQueuedData = function clearQueuedData() {
    var _this2 = this;

    forEachObject(this._queuedRecords, function (_, key) {
      delete _this2._queuedRecords[key];
      GraphQLStoreChangeEmitter.broadcastChangeForID(key);
    });
  };

  RelayStoreData.prototype.getCachedData = function getCachedData() {
    return this._cachedRecords;
  };

  RelayStoreData.prototype.getGarbageCollector = function getGarbageCollector() {
    return this._garbageCollector;
  };

  /**
   * Get the record store with full data (cached, base, queued).
   */

  RelayStoreData.prototype.getQueuedStore = function getQueuedStore() {
    return this._queuedStore;
  };

  /**
   * Get the record store with only the base data (no queued/cached data).
   */

  RelayStoreData.prototype.getRecordStore = function getRecordStore() {
    return this._recordStore;
  };

  RelayStoreData.prototype.getQueryTracker = function getQueryTracker() {
    return this._queryTracker;
  };

  /**
   * @deprecated
   *
   * Used temporarily by GraphQLStore, but all updates to this object are now
   * handled through a `RelayRecordStore` instance.
   */

  RelayStoreData.prototype.getRootCallData = function getRootCallData() {
    return this._rootCalls;
  };

  RelayStoreData.prototype._isStoreDataEmpty = function _isStoreDataEmpty() {
    return _Object$keys(this._records).length === 0 && _Object$keys(this._queuedRecords).length === 0 && _Object$keys(this._cachedRecords).length === 0;
  };

  /**
   * Given a ChangeSet, broadcasts changes for updated DataIDs
   * and registers new DataIDs with the garbage collector.
   */

  RelayStoreData.prototype._handleChangedAndNewDataIDs = function _handleChangedAndNewDataIDs(changeSet) {
    var updatedDataIDs = _Object$keys(changeSet.updated);
    updatedDataIDs.forEach(GraphQLStoreChangeEmitter.broadcastChangeForID);
    if (this._garbageCollector) {
      var createdDataIDs = _Object$keys(changeSet.created);
      var garbageCollector = this._garbageCollector;
      createdDataIDs.forEach(function (dataID) {
        return garbageCollector.register(dataID);
      });
    }
  };

  RelayStoreData.prototype.getRecordStoreForOptimisticMutation = function getRecordStoreForOptimisticMutation(clientMutationID) {
    var cachedRecords = this._cachedRecords;
    var cachedRootCallMap = this._cachedRootCalls;
    var rootCallMap = this._rootCalls;
    var queuedRecords = this._queuedRecords;
    var records = this._records;

    return new RelayRecordStore({ cachedRecords: cachedRecords, queuedRecords: queuedRecords, records: records }, { cachedRootCallMap: cachedRootCallMap, rootCallMap: rootCallMap }, this._nodeRangeMap, this._cacheManager, clientMutationID);
  };

  return RelayStoreData;
})();

RelayProfiler.instrumentMethods(RelayStoreData.prototype, {
  handleQueryPayload: 'RelayStoreData.prototype.handleQueryPayload'
});

module.exports = RelayStoreData;