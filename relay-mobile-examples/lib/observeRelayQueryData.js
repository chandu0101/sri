/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule observeRelayQueryData
 * @typechecks
 * 
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _slicedToArray = require('babel-runtime/helpers/sliced-to-array')['default'];

var _Object$keys = require('babel-runtime/core-js/object/keys')['default'];

var GraphQLStoreChangeEmitter = require('./GraphQLStoreChangeEmitter');
var RelayError = require('./RelayError');

var RelayStoreData = require('./RelayStoreData');

var emptyFunction = require('fbjs/lib/emptyFunction');
var filterExclusiveKeys = require('./filterExclusiveKeys');
var invariant = require('fbjs/lib/invariant');
var readRelayQueryData = require('./readRelayQueryData');

/**
 * @internal
 */
function observeRelayQueryData(store, queryNode, dataID, options) {
  return new RelayQueryDataObservable(readRelayQueryData.bind(null, store, queryNode, dataID, options), dataID);
}

var RelayQueryDataObservable = (function () {
  function RelayQueryDataObservable(readQueryData, dataID) {
    _classCallCheck(this, RelayQueryDataObservable);

    this._activeSubscriptions = 0;
    this._changeListener = null;
    this._data = null;
    this._dataID = dataID;
    this._lastError = null;
    this._observedDataIDs = {};
    this._readQueryData = readQueryData;
    this._subscriptions = [];

    this._handleChange = this._handleChange.bind(this);
    this._handleData = this._handleData.bind(this);
    this._handleError = this._handleError.bind(this);

    this._garbageCollector = RelayStoreData.getDefaultInstance().getGarbageCollector();
  }

  RelayQueryDataObservable.prototype.subscribe = function subscribe(callbacks) {
    var _this = this;

    // We only ever start watching for data once the first subscriber is
    // registered
    if (!this._subscriptions.length) {
      this._watchQueryData();
    }

    // An error occured earlier, we immediately inform the new subscriber
    // and return a function that does nothing
    if (this._lastError) {
      callbacks.onError(this._lastError);
      return {
        dispose: emptyFunction
      };
    }

    var index = this._subscriptions.length;
    var isDisposed = false;
    this._subscriptions.push(callbacks);
    callbacks.onNext(this._data);
    this._activeSubscriptions++;

    return {
      dispose: function dispose() {
        !!isDisposed ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayObserver.dispose(): Subscription was already disposed.') : invariant(false) : undefined;

        _this._subscriptions[index] = null;
        _this._activeSubscriptions--;
        isDisposed = true;
        // If this is the last subscription we stop watching for new data and
        // forget the data we have.
        if (!_this._activeSubscriptions) {
          _this._unregisterChangeListener();
          _this._data = null;
          _this._subscriptions = [];
          // Decrease count for all dataIDs observed by this observable
          _this._updateGarbageCollectorSubscriptionCount({});
          // No longer observing any dataIDs
          _this._observedDataIDs = {};
        }
      }
    };
  };

  /**
   * Invoked when the registered change listener is notified, if first reads new
   * data from the store and registered eventual new change listeners than
   * notifies any subscribers.
   * @callback
   */

  RelayQueryDataObservable.prototype._handleChange = function _handleChange() {
    // Run _watchQueryData to react to any subtree changes, this will
    // also update the value of `this._data`
    this._watchQueryData();
    this._subscriptions.forEach(this._lastError ? this._handleError : this._handleData);
  };

  /**
   * Calls `onNext` on all subscribers with new data
   */

  RelayQueryDataObservable.prototype._handleData = function _handleData(subscriber) {
    subscriber && subscriber.onNext(this._data);
  };

  /**
    * Calls `onError` on all subscribers informing them that the observed data
    * is gone from the store.
    */

  RelayQueryDataObservable.prototype._handleError = function _handleError(subscriber) {
    subscriber && this._lastError && subscriber.onError(this._lastError);
  };

  /**
   * Registers a change listener for a set of data ids. A previous listener will
   * be unregistered.
   */

  RelayQueryDataObservable.prototype._registerChangeListener = function _registerChangeListener(dataIDs) {
    this._unregisterChangeListener();

    if (dataIDs.length) {
      this._changeListener = GraphQLStoreChangeEmitter.addListenerForIDs(dataIDs, this._handleChange);
    }
  };

  /**
   * Unregisters the current change listener.
   */

  RelayQueryDataObservable.prototype._unregisterChangeListener = function _unregisterChangeListener() {
    if (this._changeListener) {
      this._changeListener.remove();
      this._changeListener = null;
    }
  };

  /**
   * Reads data from the store and registers a change listener for all the data
   * ids that are in the subtree below the root data.
   */

  RelayQueryDataObservable.prototype._watchQueryData = function _watchQueryData() {
    var _readQueryData = this._readQueryData();

    var data = _readQueryData.data;
    var dataIDs = _readQueryData.dataIDs;

    if (data === undefined) {
      this._lastError = RelayError.create('RelayObserverError', this._changeListener !== null ? 'Record `%s` was purged from the store.' : 'Record `%s` has not been fetched.', this._dataID);

      // Stop watching for data once an error occured, the store is in an
      // invalid state and it is not guaranteed it will ever recover
      this._unregisterChangeListener();
      // Decrease count for all dataIDs observed by this observable
      this._updateGarbageCollectorSubscriptionCount({});
      // No longer observing any dataIDs
      this._observedDataIDs = {};
      return;
    }

    this._data = data;
    this._registerChangeListener(_Object$keys(dataIDs));
    this._updateGarbageCollectorSubscriptionCount(dataIDs);
    // Only observing dataIDs returned by `readQueryData`
    this._observedDataIDs = dataIDs;
  };

  /**
   * Calculates the added and removed dataIDs between `nextDataIDs` and
   * `this._currentDataIDs`.
   * For all added DataIDs the subscription-count in the garbage collector will
   * be increased, for each removed DataID the count will be decreased.
   */

  RelayQueryDataObservable.prototype._updateGarbageCollectorSubscriptionCount = function _updateGarbageCollectorSubscriptionCount(nextDataIDs) {
    if (this._garbageCollector) {
      var garbageCollector = this._garbageCollector;

      var prevDataIDs = this._observedDataIDs;

      var _filterExclusiveKeys = filterExclusiveKeys(prevDataIDs, nextDataIDs);

      var _filterExclusiveKeys2 = _slicedToArray(_filterExclusiveKeys, 2);

      var removed = _filterExclusiveKeys2[0];
      var added = _filterExclusiveKeys2[1];

      added.forEach(function (id) {
        return garbageCollector.increaseSubscriptionsFor(id);
      });
      removed.forEach(function (id) {
        return garbageCollector.decreaseSubscriptionsFor(id);
      });
    }
  };

  return RelayQueryDataObservable;
})();

module.exports = observeRelayQueryData;