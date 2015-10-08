/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayBufferedNeglectionStateMap
 * 
 * @typechecks
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var invariant = require('fbjs/lib/invariant');

/**
 * @internal
 *
 * A class that implements the `SortedMap` interface for a mapping from
 * DataID to NeglectionState.
 */

var RelayBufferedNeglectionStateMap = (function () {
  function RelayBufferedNeglectionStateMap(neglectionStateMap) {
    _classCallCheck(this, RelayBufferedNeglectionStateMap);

    this._bufferedChanges = [];
    this._neglectionStateMap = neglectionStateMap;
  }

  /**
   * Creates a buffered change that, once the buffer is flushed, decreases the
   * subscriptions-count for the given data ID.
   */

  RelayBufferedNeglectionStateMap.prototype.decreaseSubscriptionsFor = function decreaseSubscriptionsFor(dataID) {
    this._bufferedChanges.push({
      type: 'decrease',
      dataID: dataID
    });
  };

  /**
   * Creates a buffered change that, once the buffer is flushed, increases the
   * subscriptions-count for the given data ID.
   */

  RelayBufferedNeglectionStateMap.prototype.increaseSubscriptionsFor = function increaseSubscriptionsFor(dataID) {
    this._bufferedChanges.push({
      type: 'increase',
      dataID: dataID
    });
  };

  /**
   * Creates a buffered change that, once the buffer is flushed, creates an
   * entry for the data ID in the underlying `RelayNeglectionStateMap`.
   */

  RelayBufferedNeglectionStateMap.prototype.register = function register(dataID) {
    this._bufferedChanges.push({
      type: 'register',
      dataID: dataID
    });
  };

  /**
   * Creates a buffered change that, once the buffer is flushed, removes the
   * data ID from the underlying `RelayNeglectionStateMap`.
   */

  RelayBufferedNeglectionStateMap.prototype.remove = function remove(dataID) {
    this._bufferedChanges.push({
      type: 'remove',
      dataID: dataID
    });
  };

  /**
   * Returns the number of registered data IDs in the underlying
   * `RelayStoreNeglectionStates`.
   */

  RelayBufferedNeglectionStateMap.prototype.size = function size() {
    return this._neglectionStateMap.size();
  };

  /**
   * Returns the iterator returned by `values` on the underlying
   * `RelayNeglectionStateMap`.
   */

  RelayBufferedNeglectionStateMap.prototype.values = function values() {
    return this._neglectionStateMap.values();
  };

  RelayBufferedNeglectionStateMap.prototype.flushBuffer = function flushBuffer() {
    var _this = this;

    this._bufferedChanges.forEach(function (action) {
      var type = action.type;
      var dataID = action.dataID;

      switch (type) {
        case 'decrease':
          _this._neglectionStateMap.decreaseSubscriptionsFor(dataID);
          break;
        case 'increase':
          _this._neglectionStateMap.increaseSubscriptionsFor(dataID);
          break;
        case 'register':
          _this._neglectionStateMap.register(dataID);
          break;
        case 'remove':
          _this._neglectionStateMap.remove(dataID);
          break;
        default:
          !false ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayBufferedNeglectionStateMap._flushBufferedChanges: ' + 'Invalid type %s for buffered chaged', type) : invariant(false) : undefined;
      }
    });
    this._bufferedChanges = [];
  };

  return RelayBufferedNeglectionStateMap;
})();

module.exports = RelayBufferedNeglectionStateMap;