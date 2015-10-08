/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayStore
 * @typechecks
 * 
 */

'use strict';

var GraphQLQueryRunner = require('./GraphQLQueryRunner');

var RelayMutationTransaction = require('./RelayMutationTransaction');

var RelayStoreData = require('./RelayStoreData');

var forEachRootCallArg = require('./forEachRootCallArg');
var observeAllRelayQueryData = require('./observeAllRelayQueryData');
var observeRelayQueryData = require('./observeRelayQueryData');
var readRelayQueryData = require('./readRelayQueryData');

var queuedStore = RelayStoreData.getDefaultInstance().getQueuedStore();

/**
 * @public
 *
 * RelayStore is a caching layer that records GraphQL response data and enables
 * resolving and subscribing to queries.
 *
 * === onReadyStateChange ===
 *
 * Whenever Relay sends a request for data via GraphQL, an "onReadyStateChange"
 * callback can be supplied. This callback is called one or more times with a
 * `readyState` object with the following properties:
 *
 *   aborted: Whether the request was aborted.
 *   done: Whether all response data has been fetched.
 *   error: An error in the event of a failure, or null if none.
 *   ready: Whether the queries are at least partially resolvable.
 *   stale: When resolvable during `forceFetch`, whether data is stale.
 *
 * If the callback is invoked with `aborted`, `done`, or a non-null `error`, the
 * callback will never be called again. Example usage:
 *
 *  function onReadyStateChange(readyState) {
 *    if (readyState.aborted) {
 *      // Request was aborted.
 *    } else if (readyState.error) {
 *      // Failure occured.
 *    } else if (readyState.ready) {
 *      // Queries are at least partially resolvable.
 *      if (readyState.done) {
 *        // Queries are completely resolvable.
 *      }
 *    }
 *  }
 *
 */
var RelayStore = {

  /**
   * Primes the store by sending requests for any missing data that would be
   * required to satisfy the supplied set of queries.
   */
  primeCache: function primeCache(querySet, callback) {
    return GraphQLQueryRunner.run(querySet, callback);
  },

  /**
   * Forces the supplied set of queries to be fetched and written to the store.
   * Any data that previously satisfied the queries will be overwritten.
   */
  forceFetch: function forceFetch(querySet, callback) {
    return GraphQLQueryRunner.forceFetch(querySet, callback);
  },

  /**
   * Reads query data anchored at the supplied data ID.
   */
  read: function read(node, dataID, options) {
    return readRelayQueryData(queuedStore, node, dataID, options).data;
  },

  /**
   * Reads query data anchored at the supplied data IDs.
   */
  readAll: function readAll(node, dataIDs, options) {
    return dataIDs.map(function (dataID) {
      return readRelayQueryData(queuedStore, node, dataID, options).data;
    });
  },

  /**
   * Reads query data, where each element in the result array corresponds to a
   * root call argument. If the root call has no arguments, the result array
   * will contain exactly one element.
   */
  readQuery: function readQuery(root, options) {
    var results = [];
    forEachRootCallArg(root, function (rootCallArg, rootCallName) {
      var data;
      var dataID = queuedStore.getRootCallID(rootCallName, rootCallArg);
      if (dataID != null) {
        data = RelayStore.read(root, dataID, options);
      }
      results.push(data);
    });
    return results;
  },

  /**
   * Reads and subscribes to query data anchored at the supplied data ID. The
   * returned observable emits updates as the data changes over time.
   */
  observe: function observe(node, dataID, options) {
    return observeRelayQueryData(queuedStore, node, dataID, options);
  },

  /**
   * Reads and subscribes to query data anchored at the supplied data IDs. The
   * returned observable emits updates as the data changes over time.
   */
  observeAll: function observeAll(node, dataIDs, options) {
    return observeAllRelayQueryData(queuedStore, node, dataIDs, options);
  },

  update: function update(mutation, callbacks) {
    var transaction = new RelayMutationTransaction(mutation);
    transaction.commit(callbacks);
  }
};

module.exports = RelayStore;