/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule printRelayQueryCall
 * @typechecks
 * 
 */

'use strict';

var flattenArray = require('fbjs/lib/flattenArray');

/**
 * @internal
 *
 * Used to both print queries (to create requests) and to serialize nodes.
 */
function printRelayQueryCall(call) {
  var value = call.value;

  var valueString;
  if (Array.isArray(value)) {
    valueString = flattenArray(value).map(sanitizeCallValue).join(',');
  } else if (value != null) {
    valueString = sanitizeCallValue(value);
  } else {
    valueString = '';
  }
  return '.' + call.name + '(' + valueString + ')';
}

function sanitizeCallValue(value) {
  if (value == null) {
    return '';
  }
  if (typeof value !== 'string') {
    value = JSON.stringify(value);
  }
  value = value.replace(/[)(}{><,.\\]/g, '\\$&');
  // Works around a bug in Legacy GraphQL, see Task #7599025.
  if (/ $/.test(value)) {
    value += ' ';
  }
  return value.replace(/^( *)(.*?)( *)$/, function (_, prefix, body, suffix) {
    return '\\ '.repeat(prefix.length) + body + '\\ '.repeat(suffix.length);
  });
}

module.exports = printRelayQueryCall;