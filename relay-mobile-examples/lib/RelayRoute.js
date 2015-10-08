/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayRoute
 * 
 * @typechecks
 */

'use strict';

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _Object$freeze = require('babel-runtime/core-js/object/freeze')['default'];

Object.defineProperty(exports, '__esModule', {
  value: true
});

var RelayDeprecated = require('./RelayDeprecated');

var forEachObject = require('fbjs/lib/forEachObject');
var invariant = require('fbjs/lib/invariant');

var createURI = function createURI() {
  return null;
};

/**
 * Describes the root queries, param definitions and other metadata for a given
 * path (URI).
 */

var RelayRoute = (function () {
  function RelayRoute(initialParams, uri) {
    _classCallCheck(this, RelayRoute);

    var constructor = this.constructor;
    var routeName = constructor.routeName;
    var queries = constructor.queries;
    var paramDefinitions = constructor.paramDefinitions;
    var path = constructor.path;
    var prepareParams = constructor.prepareParams;

    !(constructor !== RelayRoute) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRoute: Abstract class cannot be instantiated.') : invariant(false) : undefined;
    !routeName ? process.env.NODE_ENV !== 'production' ? invariant(false, '%s: Subclasses of RelayRoute must define a `routeName`.', constructor.name || '<<anonymous>>') : invariant(false) : undefined;

    var processQueryParams = constructor.processQueryParams;
    if (processQueryParams && !prepareParams) {
      RelayDeprecated.warn({
        was: routeName + '.processQueryParams',
        now: routeName + '.prepareParams'
      });
      prepareParams = processQueryParams;
    }

    var params = initialParams || {};
    if (prepareParams) {
      params = prepareParams(params);
    }

    queries = queries || {};
    if (!uri && path) {
      uri = createURI(constructor, params);
    }

    forEachObject(paramDefinitions, function (paramDefinition, paramName) {
      if (params.hasOwnProperty(paramName)) {
        return;
      }
      !!paramDefinition.required ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRoute: Missing required parameter `%s` in `%s`. Check the ' + 'supplied params or URI (%s).', paramName, routeName, uri) : invariant(false) : undefined;
      // Backfill param so that a call variable is created for it.
      params[paramName] = undefined;
    });

    Object.defineProperty(this, 'name', {
      enumerable: true,
      value: routeName,
      writable: false
    });
    Object.defineProperty(this, 'params', {
      enumerable: true,
      value: params,
      writable: false
    });
    Object.defineProperty(this, 'queries', {
      enumerable: true,
      value: queries,
      writable: false
    });
    Object.defineProperty(this, 'uri', {
      enumerable: true,
      value: uri,
      writable: false
    });
    if (process.env.NODE_ENV !== 'production') {
      _Object$freeze(this.params);
      _Object$freeze(this.queries);
    }
  }

  RelayRoute.injectURICreator = function injectURICreator(creator) {
    createURI = creator;
  };

  return RelayRoute;
})();

module.exports = RelayRoute;