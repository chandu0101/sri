/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayOSSNodeInterface
 * @typechecks
 * 
 */

'use strict';

var forEachRootCallArg = require('./forEachRootCallArg');
var generateClientID = require('./generateClientID');
var invariant = require('fbjs/lib/invariant');

/**
 * @internal
 *
 * Defines logic relevant to the informal "Node" GraphQL interface.
 */
var RelayOSSNodeInterface = {
  ID: 'id',
  NODE: 'node',
  NODE_TYPE: 'Node',
  NODES: 'nodes',

  isNodeRootCall: function isNodeRootCall(rootCallName) {
    return rootCallName === RelayOSSNodeInterface.NODE || rootCallName === RelayOSSNodeInterface.NODES;
  },

  getResultsFromPayload: function getResultsFromPayload(store, query, payload) {
    var results = [];

    var rootBatchCall = query.getBatchCall();
    if (rootBatchCall) {
      getPayloadRecords(query, payload).forEach(function (result) {
        if (typeof result !== 'object' || !result) {
          return;
        }
        var dataID = result[RelayOSSNodeInterface.ID];
        !(dataID != null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayOSSNodeInterface.getResultsFromPayload(): Unable to write ' + 'result with no `%s` field for query, `%s`.', RelayOSSNodeInterface.ID, query.getName()) : invariant(false) : undefined;
        results.push({ dataID: dataID, result: result });
      });
    } else {
      var records = getPayloadRecords(query, payload);
      var ii = 0;
      forEachRootCallArg(query, function (rootCallArg, rootCallName) {
        var result = records[ii++];
        if (result == null) {
          return;
        }
        var dataID = store.getRootCallID(rootCallName, rootCallArg);
        if (dataID == null) {
          var payloadID = typeof result === 'object' && result ? result[RelayOSSNodeInterface.ID] : null;
          if (payloadID != null) {
            dataID = payloadID;
          } else if (rootCallArg == null) {
            dataID = 'client:' + rootCallName;
          } else {
            dataID = generateClientID();
          }
          store.putRootCallID(rootCallName, rootCallArg, dataID);
        }
        results.push({ dataID: dataID, result: result });
      });
    }

    return results;
  }
};

function getPayloadRecords(query, payload) {
  var records = payload[query.getRootCall().name];
  return Array.isArray(records) ? records : [records];
}

module.exports = RelayOSSNodeInterface;