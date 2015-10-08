/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayQueryTracker
 * 
 * @typechecks
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _toConsumableArray = require('babel-runtime/helpers/to-consumable-array')['default'];

var GraphQLStoreDataHandler = require('./GraphQLStoreDataHandler');
var RelayQuery = require('./RelayQuery');

var flattenRelayQuery = require('./flattenRelayQuery');
var invariant = require('fbjs/lib/invariant');

var TYPE = '__type__';

var RelayQueryTracker = (function () {
  function RelayQueryTracker() {
    _classCallCheck(this, RelayQueryTracker);

    this._trackedNodesByID = {};
  }

  RelayQueryTracker.prototype.trackNodeForID = function trackNodeForID(node, dataID, path) {
    // Non-refetchable nodes are tracked via their nearest-refetchable parent
    // (except for root call nodes)
    if (GraphQLStoreDataHandler.isClientID(dataID)) {
      !path ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryTracker.trackNodeForID(): Expected `path` for client ID, ' + '`%s`.', dataID) : invariant(false) : undefined;
      if (!path.isRootPath()) {
        return;
      }
    }
    // Don't track `__type__` fields
    if (node instanceof RelayQuery.Field && node.getSchemaName() === TYPE) {
      return;
    }

    this._trackedNodesByID[dataID] = this._trackedNodesByID[dataID] || {
      trackedNodes: [],
      isFlattened: false
    };
    this._trackedNodesByID[dataID].trackedNodes.push(node);
    this._trackedNodesByID[dataID].isFlattened = false;
  };

  /**
   * Get the children that are tracked for the given `dataID`, if any.
   */

  RelayQueryTracker.prototype.getTrackedChildrenForID = function getTrackedChildrenForID(dataID) {
    var trackedNodesByID = this._trackedNodesByID[dataID];
    if (!trackedNodesByID) {
      return [];
    }
    var isFlattened = trackedNodesByID.isFlattened;
    var trackedNodes = trackedNodesByID.trackedNodes;

    if (!isFlattened) {
      var trackedChildren = [];
      trackedNodes.forEach(function (trackedQuery) {
        trackedChildren.push.apply(trackedChildren, _toConsumableArray(trackedQuery.getChildren()));
      });
      trackedNodes.length = 0;
      trackedNodesByID.isFlattened = true;
      var containerNode = RelayQuery.Node.buildFragment('RelayQueryTracker', 'Node', trackedChildren);
      if (containerNode) {
        var flattenedNode = flattenRelayQuery(containerNode);
        if (flattenedNode) {
          trackedNodes.push(flattenedNode);
        }
      }
    }
    var trackedNode = trackedNodes[0];
    if (trackedNode) {
      return trackedNode.getChildren();
    }
    return [];
  };

  /**
   * Removes all nodes that are tracking the given DataID from the
   * query-tracker.
   */

  RelayQueryTracker.prototype.untrackNodesForID = function untrackNodesForID(dataID) {
    delete this._trackedNodesByID[dataID];
  };

  return RelayQueryTracker;
})();

module.exports = RelayQueryTracker;