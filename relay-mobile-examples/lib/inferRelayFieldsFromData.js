/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule inferRelayFieldsFromData
 * @typechecks
 * 
 */

'use strict';

var GraphQLStoreDataHandler = require('./GraphQLStoreDataHandler');
var RelayConnectionInterface = require('./RelayConnectionInterface');
var RelayQuery = require('./RelayQuery');

var forEachObject = require('fbjs/lib/forEachObject');
var invariant = require('fbjs/lib/invariant');

var FIELD_ARGUMENT_ENCODING = /^(\w+)\((.*?)\)$/;
var NODE = RelayConnectionInterface.NODE;
var EDGES = RelayConnectionInterface.EDGES;

/**
 * @internal
 *
 * Given a record-like object, infers fields that could be used to fetch them.
 * Properties that are fetched via fields with arguments can be encoded by
 * serializing the arguments in property keys.
 */
function inferRelayFieldsFromData(data) {
  var fields = [];
  forEachObject(data, function (value, key) {
    if (!GraphQLStoreDataHandler.isMetadataKey(key)) {
      fields.push(inferField(value, key));
    }
  });
  return fields;
}

function inferField(value, key) {
  var children;
  var metadata;
  if (Array.isArray(value)) {
    var element = value[0];
    if (element && typeof element === 'object') {
      children = inferRelayFieldsFromData(element);
    } else {
      children = [];
    }
    metadata = { plural: true };
  } else if (typeof value === 'object' && value !== null) {
    children = inferRelayFieldsFromData(value);
  } else {
    children = [];
  }
  if (key === NODE) {
    children.push(RelayQuery.Node.buildField('id'));
  } else if (key === EDGES) {
    children.push(RelayQuery.Node.buildField('cursor'));
  }
  return buildField(key, children, metadata);
}

function buildField(key, children, metadata) {
  var fieldName = key;
  var calls = null;
  var parts = key.split('.');
  if (parts.length > 1) {
    fieldName = parts.shift();
    calls = parts.map(function (callString) {
      var captures = callString.match(FIELD_ARGUMENT_ENCODING);
      !captures ? process.env.NODE_ENV !== 'production' ? invariant(false, 'inferRelayFieldsFromData(): Malformed data key, `%s`.', key) : invariant(false) : undefined;
      var value = captures[2].split(',');
      return {
        name: captures[1],
        value: value.length === 1 ? value[0] : value
      };
    });
  }
  return RelayQuery.Node.buildField(fieldName, calls, children, metadata);
}

module.exports = inferRelayFieldsFromData;