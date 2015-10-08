/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule GraphQLFragmentPointer
 * 
 * @typechecks
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var GraphQLStoreDataHandler = require('./GraphQLStoreDataHandler');
var RelayQuery = require('./RelayQuery');

var invariant = require('fbjs/lib/invariant');
var shallowEqual = require('fbjs/lib/shallowEqual');

/**
 * Fragment pointers encapsulate the fetched data for a fragment reference. They
 * are opaque tokens that are used by Relay containers to read data that is then
 * passed to the underlying React component.
 */

var GraphQLFragmentPointer = (function () {

  /**
   * Creates a valid prop value to be passed into the top-level Relay container.
   */

  GraphQLFragmentPointer.createForRoot = function createForRoot(store, query) {
    var fragment = getRootFragment(query);
    if (!fragment) {
      return null;
    }
    var concreteFragmentID = fragment.getConcreteFragmentID();
    var rootCall = query.getRootCall();
    var rootCallName = rootCall.name;
    var rootCallArgs = rootCall.value;
    if (Array.isArray(rootCallArgs)) {
      var rootFragment = fragment; // for Flow
      return rootCallArgs.map(function (rootCallArg) {
        var dataID = store.getRootCallID(rootCallName, rootCallArg);
        if (!dataID) {
          return null;
        }
        var pointer = GraphQLStoreDataHandler.createPointerWithID(dataID);
        pointer[concreteFragmentID] = new GraphQLFragmentPointer([dataID], rootFragment);
        return pointer;
      });
    }
    !(typeof rootCallArgs === 'string' || rootCallArgs == null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'GraphQLFragmentPointer: Value for the argument to `%s` on query `%s` ' + 'should be a string, but it was set to `%s`. Check that the value is a ' + 'string.', rootCallName, query.getName(), rootCallArgs) : invariant(false) : undefined;
    var dataIDOrIDs = store.getRootCallID(rootCallName, rootCallArgs);
    if (!dataIDOrIDs) {
      return null;
    }
    var result = {};
    // TODO(t7765591): Throw if `fragment` is not optional.
    var fragmentPointer = new GraphQLFragmentPointer(dataIDOrIDs, fragment);
    result[concreteFragmentID] = fragmentPointer;
    return result;
  };

  function GraphQLFragmentPointer(dataIDOrIDs, fragment) {
    _classCallCheck(this, GraphQLFragmentPointer);

    var isArray = Array.isArray(dataIDOrIDs);
    var isPlural = fragment.isPlural();
    !(isArray === isPlural) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'GraphQLFragmentPointer: Wrong plurality, %s supplied with %s fragment.', isArray ? 'array of data IDs' : 'single data ID', isPlural ? 'plural' : 'non-plural') : invariant(false) : undefined;

    this._dataIDOrIDs = dataIDOrIDs;
    this._fragment = fragment;
  }

  /**
   * Get the data ID for a singular query fragment.
   */

  GraphQLFragmentPointer.prototype.getDataID = function getDataID() {
    !!Array.isArray(this._dataIDOrIDs) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'GraphQLFragmentPointer.getDataID(): Bad call for plural fragment.') : invariant(false) : undefined;
    return this._dataIDOrIDs;
  };

  /**
   * Get the data ID for a plural query fragment.
   */

  GraphQLFragmentPointer.prototype.getDataIDs = function getDataIDs() {
    !Array.isArray(this._dataIDOrIDs) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'GraphQLFragmentPointer.getDataIDs(): Bad call for non-plural fragment.') : invariant(false) : undefined;
    return this._dataIDOrIDs;
  };

  GraphQLFragmentPointer.prototype.getFragment = function getFragment() {
    return this._fragment;
  };

  GraphQLFragmentPointer.prototype.equals = function equals(that) {
    return shallowEqual(this._dataIDOrIDs, that._dataIDOrIDs) && this._fragment.isEquivalent(that._fragment);
  };

  /**
   * @unstable
   *
   * For debugging only, do not rely on this for comparing values at runtime.
   * Instead, use `pointer.getFragment().getFragmentID()`.
   */

  GraphQLFragmentPointer.prototype.toString = function toString() {
    return 'GraphQLFragmentPointer(ids: ' + JSON.stringify(this._dataIDOrIDs) + ', fragment: `' + this.getFragment().getDebugName() + ', params: ' + JSON.stringify(this._fragment.getVariables()) + ')';
  };

  return GraphQLFragmentPointer;
})();

function getRootFragment(query) {
  var batchCall = query.getBatchCall();
  if (batchCall) {
    !false ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Queries supplied at the root cannot have batch call variables. Query ' + '`%s` has a batch call variable, `%s`.', query.getName(), batchCall.refParamName) : invariant(false) : undefined;
  }
  var fragment;
  query.getChildren().forEach(function (child) {
    if (child instanceof RelayQuery.Fragment) {
      !!fragment ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Queries supplied at the root should contain exactly one fragment ' + '(e.g. `${Component.getFragment(\'...\')}`). Query `%s` contains ' + 'more than one fragment.', query.getName()) : invariant(false) : undefined;
      fragment = child;
    } else if (child instanceof RelayQuery.Field) {
      !child.isGenerated() ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Queries supplied at the root should contain exactly one fragment ' + 'and no fields. Query `%s` contains a field, `%s`. If you need to ' + 'fetch fields, declare them in a Relay container.', query.getName(), child.getSchemaName()) : invariant(false) : undefined;
    }
  });
  return fragment;
}

module.exports = GraphQLFragmentPointer;