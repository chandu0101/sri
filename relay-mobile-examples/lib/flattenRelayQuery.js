/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule flattenRelayQuery
 * 
 * @typechecks
 */

'use strict';

var _inherits = require('babel-runtime/helpers/inherits')['default'];

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _Object$keys = require('babel-runtime/core-js/object/keys')['default'];

var RelayProfiler = require('./RelayProfiler');

var RelayQueryVisitor = require('./RelayQueryVisitor');

var sortTypeFirst = require('./sortTypeFirst');

/**
 * @internal
 *
 * `flattenRelayQuery(query)` returns a clone of `query` with fields inside of
 * fragments recursively flattened into the nearest ancestor field.
 *
 * The result can be null if `node` only contains empty fragments or fragments
 * that only contain empty fragments.
 */
function flattenRelayQuery(node) {
  var flattener = new RelayQueryFlattener();
  var flattenedFieldMap = {};
  flattener.traverse(node, { node: node, flattenedFieldMap: flattenedFieldMap });
  return toQuery(node, flattenedFieldMap);
}

function toQuery(node, flattenedFieldMap) {
  var keys = _Object$keys(flattenedFieldMap).sort(sortTypeFirst);
  return node.clone(keys.map(function (alias) {
    var field = flattenedFieldMap[alias];
    if (field) {
      return toQuery(field.node, field.flattenedFieldMap);
    }
  }));
}

var RelayQueryFlattener = (function (_RelayQueryVisitor) {
  _inherits(RelayQueryFlattener, _RelayQueryVisitor);

  function RelayQueryFlattener() {
    _classCallCheck(this, RelayQueryFlattener);

    _RelayQueryVisitor.apply(this, arguments);
  }

  RelayQueryFlattener.prototype.visitField = function visitField(node, state) {
    var serializationKey = node.getSerializationKey();
    var flattenedField = state.flattenedFieldMap[serializationKey];
    if (!flattenedField) {
      flattenedField = {
        node: node,
        flattenedFieldMap: {}
      };
      state.flattenedFieldMap[serializationKey] = flattenedField;
    }
    this.traverse(node, flattenedField);
  };

  return RelayQueryFlattener;
})(RelayQueryVisitor);

module.exports = RelayProfiler.instrument('flattenRelayQuery', flattenRelayQuery);