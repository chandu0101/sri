/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule GraphQLStoreQueryResolver
 * @typechecks
 * 
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _slicedToArray = require('babel-runtime/helpers/sliced-to-array')['default'];

var _Object$keys = require('babel-runtime/core-js/object/keys')['default'];

var GraphQLStoreChangeEmitter = require('./GraphQLStoreChangeEmitter');
var GraphQLStoreRangeUtils = require('./GraphQLStoreRangeUtils');

var RelayProfiler = require('./RelayProfiler');

var RelayStoreData = require('./RelayStoreData');

var filterExclusiveKeys = require('./filterExclusiveKeys');
var readRelayQueryData = require('./readRelayQueryData');
var recycleNodesInto = require('./recycleNodesInto');

/**
 * @internal
 *
 * Resolves data from fragment pointers.
 *
 * The supplied `callback` will be invoked whenever data returned by the last
 * invocation to `resolve` has changed.
 */

var GraphQLStoreQueryResolver = (function () {
  function GraphQLStoreQueryResolver(fragmentPointer, callback) {
    _classCallCheck(this, GraphQLStoreQueryResolver);

    this.reset();
    this._fragmentPointer = fragmentPointer;
    this._callback = callback;
    this._resolver = null;
  }

  /**
   * Resolves plural fragments.
   */

  /**
   * Resets the resolver's internal state such that future `resolve()` results
   * will not be `===` to previous results, and unsubscribes any subscriptions.
   */

  GraphQLStoreQueryResolver.prototype.reset = function reset() {
    if (this._resolver) {
      this._resolver.reset();
    }
  };

  GraphQLStoreQueryResolver.prototype.resolve = function resolve(fragmentPointer) {
    var resolver = this._resolver;
    if (!resolver) {
      resolver = this._fragmentPointer.getFragment().isPlural() ? new GraphQLStorePluralQueryResolver(this._callback) : new GraphQLStoreSingleQueryResolver(this._callback);
      this._resolver = resolver;
    }
    return resolver.resolve(fragmentPointer);
  };

  return GraphQLStoreQueryResolver;
})();

var GraphQLStorePluralQueryResolver = (function () {
  function GraphQLStorePluralQueryResolver(callback) {
    _classCallCheck(this, GraphQLStorePluralQueryResolver);

    this.reset();
    this._callback = callback;
  }

  /**
   * Resolves non-plural fragments.
   */

  GraphQLStorePluralQueryResolver.prototype.reset = function reset() {
    if (this._resolvers) {
      this._resolvers.forEach(function (resolver) {
        return resolver.reset();
      });
    }
    this._resolvers = [];
    this._results = [];
  };

  /**
   * Resolves a plural fragment pointer into an array of records.
   *
   * If the data, order, and number of resolved records has not changed since
   * the last call to `resolve`, the same array will be returned. Otherwise, a
   * new array will be returned.
   */

  GraphQLStorePluralQueryResolver.prototype.resolve = function resolve(fragmentPointer) {
    var prevResults = this._results;
    var nextResults;

    var nextIDs = fragmentPointer.getDataIDs();
    var prevLength = prevResults.length;
    var nextLength = nextIDs.length;
    var resolvers = this._resolvers;

    // Ensure that we have exactly `nextLength` resolvers.
    while (resolvers.length < nextLength) {
      resolvers.push(new GraphQLStoreSingleQueryResolver(this._callback));
    }
    while (resolvers.length > nextLength) {
      resolvers.pop().reset();
    }

    // Allocate `nextResults` if and only if results have changed.
    if (prevLength !== nextLength) {
      nextResults = [];
    }
    for (var ii = 0; ii < nextLength; ii++) {
      var nextResult = resolvers[ii].resolve(fragmentPointer, nextIDs[ii]);
      if (nextResults || ii >= prevLength || nextResult !== prevResults[ii]) {
        nextResults = nextResults || prevResults.slice(0, ii);
        nextResults.push(nextResult);
      }
    }

    if (nextResults) {
      this._results = nextResults;
    }
    return this._results;
  };

  return GraphQLStorePluralQueryResolver;
})();

var GraphQLStoreSingleQueryResolver = (function () {
  function GraphQLStoreSingleQueryResolver(callback) {
    _classCallCheck(this, GraphQLStoreSingleQueryResolver);

    this.reset();
    this._callback = callback;
    this._garbageCollector = RelayStoreData.getDefaultInstance().getGarbageCollector();
    this._subscribedIDs = {};
  }

  GraphQLStoreSingleQueryResolver.prototype.reset = function reset() {
    if (this._subscription) {
      this._subscription.remove();
    }
    this._hasDataChanged = false;
    this._fragment = null;
    this._result = null;
    this._resultID = null;
    this._subscription = null;
    this._updateGarbageCollectorSubscriptionCount({});
    this._subscribedIDs = {};
  };

  /**
   * Resolves data for a single fragment pointer.
   *
   * NOTE: `nextPluralID` should only be passed by the plural query resolver.
   */

  GraphQLStoreSingleQueryResolver.prototype.resolve = function resolve(fragmentPointer, nextPluralID) {
    var nextFragment = fragmentPointer.getFragment();
    var prevFragment = this._fragment;

    var nextID = nextPluralID || fragmentPointer.getDataID();
    var prevID = this._resultID;
    var nextResult;
    var prevResult = this._result;
    var subscribedIDs;

    if (prevFragment != null && prevID != null && getCanonicalID(prevID) === getCanonicalID(nextID)) {
      if (prevID !== nextID || this._hasDataChanged || !nextFragment.isEquivalent(prevFragment)) {
        var _resolveFragment = resolveFragment(nextFragment, nextID);

        // same canonical ID,
        // but the data, call(s), route, and/or variables have changed

        var _resolveFragment2 = _slicedToArray(_resolveFragment, 2);

        nextResult = _resolveFragment2[0];
        subscribedIDs = _resolveFragment2[1];

        nextResult = recycleNodesInto(prevResult, nextResult);
      } else {
        // same id, route, variables, and data
        nextResult = prevResult;
      }
    } else {
      var _resolveFragment3 = resolveFragment(nextFragment, nextID);

      // Pointer has a different ID or is/was fake data.

      var _resolveFragment32 = _slicedToArray(_resolveFragment3, 2);

      nextResult = _resolveFragment32[0];
      subscribedIDs = _resolveFragment32[1];
    }

    // update subscriptions whenever results change
    if (prevResult !== nextResult) {
      if (this._subscription) {
        this._subscription.remove();
        this._subscription = null;
      }
      if (subscribedIDs) {
        this._subscription = GraphQLStoreChangeEmitter.addListenerForIDs(_Object$keys(subscribedIDs), this._handleChange.bind(this));
        this._updateGarbageCollectorSubscriptionCount(subscribedIDs);
        this._subscribedIDs = subscribedIDs;
      }
      this._resultID = nextID;
      this._result = nextResult;
    }

    this._hasDataChanged = false;
    this._fragment = nextFragment;

    return this._result;
  };

  GraphQLStoreSingleQueryResolver.prototype._handleChange = function _handleChange() {
    if (!this._hasDataChanged) {
      this._hasDataChanged = true;
      this._callback();
    }
  };

  /**
   * Updates bookkeeping about the number of subscribers on each record.
   */

  GraphQLStoreSingleQueryResolver.prototype._updateGarbageCollectorSubscriptionCount = function _updateGarbageCollectorSubscriptionCount(nextDataIDs) {
    if (this._garbageCollector) {
      var garbageCollector = this._garbageCollector;

      var prevDataIDs = this._subscribedIDs;

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

  return GraphQLStoreSingleQueryResolver;
})();

function resolveFragment(fragment, dataID) {
  var store = RelayStoreData.getDefaultInstance().getQueuedStore();

  var _readRelayQueryData = readRelayQueryData(store, fragment, dataID);

  var data = _readRelayQueryData.data;
  var dataIDs = _readRelayQueryData.dataIDs;

  return [data, dataIDs];
}

/**
 * Ranges publish events for the entire range, not the specific view of that
 * range. For example, if "client:1" is a range, the event is on "client:1",
 * not "client:1_first(5)".
 */
function getCanonicalID(id) {
  return GraphQLStoreRangeUtils.getCanonicalClientID(id);
}

RelayProfiler.instrumentMethods(GraphQLStoreQueryResolver.prototype, {
  resolve: 'GraphQLStoreQueryResolver.resolve'
});

module.exports = GraphQLStoreQueryResolver;