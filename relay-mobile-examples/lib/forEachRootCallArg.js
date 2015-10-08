/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule forEachRootCallArg
 * @typechecks
 * 
 */

'use strict';

var invariant = require('fbjs/lib/invariant');

/**
 * @internal
 *
 * Iterates over the arguments in the supplied root call. If the root call value
 * is null or undefined, the supplied callback will be invoked once.
 */
function forEachRootCallArg(query, callback) {
  !!query.getBatchCall() ? process.env.NODE_ENV !== 'production' ? invariant(false, 'forEachRootCallArg(): Cannot iterate over batch call variables.') : invariant(false) : undefined;

  var _query$getRootCall = query.getRootCall();

  var name = _query$getRootCall.name;
  var value = _query$getRootCall.value;

  function each(callArg, fn) {
    if (Array.isArray(callArg)) {
      callArg.forEach(function (arg) {
        return each(arg, fn);
      });
    } else if (callArg == null) {
      fn(callArg, name);
    } else {
      !(typeof callArg === 'string' || typeof callArg === 'number') ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Relay: Expected arguments to root field `%s` to each be strings/' + 'numbers, got `%s`.', name, JSON.stringify(callArg)) : invariant(false) : undefined;
      fn('' + callArg, name);
    }
  }
  each(value, callback);
}

module.exports = forEachRootCallArg;