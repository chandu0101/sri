/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule Relay
 * @typechecks
 * 
 */

'use strict';

var _extends = require('babel-runtime/helpers/extends')['default'];

var RelayDefaultNetworkLayer = require('./RelayDefaultNetworkLayer');
var RelayPublic = require('./RelayPublic');

// By default, assume that GraphQL is served at `/graphql` on the same domain.
RelayPublic.injectNetworkLayer(new RelayDefaultNetworkLayer('/graphql'));

module.exports = _extends({}, RelayPublic, {
  // Expose the default network layer to allow convenient re-configuration.
  DefaultNetworkLayer: RelayDefaultNetworkLayer
});