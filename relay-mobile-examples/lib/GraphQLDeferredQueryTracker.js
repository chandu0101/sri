/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule GraphQLDeferredQueryTracker
 * @typechecks
 * 
 */

'use strict';

var _Object$assign = require('babel-runtime/core-js/object/assign')['default'];

var ErrorUtils = require('fbjs/lib/ErrorUtils');
var Map = require('fbjs/lib/Map');

var RelayStoreData = require('./RelayStoreData');

var forEachObject = require('fbjs/lib/forEachObject');
var forEachRootCallArg = require('./forEachRootCallArg');
var invariant = require('fbjs/lib/invariant');
var isEmpty = require('fbjs/lib/isEmpty');
var resolveImmediate = require('fbjs/lib/resolveImmediate');

var recordStore = RelayStoreData.getDefaultInstance().getRecordStore();

/**
 * List of all subscriptions of form {callback, dataID, fragmentID}
 */
var subscribers = [];

/**
 * List of all deferred queries that have resolved/failed since last broadcast.
 */
var broadcastItems = null;

/**
 * Map of pending dataID => Set<fragmentID>
 * Stores a set as object<string,string> of all pending deferred fragmentIDs
 * for a given dataID. Presence of dataID => fragmentID pair
 * means that the query is pending, absence that it has resolved.
 */
var dataIDToFragmentNameMap = new Map();

/**
 * Map of pending rootCall => Set<fragmentID>
 * Stores a temporary mapping of fragmentIDs when the correct dataID is
 * unknown. Entries will get moved to dataIDToFragmentNameMap as the dataID
 * for the rootCall is determinble.
 */
var rootCallToFragmentNameMap = new Map();

/**
 * Map of parent query ID => [child queries]
 */
var parentToChildQueryMap = new Map();

/**
 * This module tracks pending queries and maintains information about which
 * deferred data is pending or resolved. It also provides a method to observe
 * when a deferred query for a given node either resolves or fails.
 *
 * @internal
 */
var GraphQLDeferredQueryTracker = {

  /**
   * Add a listener for when the given fragment resolves/fails for dataID.
   * Returns a subscription object {remove} where calling remove cancels the
   * subscription.
   */
  addListenerForFragment: function addListenerForFragment(dataID, fragmentID, callbacks) {
    var subscriber = {
      callbacks: callbacks,
      dataID: dataID,
      fragmentID: fragmentID
    };
    subscribers.push(subscriber);
    return {
      remove: function remove() {
        var index = subscribers.indexOf(subscriber);
        !(index >= 0) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'remove() can only be called once') : invariant(false) : undefined;
        subscribers[index] = null;
      }
    };
  },

  /**
   * Record the query as being sent, updating internal tracking to note
   * that the dataID/fragment pairs are pending.
   */
  recordQuery: function recordQuery(query) {
    var parentID = getQueryParentID(query);
    if (parentID) {
      // child query: record parent => [children] list
      var children = parentToChildQueryMap.get(parentID) || [];
      children.push(query);
      parentToChildQueryMap.set(parentID, children);
    } else {
      var deferredFragmentNames = query.getDeferredFragmentNames();
      if (deferredFragmentNames) {
        // deferred query: record ID => fragment set
        var dataIDs = getRootCallToIDMap(query);
        forEachObject(dataIDs, function (dataID, rootCall) {
          if (dataID) {
            var dataIDSet = dataIDToFragmentNameMap.get(dataID) || {};
            _Object$assign(dataIDSet, deferredFragmentNames); // set union
            dataIDToFragmentNameMap.set(dataID, dataIDSet);
          } else {
            var rootCallSet = rootCallToFragmentNameMap.get(rootCall) || {};
            _Object$assign(rootCallSet, deferredFragmentNames);
            rootCallToFragmentNameMap.set(rootCall, rootCallSet);
          }
        });
      }
    }
  },

  /**
   * Record the query as being resolved with the given data, updating
   * internal tracking and firing subscriptions.
   */
  resolveQuery: function resolveQuery(query, response, refParams) {
    var parentID = getQueryParentID(query);
    resolveFragmentsForRootCall(query);
    if (query.isDeferred()) {
      resolveDeferredQuery(query, broadcastChangeForFragment, refParams);
      if (parentID) {
        resolveDeferredRefQuery(query);
      }
    } else if (response) {
      resolveDeferredParentQuery(query, response);
    }
  },

  /**
   * Record that the query has resolved with an error.
   */
  rejectQuery: function rejectQuery(query, error) {
    var parentID = getQueryParentID(query);
    if (query.isDeferred()) {
      rejectDeferredFragmentsForRootCall(query);
      resolveDeferredQuery(query, function (dataID, fragmentID) {
        broadcastErrorForFragment(dataID, fragmentID, error);
      });
      if (parentID) {
        resolveDeferredRefQuery(query);
      }
    } else {
      rejectDeferredParentQuery(query);
    }
  },

  /**
   * Determine if the given query is pending by checking if it is fetching
   * the same dataID/fragments as any pending queries.
   */
  isQueryPending: function isQueryPending(dataID, fragmentID) {
    if (dataIDToFragmentNameMap.has(dataID)) {
      var dataIDSet = dataIDToFragmentNameMap.get(dataID);
      if (dataIDSet.hasOwnProperty(fragmentID)) {
        return true;
      }
    }

    return false;
  },

  /**
   * Clear all query tracking and subscriptions.
   */
  reset: function reset() {
    dataIDToFragmentNameMap = new Map();
    parentToChildQueryMap = new Map();
    rootCallToFragmentNameMap = new Map();
    subscribers = [];
    broadcastItems = null;
  }
};

/**
 * Clears all pending dataID => fragmentID associations for this query
 * and calls the callback for each (dataID, fragmentID) pair.
 */
function resolveDeferredQuery(query, callback, refParams) {
  var deferredFragmentNames = query.getDeferredFragmentNames();
  if (!deferredFragmentNames) {
    return;
  }
  var dataIDs = {};
  var batchCall = query.getBatchCall();
  if (batchCall) {
    // refParams can be undefined if the node is null in the parent query.
    var refIDs = refParams && refParams[batchCall.refParamName];
    if (refIDs != null) {
      refIDs = Array.isArray(refIDs) ? refIDs : [refIDs];
      refIDs.forEach(function (id) {
        return dataIDs[id] = id;
      });
    }
  } else {
    dataIDs = getRootCallToIDMap(query);
  }
  forEachObject(dataIDs, function (dataID) {
    if (dataID && dataIDToFragmentNameMap.has(dataID)) {
      var dataIDSet = dataIDToFragmentNameMap.get(dataID);
      forEachObject(deferredFragmentNames, function (fragmentID) {
        delete dataIDSet[fragmentID];
        callback(dataID, fragmentID);
      });
      if (!isEmpty(dataIDSet)) {
        dataIDToFragmentNameMap.set(dataID, dataIDSet);
      } else {
        dataIDToFragmentNameMap['delete'](dataID);
      }
    }
  });
}

/**
 * Clears the deferred query from its parent's list of dependent queries.
 */
function resolveDeferredRefQuery(query) {
  var parentID = getQueryParentID(query);
  var children = parentToChildQueryMap.get(parentID) || [];
  children = children.filter(function (q) {
    return q !== query;
  });
  if (children.length) {
    parentToChildQueryMap.set(parentID, children);
  } else {
    parentToChildQueryMap['delete'](parentID);
  }
}

/**
 * Resolves the root IDs for any dependent queries of the given query.
 */
function resolveDeferredParentQuery(query, response) {
  // resolve IDs in child queries, add to ID => fragment set
  var children = parentToChildQueryMap.get(query.getID()) || [];
  for (var ii = 0; ii < children.length; ii++) {
    var childQuery = children[ii];
    var childFragmentNames = childQuery.getDeferredFragmentNames();
    var childDataIDs = getRefParamFromResponse(response, childQuery);
    forEachObject(childDataIDs, function (dataID) {
      var dataIDSet = dataIDToFragmentNameMap.get(dataID) || {};
      _Object$assign(dataIDSet, childFragmentNames);
      dataIDToFragmentNameMap.set(dataID, dataIDSet);
    });
  }
}

/**
 * Maps the deferred fragments for a root call with a previously unknown ID to
 * the resolved ID value.
 */
function resolveFragmentsForRootCall(query) {
  var rootCallMap = getRootCallToIDMap(query);
  forEachObject(rootCallMap, function (dataID, rootCall) {
    if (dataID && rootCallToFragmentNameMap.has(rootCall)) {
      var rootCallSet = rootCallToFragmentNameMap.get(rootCall) || {};
      var dataIDSet = dataIDToFragmentNameMap.get(dataID) || {};
      _Object$assign(dataIDSet, rootCallSet);
      dataIDToFragmentNameMap.set(dataID, dataIDSet);
      rootCallToFragmentNameMap['delete'](rootCall);
    }
  });
}

/**
 * Removes the deferred fragments for a previously unresolved root call ID.
 */
function rejectDeferredFragmentsForRootCall(query) {
  var rootCallMap = getRootCallToIDMap(query);
  var deferredFragmentNames = query.getDeferredFragmentNames();
  forEachObject(rootCallMap, function (dataID, rootCall) {
    if (rootCallToFragmentNameMap.has(rootCall)) {
      var rootCallSet = rootCallToFragmentNameMap.get(rootCall) || {};
      forEachObject(deferredFragmentNames, function (fragmentID) {
        delete rootCallSet[fragmentID];
      });
      if (!isEmpty(rootCallSet)) {
        rootCallToFragmentNameMap['delete'](rootCall);
      } else {
        rootCallToFragmentNameMap.set(rootCall, rootCallSet);
      }
    }
  });
}

/**
 * Rejects the parent ID, clearing all tracking for both the parent and all
 * its dependent deferred ref queries.
 */
function rejectDeferredParentQuery(query) {
  var parentID = query.getID();
  parentToChildQueryMap['delete'](parentID);
}

/**
 * Notify observers that the given deferred fragment has resolved for node
 * with dataID.
 */
function broadcastChangeForFragment(dataID, fragmentID) {
  if (!broadcastItems) {
    broadcastItems = [];
    resolveImmediate(processBroadcasts);
  }
  broadcastItems.push({ dataID: dataID, fragmentID: fragmentID, error: null });
}

/**
 * Record that an error occurred for this dataID, fragment pair
 * and broadcast an update.
 */
function broadcastErrorForFragment(dataID, fragmentID, error) {
  if (!broadcastItems) {
    broadcastItems = [];
    resolveImmediate(processBroadcasts);
  }
  broadcastItems.push({ dataID: dataID, fragmentID: fragmentID, error: error });
}

/**
 * Process broadcast items from previous event loop.
 */
function processBroadcasts() {
  if (!broadcastItems) {
    return;
  }

  for (var ii = 0; ii < subscribers.length; ii++) {
    for (var jj = 0; jj < broadcastItems.length; jj++) {
      var subscriber = subscribers[ii];
      if (subscriber) {
        var _broadcastItems$jj = broadcastItems[jj];
        var dataID = _broadcastItems$jj.dataID;
        var error = _broadcastItems$jj.error;
        var fragmentID = _broadcastItems$jj.fragmentID;

        var method;
        var args;
        if (error) {
          method = subscriber.callbacks.onFailure;
          args = [dataID, fragmentID, error];
        } else {
          method = subscriber.callbacks.onSuccess;
          args = [dataID, fragmentID];
        }
        ErrorUtils.applyWithGuard(method, null, args, null, 'GraphQLDeferredQueryTracker');
      }
    }
  }

  subscribers = subscribers.filter(function (subscriber) {
    return subscriber !== null;
  });
  broadcastItems = null;
}

/**
 * Helper to extract the JSONPath value(s) of a query from a response.
 */
function getRefParamFromResponse(response, query) {
  var batchCall = query.getBatchCall();
  var refTarget = batchCall ? batchCall.sourceQueryPath : null;
  if (!refTarget) {
    return {};
  }
  var values = {};
  var tokens = refTarget.split('.');

  getRefParamFromNode(values, response, tokens, 1); // skip root '$' marker
  return values;
}

/**
 * Recursive helper to extract the ref parameter (represented as tokens)
 * into the values object.
 */
function getRefParamFromNode(values, node, tokens, index) {
  if (index === tokens.length && typeof node === 'string') {
    // base case
    values[node] = node;
    return;
  } else if (
  // mismatched path/response
  index >= tokens.length || !node || typeof node !== 'object' || Array.isArray(node)) {
    return;
  }
  var token = tokens[index];
  if (token === '*') {
    forEachObject(node, function (subNode) {
      getRefParamFromNode(values, subNode, tokens, index + 1);
    });
  } else if (node.hasOwnProperty(token)) {
    getRefParamFromNode(values, node[token], tokens, index + 1);
  }
}

/**
 * Helper to get a query's sourceQueryID
 */
function getQueryParentID(query) {
  var batchCall = query.getBatchCall();
  if (batchCall) {
    return batchCall.sourceQueryID;
  }
  return null;
}

function getRootCallToIDMap(query) {
  var mapping = {};
  if (!query.getBatchCall()) {
    forEachRootCallArg(query, function (rootCallArg, rootCallName) {
      var rootCallString = rootCallArg == null ? rootCallName + '()' : rootCallName + '(' + rootCallArg + ')';

      mapping[rootCallString] = recordStore.getRootCallID(rootCallName, rootCallArg);
    });
  }
  return mapping;
}
module.exports = GraphQLDeferredQueryTracker;