/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule fetchRelayQuery
 * @typechecks
 * 
 */

'use strict';

var Promise = require('fbjs/lib/Promise');
var RelayNetworkLayer = require('./RelayNetworkLayer');
var RelayProfiler = require('./RelayProfiler');
var RelayQueryRequest = require('./RelayQueryRequest');

var resolveImmediate = require('fbjs/lib/resolveImmediate');

var queue = null;

/**
 * @internal
 *
 * Schedules the supplied `query` to be sent to the server.
 *
 * This is a low-level transport API; application code should use higher-level
 * interfaces exposed by RelayContainer for retrieving data transparently via
 * queries defined on components.
 */
function fetchRelayQuery(query) {
  if (!queue) {
    queue = [];
    var currentQueue = queue;
    resolveImmediate(function () {
      queue = null;
      profileQueue(currentQueue);
      processQueue(currentQueue);
    });
  }
  var request = new RelayQueryRequest(query);
  queue.push(request);
  return request.getPromise();
}

function processQueue(currentQueue) {
  RelayNetworkLayer.sendQueries(currentQueue);
}

/**
 * Profiles time from request to receiving the first server response.
 */
function profileQueue(currentQueue) {
  var profiler = RelayProfiler.profile('fetchRelayQuery');
  var promises = currentQueue.map(function (request) {
    return request.getPromise();
  });
  Promise.race(promises)['finally'](profiler.stop);
}

module.exports = fetchRelayQuery;