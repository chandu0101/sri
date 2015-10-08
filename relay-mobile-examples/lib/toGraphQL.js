/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule toGraphQL
 * 
 */

'use strict';

var _extends = require('babel-runtime/helpers/extends')['default'];

var _slicedToArray = require('babel-runtime/helpers/sliced-to-array')['default'];

var _Object$keys = require('babel-runtime/core-js/object/keys')['default'];

var GraphQL = require('./GraphQL');
var RelayProfiler = require('./RelayProfiler');
var RelayQuery = require('./RelayQuery');

var invariant = require('fbjs/lib/invariant');

/**
 * @internal
 *
 * Converts a RelayQuery.Node into its equivalent GraphQL.Node. This should only
 * be used to aid in iterative migration of Relay to use RelayQuery.
 */
var toGraphQL = {
  Node: (function (_Node) {
    function Node(_x) {
      return _Node.apply(this, arguments);
    }

    Node.toString = function () {
      return _Node.toString();
    };

    return Node;
  })(function (node) {
    if (node instanceof RelayQuery.Root) {
      return toGraphQL.Query(node);
    } else if (node instanceof RelayQuery.Fragment) {
      return toGraphQL.Fragment(node);
    } else {
      !(node instanceof RelayQuery.Field) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'toGraphQL: Invalid node.') : invariant(false) : undefined;
      return toGraphQL.Field(node);
    }
  }),
  QueryWithValues: (function (_QueryWithValues) {
    function QueryWithValues(_x2) {
      return _QueryWithValues.apply(this, arguments);
    }

    QueryWithValues.toString = function () {
      return _QueryWithValues.toString();
    };

    return QueryWithValues;
  })(function (node) {
    return new GraphQL.QueryWithValues(toGraphQL.Query(node), {});
  }),
  Query: (function (_Query) {
    function Query(_x3) {
      return _Query.apply(this, arguments);
    }

    Query.toString = function () {
      return _Query.toString();
    };

    return Query;
  })(function (node) {
    return node.getConcreteQueryNode(function () {
      var batchCall = node.getBatchCall();
      var rootCall = node.getRootCall();
      var calls;
      if (batchCall) {
        calls = [new GraphQL.BatchCallVariable(batchCall.sourceQueryID, batchCall.sourceQueryPath)];
      } else {
        calls = rootCall.value;
      }

      var _toGraphQLChildren = toGraphQLChildren(node.getChildren());

      var _toGraphQLChildren2 = _slicedToArray(_toGraphQLChildren, 2);

      var fields = _toGraphQLChildren2[0];
      var fragments = _toGraphQLChildren2[1];

      var query = new GraphQL.Query(rootCall.name, calls, fields, fragments, toGraphQLMetadata(node), node.getName());
      return query;
    });
  }),
  Fragment: (function (_Fragment) {
    function Fragment(_x4) {
      return _Fragment.apply(this, arguments);
    }

    Fragment.toString = function () {
      return _Fragment.toString();
    };

    return Fragment;
  })(function (node) {
    return node.getConcreteQueryNode(function () {
      var _toGraphQLChildren3 = toGraphQLChildren(node.getChildren());

      var _toGraphQLChildren32 = _slicedToArray(_toGraphQLChildren3, 2);

      var fields = _toGraphQLChildren32[0];
      var fragments = _toGraphQLChildren32[1];

      var fragment = new GraphQL.QueryFragment(node.getDebugName(), node.getType(), fields, fragments, toGraphQLMetadata(node));
      return fragment;
    });
  }),
  Field: (function (_Field) {
    function Field(_x5) {
      return _Field.apply(this, arguments);
    }

    Field.toString = function () {
      return _Field.toString();
    };

    return Field;
  })(function (node) {
    return node.getConcreteQueryNode(function () {
      var metadata = toGraphQLMetadata(node);
      var calls = node.getCallsWithValues().map(function (call) {
        return new GraphQL.Callv(call.name, call.value);
      });

      var _toGraphQLChildren4 = toGraphQLChildren(node.getChildren());

      var _toGraphQLChildren42 = _slicedToArray(_toGraphQLChildren4, 2);

      var fields = _toGraphQLChildren42[0];
      var fragments = _toGraphQLChildren42[1];

      return new GraphQL.Field(node.getSchemaName(), fields, fragments, calls, node.__concreteNode__.alias, node.__concreteNode__.condition, metadata);
    });
  })
};

RelayProfiler.instrumentMethods(toGraphQL, {
  Node: 'toGraphQL.Node',
  QueryWithValues: 'toGraphQL.QueryWithValues',
  Query: 'toGraphQL.Query',
  Fragment: 'toGraphQL.Fragment',
  Field: 'toGraphQL.Field'
});

function toGraphQLChildren(children) {
  var fields = [];
  var fragments = [];
  children.forEach(function (child) {
    if (child instanceof RelayQuery.Field) {
      fields.push(toGraphQL.Field(child));
    } else {
      !(child instanceof RelayQuery.Fragment) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'toGraphQL: Invalid child node.') : invariant(false) : undefined;
      fragments.push(toGraphQL.Fragment(child));
    }
  });
  return [fields, fragments];
}

function toGraphQLMetadata(node) {
  var metadata = _extends({}, node.__concreteNode__.__metadata__);
  if (_Object$keys(metadata).length) {
    return metadata;
  }
  return null;
}

module.exports = toGraphQL;