/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayMutationRequest
 * @typechecks
 * 
 */

'use strict';

var _inherits = require('babel-runtime/helpers/inherits')['default'];

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var Deferred = require('fbjs/lib/Deferred');

var invariant = require('fbjs/lib/invariant');
var isEmpty = require('fbjs/lib/isEmpty');
var printRelayQuery = require('./printRelayQuery');

/**
 * @internal
 *
 * Instances of these are made available via `RelayNetworkLayer.sendMutation`.
 */

var RelayMutationRequest = (function (_Deferred) {
  _inherits(RelayMutationRequest, _Deferred);

  function RelayMutationRequest(mutation, variables, files) {
    _classCallCheck(this, RelayMutationRequest);

    _Deferred.call(this);
    this._mutation = mutation;
    this._variables = variables;
    this._files = files;
  }

  /**
   * @public
   *
   * Gets a string name used to refer to this request for printing debug output.
   */

  RelayMutationRequest.prototype.getDebugName = function getDebugName() {
    return this._mutation.getName();
  };

  /**
   * @public
   *
   * Gets an optional map from name to File objects.
   */

  RelayMutationRequest.prototype.getFiles = function getFiles() {
    return this._files;
  };

  /**
   * @public
   *
   * Gets the variables used by the mutation. These variables should be
   * serialized and send in the GraphQL request.
   */

  RelayMutationRequest.prototype.getVariables = function getVariables() {
    return this._variables;
  };

  /**
   * @public
   *
   * Gets a string representation of the GraphQL mutation.
   */

  RelayMutationRequest.prototype.getQueryString = function getQueryString() {
    var printedQuery = printRelayQuery(this._mutation);
    !isEmpty(printedQuery.variables) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayMutationRequest: Expected mutation `%s` to have exactly one ' + 'variable, `$input`.', this.getDebugName()) : invariant(false) : undefined;
    return printedQuery.text;
  };

  /**
   * @public
   * @unstable
   */

  RelayMutationRequest.prototype.getMutation = function getMutation() {
    return this._mutation;
  };

  return RelayMutationRequest;
})(Deferred);

module.exports = RelayMutationRequest;