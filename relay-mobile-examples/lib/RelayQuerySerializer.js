/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayQuerySerializer
 * 
 * @typechecks
 */

'use strict';

var _extends = require('babel-runtime/helpers/extends')['default'];

var RelayQuery = require('./RelayQuery');

var invariant = require('fbjs/lib/invariant');

var FIELD = 'Field';
var FRAGMENT_DEFINITION = 'FragmentDefinition';
var QUERY = 'Query';
var MUTATION = 'Mutation';

/**
 * @internal
 *
 * Methods for (de)serializing `RelayQueryNode`s to/from JSON.
 */
var RelayQuerySerializer = {
  fromJSON: function fromJSON(data) {
    !(typeof data === 'object' && data !== null && !Array.isArray(data)) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected an object.') : invariant(false) : undefined;
    var alias = data.alias;
    var calls = data.calls;
    var children = data.children;
    var kind = data.kind;
    var metadata = data.metadata;
    var name = data.name;
    var type = data.type;

    !(alias == null || typeof alias === 'string') ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected `alias` to be a string, got ' + '`%s`.', alias) : invariant(false) : undefined;
    !(calls == null || Array.isArray(calls)) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected `calls` to be an array.') : invariant(false) : undefined;
    !(typeof kind === 'string') ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected `kind` to be a string.') : invariant(false) : undefined;
    !(!metadata || typeof metadata === 'object' && !Array.isArray(metadata)) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected `metadata` to be an object.') : invariant(false) : undefined;
    !(typeof name === 'string') ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected `name` to be a string.') : invariant(false) : undefined;
    !(!children || Array.isArray(children)) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected `children` to be an array.') : invariant(false) : undefined;
    children = children.map(RelayQuerySerializer.fromJSON);

    if (kind === FIELD) {
      var field = RelayQuery.Node.buildField(name, calls, children, metadata, alias);
      !(field != null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected a `Field`.') : invariant(false) : undefined;
      return field;
    } else if (kind === FRAGMENT_DEFINITION) {
      !(typeof type === 'string') ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected `type` to be a string.') : invariant(false) : undefined;
      var fragment = RelayQuery.Node.buildFragment(name, type, children, metadata);
      !(fragment != null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected a `Fragment`.') : invariant(false) : undefined;
      return fragment;
    } else if (kind === QUERY) {
      var rootCall = calls[0];
      var root = RelayQuery.Node.buildRoot(rootCall.name, rootCall.value, children, metadata, name);
      !(root != null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected a `Root`.') : invariant(false) : undefined;
      return root;
    } else if (kind === MUTATION) {
      !(typeof type === 'string') ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected `type` to be a string.') : invariant(false) : undefined;
      var mutationCall = calls[0];
      var mutation = RelayQuery.Node.buildMutation(name, type, mutationCall.name, mutationCall.value, children);
      !(mutation != null) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): expected a `Mutation`.') : invariant(false) : undefined;
      return mutation;
    } else {
      !false ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.fromJSON(): invalid kind %s.', kind) : invariant(false) : undefined;
    }
  },

  toJSON: function toJSON(node) {
    var children = node.getChildren().map(RelayQuerySerializer.toJSON);
    if (node instanceof RelayQuery.Field) {
      var name = node.getSchemaName();
      var alias = node.getApplicationName();
      return {
        kind: FIELD,
        name: name,
        alias: alias !== name ? alias : null,
        calls: node.getCallsWithValues(),
        children: children,
        metadata: node.__concreteNode__.__metadata__
      };
    } else if (node instanceof RelayQuery.Fragment) {
      return {
        kind: FRAGMENT_DEFINITION,
        name: node.getDebugName(),
        type: node.getType(),
        children: children,
        metadata: _extends({}, node.__concreteNode__.__metadata__, {
          isDeferred: node.isDeferred(),
          isReferenceFragment: node.isReferenceFragment()
        })
      };
    } else if (node instanceof RelayQuery.Root) {
      var rootCall = node.getRootCall();
      return {
        kind: QUERY,
        name: node.getName(),
        calls: [rootCall],
        children: children,
        metadata: node.__concreteNode__.__metadata__
      };
    } else if (node instanceof RelayQuery.Mutation) {
      var mutationCall = node.getCall();
      return {
        kind: MUTATION,
        name: node.getName(),
        calls: [mutationCall],
        children: children,
        type: node.getResponseType()
      };
    } else {
      !false ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayQuerySerializer.toJSON(): invalid node type, only `Field`, ' + '`Fragment`, `Mutation`, and `Root` are supported, got `%s`.', node.constructor.name) : invariant(false) : undefined;
    }
  }
};

module.exports = RelayQuerySerializer;