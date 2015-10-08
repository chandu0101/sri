/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayRecordStore
 * 
 * @typechecks
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _Object$keys = require('babel-runtime/core-js/object/keys')['default'];

Object.defineProperty(exports, '__esModule', {
  value: true
});

var GraphQLMutatorConstants = require('./GraphQLMutatorConstants');
var GraphQLRange = require('./GraphQLRange');
var GraphQLStoreDataHandler = require('./GraphQLStoreDataHandler');
var GraphQLStoreRangeUtils = require('./GraphQLStoreRangeUtils');
var RelayConnectionInterface = require('./RelayConnectionInterface');

var RelayNodeInterface = require('./RelayNodeInterface');

var forEachObject = require('fbjs/lib/forEachObject');
var invariant = require('fbjs/lib/invariant');
var warning = require('fbjs/lib/warning');

var CURSOR = RelayConnectionInterface.CURSOR;
var NODE = RelayConnectionInterface.NODE;

var EMPTY = '';
var FILTER_CALLS = '__filterCalls__';
var FORCE_INDEX = '__forceIndex__';
var RANGE = '__range__';
var PATH = '__path__';
var APPEND = GraphQLMutatorConstants.APPEND;
var PREPEND = GraphQLMutatorConstants.PREPEND;
var REMOVE = GraphQLMutatorConstants.REMOVE;

// maps root call args to IDs. ex `username(joe)` -> 123`

/**
 * @internal
 *
 * `RelayRecordStore` is the central repository for all data fetched by the
 * client. Data is stored as a map of IDs to Records. Records are maps of
 * field names to values.
 *
 * TODO: #6584253 Mediate access to node/cached/queued data via RelayRecordStore
 */

var RelayRecordStore = (function () {
  function RelayRecordStore(records, rootCallMaps, nodeConnectionMap, cacheManager, clientMutationID) {
    _classCallCheck(this, RelayRecordStore);

    this._cacheManager = cacheManager;
    this._cachedRecords = records.cachedRecords;
    this._cachedRootCallMap = rootCallMaps && rootCallMaps.cachedRootCallMap || {};
    this._clientMutationID = clientMutationID;
    this._queuedRecords = records.queuedRecords;
    this._nodeConnectionMap = nodeConnectionMap || {};
    this._records = records.records;
    this._rootCallMap = rootCallMaps && rootCallMaps.rootCallMap || {};
    this._storage = [];
    if (this._queuedRecords) {
      this._storage.push(this._queuedRecords);
    }
    if (this._records) {
      this._storage.push(this._records);
    }
    if (this._cachedRecords) {
      this._storage.push(this._cachedRecords);
    }
  }

  /**
   * Filter calls to only those that specify conditions on the returned results
   * (ex: `orderby(TOP_STORIES)`), removing generic calls (ex: `first`, `find`).
   */

  /**
   * Get the data ID associated with this root call/value pair.
   */

  RelayRecordStore.prototype.getRootCallID = function getRootCallID(rootCall, rootCallArg) {
    if (RelayNodeInterface.isNodeRootCall(rootCall)) {
      !(rootCallArg != null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.getRootCallID(): Argument to `%s()` cannot be null ' + 'or undefined.', rootCall) : invariant(false) : undefined;
      return rootCallArg;
    }
    if (rootCallArg == null) {
      rootCallArg = EMPTY;
    }
    if (this._rootCallMap.hasOwnProperty(rootCall) && this._rootCallMap[rootCall].hasOwnProperty(rootCallArg)) {
      return this._rootCallMap[rootCall][rootCallArg];
    } else if (this._cachedRootCallMap.hasOwnProperty(rootCall)) {
      return this._cachedRootCallMap[rootCall][rootCallArg];
    }
  };

  /**
   * Associate a data ID with the given root call/value pair.
   */

  RelayRecordStore.prototype.putRootCallID = function putRootCallID(rootCall, rootCallArg, dataID) {
    if (RelayNodeInterface.isNodeRootCall(rootCall)) {
      !(rootCallArg != null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putRootCallID(): Argument to `%s()` cannot be null ' + 'or undefined.', rootCall) : invariant(false) : undefined;
      return;
    }
    if (rootCallArg == null) {
      rootCallArg = EMPTY;
    }
    this._rootCallMap[rootCall] = this._rootCallMap[rootCall] || {};
    this._rootCallMap[rootCall][rootCallArg] = dataID;
    if (this._cacheManager) {
      this._cacheManager.cacheRootCall(rootCall, rootCallArg, dataID);
    }
  };

  /**
   * Returns the status of the record stored at `dataID`.
   */

  RelayRecordStore.prototype.getRecordState = function getRecordState(dataID) {
    var record = this._getRecord(dataID);
    if (record === null) {
      return 'NONEXISTENT';
    } else if (record === undefined) {
      return 'UNKNOWN';
    }
    return 'EXISTENT';
  };

  /**
   * Create an empty record at `dataID` if a record does not already exist.
   */

  RelayRecordStore.prototype.putRecord = function putRecord(dataID, path) {
    var target = this._queuedRecords || this._records;
    var prevRecord = target[dataID];
    if (prevRecord) {
      if (target === this._queuedRecords) {
        this._setClientMutationID(prevRecord);
      }
      return;
    }
    var nextRecord = {
      __dataID__: dataID
    };
    if (target === this._queuedRecords) {
      this._setClientMutationID(nextRecord);
    }
    if (GraphQLStoreDataHandler.isClientID(dataID)) {
      !path ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putRecord(): Expected a path for non-refetchable ' + 'record `%s`.', dataID) : invariant(false) : undefined;
      nextRecord[PATH] = path;
    }
    target[dataID] = nextRecord;
    var cacheManager = this._cacheManager;
    if (!this._queuedRecords && cacheManager) {
      cacheManager.cacheField(dataID, '__dataID__', dataID);
      var cachedPath = nextRecord[PATH];
      if (cachedPath) {
        cacheManager.cacheField(dataID, '__path__', cachedPath);
      }
    }
  };

  /**
   * Returns the path to a non-refetchable record.
   */

  RelayRecordStore.prototype.getPathToRecord = function getPathToRecord(dataID) {
    var path = this._getField(dataID, PATH);
    return path;
  };

  /**
   * Returns whether a given record is affected by an optimistic update.
   */

  RelayRecordStore.prototype.hasOptimisticUpdate = function hasOptimisticUpdate(dataID) {
    dataID = GraphQLStoreRangeUtils.getCanonicalClientID(dataID);
    !this._queuedRecords ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.hasOptimisticUpdate(): Optimistic updates require ' + 'queued records.') : invariant(false) : undefined;
    return this._queuedRecords.hasOwnProperty(dataID);
  };

  /**
   * Returns a list of client mutation IDs for queued mutations whose optimistic
   * updates are affecting the record corresponding the given dataID. Returns
   * null if the record isn't affected by any optimistic updates.
   */

  RelayRecordStore.prototype.getClientMutationIDs = function getClientMutationIDs(dataID) {
    dataID = GraphQLStoreRangeUtils.getCanonicalClientID(dataID);
    !this._queuedRecords ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.getClientMutationIDs(): Optimistic updates require ' + 'queued records.') : invariant(false) : undefined;
    var record = this._queuedRecords[dataID];
    return record ? record.__mutationIDs__ : null;
  };

  /**
   * Returns whether an error occurred during a mutation affecting the
   * given (queued) record.
   */

  RelayRecordStore.prototype.hasMutationError = function hasMutationError(dataID) {
    if (this._queuedRecords) {
      var record = this._queuedRecords[dataID];
      return !!(record && record.__hasError__);
    }
    return false;
  };

  /**
   * Sets the mutation status of a queued record to the given value.
   */

  RelayRecordStore.prototype.setMutationErrorStatus = function setMutationErrorStatus(dataID, hasError) {
    !this._queuedRecords ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.setMutationErrorStatus(): Can only set the ' + 'mutation status of queued records.') : invariant(false) : undefined;
    var record = this._queuedRecords[dataID];
    !record ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.setMutationErrorStatus(): Expected record `%s` to ' + 'exist before settings its mutation error status.', dataID) : invariant(false) : undefined;
    record.__hasError__ = hasError;
  };

  /**
   * Delete the record at `dataID`, setting its value to `null`.
   */

  RelayRecordStore.prototype.deleteRecord = function deleteRecord(dataID) {
    var target = this._queuedRecords || this._records;
    target[dataID] = null;

    // Remove any links for this record
    if (!this._queuedRecords) {
      delete this._nodeConnectionMap[dataID];
      if (this._cacheManager) {
        this._cacheManager.cacheNode(dataID, null);
      }
    }
  };

  /**
   * Returns the value of the field for the given dataID.
   */

  RelayRecordStore.prototype.getField = function getField(dataID, storageKey) {
    return this._getField(dataID, storageKey);
  };

  /**
   * Sets the value of a scalar field.
   */

  RelayRecordStore.prototype.putField = function putField(dataID, storageKey, value) {
    var record = this._getRecordForWrite(dataID);
    !record ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putField(): Expected record `%s` to exist before ' + 'writing field `%s`.', dataID, storageKey) : invariant(false) : undefined;
    record[storageKey] = value;
    if (!this._queuedRecords && this._cacheManager) {
      this._cacheManager.cacheField(dataID, storageKey, value);
    }
  };

  /**
   * Clears the value of a field by setting it to null/undefined.
   */

  RelayRecordStore.prototype.deleteField = function deleteField(dataID, storageKey) {
    var record = this._getRecordForWrite(dataID);
    !record ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.deleteField(): Expected record `%s` to exist before ' + 'deleting field `%s`.', dataID, storageKey) : invariant(false) : undefined;
    record[storageKey] = null;
    if (!this._queuedRecords && this._cacheManager) {
      this._cacheManager.cacheField(dataID, storageKey, null);
    }
  };

  /**
   * Returns the Data ID of a linked record (eg the ID of the `address` record
   * in `actor{address}`).
   */

  RelayRecordStore.prototype.getLinkedRecordID = function getLinkedRecordID(dataID, storageKey) {
    var field = this._getField(dataID, storageKey);
    if (field == null) {
      return field;
    }
    !(typeof field === 'object' && field !== null && !Array.isArray(field)) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.getLinkedRecordID(): Expected field `%s` for record ' + '`%s` to have a linked record.', storageKey, dataID) : invariant(false) : undefined;
    return field.__dataID__;
  };

  /**
   * Creates/updates a link between two records via the given field.
   */

  RelayRecordStore.prototype.putLinkedRecordID = function putLinkedRecordID(parentID, storageKey, recordID) {
    var parent = this._getRecordForWrite(parentID);
    !parent ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putLinkedRecordID(): Expected record `%s` to exist ' + 'before linking to record `%s`.', parentID, recordID) : invariant(false) : undefined;
    var record = this._getRecord(recordID);
    !record ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putLinkedRecordID(): Expected record `%s` to exist ' + 'before linking from record `%s`.', recordID, parentID) : invariant(false) : undefined;
    var fieldValue = {
      __dataID__: recordID
    };
    parent[storageKey] = fieldValue;
    if (!this._queuedRecords && this._cacheManager) {
      this._cacheManager.cacheField(parentID, storageKey, fieldValue);
    }
  };

  /**
   * Returns an array of Data ID for a plural linked field (eg the actor IDs of
   * the `likers` in `story{likers}`).
   */

  RelayRecordStore.prototype.getLinkedRecordIDs = function getLinkedRecordIDs(dataID, storageKey) {
    var field = this._getField(dataID, storageKey);
    if (field == null) {
      return field;
    }
    !Array.isArray(field) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.getLinkedRecordIDs(): Expected field `%s` for ' + 'record `%s` to have an array of linked records.', storageKey, dataID) : invariant(false) : undefined;
    return field.map(function (item, ii) {
      !(typeof item === 'object' && item.__dataID__) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.getLinkedRecordIDs(): Expected element at index %s ' + 'in field `%s` for record `%s` to be a linked record.', ii, storageKey, dataID) : invariant(false) : undefined;
      return item.__dataID__;
    });
  };

  /**
   * Creates/updates a one-to-many link between records via the given field.
   */

  RelayRecordStore.prototype.putLinkedRecordIDs = function putLinkedRecordIDs(parentID, storageKey, recordIDs) {
    var _this = this;

    var parent = this._getRecordForWrite(parentID);
    !parent ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putLinkedRecordIDs(): Expected record `%s` to exist ' + 'before linking records.', parentID) : invariant(false) : undefined;
    var records = recordIDs.map(function (recordID) {
      var record = _this._getRecord(recordID);
      !record ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putLinkedRecordIDs(): Expected record `%s` to ' + 'exist before linking from `%s`.', recordID, parentID) : invariant(false) : undefined;
      return {
        __dataID__: recordID
      };
    });
    parent[storageKey] = records;
    if (!this._queuedRecords && this._cacheManager) {
      this._cacheManager.cacheField(parentID, storageKey, records);
    }
  };

  /**
   * Gets the connectionIDs for all the connections that contain the given
   * record as a `node`, or null if the record does not appear as a `node` in
   * any connection.
   */

  RelayRecordStore.prototype.getConnectionIDsForRecord = function getConnectionIDsForRecord(dataID) {
    var connectionIDs = this._nodeConnectionMap[dataID];
    if (connectionIDs) {
      return _Object$keys(connectionIDs);
    }
    return null;
  };

  /**
   * Gets the connectionIDs for all variations of calls for the given base
   * schema name (Ex: `posts.orderby(recent)` and `posts.orderby(likes)`).
   */

  RelayRecordStore.prototype.getConnectionIDsForField = function getConnectionIDsForField(dataID, schemaName) {
    // ignore queued records because not all range fields may be present there
    var record = this._records[dataID];
    if (record == null) {
      return record;
    }
    var connectionIDs;
    forEachObject(record, function (datum, key) {
      if (datum && getFieldNameFromKey(key) === schemaName) {
        var dataID = datum.__dataID__;
        if (dataID) {
          connectionIDs = connectionIDs || [];
          connectionIDs.push(dataID);
        }
      }
    });
    return connectionIDs;
  };

  /**
   * Get the force index associated with the range at `connectionID`.
   */

  RelayRecordStore.prototype.getRangeForceIndex = function getRangeForceIndex(connectionID) {
    var forceIndex = this._getField(connectionID, FORCE_INDEX);
    if (forceIndex === null) {
      return -1;
    }
    // __forceIndex__ can only be a number
    return forceIndex || 0;
  };

  /**
   * Get the condition calls that were used to fetch the given connection.
   * Ex: for a field `photos.orderby(recent)`, this would be
   * [{name: 'orderby', value: 'recent'}]
   */

  RelayRecordStore.prototype.getRangeFilterCalls = function getRangeFilterCalls(connectionID) {
    return this._getField(connectionID, FILTER_CALLS);
  };

  /**
   * Returns range information for the given connection field:
   * - `requestedEdges`: any edges already fetched for the given `calls`.
   * - `diffCalls`: an array of calls describing the difference
   *   between the given `calls` and already fetched data. Includes conditional
   *   calls (`orderby`) and range/offset calls (`first`, `after`).
   * - `filterCalls`: the subset of `calls` that are condition calls
   *   (`orderby`).
   */

  RelayRecordStore.prototype.getRangeMetadata = function getRangeMetadata(connectionID, calls) {
    var _this2 = this;

    if (connectionID == null) {
      return connectionID;
    }
    var range = this._getField(connectionID, RANGE);
    if (range == null) {
      if (range === null) {
        process.env.NODE_ENV !== 'production' ? warning(false, 'RelayRecordStore.getRangeMetadata(): Expected range to exist if ' + '`edges` has been fetched.') : undefined;
      }
      return undefined;
    }
    var filterCalls = getFilterCalls(calls);
    // Edges can only be fetched if a range call (first/last/find) is given.
    // Otherwise return diffCalls/filterCalls with empty edges.
    if (calls.length === filterCalls.length) {
      return {
        diffCalls: calls,
        filterCalls: filterCalls,
        pageInfo: undefined,
        requestedEdges: []
      };
    }
    // Convert ordered `{name,value}` objects to `GraphQL.Call`s
    // TODO: make GraphQLRange accept output of `getCallsWithValues()`
    var queuedRecord = this._queuedRecords ? this._queuedRecords[connectionID] : null;

    var _range$retrieveRangeInfoForQuery = range.retrieveRangeInfoForQuery(calls, queuedRecord);

    var diffCalls = _range$retrieveRangeInfoForQuery.diffCalls;
    var pageInfo = _range$retrieveRangeInfoForQuery.pageInfo;
    var requestedEdgeIDs = _range$retrieveRangeInfoForQuery.requestedEdgeIDs;

    if (diffCalls && diffCalls.length) {
      diffCalls = filterCalls.concat(diffCalls);
    } else {
      diffCalls = [];
    }
    var requestedEdges;
    if (requestedEdgeIDs) {
      requestedEdges = requestedEdgeIDs.map(function (edgeID) {
        return {
          edgeID: edgeID,
          nodeID: _this2.getLinkedRecordID(edgeID, NODE)
        };
      }).filter(function (edge) {
        return _this2._getRecord(edge.nodeID);
      });
    } else {
      requestedEdges = [];
    }
    return {
      diffCalls: diffCalls,
      filterCalls: filterCalls,
      pageInfo: pageInfo,
      requestedEdges: requestedEdges
    };
  };

  /**
   * Creates a range at `dataID` with an optional `forceIndex`.
   */

  RelayRecordStore.prototype.putRange = function putRange(connectionID, calls, forceIndex) {
    !!this._queuedRecords ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putRange(): Cannot create a queued range.') : invariant(false) : undefined;
    var record = this._getRecord(connectionID);
    !record ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putRange(): Expected record `%s` to exist before ' + 'adding a range.', connectionID) : invariant(false) : undefined;
    var range = new GraphQLRange();
    var filterCalls = getFilterCalls(calls);
    forceIndex = forceIndex || 0;
    record.__filterCalls__ = filterCalls;
    record.__forceIndex__ = forceIndex;
    record.__range__ = range;

    var cacheManager = this._cacheManager;
    if (!this._queuedRecords && cacheManager) {
      cacheManager.cacheField(connectionID, FILTER_CALLS, filterCalls);
      cacheManager.cacheField(connectionID, FORCE_INDEX, forceIndex);
      cacheManager.cacheField(connectionID, RANGE, range);
    }
  };

  /**
   * Returns whether there is a range at `connectionID`.
   */

  RelayRecordStore.prototype.hasRange = function hasRange(connectionID) {
    return !!this._getField(connectionID, RANGE);
  };

  /**
   * Adds newly fetched edges to a range.
   */

  RelayRecordStore.prototype.putRangeEdges = function putRangeEdges(connectionID, calls, pageInfo, edges) {
    var _this3 = this;

    var range = this._getField(connectionID, RANGE);
    !range ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore.putRangeEdges(): Expected record `%s` to exist and ' + 'have a range.', connectionID) : invariant(false) : undefined;
    var edgesData = [];
    edges.forEach(function (edgeID) {
      var edgeData = _this3._getRangeEdgeData(edgeID);
      edgesData.push(edgeData);
      _this3._addConnectionForNode(connectionID, edgeData.node.__dataID__);
    });
    range.addItems(calls, edgesData, pageInfo);
    if (!this._queuedRecords && this._cacheManager) {
      this._cacheManager.cacheField(connectionID, RANGE, range);
    }
  };

  /**
   * Prepend, append, or delete edges to/from a range.
   */

  RelayRecordStore.prototype.applyRangeUpdate = function applyRangeUpdate(connectionID, edgeID, operation) {
    if (this._queuedRecords) {
      this._applyOptimisticRangeUpdate(connectionID, edgeID, operation);
    } else {
      this._applyServerRangeUpdate(connectionID, edgeID, operation);
    }
  };

  /**
   * Completely removes the record identified by `dataID` from the store
   */

  RelayRecordStore.prototype.removeRecord = function removeRecord(dataID) {
    delete this._records[dataID];
    if (this._queuedRecords) {
      delete this._queuedRecords[dataID];
    }
    if (this._cachedRecords) {
      delete this._cachedRecords[dataID];
    }
  };

  /**
   * Get edge data in a format compatibile with `GraphQLRange`.
   * TODO: change `GraphQLRange` to accept `(edgeID, cursor, nodeID)` tuple
   */

  RelayRecordStore.prototype._getRangeEdgeData = function _getRangeEdgeData(edgeID) {
    var nodeID = this.getLinkedRecordID(edgeID, NODE);
    !nodeID ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore: Expected edge `%s` to have a `node` record.', edgeID) : invariant(false) : undefined;
    return {
      __dataID__: edgeID,
      cursor: this.getField(edgeID, CURSOR),
      node: {
        __dataID__: nodeID
      }
    };
  };

  RelayRecordStore.prototype._applyOptimisticRangeUpdate = function _applyOptimisticRangeUpdate(connectionID, edgeID, operation) {
    !this._queuedRecords ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore: Expected queued records to exist for optimistic ' + '`%s` update to record `%s`.', operation, connectionID) : invariant(false) : undefined;
    var record = this._queuedRecords[connectionID];
    if (!record) {
      /* $FlowIssue #5995526 - Ideally we want to do something like
       * record = ({ ... }: Record)
       * however a bug in Flow is preventing that from working.
       */
      record = { __dataID__: connectionID };
      this._queuedRecords[connectionID] = record;
    }
    this._setClientMutationID(record);
    var queue = record[operation];
    if (!queue) {
      queue = [];
      record[operation] = queue;
    }
    if (operation === PREPEND) {
      queue.unshift(edgeID);
    } else {
      queue.push(edgeID);
    }
  };

  RelayRecordStore.prototype._applyServerRangeUpdate = function _applyServerRangeUpdate(connectionID, edgeID, operation) {
    !this._records ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore: Expected base records to exist for `%s` update to ' + 'record `%s`.', operation, connectionID) : invariant(false) : undefined;
    var range = this._getField(connectionID, RANGE);
    !range ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore: Cannot apply `%s` update to non-existent record `%s`.', operation, connectionID) : invariant(false) : undefined;
    if (operation === REMOVE) {
      range.removeEdgeWithID(edgeID);
      var nodeID = this.getLinkedRecordID(edgeID, 'node');
      if (nodeID) {
        this._removeConnectionForNode(connectionID, nodeID);
      }
    } else {
      var edgeData = this._getRangeEdgeData(edgeID);
      this._addConnectionForNode(connectionID, edgeData.node.__dataID__);
      if (operation === APPEND) {
        range.appendEdge(this._getRangeEdgeData(edgeID));
      } else {
        // prepend
        range.prependEdge(this._getRangeEdgeData(edgeID));
      }
    }
    if (this._cacheManager) {
      this._cacheManager.cacheField(connectionID, RANGE, range);
    }
  };

  /**
   * Record that the node is contained in the connection.
   */

  RelayRecordStore.prototype._addConnectionForNode = function _addConnectionForNode(connectionID, nodeID) {
    var connectionMap = this._nodeConnectionMap[nodeID];
    if (!connectionMap) {
      connectionMap = {};
      this._nodeConnectionMap[nodeID] = connectionMap;
    }
    connectionMap[connectionID] = true;
  };

  /**
   * Record that the given node is no longer part of the connection.
   */

  RelayRecordStore.prototype._removeConnectionForNode = function _removeConnectionForNode(connectionID, nodeID) {
    var connectionMap = this._nodeConnectionMap[nodeID];
    if (connectionMap) {
      delete connectionMap[connectionID];
      if (_Object$keys(connectionMap).length === 0) {
        delete this._nodeConnectionMap[nodeID];
      }
    }
  };

  /**
   * Gets the first version of the record from the available caches.
   */

  RelayRecordStore.prototype._getRecord = function _getRecord(dataID) {
    if (this._queuedRecords && this._queuedRecords.hasOwnProperty(dataID)) {
      return this._queuedRecords[dataID];
    } else if (this._records.hasOwnProperty(dataID)) {
      return this._records[dataID];
    } else if (this._cachedRecords) {
      return this._cachedRecords[dataID];
    }
  };

  /**
   * If the record is in the store, gets or creates a version of the record
   * in the store being used for writes.
   */

  RelayRecordStore.prototype._getRecordForWrite = function _getRecordForWrite(dataID) {
    // Cannot write to non-existent records, so ensure the record exists first.
    // Returning null/undefined allows for local invariant checks at call sites
    // with specific error messaging.
    var record = this._getRecord(dataID);
    if (!record) {
      return record;
    }
    // Create an empty version of the record in the writable store if it does
    // not already exist there.
    var source = this._queuedRecords || this._records;
    if (!source[dataID]) {
      record = source[dataID] = {
        __dataID__: dataID
      };
    }
    if (source === this._queuedRecords) {
      this._setClientMutationID(record);
    }
    return record;
  };

  /**
   * Get the value of the field from the first version of the record for which
   * the field is defined, returning `null` if the record has been deleted or
   * `undefined` if the record has not been fetched.
   */

  RelayRecordStore.prototype._getField = function _getField(dataID, storageKey) {
    var storage = this._storage;
    for (var ii = 0; ii < storage.length; ii++) {
      var record = storage[ii][dataID];
      if (record === null) {
        return null;
      } else if (record && record.hasOwnProperty(storageKey)) {
        return record[storageKey];
      }
    }
    return undefined;
  };

  /**
   * Injects the client mutation id associated with the record store instance
   * into the given record.
   */

  RelayRecordStore.prototype._setClientMutationID = function _setClientMutationID(record) {
    var clientMutationID = this._clientMutationID;
    !clientMutationID ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRecordStore: _clientMutationID cannot be null/undefined.') : invariant(false) : undefined;
    var mutationIDs = record.__mutationIDs__ || [];
    if (mutationIDs.indexOf(clientMutationID) === -1) {
      mutationIDs.push(clientMutationID);
      record.__mutationIDs__ = mutationIDs;
    }
  };

  return RelayRecordStore;
})();

function getFilterCalls(calls) {
  return calls.filter(function (call) {
    return !RelayConnectionInterface.isConnectionCall(call);
  });
}

/**
 * Returns the field name based on the object key used to store the data in
 * nodeData. It returns the field name without any calls. For example, the
 * field name for 'profile_picture.size(50)' will be 'profile_picture'
 */
function getFieldNameFromKey(key) {
  return key.split('.')[0];
}

module.exports = RelayRecordStore;

/**
 * $FlowIssue: the catch-all "mixed" type above should allow us to set
 * "append", "prepend" etc as keys in _applyOptimisticRangeUpdate, but it does
 * not.
 */