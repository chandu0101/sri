/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule GraphQL
 * @typechecks
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _inherits = require('babel-runtime/helpers/inherits')['default'];

var _extends = require('babel-runtime/helpers/extends')['default'];

var _slicedToArray = require('babel-runtime/helpers/sliced-to-array')['default'];

var _Object$freeze = require('babel-runtime/core-js/object/freeze')['default'];

var RelayNodeInterface = require('./RelayNodeInterface');

var invariant = require('fbjs/lib/invariant');

var EMPTY_OBJECT = {};
var EMPTY_ARRAY = [];

if (process.env.NODE_ENV !== 'production') {
  _Object$freeze(EMPTY_OBJECT);
  _Object$freeze(EMPTY_ARRAY);
}

var BATCH_CALL_VARIABLE = 'BatchCallVariable';
var CALL = 'Call';
var CALL_VALUE = 'CallValue';
var CALL_VARIABLE = 'CallVariable';
var FIELD = 'Field';
var FRAGMENT = 'Fragment';
var MUTATION = 'Mutation';
var QUERY = 'Query';
var QUERY_WITH_VALUES = 'QueryWithValues';
var SUBSCRIPTION = 'Subscription';

var JSON_TYPES = {
  QUERY: 1,
  FRAGMENT: 2,
  FIELD: 3,
  CALL: 4,
  CALL_VALUE: 5,
  CALL_VARIABLE: 6,
  BATCH_VARIABLE: 7,
  MUTATION: 8,
  QUERY_WITH_VALUES: 9,
  SUBSCRIPTION: 10
};

/**
 * Represents a GraphQL node.
 *
 * A node may contain zero or more fields and/or query fragments.
 *
 * Note that we don't actually export this class (rather, we export subclasses
 * corresponding to fields, fragments, queries and mutations); we do, however,
 * use `GraphQLNode` as a type throughout Dlite.
 */

var GraphQLNode =

/**
 * @param {?array<GraphQLFieldNode>} fields
 * @param {?array<GraphQLQueryFragment|RelayRouteFragment|RelayFragmentReference>} fragments
 */
function GraphQLNode(fields, fragments) {
  _classCallCheck(this, GraphQLNode);

  this.fields = fields || EMPTY_ARRAY;
  this.fragments = fragments && fragments.length > 0 ? fragments.filter(isTruthy) : EMPTY_ARRAY;

  this.children = this.fields.concat(this.fragments);
}

/**
 * Represents a GraphQL call such as `size(50, 50)` or `(size: 32)`.
 */
;

var GraphQLCallvNode = (function () {
  /**
   * @param {string} name
   * @param {*} value (array or scalar)
   * @param {?object} metadata
   */

  function GraphQLCallvNode(name, value, metadata) {
    _classCallCheck(this, GraphQLCallvNode);

    this.kind = CALL;
    this.value = map(value, castArg) || null;
    this.name = name;
    this.metadata = metadata || EMPTY_OBJECT;
  }

  /**
   * Represents a value passed to a GraphQL call (for example, the value 5 passed
   * in a call like `first(5)`).
   */

  /**
   * @param {array} descriptor
   * @return {GraphQLCallvNode}
   */

  GraphQLCallvNode.fromJSON = function fromJSON(descriptor) {
    var _descriptor = _slicedToArray(descriptor, 4);

    var type = _descriptor[0];
    var name = _descriptor[1];
    var value = _descriptor[2];
    var metadata = _descriptor[3];

    !(type === JSON_TYPES.CALL) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected call descriptor') : invariant(false) : undefined;
    return new GraphQLCallvNode(name, callArgsFromJSON(value), metadata);
  };

  GraphQLCallvNode.prototype.toJSON = function toJSON() {
    return trimArray([JSON_TYPES.CALL, this.name, this.value, this.metadata === EMPTY_OBJECT ? null : this.metadata]);
  };

  return GraphQLCallvNode;
})();

var GraphQLCallValue = (function () {
  /**
   * @param {*} value
   */

  function GraphQLCallValue(value) {
    _classCallCheck(this, GraphQLCallValue);

    this.kind = CALL_VALUE;
    this.callValue = value;
  }

  /**
   * Represents a GraphQL call variable for use with the GraphQL Batch API.
   *
   * For example, given a source query identified by "q0", we would make a batch
   * call variable "<ref_q0>" as follows:
   *
   *     new GraphQL.BatchCallVariable('q0', '$.*.actor.id');
   *
   * The batch API allows streaming responses to the client, re-using information
   * from previous queries via ref_params; the query identifier ("q0" in the
   * example above) combined with a JSONPath to the node to be extended
   * ("$.*.actor.id") allow us to define a supplementary query that retrieves
   * additional information (example: https://fburl.com/65122329) for that node.
   *
   * @see https://our.intern.facebook.com/intern/dex/graphql-batch-api
   */

  /**
   * @param {array} descriptor
   * @return {GraphQLCallValue}
   */

  GraphQLCallValue.fromJSON = function fromJSON(descriptor) {
    var _descriptor2 = _slicedToArray(descriptor, 2);

    var type = _descriptor2[0];
    var value = _descriptor2[1];

    !(type === JSON_TYPES.CALL_VALUE) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected value descriptor') : invariant(false) : undefined;
    return new GraphQLCallValue(value);
  };

  GraphQLCallValue.prototype.toJSON = function toJSON() {
    return [JSON_TYPES.CALL_VALUE, this.callValue];
  };

  return GraphQLCallValue;
})();

var GraphQLBatchCallVariable = (function () {
  /**
   * @param {string} sourceQueryID
   * @param {string} jsonPath
   */

  function GraphQLBatchCallVariable(sourceQueryID, jsonPath) {
    _classCallCheck(this, GraphQLBatchCallVariable);

    this.kind = BATCH_CALL_VARIABLE;
    this.sourceQueryID = sourceQueryID;
    this.jsonPath = jsonPath;
  }

  /**
   * Represents a variable used in a GraphQL call.
   *
   * For example:
   *
   *     new GraphQL.CallVariable('foo') // variable: <foo>
   */

  /**
   * @param {array} descriptor
   * @return {GraphQLBatchCallVariable}
   */

  GraphQLBatchCallVariable.fromJSON = function fromJSON(descriptor) {
    var _descriptor3 = _slicedToArray(descriptor, 3);

    var type = _descriptor3[0];
    var sourceQueryID = _descriptor3[1];
    var jsonPath = _descriptor3[2];

    !(type === JSON_TYPES.BATCH_VARIABLE) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected batch variable descriptor') : invariant(false) : undefined;
    return new GraphQLBatchCallVariable(sourceQueryID, jsonPath);
  };

  GraphQLBatchCallVariable.prototype.toJSON = function toJSON() {
    return [JSON_TYPES.BATCH_VARIABLE, this.sourceQueryID, this.jsonPath];
  };

  return GraphQLBatchCallVariable;
})();

var GraphQLCallVariable = (function () {
  /**
   * @param {string} variableName
   */

  function GraphQLCallVariable(variableName) {
    _classCallCheck(this, GraphQLCallVariable);

    this.kind = CALL_VARIABLE;
    this.callVariableName = variableName;
  }

  /**
   * Represents a field in a GraphQL query.
   *
   * A field may be simple or arbitrarily complex, including calls, and containing
   * subfields, nested fragments.
   */

  /**
   * @param {array} descriptor
   * @return {GraphQLCallVariable}
   */

  GraphQLCallVariable.fromJSON = function fromJSON(descriptor) {
    var _descriptor4 = _slicedToArray(descriptor, 2);

    var type = _descriptor4[0];
    var name = _descriptor4[1];

    !(type === JSON_TYPES.CALL_VARIABLE) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected variable descriptor') : invariant(false) : undefined;
    return new GraphQLCallVariable(name);
  };

  GraphQLCallVariable.prototype.toJSON = function toJSON() {
    return [JSON_TYPES.CALL_VARIABLE, this.callVariableName];
  };

  return GraphQLCallVariable;
})();

var GraphQLFieldNode = (function (_GraphQLNode) {
  _inherits(GraphQLFieldNode, _GraphQLNode);

  /**
   * @param {string} fieldName
   * @param {?array<GraphQLFieldNode>} fields
   * @param {?array<GraphQLQueryFragment|RelayRouteFragment|RelayFragmentReference>} fragments
   * @param {?array<GraphQLCallvNode>} calls
   * @param {?string} alias
   * @param {?string} condition
   * @param {?object} metadata
   */

  function GraphQLFieldNode(fieldName, fields, fragments, calls, alias, condition, metadata) {
    _classCallCheck(this, GraphQLFieldNode);

    _GraphQLNode.call(this, fields, fragments);

    this.kind = FIELD;
    this.fieldName = fieldName;
    this.calls = calls || EMPTY_ARRAY;
    this.alias = alias || null;
    this.condition = condition || null;

    metadata = metadata || EMPTY_OBJECT;
    this.__metadata__ = metadata;
    this.metadata = {
      edgesID: metadata.edgesID,
      inferredRootCallName: metadata.rootCall,
      inferredPrimaryKey: metadata.pk,
      isConnection: !!metadata.connection,
      isFindable: !!metadata.connection && !metadata.nonFindable,
      isGenerated: !!metadata.generated,
      isPlural: !!metadata.plural,
      isRequisite: !!metadata.requisite,
      isUnionOrInterface: !!metadata.dynamic,
      parentType: metadata.parentType
    };
  }

  /**
   * Represents a query fragment in a GraphQL query.
   *
   * A fragment may contain zero or more fields and/or additional fragments.
   */

  /**
   * @param {array} descriptor
   * @return {GraphQLFieldNode}
   */

  GraphQLFieldNode.fromJSON = function fromJSON(descriptor) {
    var _descriptor5 = _slicedToArray(descriptor, 8);

    var type = _descriptor5[0];
    var fieldName = _descriptor5[1];
    var fields = _descriptor5[2];
    var fragments = _descriptor5[3];
    var calls = _descriptor5[4];
    var alias = _descriptor5[5];
    var condition = _descriptor5[6];
    var metadata = _descriptor5[7];

    !(type === JSON_TYPES.FIELD) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected field descriptor') : invariant(false) : undefined;
    return new GraphQLFieldNode(fieldName, fields ? fields.map(GraphQLFieldNode.fromJSON) : null, fragments ? fragments.map(GraphQLQueryFragment.fromJSON) : null, calls ? calls.map(GraphQLCallvNode.fromJSON) : null, alias, condition, metadata);
  };

  GraphQLFieldNode.prototype.toJSON = function toJSON() {
    return trimArray([JSON_TYPES.FIELD, this.fieldName, this.fields.length ? this.fields : null, this.fragments.length ? this.fragments : null, this.calls.length ? this._calls : null, this.alias, this.condition, this.__metadata__ === EMPTY_OBJECT ? null : this.__metadata__]);
  };

  return GraphQLFieldNode;
})(GraphQLNode);

var GraphQLQueryFragment = (function (_GraphQLNode2) {
  _inherits(GraphQLQueryFragment, _GraphQLNode2);

  /**
   * @param {string} name
   * @param {string} type
   * @param {?array<GraphQLFieldNode>} fields
   * @param {?array<GraphQLQueryFragment|RelayRouteFragment|RelayFragmentReference>} fragments
   */

  function GraphQLQueryFragment(name, type, fields, fragments, metadata) {
    _classCallCheck(this, GraphQLQueryFragment);

    _GraphQLNode2.call(this, fields, fragments);
    this.kind = FRAGMENT;
    this.name = name;
    this.type = type;
    this.metadata = this.__metadata__ = metadata || EMPTY_OBJECT;
    this.isPlural = !!this.metadata.isPlural;
  }

  /**
   * Represents a root GraphQL query such as `viewer() { ... }` or `me() { ... }`.
   *
   * Queries may contain zero or more fields, and/or subfragments.
   */

  /**
   * @param {array} descriptor
   * @return {GraphQLQueryFragment}
   */

  GraphQLQueryFragment.fromJSON = function fromJSON(descriptor) {
    var _descriptor6 = _slicedToArray(descriptor, 6);

    var type = _descriptor6[0];
    var name = _descriptor6[1];
    var fragmentType = _descriptor6[2];
    var fields = _descriptor6[3];
    var fragments = _descriptor6[4];
    var metadata = _descriptor6[5];

    !(type === JSON_TYPES.FRAGMENT) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected fragment descriptor') : invariant(false) : undefined;
    var frag = new GraphQLQueryFragment(name, fragmentType, fields ? fields.map(GraphQLFieldNode.fromJSON) : null, fragments ? fragments.map(GraphQLQueryFragment.fromJSON) : null, metadata);
    return frag;
  };

  GraphQLQueryFragment.prototype.toJSON = function toJSON() {
    return trimArray([JSON_TYPES.FRAGMENT, this.name, this.type, this.fields.length ? this.fields : null, this.fragments.length ? this.fragments : null, this.metadata]);
  };

  return GraphQLQueryFragment;
})(GraphQLNode);

var GraphQLQuery = (function (_GraphQLNode3) {
  _inherits(GraphQLQuery, _GraphQLNode3);

  /**
   * @param {string} rootCall
   * @param {*} value
   * @param {?array<GraphQLFieldNode>} fields
   * @param {?array<GraphQLQueryFragment|RelayRouteFragment|RelayFragmentReference>} fragments
   * @param {?object} metadata
   * @param {?string} queryName
   */

  function GraphQLQuery(rootCall, value, fields, fragments, metadata, queryName) {
    _classCallCheck(this, GraphQLQuery);

    _GraphQLNode3.call(this, fields, fragments);
    this.__metadata__ = metadata || EMPTY_OBJECT;
    var rootArg = this.__metadata__.rootArg;
    if (rootArg == null && RelayNodeInterface.isNodeRootCall(rootCall)) {
      rootArg = RelayNodeInterface.ID;
    }
    this.kind = QUERY;
    this.metadata = _extends({}, this.__metadata__, {
      rootArg: rootArg
    });
    this.name = queryName;
    this.fieldName = rootCall;
    this.isDeferred = !!this.__metadata__.isDeferred;

    var callMetadata = this.__metadata__.varargs ? { varargs: this.__metadata__.varargs } : null;
    this.calls = [new GraphQLCallvNode(rootCall, value, callMetadata)];
  }

  /**
   * Comprises a GraphQL query (see `GraphQLQuery`) and a set of values.
   *
   * In practice, we're don't currently make use of the values anywhere in Dlite,
   * but we use `GraphQLQueryWithValues` widely within Dlite as a type.
   */

  /**
   * @param {array} descriptor
   * @return {GraphQLQuery}
   */

  GraphQLQuery.fromJSON = function fromJSON(descriptor) {
    var _descriptor7 = _slicedToArray(descriptor, 7);

    var type = _descriptor7[0];
    var name = _descriptor7[1];
    var value = _descriptor7[2];
    var fields = _descriptor7[3];
    var fragments = _descriptor7[4];
    var metadata = _descriptor7[5];
    var queryName = _descriptor7[6];

    !(type === JSON_TYPES.QUERY) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected query descriptor') : invariant(false) : undefined;
    return new GraphQLQuery(name, callArgsFromJSON(value), fields ? fields.map(GraphQLFieldNode.fromJSON) : null, fragments ? fragments.map(GraphQLQueryFragment.fromJSON) : null, metadata, queryName);
  };

  GraphQLQuery.prototype.toJSON = function toJSON() {
    return trimArray([JSON_TYPES.QUERY, this.fieldName, this.calls[0].value, this.fields.length ? this.fields : null, this.fragments.length ? this.fragments : null, this.__metadata__ !== EMPTY_OBJECT ? this.__metadata__ : null, this.name || null]);
  };

  return GraphQLQuery;
})(GraphQLNode);

var GraphQLQueryWithValues = (function () {
  /**
   * @param {GraphQLQuery} query
   * @param {*} values
   */

  function GraphQLQueryWithValues(query, values) {
    _classCallCheck(this, GraphQLQueryWithValues);

    this.kind = QUERY_WITH_VALUES;
    this.query = query;
    this.values = values;
  }

  /**
   * Base class from which GraphQLMutation and GraphQLSubscription extend.
   */

  GraphQLQueryWithValues.prototype.getQuery = function getQuery() {
    return this.query;
  };

  /**
   * @param {array} descriptor
   * @return {GraphQLQueryWithValues}
   */

  GraphQLQueryWithValues.fromJSON = function fromJSON(descriptor) {
    var _descriptor8 = _slicedToArray(descriptor, 3);

    var type = _descriptor8[0];
    var query = _descriptor8[1];
    var values = _descriptor8[2];

    !(type === JSON_TYPES.QUERY_WITH_VALUES) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected query descriptor') : invariant(false) : undefined;
    return new GraphQLQueryWithValues(GraphQLQuery.fromJSON(query), values);
  };

  GraphQLQueryWithValues.prototype.toJSON = function toJSON() {
    return trimArray([JSON_TYPES.QUERY_WITH_VALUES, this.query, this.values]);
  };

  return GraphQLQueryWithValues;
})();

var GraphQLOperation = (function (_GraphQLNode4) {
  _inherits(GraphQLOperation, _GraphQLNode4);

  /**
   * @param {string} name
   * @param {string} responseType
   * @param {GraphQLCallvNode} call
   */

  function GraphQLOperation(name, responseType, call, fields, fragments, metadata) {
    _classCallCheck(this, GraphQLOperation);

    _GraphQLNode4.call(this, fields, fragments);
    this.name = name;
    this.responseType = responseType;
    this.calls = [call];
    this.metadata = metadata || EMPTY_OBJECT;
  }

  /**
   * Represents a GraphQL mutation.
   */

  GraphQLOperation.prototype.toJSON = function toJSON() {
    return trimArray([this.getJSONType(), this.name, this.responseType, this.calls[0], this.fields.length ? this.fields : null, this.fragments.length ? this.fragments : null, this.metadata === EMPTY_OBJECT ? null : this.metadata]);
  };

  return GraphQLOperation;
})(GraphQLNode);

var GraphQLMutation = (function (_GraphQLOperation) {
  _inherits(GraphQLMutation, _GraphQLOperation);

  function GraphQLMutation() {
    _classCallCheck(this, GraphQLMutation);

    for (var _len = arguments.length, args = Array(_len), _key = 0; _key < _len; _key++) {
      args[_key] = arguments[_key];
    }

    _GraphQLOperation.call.apply(_GraphQLOperation, [this].concat(args));
    this.kind = MUTATION;
  }

  /**
   * Represents a GraphQL subscription.
   */

  /**
   * @param {array} descriptor
   * @return {GraphQLMutation}
   */

  GraphQLMutation.fromJSON = function fromJSON(descriptor) {
    var _descriptor9 = _slicedToArray(descriptor, 7);

    var type = _descriptor9[0];
    var name = _descriptor9[1];
    var responseType = _descriptor9[2];
    var mutationCall = _descriptor9[3];
    var fields = _descriptor9[4];
    var fragments = _descriptor9[5];
    var metadata = _descriptor9[6];

    !(type === JSON_TYPES.MUTATION) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected mutation descriptor') : invariant(false) : undefined;
    return new GraphQLMutation(name, responseType, GraphQLCallvNode.fromJSON(mutationCall), fields ? fields.map(GraphQLFieldNode.fromJSON) : null, fragments ? fragments.map(GraphQLQueryFragment.fromJSON) : null, metadata);
  };

  /**
   * @return {number}
   */

  GraphQLMutation.prototype.getJSONType = function getJSONType() {
    return JSON_TYPES.MUTATION;
  };

  return GraphQLMutation;
})(GraphQLOperation);

var GraphQLSubscription = (function (_GraphQLOperation2) {
  _inherits(GraphQLSubscription, _GraphQLOperation2);

  function GraphQLSubscription() {
    _classCallCheck(this, GraphQLSubscription);

    for (var _len2 = arguments.length, args = Array(_len2), _key2 = 0; _key2 < _len2; _key2++) {
      args[_key2] = arguments[_key2];
    }

    _GraphQLOperation2.call.apply(_GraphQLOperation2, [this].concat(args));
    this.kind = SUBSCRIPTION;
  }

  /**
   * @param {*} thing
   * @return {boolean}
   */

  /**
   * @param {array} descriptor
   * @return {GraphQLSubscription}
   */

  GraphQLSubscription.fromJSON = function fromJSON(descriptor) {
    var _descriptor10 = _slicedToArray(descriptor, 7);

    var type = _descriptor10[0];
    var name = _descriptor10[1];
    var responseType = _descriptor10[2];
    var subscriptionCall = _descriptor10[3];
    var fields = _descriptor10[4];
    var fragments = _descriptor10[5];
    var metadata = _descriptor10[6];

    !(type === JSON_TYPES.SUBSCRIPTION) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Expected subscription descriptor') : invariant(false) : undefined;
    return new GraphQLSubscription(name, responseType, GraphQLCallvNode.fromJSON(subscriptionCall), fields ? fields.map(GraphQLFieldNode.fromJSON) : null, fragments ? fragments.map(GraphQLQueryFragment.fromJSON) : null, metadata);
  };

  /**
   * @return {number}
   */

  GraphQLSubscription.prototype.getJSONType = function getJSONType() {
    return JSON_TYPES.SUBSCRIPTION;
  };

  return GraphQLSubscription;
})(GraphQLOperation);

function isTruthy(thing) {
  return !!thing;
}

/**
 * Map a singular/array value with the supplied function.
 */
function map(value, fn) {
  if (value == null) {
    return value;
  } else if (Array.isArray(value)) {
    return value.map(fn);
  } else {
    return fn(value);
  }
}

/**
 * @param {*} arg
 */
function castArg(arg) {
  if (arg instanceof GraphQLCallValue || arg instanceof GraphQLCallVariable || arg instanceof GraphQLBatchCallVariable) {
    return arg;
  } else if (arg == null) {
    return new GraphQLCallVariable('__null__');
  } else {
    return new GraphQLCallValue(arg);
  }
}

function trimArray(arr) {
  var lastIndex = -1;
  for (var ii = arr.length - 1; ii >= 0; ii--) {
    if (arr[ii] !== null) {
      lastIndex = ii;
      break;
    }
  }
  arr.length = lastIndex + 1;
  return arr;
}

function callArgsFromJSON(value) {
  if (Array.isArray(value) && Array.isArray(value[0])) {
    return value.map(callArgFromJSON);
  } else if (value) {
    return callArgFromJSON(value);
  }
  return value;
}

/**
 * @param {array} descriptor
 * @return {GraphQLCallValue|GraphQLCallVariable|GraphQLBatchCallVariable}
 */
function callArgFromJSON(descriptor) {
  var type = descriptor[0];
  switch (type) {
    case JSON_TYPES.CALL_VALUE:
      return GraphQLCallValue.fromJSON(descriptor);
    case JSON_TYPES.CALL_VARIABLE:
      return GraphQLCallVariable.fromJSON(descriptor);
    case JSON_TYPES.BATCH_VARIABLE:
      return GraphQLBatchCallVariable.fromJSON(descriptor);
    default:
      !false ? process.env.NODE_ENV !== 'production' ? invariant(false, 'GraphQL: Unexpected call type, got `%s` from `%s`.', type, descriptor) : invariant(false) : undefined;
  }
}

function isType(node, type) {
  return typeof node === 'object' && node !== null && node.kind === type;
}

function isCall(node) {
  return isType(node, CALL);
}

function isCallValue(node) {
  return isType(node, CALL_VALUE);
}

function isCallVariable(node) {
  return isType(node, CALL_VARIABLE);
}

function isBatchCallVariable(node) {
  return isType(node, BATCH_CALL_VARIABLE);
}

function isField(node) {
  return isType(node, FIELD);
}

function isFragment(node) {
  return isType(node, FRAGMENT);
}

function isQuery(node) {
  return isType(node, QUERY);
}

function isQueryWithValues(node) {
  return isType(node, QUERY_WITH_VALUES);
}

function isMutation(node) {
  return isType(node, MUTATION);
}

function isSubscription(node) {
  return isType(node, SUBSCRIPTION);
}

/**
 * This module exports the building blocks for creating a structured
 * representation (ie. an AST) of GraphQL queries in JavaScript.
 *
 * @see https://our.intern.facebook.com/intern/dex/introduction-to-graphql/
 * @internal
 */
var GraphQL = {
  BatchCallVariable: GraphQLBatchCallVariable,
  Callv: GraphQLCallvNode,
  CallValue: GraphQLCallValue,
  CallVariable: GraphQLCallVariable,
  Field: GraphQLFieldNode,
  Mutation: GraphQLMutation,
  Query: GraphQLQuery,
  QueryFragment: GraphQLQueryFragment,
  QueryWithValues: GraphQLQueryWithValues,
  Subscription: GraphQLSubscription,
  isBatchCallVariable: isBatchCallVariable,
  isCall: isCall,
  isCallValue: isCallValue,
  isCallVariable: isCallVariable,
  isField: isField,
  isFragment: isFragment,
  isMutation: isMutation,
  isQuery: isQuery,
  isQueryWithValues: isQueryWithValues,
  isSubscription: isSubscription
};

module.exports = GraphQL;