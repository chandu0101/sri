/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule printRelayOSSQuery
 * @typechecks
 * 
 */

'use strict';

var RelayProfiler = require('./RelayProfiler');
var RelayQuery = require('./RelayQuery');

var forEachObject = require('fbjs/lib/forEachObject');
var invariant = require('fbjs/lib/invariant');
var mapObject = require('fbjs/lib/mapObject');

/**
 * @internal
 *
 * `printRelayOSSQuery(query)` returns a string representation of the query. The
 * supplied `node` must be flattened (and not contain fragments).
 */
function printRelayOSSQuery(node) {
  var printerState = {
    fragmentMap: {},
    nextVariableID: 0,
    variableMap: {}
  };
  var queryText = null;
  if (node instanceof RelayQuery.Root) {
    queryText = printRoot(node, printerState);
  } else if (node instanceof RelayQuery.Fragment) {
    queryText = printFragment(node, printerState);
  } else if (node instanceof RelayQuery.Field) {
    queryText = printField(node, printerState);
  } else if (node instanceof RelayQuery.Mutation) {
    queryText = printMutation(node, printerState);
  }
  !queryText ? process.env.NODE_ENV !== 'production' ? invariant(false, 'printRelayOSSQuery(): Unsupported node type.') : invariant(false) : undefined;
  // Reassign to preserve Flow type refinement within closure.
  var text = queryText;
  forEachObject(printerState.fragmentMap, function (fragmentText, fragmentID) {
    if (fragmentText) {
      text = text + ' ' + fragmentText;
    }
  });
  var variables = mapObject(printerState.variableMap, function (variable) {
    return variable.value;
  });
  return {
    text: text,
    variables: variables
  };
}

function printRoot(node, printerState) {
  !!node.getBatchCall() ? process.env.NODE_ENV !== 'production' ? invariant(false, 'printRelayOSSQuery(): Deferred queries are not supported.') : invariant(false) : undefined;

  var queryString = node.getName();
  var rootCall = node.getRootCall();
  var rootArgumentName = node.getRootCallArgument();
  var rootFieldString = rootCall.name;
  if (rootCall.value != null) {
    !rootArgumentName ? process.env.NODE_ENV !== 'production' ? invariant(false, 'printRelayOSSQuery(): Expected an argument name for root field `%s`.', rootCall.name) : invariant(false) : undefined;
    var rootArgString = printArgument(rootArgumentName, rootCall.value, node.getCallType(), printerState);
    if (rootArgString) {
      rootFieldString += '(' + rootArgString + ')';
    }
  }
  var children = printChildren(node, printerState);

  var argStrings = null;
  forEachObject(printerState.variableMap, function (variable, variableID) {
    argStrings = argStrings || [];
    argStrings.push('$' + variableID + ':' + variable.type);
  });
  if (argStrings) {
    queryString += '(' + argStrings.join(',') + ')';
  }

  return 'query ' + queryString + '{' + rootFieldString + children + '}';
}

function printMutation(node, printerState) {
  var inputName = node.getCallVariableName();
  var call = '(' + inputName + ':$' + inputName + ')';
  return 'mutation ' + node.getName() + '($' + inputName + ':' + node.getInputType() + ')' + '{' + node.getCall().name + call + printChildren(node, printerState) + '}';
}

function printFragment(node, printerState) {
  return 'fragment ' + node.getDebugName() + ' on ' + node.getType() + printChildren(node, printerState);
}

function printInlineFragment(node, printerState) {
  var fragmentID = node.getFragmentID();
  var fragmentMap = printerState.fragmentMap;

  if (!(fragmentID in fragmentMap)) {
    fragmentMap[fragmentID] = 'fragment ' + fragmentID + ' on ' + node.getType() + printChildren(node, printerState);
  }
  return '...' + fragmentID;
}

function printField(node, printerState) {
  !(node instanceof RelayQuery.Field) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'printRelayOSSQuery(): Query must be flattened before printing.') : invariant(false) : undefined;
  var schemaName = node.getSchemaName();
  var serializationKey = node.getSerializationKey();
  var callsWithValues = node.getCallsWithValues();
  var fieldString = schemaName;
  var argStrings = null;
  if (callsWithValues.length) {
    callsWithValues.forEach(function (_ref) {
      var name = _ref.name;
      var value = _ref.value;

      var argString = printArgument(name, value, node.getCallType(name), printerState);
      if (argString) {
        argStrings = argStrings || [];
        argStrings.push(argString);
      }
    });
    if (argStrings) {
      fieldString += '(' + argStrings.join(',') + ')';
    }
  }
  return (serializationKey !== schemaName ? serializationKey + ':' : '') + fieldString + printChildren(node, printerState);
}

function printChildren(node, printerState) {
  var children = node.getChildren().map(function (node) {
    if (node instanceof RelayQuery.Field) {
      return printField(node, printerState);
    } else {
      !(node instanceof RelayQuery.Fragment) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'printRelayOSSQuery(): expected child node to be a `Field` or ' + '`Fragment`, got `%s`.', node.constructor.name) : invariant(false) : undefined;
      return printInlineFragment(node, printerState);
    }
  });
  if (!children.length) {
    return '';
  }
  return '{' + children.join(',') + '}';
}

function printArgument(name, value, type, printerState) {
  var stringValue;
  if (value == null) {
    return value;
  }
  if (type != null) {
    var variableID = createVariable(name, value, type, printerState);
    stringValue = '$' + variableID;
  } else {
    stringValue = JSON.stringify(value);
  }
  return name + ':' + stringValue;
}

function createVariable(name, value, type, printerState) {
  var variableID = name + '_' + printerState.nextVariableID.toString(36);
  printerState.nextVariableID++;
  printerState.variableMap[variableID] = {
    type: type,
    value: value
  };
  return variableID;
}

module.exports = RelayProfiler.instrument('printRelayQuery', printRelayOSSQuery);