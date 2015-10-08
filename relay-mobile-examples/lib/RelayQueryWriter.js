/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayQueryWriter
 * 
 * @typechecks
 */

'use strict';

var _inherits = require('babel-runtime/helpers/inherits')['default'];

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var RelayQuery = require('./RelayQuery');

var RelayConnectionInterface = require('./RelayConnectionInterface');

var RelayQueryVisitor = require('./RelayQueryVisitor');
var RelayRecordState = require('./RelayRecordState');

var generateClientEdgeID = require('./generateClientEdgeID');
var generateClientID = require('./generateClientID');
var invariant = require('fbjs/lib/invariant');
var warning = require('fbjs/lib/warning');

var EDGES = RelayConnectionInterface.EDGES;
var NODE = RelayConnectionInterface.NODE;
var PAGE_INFO = RelayConnectionInterface.PAGE_INFO;

var ID = 'id';

/**
 * @internal
 *
 * Helper for writing the result of one or more queries/operations into the
 * store, updating tracked queries, and recording changed record IDs.
 */

var RelayQueryWriter = (function (_RelayQueryVisitor) {
  _inherits(RelayQueryWriter, _RelayQueryVisitor);

  function RelayQueryWriter(store, queryTracker, changeTracker, options) {
    _classCallCheck(this, RelayQueryWriter);

    _RelayQueryVisitor.call(this);
    this._changeTracker = changeTracker;
    this._forceIndex = options && options.forceIndex ? options.forceIndex : 0;
    this._store = store;
    this._queryTracker = queryTracker;
    this._updateTrackedQueries = !!(options && options.updateTrackedQueries);
  }

  RelayQueryWriter.prototype.getRecordStore = function getRecordStore() {
    return this._store;
  };

  /**
   * Traverses a query and payload in parallel, writing the results into the
   * store.
   */

  RelayQueryWriter.prototype.writePayload = function writePayload(node, recordID, responseData, path) {
    var _this = this;

    var state = {
      nodeID: null,
      recordID: recordID,
      responseData: responseData,
      path: path
    };

    if (node instanceof RelayQuery.Field && !node.isScalar()) {
      // for non-scalar fields, the recordID is the parent
      node.getChildren().forEach(function (child) {
        _this.visit(child, state);
      });
      return;
    }

    this.visit(node, state);
  };

  /**
   * Records are "created" whenever an entry did not previously exist for the
   * `recordID`, including cases when a `recordID` is created with a null value.
   */

  RelayQueryWriter.prototype.recordCreate = function recordCreate(recordID) {
    this._changeTracker.createID(recordID);
  };

  /**
   * Records are "updated" if any field changes (including being set to null).
   * Updates are not recorded for newly created records.
   */

  RelayQueryWriter.prototype.recordUpdate = function recordUpdate(recordID) {
    this._changeTracker.updateID(recordID);
  };

  /**
   * Determine if the record was created or updated by this write operation.
   */

  RelayQueryWriter.prototype.hasChangeToRecord = function hasChangeToRecord(recordID) {
    return this._changeTracker.hasChange(recordID);
  };

  /**
   * Determine if the record was created by this write operation.
   */

  RelayQueryWriter.prototype.isNewRecord = function isNewRecord(recordID) {
    return this._changeTracker.isNewRecord(recordID);
  };

  /**
   * Helper to create a record and the corresponding notification.
   */

  RelayQueryWriter.prototype.createRecordIfMissing = function createRecordIfMissing(node, recordID, path) {
    var recordState = this._store.getRecordState(recordID);
    if (recordState !== RelayRecordState.EXISTENT) {
      this._store.putRecord(recordID, path);
      this.recordCreate(recordID);
    }
    if (this.isNewRecord(recordID) || this._updateTrackedQueries) {
      this._queryTracker.trackNodeForID(node, recordID, path);
    }
  };

  RelayQueryWriter.prototype.visitRoot = function visitRoot(root, state) {
    var path = state.path;
    var recordID = state.recordID;
    var responseData = state.responseData;

    var recordState = this._store.getRecordState(recordID);

    // GraphQL should never return undefined for a field
    if (responseData == null) {
      !(responseData !== undefined) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Unexpectedly encountered `undefined` in payload. ' + 'Cannot set root record `%s` to undefined.', recordID) : invariant(false) : undefined;
      this._store.deleteRecord(recordID);
      if (recordState === RelayRecordState.EXISTENT) {
        this.recordUpdate(recordID);
      }
      return;
    }
    if (recordState !== RelayRecordState.EXISTENT) {
      this._store.putRecord(recordID, path);
      this.recordCreate(recordID);
    }
    if (this.isNewRecord(recordID) || this._updateTrackedQueries) {
      this._queryTracker.trackNodeForID(root, recordID, path);
    }
    this.traverse(root, state);
  };

  RelayQueryWriter.prototype.visitField = function visitField(field, state) {
    var recordID = state.recordID;
    var responseData = state.responseData;

    !(this._store.getRecordState(recordID) === RelayRecordState.EXISTENT) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Cannot update a non-existent record, `%s`.', recordID) : invariant(false) : undefined;
    !(typeof responseData === 'object' && responseData !== null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Cannot update record `%s`, expected response to be ' + 'an object.', recordID) : invariant(false) : undefined;

    // handle missing data
    var fieldData = responseData[field.getSerializationKey()];
    if (fieldData === undefined) {
      return;
    }
    if (fieldData === null) {
      this._store.deleteField(recordID, field.getStorageKey());
      this.recordUpdate(recordID);
      return;
    }

    if (field.isScalar()) {
      this._writeScalar(field, state, recordID, fieldData);
    } else if (field.isConnection()) {
      this._writeConnection(field, state, recordID, fieldData);
    } else if (field.isPlural()) {
      this._writePluralLink(field, state, recordID, fieldData);
    } else {
      this._writeLink(field, state, recordID, fieldData);
    }
  };

  /**
   * Writes the value for a 'scalar' field such as `id` or `name`. The response
   * data is expected to be scalar values or arrays of scalar values.
   */

  RelayQueryWriter.prototype._writeScalar = function _writeScalar(field, state, recordID, nextValue) {
    var storageKey = field.getStorageKey();
    var prevValue = this._store.getField(recordID, storageKey);

    // always update the store to ensure the value is present in the appropriate
    // data sink (records/queuedRecords), but only record an update if the value
    // changed.
    this._store.putField(recordID, storageKey, nextValue);

    // TODO: Flow: `nextValue` is an array, array indexing should work
    if (Array.isArray(prevValue) && Array.isArray(nextValue) && prevValue.length === nextValue.length && prevValue.every(function (prev, ii) {
      return prev === nextValue[ii];
    })) {
      return;
    } else if (prevValue === nextValue) {
      return;
    }
    this.recordUpdate(recordID);
  };

  /**
   * Writes data for connection fields such as `news_feed` or `friends`. The
   * response data is expected to be array of edge objects.
   */

  RelayQueryWriter.prototype._writeConnection = function _writeConnection(field, state, recordID, connectionData) {
    // Each unique combination of filter calls is stored in its own
    // generated record (ex: `field.orderby(x)` results are separate from
    // `field.orderby(y)` results).
    var storageKey = field.getStorageKey();
    var connectionID = this._store.getLinkedRecordID(recordID, storageKey);
    if (!connectionID) {
      connectionID = generateClientID();
    }
    var connectionRecordState = this._store.getRecordState(connectionID);
    var hasEdges = !!(field.getFieldByStorageKey(EDGES) || connectionData != null && typeof connectionData === 'object' && connectionData[EDGES]);
    var path = state.path.getPath(field, connectionID);
    // always update the store to ensure the value is present in the appropriate
    // data sink (records/queuedRecords), but only record an update if the value
    // changed.
    this._store.putRecord(connectionID, path);
    this._store.putLinkedRecordID(recordID, storageKey, connectionID);
    // record the create/update only if something changed
    if (connectionRecordState !== RelayRecordState.EXISTENT) {
      this.recordUpdate(recordID);
      this.recordCreate(connectionID);
    }
    if (this.isNewRecord(connectionID) || this._updateTrackedQueries) {
      this._queryTracker.trackNodeForID(field, connectionID, path);
    }

    // Only create a range if `edges` field is present
    // Overwrite an existing range only if the new force index is greater
    if (hasEdges && (!this._store.hasRange(connectionID) || this._forceIndex && this._forceIndex > this._store.getRangeForceIndex(connectionID))) {
      this._store.putRange(connectionID, field.getCallsWithValues(), this._forceIndex);
      this.recordUpdate(connectionID);
    }

    var connectionState = {
      path: path,
      nodeID: null,
      recordID: connectionID,
      responseData: connectionData
    };
    this._traverseConnection(field, field, connectionState);
  };

  /**
   * Recurse through connection subfields and write their results. This is
   * necessary because handling an `edges` field also requires information about
   * the parent connection field (see `_writeEdges`).
   */

  RelayQueryWriter.prototype._traverseConnection = function _traverseConnection(connection, // the parent connection
  node, // the parent connection or an intermediary fragment
  state) {
    var _this2 = this;

    node.getChildren().forEach(function (child) {
      if (child instanceof RelayQuery.Field) {
        if (child.getSchemaName() === EDGES) {
          _this2._writeEdges(connection, child, state);
        } else if (child.getSchemaName() !== PAGE_INFO) {
          // Page info is handled by the range
          // Otherwise, write metadata fields normally (ex: `count`)
          _this2.visit(child, state);
        }
      } else {
        // Fragment case, recurse keeping track of parent connection
        _this2._traverseConnection(connection, child, state);
      }
    });
  };

  /**
   * Update a connection with newly fetched edges.
   */

  RelayQueryWriter.prototype._writeEdges = function _writeEdges(connection, edges, state) {
    var _this3 = this;

    var connectionID = state.recordID;
    var connectionData = state.responseData;

    var storageKey = connection.getStorageKey();
    !(typeof connectionData === 'object' && connectionData !== null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Cannot write edges for malformed connection `%s` on ' + 'record `%s`, expected the response to be an object.', storageKey, connectionID) : invariant(false) : undefined;
    var edgesData = connectionData[EDGES];

    // Validate response data.
    if (edgesData == null) {
      process.env.NODE_ENV !== 'production' ? warning(false, 'RelayQueryWriter: Cannot write edges for connection `%s` on record ' + '`%s`, expected a response for field `edges`.', storageKey, connectionID) : undefined;
      return;
    }
    !Array.isArray(edgesData) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Cannot write edges for connection `%s` on record ' + '`%s`, expected `edges` to be an array.', storageKey, connectionID) : invariant(false) : undefined;

    var rangeCalls = connection.getCallsWithValues();
    !RelayConnectionInterface.hasRangeCalls(rangeCalls) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Cannot write edges for connection `%s` on record ' + '`%s` without `first`, `last`, or `find` argument.', storageKey, connectionID) : invariant(false) : undefined;
    var rangeInfo = this._store.getRangeMetadata(connectionID, rangeCalls);
    !rangeInfo ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Expected a range to exist for connection field `%s` ' + 'on record `%s`.', storageKey, connectionID) : invariant(false) : undefined;
    var fetchedEdgeIDs = [];
    var isUpdate = false;
    var nextIndex = 0;
    var requestedEdges = rangeInfo.requestedEdges;
    // Traverse connection edges, reusing existing edges if they exist
    edgesData.forEach(function (edgeData) {
      // validate response data
      if (edgeData == null) {
        return;
      }
      !(typeof edgeData === 'object' && edgeData) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Cannot write edge for connection field `%s` on ' + 'record `%s`, expected an object.', storageKey, connectionID) : invariant(false) : undefined;

      var nodeData = edgeData[NODE];
      if (nodeData == null) {
        return;
      }

      !(typeof nodeData === 'object') ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Expected node to be an object for field `%s` on ' + 'record `%s`.', storageKey, connectionID) : invariant(false) : undefined;

      // For consistency, edge IDs are calculated from the connection & node ID.
      // A node ID is only generated if the node does not have an id and
      // there is no existing edge.
      var prevEdge = requestedEdges[nextIndex++];
      var nodeID = nodeData && nodeData[ID] || prevEdge && _this3._store.getLinkedRecordID(prevEdge.edgeID, NODE) || generateClientID();
      // TODO: Flow: `nodeID` is `string`
      var edgeID = generateClientEdgeID(connectionID, nodeID);
      var path = state.path.getPath(edges, edgeID);
      _this3.createRecordIfMissing(edges, edgeID, path);
      fetchedEdgeIDs.push(edgeID);

      // Write data for the edge, using `nodeID` as the id for direct descendant
      // `node` fields. This is necessary for `node`s that do not have an `id`,
      // which would cause the generated ID here to not match the ID generated
      // in `_writeLink`.
      _this3.traverse(edges, {
        path: path,
        nodeID: nodeID,
        recordID: edgeID,
        responseData: edgeData
      });
      isUpdate = isUpdate || _this3.hasChangeToRecord(edgeID);
    });

    var pageInfo = connectionData[PAGE_INFO] || RelayConnectionInterface.getDefaultPageInfo();
    this._store.putRangeEdges(connectionID, rangeCalls, pageInfo, fetchedEdgeIDs);

    // Only broadcast an update to the range if an edge was added/changed.
    // Node-level changes will broadcast at the node ID.
    if (isUpdate) {
      this.recordUpdate(connectionID);
    }
  };

  /**
   * Writes a plural linked field such as `actors`. The response data is
   * expected to be an array of item objects. These fields are similar to
   * connections, but do not support range calls such as `first` or `after`.
   */

  RelayQueryWriter.prototype._writePluralLink = function _writePluralLink(field, state, recordID, fieldData) {
    var _this4 = this;

    var storageKey = field.getStorageKey();
    !Array.isArray(fieldData) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Expected array data for field `%s` on record `%s`.', storageKey, recordID) : invariant(false) : undefined;

    var prevLinkedIDs = this._store.getLinkedRecordIDs(recordID, storageKey);
    var nextLinkedIDs = [];
    var isUpdate = !prevLinkedIDs;
    var nextIndex = 0;
    fieldData.forEach(function (nextRecord) {
      // validate response data
      if (nextRecord == null) {
        return;
      }
      !(typeof nextRecord === 'object' && nextRecord) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Expected elements for plural field `%s` to be ' + 'objects.', storageKey) : invariant(false) : undefined;

      // Reuse existing generated IDs if the node does not have its own `id`.
      // TODO: Flow: `nextRecord` is asserted as typeof === 'object'
      var prevLinkedID = prevLinkedIDs && prevLinkedIDs[nextIndex];
      var nextLinkedID = nextRecord[ID] || prevLinkedID || generateClientID();
      nextLinkedIDs.push(nextLinkedID);

      var path = state.path.getPath(field, nextLinkedID);
      _this4.createRecordIfMissing(field, nextLinkedID, path);
      isUpdate = isUpdate || nextLinkedID !== prevLinkedID || _this4.isNewRecord(nextLinkedID);

      _this4.traverse(field, {
        path: path,
        nodeID: null, // never propagate `nodeID` past the first linked field
        recordID: nextLinkedID,
        responseData: nextRecord
      });
      isUpdate = isUpdate || _this4.hasChangeToRecord(nextLinkedID);
      nextIndex++;
    });

    this._store.putLinkedRecordIDs(recordID, storageKey, nextLinkedIDs);

    // Only broadcast a list-level change if a record was changed/added
    if (isUpdate) {
      this.recordUpdate(recordID);
    }
  };

  /**
   * Writes a link from one record to another, for example linking the `viewer`
   * record to the `actor` record in the query `viewer { actor }`. The `field`
   * variable is the field being linked (`actor` in the example).
   */

  RelayQueryWriter.prototype._writeLink = function _writeLink(field, state, recordID, fieldData) {
    var nodeID = state.nodeID;

    var storageKey = field.getStorageKey();
    !(typeof fieldData === 'object') ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryWriter: Expected data for non-scalar field `%s` on record ' + '`%s` to be an object.', storageKey, recordID) : invariant(false) : undefined;

    // Prefer the actual `id` if present, otherwise generate one (if an id
    // was already generated it is reused). `node`s within a connection are
    // a special case as the ID used here must match the one generated prior to
    // storing the parent `edge`.
    // TODO: Flow: `fieldData` is asserted as typeof === 'object'
    var prevLinkedID = this._store.getLinkedRecordID(recordID, storageKey);
    var nextLinkedID = field.getSchemaName() === NODE && nodeID || fieldData[ID] || prevLinkedID || generateClientID();

    var path = state.path.getPath(field, nextLinkedID);
    this.createRecordIfMissing(field, nextLinkedID, path);
    // always update the store to ensure the value is present in the appropriate
    // data sink (record/queuedRecords), but only record an update if the value
    // changed.
    this._store.putLinkedRecordID(recordID, storageKey, nextLinkedID);
    if (prevLinkedID !== nextLinkedID || this.isNewRecord(nextLinkedID)) {
      this.recordUpdate(recordID);
    }

    this.traverse(field, {
      path: path,
      nodeID: null,
      recordID: nextLinkedID,
      responseData: fieldData
    });
  };

  return RelayQueryWriter;
})(RelayQueryVisitor);

module.exports = RelayQueryWriter;