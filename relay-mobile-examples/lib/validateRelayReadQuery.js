/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule validateRelayReadQuery
 * 
 * @typechecks
 */

'use strict';

var _inherits = require('babel-runtime/helpers/inherits')['default'];

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var RelayQueryVisitor = require('./RelayQueryVisitor');

var emptyFunction = require('fbjs/lib/emptyFunction');

var SERIALIZATION_KEY = '__serializationKey__'; // task #7117200

var validateRelayReadQuery = emptyFunction;

if (process.env.NODE_ENV !== 'production') {
  // Wrap in an IIFE to avoid unwanted function hoisting.
  (function () {
    /**
     * @internal
     *
     * `validateRelayReadQuery` is a `__DEV__`-only validator that checks that a
     * query used to read data from `RelayStore` is well-formed. Validation
     * problems are reported via `console.error`.
     *
     * At the moment, "well-formed" means that the query does not contain
     * duplicate aliases.
     */
    validateRelayReadQuery = function validateRelayReadQuery(queryNode, options) {
      var validator = new RelayStoreReadValidator(options);
      validator.visit(queryNode, {});
    };

    function assertUniqueAlias(field, aliasMap) {
      var serializationKey = field.getSerializationKey();
      if (aliasMap[SERIALIZATION_KEY]) {
        if (aliasMap[SERIALIZATION_KEY] !== serializationKey) {
          console.error('`%s` is used as an alias more than once. Please use unique ' + 'aliases.', field.getApplicationName());
        }
      } else {
        aliasMap[SERIALIZATION_KEY] = serializationKey;
      }
    }

    /**
     * Returns the nested AliasMap for `node`, initializing it to an empty map
     * if it does not already exist.
     */
    function getAliasMap(node, aliasMap) {
      var applicationName = node.getApplicationName();
      if (!aliasMap[applicationName]) {
        aliasMap[applicationName] = {};
      }
      return aliasMap[applicationName];
    }

    var RelayStoreReadValidator = (function (_RelayQueryVisitor) {
      _inherits(RelayStoreReadValidator, _RelayQueryVisitor);

      function RelayStoreReadValidator(options) {
        _classCallCheck(this, RelayStoreReadValidator);

        _RelayQueryVisitor.call(this);
        this._traverseFragmentReferences = options && options.traverseFragmentReferences || false;
      }

      RelayStoreReadValidator.prototype.visitField = function visitField(node, aliasMap) {
        aliasMap = getAliasMap(node, aliasMap);
        assertUniqueAlias(node, aliasMap);

        if (node.isGenerated()) {
          return;
        } else if (node.isScalar()) {
          return;
        } else if (node.isPlural()) {
          this._readPlural(node, aliasMap);
        } else {
          // No special handling needed for connections, edges, page_info etc.
          this._readLinkedField(node, aliasMap);
        }
      };

      RelayStoreReadValidator.prototype.visitFragment = function visitFragment(node, aliasMap) {
        if (this._traverseFragmentReferences || !node.isReferenceFragment()) {
          this.traverse(node, aliasMap);
        }
      };

      RelayStoreReadValidator.prototype._readPlural = function _readPlural(node, aliasMap) {
        var _this = this;

        node.getChildren().forEach(function (child) {
          return _this.visit(child, aliasMap);
        });
      };

      RelayStoreReadValidator.prototype._readLinkedField = function _readLinkedField(node, aliasMap) {
        aliasMap = getAliasMap(node, aliasMap);
        this.traverse(node, aliasMap);
      };

      return RelayStoreReadValidator;
    })(RelayQueryVisitor);
  })();
}

module.exports = validateRelayReadQuery;