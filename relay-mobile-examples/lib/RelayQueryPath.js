/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayQueryPath
 * 
 * @typechecks
 */

// Placeholder to mark fields as non-scalar
'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _extends = require('babel-runtime/helpers/extends')['default'];

var RelayNodeInterface = require('./RelayNodeInterface');
var GraphQLStoreDataHandler = require('./GraphQLStoreDataHandler');
var RelayQuery = require('./RelayQuery');
var RelayQuerySerializer = require('./RelayQuerySerializer');

var invariant = require('fbjs/lib/invariant');

var EMPTY_FRAGMENT = RelayQuery.Node.buildFragment('$RelayQueryPath', 'Node');

/**
 * @internal
 *
 * Represents the path (root plus fields) within a query that fetched a
 * particular node. Each step of the path may represent a root query (for
 * refetchable nodes) or the field path from the nearest refetchable node.
 */

var RelayQueryPath = (function () {
  function RelayQueryPath(node, parent) {
    _classCallCheck(this, RelayQueryPath);

    if (node instanceof RelayQuery.Root) {
      !!parent ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryPath: Root paths may not have a parent.') : invariant(false) : undefined;
      this._name = node.getName();
    } else {
      !parent ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryPath: A parent is required for field paths.') : invariant(false) : undefined;
      this._name = parent.getName();
    }
    this._node = node;
    this._parent = parent;
  }

  /**
   * Creates a shallow version of `node` with only a primary key field. If the
   * node is not scalar and would otherwise be empty, an empty fragment is added.
   */

  /**
   * Returns true if this is a root path (the node is a root node with an ID),
   * false otherwise.
   */

  RelayQueryPath.prototype.isRootPath = function isRootPath() {
    return !this._parent;
  };

  /**
   * Gets the parent path, throwing if it does not exist. Use `!isRootPath()`
   * to check if there is a parent.
   */

  RelayQueryPath.prototype.getParent = function getParent() {
    var parent = this._parent;
    !parent ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryPath.getParent(): Cannot get the parent of a root path.') : invariant(false) : undefined;
    return parent;
  };

  /**
   * Helper to get the name of the root query node.
   */

  RelayQueryPath.prototype.getName = function getName() {
    return this._name;
  };

  /**
   * Gets a new path that describes how to access the given `node` via the
   * current path. Returns a new, root path if `dataID` is provided and
   * refetchable, otherwise returns an extension of the current path.
   */

  RelayQueryPath.prototype.getPath = function getPath(node, dataID) {
    if (GraphQLStoreDataHandler.isClientID(dataID)) {
      return new RelayQueryPath(node, this);
    } else {
      // refetchable ID
      var root = RelayQuery.Node.buildRoot(RelayNodeInterface.NODE, dataID, [RelayQuery.Node.buildField('id')], { rootArg: RelayNodeInterface.ID }, this.getName());
      return new RelayQueryPath(root);
    }
  };

  /**
   * Returns a new root query that follows only the fields in this path and then
   * appends the specified field/fragment at the node reached by the path.
   *
   * The query also includes any ID fields along the way.
   */

  RelayQueryPath.prototype.getQuery = function getQuery(appendNode) {
    var node = this._node;
    var path = this;
    var child = appendNode;
    while (node instanceof RelayQuery.Field) {
      var idFieldName = node.getInferredPrimaryKey();
      if (idFieldName) {
        child = node.clone([child, node.getFieldByStorageKey(idFieldName)]);
      } else {
        child = node.clone([child]);
      }
      path = path._parent;
      !path ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryPath.getQuery(): Expected field to have a parent path.') : invariant(false) : undefined;
      node = path._node;
    }
    !child ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryPath: Expected a leaf node.') : invariant(false) : undefined;
    !(node instanceof RelayQuery.Root) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryPath: Expected a root node.') : invariant(false) : undefined;
    var rootCall = node.getRootCall();
    return RelayQuery.Node.buildRoot(rootCall.name, rootCall.value, [child, node.getFieldByStorageKey('id')], _extends({}, node.__concreteNode__.metatada, {
      rootArg: node.getRootCallArgument()
    }), this.getName());
  };

  RelayQueryPath.prototype.toJSON = function toJSON() {
    var path = [];
    var next = this;
    while (next) {
      path.unshift(RelayQuerySerializer.toJSON(getShallowClone(next._node)));
      next = next._parent;
    }
    return path;
  };

  RelayQueryPath.fromJSON = function fromJSON(data) {
    !(Array.isArray(data) && data.length > 0) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryPath.fromJSON(): expected an array with at least one item.') : invariant(false) : undefined;
    var root = RelayQuerySerializer.fromJSON(data[0]);
    !(root instanceof RelayQuery.Root) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryPath.fromJSON(): invalid path, expected first node to be ' + 'a `RelayQueryRoot`.') : invariant(false) : undefined;
    var path = new RelayQueryPath(root);

    for (var ii = 1; ii < data.length; ii++) {
      var field = RelayQuerySerializer.fromJSON(data[ii]);
      !(field instanceof RelayQuery.Field) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQueryPath.fromJSON(): invalid path, expected node at index %s ' + 'to be a `RelayQueryField`.', ii) : invariant(false) : undefined;
      path = new RelayQueryPath(field, path);
    }
    return path;
  };

  return RelayQueryPath;
})();

function getShallowClone(node) {
  // cloning with non-empty children guarantees result is non-null
  if (node instanceof RelayQuery.Field) {
    var idFieldName = node.getInferredPrimaryKey();
    var idField = idFieldName && node.getFieldByStorageKey(idFieldName);
    return node.clone([idField || EMPTY_FRAGMENT]);
  }
  return node.clone([node.getFieldByStorageKey('id') || EMPTY_FRAGMENT]);
}

module.exports = RelayQueryPath;