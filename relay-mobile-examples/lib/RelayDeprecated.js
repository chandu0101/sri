/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayDeprecated
 * @typechecks
 * 
 */

'use strict';

var RelayQL = require('./RelayQL');

var forEachObject = require('fbjs/lib/forEachObject');
var invariant = require('fbjs/lib/invariant');
var mapObject = require('fbjs/lib/mapObject');
var warning = require('fbjs/lib/warning');

/**
 * @internal
 */
var RelayDeprecated = {

  /**
   * Prints a deprecation warning.
   */
  warn: function warn(_ref) {
    var was = _ref.was;
    var now = _ref.now;
    return (function () {
      process.env.NODE_ENV !== 'production' ? warning(false, 'Relay: `%s` is deprecated; use `%s`.', was, now) : undefined;
    })();
  },

  /**
   * Wraps a deprecated method to warn when invoked.
   */
  createWarning: function createWarning(_ref2) {
    var was = _ref2.was;
    var now = _ref2.now;
    var adapter = _ref2.adapter;
    return (function () {
      return function () {
        RelayDeprecated.warn({ was: was, now: now });
        return adapter.apply(this, arguments);
      };
    })();
  },

  /**
   * Upgrades a deprecated RelayContainer spec.
   */
  upgradeContainerSpec: function upgradeContainerSpec(maybeSpec) {
    var deprecatedProperties = ['queries', 'queryParams', 'processQueryParams'].filter(function (property) {
      return maybeSpec.hasOwnProperty(property);
    });

    var modernProperties = ['fragments', 'initialVariables', 'prepareVariables'].filter(function (property) {
      return maybeSpec.hasOwnProperty(property);
    });

    if (modernProperties.length) {
      !(deprecatedProperties.length === 0) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'Relay.createContainer(...): Spec contains a mixture of valid and ' + 'deprecated properties: %s', deprecatedProperties.join(', ')) : invariant(false) : undefined;
      return maybeSpec;
    }

    var spec = {};
    forEachObject(maybeSpec, function (property, name) {
      switch (name) {
        case 'queries':
          spec.fragments = mapObject(property, function (queryBuilder, propName) {
            return function (variables) {
              return queryBuilder(undefined, RelayQL, variables);
            };
          });
          break;
        case 'queryParams':
          spec.initialVariables = property;
          break;
        case 'processQueryParams':
          spec.prepareVariables = function (prevVariables, route) {
            return property(route, prevVariables);
          };
          break;
      }
    });
    return spec;
  },

  getMutationInitialVariables: function getMutationInitialVariables(Mutation) {
    var queryParams = Mutation.queryParams;
    if (queryParams && !Mutation.initialVariables) {
      RelayDeprecated.warn({
        was: Mutation.name + '.queryParams',
        now: Mutation.name + '.initialVariables'
      });
      Mutation.initialVariables = queryParams;
    }
    return Mutation.initialVariables;
  },

  getMutationFragments: function getMutationFragments(Mutation) {
    var queries = Mutation.queries;
    if (queries && !Mutation.fragments) {
      RelayDeprecated.warn({
        was: Mutation.name + '.queries',
        now: Mutation.name + '.fragments'
      });
      Mutation.fragments = queries;
    }
    return Mutation.fragments;
  }

};

module.exports = RelayDeprecated;