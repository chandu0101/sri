/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule refragmentRelayQuery
 * 
 * @typechecks
 */

'use strict';

var _Object$keys = require('babel-runtime/core-js/object/keys')['default'];

var RelayQuery = require('./RelayQuery');

var invariant = require('fbjs/lib/invariant');

/**
 * @internal
 *
 * `refragmentRelayQuery(query)` returns a clone of `query` such that child
 * fields of dynamically-typed nodes are split into fragments by type. This is
 * necessary when refetching information about a record. The fields fetched for
 * a record may only be available via certain types:
 *
 * ```
 * // Input:
 * {
 *   id,    // fetched via a field of type `Node`
 *   name,  // fetched via a field of type `User`
 * }
 *
 * // Becomes:
 * {
 *   ...on Node { id },
 *   ...on User { name },
 * }
 * ```
 */
function refragmentRelayQuery(node) {
  // Refragmenting is not necessary in these cases:
  // - fragments are primarily constructed by end users, and their fields are
  //   validated at transpile-time.
  // - fields that have a concrete type will always have valid fields.
  if (node instanceof RelayQuery.Fragment || node instanceof RelayQuery.Field && !node.isUnionOrInterface()) {
    return node.clone(node.getChildren().map(refragmentRelayQuery));
  }

  // In all other cases, the fields of a node may be type-dependent:
  // - fields with union/interface types may have varying fields that must
  //   be fragmented.
  // - root fields are fragmented for simplicity, though they can eventually
  //   be annotated with the `isUnionOrInterface` metadata and be treated as
  //   fields.
  var children = [];
  var fieldsByType = {};
  node.getChildren().forEach(function (child) {
    var clone = refragmentRelayQuery(child);
    if (clone == null) {
      return;
    }
    if (clone instanceof RelayQuery.Fragment) {
      children.push(clone);
    } else {
      !(clone instanceof RelayQuery.Field) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'refragmentRelayQuery(): invalid node type, expected a `Field` or ' + '`Fragment`.') : invariant(false) : undefined;
      var parentType = clone.getParentType();
      var fields = fieldsByType[parentType];
      if (!fields) {
        fieldsByType[parentType] = fields = [];
      }
      fields.push(clone);
    }
  });
  _Object$keys(fieldsByType).forEach(function (type) {
    children.push(RelayQuery.Node.buildFragment('refragmentRelayQuery', type, fieldsByType[type]));
  });
  return node.clone(children);
}

module.exports = refragmentRelayQuery;