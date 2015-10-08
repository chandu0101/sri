/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule GraphQLStoreChangeEmitter
 * @typechecks
 * 
 */

'use strict';

Object.defineProperty(exports, '__esModule', {
  value: true
});
var ErrorUtils = require('fbjs/lib/ErrorUtils');
var GraphQLStoreRangeUtils = require('./GraphQLStoreRangeUtils');
var RelayProfiler = require('./RelayProfiler');

var resolveImmediate = require('fbjs/lib/resolveImmediate');

var batchUpdate = function batchUpdate(callback) {
  return callback();
};
var subscribers = [];

var executingIDs = {};
var scheduledIDs = null;

/**
 * Asynchronous change emitter for nodes stored in GraphQLStore.
 *
 * Callers which broadcast changes include:
 *
 * - `GraphQLStore`: broadcasts status changes when mutations have an error or
 *   are retried
 * - `GraphQLWriter`: broadcasts when changes are written to the store (such as
 *   nodes being added or deleted)
 *
 * Callers which add listeners include:
 *
 * - `GraphQLStoreQueryResolver`: sets up listeners when resolving (retrieving)
 *   data from the store; called via Relay containers as part of the React
 *   lifecycle (ie. in `componentWillMount` and `componentWillReceiveProps`)
 *
 * @internal
 */
var GraphQLStoreChangeEmitter = {

  addListenerForIDs: function addListenerForIDs(ids, callback) {
    var subscribedIDs = ids.map(getBroadcastID);
    var index = subscribers.length;
    subscribers.push({ subscribedIDs: subscribedIDs, callback: callback });
    return {
      remove: function remove() {
        delete subscribers[index];
      }
    };
  },

  broadcastChangeForID: function broadcastChangeForID(id) {
    if (scheduledIDs === null) {
      resolveImmediate(processBroadcasts);
      scheduledIDs = {};
    }
    // Record index of the last subscriber so we do not later unintentionally
    // invoke callbacks that were subscribed after this broadcast.
    scheduledIDs[getBroadcastID(id)] = subscribers.length - 1;
  },

  injectBatchingStrategy: function injectBatchingStrategy(batchStrategy) {
    batchUpdate = batchStrategy;
  },

  /**
   * Exposed for profiling reasons.
   * @private
   */
  _processSubscribers: processSubscribers

};

function processBroadcasts() {
  if (scheduledIDs) {
    executingIDs = scheduledIDs;
    scheduledIDs = null;
    batchUpdate(processSubscribers);
  }
}

function processSubscribers() {
  subscribers.forEach(processSubscriber);
}

function processSubscriber(_ref, subscriberIndex) {
  var subscribedIDs = _ref.subscribedIDs;
  var callback = _ref.callback;

  for (var broadcastID in executingIDs) {
    if (executingIDs.hasOwnProperty(broadcastID)) {
      var broadcastIndex = executingIDs[broadcastID];
      if (broadcastIndex < subscriberIndex) {
        // Callback was subscribed after this particular broadcast.
        break;
      }
      if (subscribedIDs.indexOf(broadcastID) >= 0) {
        ErrorUtils.applyWithGuard(callback, null, null, null, 'GraphQLStoreChangeEmitter');
        break;
      }
    }
  }
}

/**
 * Ranges publish events for the entire range, not the specific view of that
 * range. For example, if "client:1" is a range, the event is on "client:1",
 * not "client:1_first(5)".
 */
function getBroadcastID(id) {
  return GraphQLStoreRangeUtils.getCanonicalClientID(id);
}

RelayProfiler.instrumentMethods(GraphQLStoreChangeEmitter, {
  addListenerForIDs: 'GraphQLStoreChangeEmitter.addListenerForIDs',
  broadcastChangeForID: 'GraphQLStoreChangeEmitter.broadcastChangeForID',
  _processSubscribers: 'GraphQLStoreChangeEmitter.processSubscribers'
});

module.exports = GraphQLStoreChangeEmitter;