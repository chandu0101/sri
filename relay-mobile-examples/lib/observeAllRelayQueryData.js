/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule observeAllRelayQueryData
 * @typechecks
 * 
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _slicedToArray = require('babel-runtime/helpers/sliced-to-array')['default'];

var _Object$keys = require('babel-runtime/core-js/object/keys')['default'];

var emptyFunction = require('fbjs/lib/emptyFunction');
var filterExclusiveKeys = require('./filterExclusiveKeys');
var forEachObject = require('fbjs/lib/forEachObject');
var invariant = require('fbjs/lib/invariant');
var observeRelayQueryData = require('./observeRelayQueryData');

var DATAID_REMOVED = {};

function observeAllRelayQueryData(store, queryNode, dataIDs, options) {
  return new RelayQueryMultipleDataObservable(function (dataID) {
    return observeRelayQueryData(store, queryNode, dataID, options);
  }, dataIDs);
}

var RelayQueryMultipleDataObservable = (function () {
  function RelayQueryMultipleDataObservable(observeRelayQueryData, dataIDs) {
    _classCallCheck(this, RelayQueryMultipleDataObservable);

    this._activeSubscriptions = 0;
    this._dataIDs = _Object$keys(toObject(dataIDs));
    this._lastError = null;
    this._observeRelayQueryData = observeRelayQueryData;
    this._observers = null;
    this._shouldExecuteCallbacks = false;
    this._subscribeCalls = [];
    this._subscriptions = {};
    this._wrappedData = {};
  }

  /**
   * Returns a new object with the keys in the same order as they appear in
   * `reference`.
   */

  RelayQueryMultipleDataObservable.prototype.subscribe = function subscribe(callbacks) {
    var _this = this;

    // An error occurred earlier, it is no longer possible to subscribe to this
    // observer
    if (this._lastError) {
      callbacks.onError(this._lastError);
      return {
        dispose: emptyFunction
      };
    }

    // Only create observers on the first subscribe call
    if (!this._observers) {
      this._setupObservers(this._dataIDs);
    }

    // List of indices of where in the list of subscription per dataID this
    // subscription is
    var dataIDToSubscriptionIndex = {};
    this._addSubscriptions(this._dataIDs, dataIDToSubscriptionIndex, callbacks);

    // An error occurred while creating the subscriptions, rolling back
    if (this._lastError) {
      callbacks.onError(this._lastError);
      this._disposeSubscriptions(dataIDToSubscriptionIndex);
      return {
        dispose: emptyFunction
      };
    }
    this._subscribeCalls.push({ callbacks: callbacks, dataIDToSubscriptionIndex: dataIDToSubscriptionIndex });

    callbacks.onNext(unwrapData(this._wrappedData));
    var index = this._subscribeCalls.length - 1;
    var isDisposed = false;
    this._activeSubscriptions++;

    return {
      dispose: function dispose() {
        !!isDisposed ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayObserver.dispose(): Subscription was already disposed.') : invariant(false) : undefined;
        isDisposed = true;

        _this._activeSubscriptions--;
        _this._disposeSubscriptions(dataIDToSubscriptionIndex);
        _this._subscribeCalls[index] = null;

        if (!_this._activeSubscriptions) {
          _this._observers = null;
          _this._subscribeCalls = [];
          _this._subscriptions = {};
          _this._wrappedData = {};
        }
      }
    };
  };

  /**
   * Changes the observed dataIDs to the given dataIDs, the order of the new
   * dataIDs is kept.
   */

  RelayQueryMultipleDataObservable.prototype.setDataIDs = function setDataIDs(dataIDs) {
    var _this2 = this;

    !!this._lastError ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayObserver.setDataIDs(): Unable to update records on a defunct ' + 'observer.') : invariant(false) : undefined;
    var dataIDSet = toObject(dataIDs);
    this._dataIDs = _Object$keys(dataIDSet);

    var _filterExclusiveKeys = filterExclusiveKeys(this._observers, dataIDSet);

    var _filterExclusiveKeys2 = _slicedToArray(_filterExclusiveKeys, 2);

    var removedDataIDs = _filterExclusiveKeys2[0];
    var addedDataIDs = _filterExclusiveKeys2[1];

    // Unsubscribe subscriptions for removed data IDs
    removedDataIDs.forEach(function (dataID) {
      var subscriptions = _this2._subscriptions[dataID];
      if (subscriptions) {
        subscriptions.forEach(function (subscription) {
          subscription && subscription.dispose();
          _this2._wrappedData[dataID] = DATAID_REMOVED;
        });
        _this2._subscriptions[dataID] = null;
      }
    });

    this._setupObservers(addedDataIDs);
    this._subscribeCalls.forEach(function (call) {
      // Add the dataIDs to any previously attached callbacks
      call && _this2._addSubscriptions(addedDataIDs, call.dataIDToSubscriptionIndex);
    });

    // All subscriptions have been added and data has been ordered, invoke
    // callback on all subscriptions
    if (this._lastError) {
      this._callOnError();
    } else {
      this._wrappedData = reorderObjectKeys(this._dataIDs, this._wrappedData);
      this._callOnNext();
    }
  };

  /**
   * Adds subscriptions for dataIDs that were added after the initial call to
   * `subscribe`.
   */

  RelayQueryMultipleDataObservable.prototype._addSubscriptions = function _addSubscriptions(dataIDs, indices) {
    var _this3 = this;

    this._shouldExecuteCallbacks = false;
    dataIDs.forEach(function (dataID) {
      if (_this3._observers) {
        var observer = _this3._observers[dataID];
        if (observer) {
          var subscriptions = _this3._subscriptions[dataID] || (_this3._subscriptions[dataID] = []);
          // The index the subscription will be stored at in the array.
          indices[dataID] = subscriptions.length;
          subscriptions.push(observer.subscribe({
            onCompleted: function onCompleted() {
              return _this3._handleCompleted(dataID);
            },
            onError: function onError(error) {
              return _this3._handleError(dataID, error);
            },
            onNext: function onNext(data) {
              return _this3._handleNext(dataID, data);
            }
          }));
        }
      }
    });
    this._shouldExecuteCallbacks = true;
  };

  /**
   * Calls `onError` on all subscriptions but only if `_shouldExecuteCallbacks`
   * is `true`. This is handy to prevent excessive calls of `onError` when
   * observed DataIDs change
   */

  RelayQueryMultipleDataObservable.prototype._callOnError = function _callOnError() {
    var _this4 = this;

    this._shouldExecuteCallbacks && this._subscribeCalls.forEach(function (call) {
      call && _this4._lastError && call.callbacks.onError(_this4._lastError);
    });
  };

  /**
   * Calls `onNext` on all subscriptions but only if `_shouldExecuteCallbacks`
   * is `true`. This is handy to prevent excessive calls of `onNext` when
   * observed DataIDs change
   */

  RelayQueryMultipleDataObservable.prototype._callOnNext = function _callOnNext() {
    var _this5 = this;

    this._shouldExecuteCallbacks && this._subscribeCalls.forEach(function (call) {
      if (call) {
        call.callbacks.onNext(unwrapData(_this5._wrappedData));
      }
    });
  };

  /**
   * Remove a set of subscriptions based on their dataID
   */

  RelayQueryMultipleDataObservable.prototype._disposeSubscriptions = function _disposeSubscriptions(indices) {
    var _this6 = this;

    forEachObject(indices, function (index, dataID) {
      var subscriptions = _this6._subscriptions[dataID];
      if (subscriptions && subscriptions[index]) {
        subscriptions[index].dispose();
        subscriptions[index] = null;
      }
    });
  };

  RelayQueryMultipleDataObservable.prototype._handleCompleted = function _handleCompleted(dataID) {
    this._subscribeCalls.forEach(function (call) {
      call && call.callbacks.onCompleted();
    });
  };

  /**
   * Notify all subscribers that an error occurred
   */

  RelayQueryMultipleDataObservable.prototype._handleError = function _handleError(dataID, error) {
    this._lastError = error;
    this._callOnError();
  };

  RelayQueryMultipleDataObservable.prototype._handleNext = function _handleNext(dataID, data) {
    this._wrappedData[dataID] = data;
    this._callOnNext();
  };

  /**
   * Creates observers for the given dataIDs, if an observer for the given
   * dataID already exists nothing will be done for this dataID
   */

  RelayQueryMultipleDataObservable.prototype._setupObservers = function _setupObservers(dataIDs) {
    var _this7 = this;

    if (!this._observers) {
      this._observers = {};
    }
    dataIDs.forEach(function (dataID) {
      var observer = _this7._observeRelayQueryData(dataID);
      // Additional check if dataIDToObserver exists for Flow
      if (_this7._observers) {
        _this7._observers[dataID] = observer;
      }
    });
  };

  return RelayQueryMultipleDataObservable;
})();

function reorderObjectKeys(reference, input) {
  var orderedInput = {};
  reference.forEach(function (key) {
    !input.hasOwnProperty(key) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayObserver.setDataIDs(): Expected object to have key `%s`.', key) : invariant(false) : undefined;
    orderedInput[key] = input[key];
  });
  return orderedInput;
}

function toObject(dataIDs) {
  var dataIDSet = {};
  dataIDs.forEach(function (dataID) {
    dataIDSet[dataID] = null;
  });
  return dataIDSet;
}

function unwrapData(wrappedData) {
  var unwrappedData = [];
  forEachObject(wrappedData, function (data) {
    if (data !== DATAID_REMOVED) {
      unwrappedData.push(data);
    }
  });
  return unwrappedData;
}

module.exports = observeAllRelayQueryData;