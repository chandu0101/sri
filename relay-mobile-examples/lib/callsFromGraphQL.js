/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule callsFromGraphQL
 * 
 * @typechecks
 */

'use strict';

var GraphQL = require('./GraphQL');

var invariant = require('fbjs/lib/invariant');

/**
 * @internal
 *
 * Convert from GraphQL call nodes to plain object `{name,value}` calls.
 */
function callsFromGraphQL(concreteCalls, variables) {
  var orderedCalls = [];
  for (var ii = 0; ii < concreteCalls.length; ii++) {
    var _concreteCalls$ii = concreteCalls[ii];
    var name = _concreteCalls$ii.name;
    var value = _concreteCalls$ii.value;

    // Batch calls are handled separately
    if (GraphQL.isBatchCallVariable(value) || Array.isArray(value) && value.some(GraphQL.isBatchCallVariable)) {
      value = null;
    } else if (Array.isArray(value)) {
      value = value.map(function (arg) {
        return getCallValue(arg, variables);
      });
    } else if (value != null) {
      value = getCallValue(value, variables);
    }

    orderedCalls.push({ name: name, value: value });
  }
  return orderedCalls;
}

function getCallValue(arg, variables) {
  if (GraphQL.isCallVariable(arg)) {
    var variableName = arg.callVariableName;
    !variables.hasOwnProperty(variableName) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'callsFromGraphQL(): Expected a declared value for variable, `$%s`.', variableName) : invariant(false) : undefined;
    return variables[variableName];
  } else {
    !GraphQL.isCallValue(arg) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'callsFromGraphQL(): Expected an inline value or variable, got `%s`.', JSON.stringify(arg)) : invariant(false) : undefined;
    return arg.callValue;
  }
}

module.exports = callsFromGraphQL;