/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule splitDeferredRelayQueries
 * 
 * @typechecks
 */

'use strict';

var _inherits = require('babel-runtime/helpers/inherits')['default'];

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

Object.defineProperty(exports, '__esModule', {
  value: true
});
var GraphQL = require('./GraphQL');
var RelayNodeInterface = require('./RelayNodeInterface');
var RelayProfiler = require('./RelayProfiler');
var RelayQuery = require('./RelayQuery');
var RelayQueryTransform = require('./RelayQueryTransform');
var RelayRefQueryDescriptor = require('./RelayRefQueryDescriptor');

var invariant = require('fbjs/lib/invariant');

/**
 * Traverse `node` splitting off deferred query fragments into separate queries.
 *
 * @internal
 */
function splitDeferredRelayQueries(node) {
  var splitter = new GraphQLSplitDeferredQueries();
  var splitQueries = {
    __parent__: null,
    __path__: [],
    __refQuery__: null,
    deferred: [],
    required: null
  };
  splitter.visit(node, splitQueries);

  return buildQueries(splitQueries);
}

/**
 * Returns the requisite siblings of `node`, but filters any non-requisite
 * children of those siblings.
 */
function getRequisiteSiblings(node, parent) {
  // Get the requisite siblings.
  var siblings = parent.getChildren().filter(function (child) {
    return child !== node && child instanceof RelayQuery.Field && child.isRequisite();
  });

  // Filter the non-requisite children from those siblings.
  return siblings.map(function (sibling) {
    var children = sibling.getChildren().filter(function (child) {
      return child instanceof RelayQuery.Field && child.isRequisite();
    });
    var clone = sibling.clone(children);
    !clone ? process.env.NODE_ENV !== 'production' ? invariant(false, 'splitDeferredRelayQueries(): Unexpected non-scalar, requisite field.') : invariant(false) : undefined;
    return clone;
  });
}

/**
 * Traverse the parent chain of `node` wrapping it at each level until it is
 * either:
 *
 * - wrapped in a RelayQuery.Root node
 * - wrapped in a non-root node that can be split off in a "ref query" (ie. a
 *   root call with a ref param that references another query)
 *
 * Additionally ensures that any requisite sibling fields are embedded in each
 * layer of the wrapper.
 */
function wrapNode(node, path) {
  for (var ii = path.length - 1; ii >= 0; ii--) {
    var parent = path[ii];
    if (parent instanceof RelayQuery.Field && parent.getInferredRootCallName()) {
      // We can make a "ref query" at this point, so stop wrapping.
      return new RelayRefQueryDescriptor(node, path.slice(0, ii + 1));
    }

    var siblings = getRequisiteSiblings(node, parent);
    var children = [node].concat(siblings);

    // Cast here because we know that `clone` will never return `null` (because
    // we always give it at least one child).
    node = parent.clone(children);
  }
  !(node instanceof RelayQuery.Root) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'splitDeferredRelayQueries(): Cannot build query without a root node.') : invariant(false) : undefined;
  var rootCall = node.getRootCall();
  return RelayQuery.Node.buildRoot(rootCall.name, rootCall.value, node.getChildren(), {
    isDeferred: true,
    rootArg: node.getRootCallArgument()
  }, node.getName());
}

/**
 * Returns `true` if `node` is considered "empty", which means that it contains
 * no non-generated fields, and no ref query dependencies.
 */
function isEmpty(node) {
  if (node.isScalar()) {
    return node.isGenerated() && !node.isRefQueryDependency();
  } else {
    return node.getChildren().every(isEmpty);
  }
}

/**
 * Mutates and returns a nested `SplitQueries` structure, updating any deferred
 * "ref queries" to actually reference their contexts.
 */
function buildQueries(splitQueries) {
  if (splitQueries.required && isEmpty(splitQueries.required)) {
    splitQueries.required = null;
  }
  splitQueries.deferred = splitQueries.deferred.map(function (nestedSplitQueries) {
    var descriptor = nestedSplitQueries.__refQuery__;
    if (descriptor) {
      // Wrap the ref query node with a reference to the required query that is
      // its context.
      var context = splitQueries.required;
      if (!context) {
        // Traverse upwards looking for context.
        var parentSplitQueries = splitQueries;
        while (parentSplitQueries.__parent__) {
          context = parentSplitQueries.__parent__.required;
          if (context) {
            break;
          }
          parentSplitQueries = parentSplitQueries.__parent__;
        }
      }
      !context ? process.env.NODE_ENV !== 'production' ? invariant(false, 'splitDeferredRelayQueries(): Expected a context root query.') : invariant(false) : undefined;
      nestedSplitQueries.required = createRefQuery(descriptor, context);
    }

    return buildQueries(nestedSplitQueries);
  });
  return splitQueries;
}

/**
 * Wraps `descriptor` in a new top-level ref query.
 */
function createRefQuery(descriptor, context) {
  var node = descriptor.node;
  !(node instanceof RelayQuery.Field || node instanceof RelayQuery.Fragment) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'splitDeferredRelayQueries(): Ref query requires a field or fragment.') : invariant(false) : undefined;

  // Build up JSONPath.
  var path = ['$', '*'];
  var parent;
  for (var ii = 0; ii < descriptor.path.length; ii++) {
    parent = descriptor.path[ii];
    if (parent instanceof RelayQuery.Field) {
      path.push(parent.getSerializationKey());
      if (parent.isPlural()) {
        path.push('*');
      }
    }
  }
  !(path.length > 2) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'splitDeferredRelayQueries(): Ref query requires a complete path.') : invariant(false) : undefined;
  var field = parent; // Flow
  var primaryKey = field.getInferredPrimaryKey();
  !primaryKey ? process.env.NODE_ENV !== 'production' ? invariant(false, 'splitDeferredRelayQueries(): Ref query requires a primary key.') : invariant(false) : undefined;
  path.push(primaryKey);

  // Create the wrapper root query.
  var root = RelayQuery.Node.buildRoot(RelayNodeInterface.NODES, new GraphQL.BatchCallVariable(context.getID(), path.join('.')), [node], {
    isDeferred: true,
    rootArg: RelayNodeInterface.ID
  }, context.getName());

  var result = root; // Flow
  return result;
}

/**
 * Traverses an input query, updating the passed in `SplitQueries` state object
 * to contain a nested structure representing the required and deferred portions
 * of the input query.
 */

var GraphQLSplitDeferredQueries = (function (_RelayQueryTransform) {
  _inherits(GraphQLSplitDeferredQueries, _RelayQueryTransform);

  function GraphQLSplitDeferredQueries() {
    _classCallCheck(this, GraphQLSplitDeferredQueries);

    _RelayQueryTransform.apply(this, arguments);
  }

  GraphQLSplitDeferredQueries.prototype.visitField = function visitField(node, splitQueries) {
    if (!node.hasDeferredDescendant()) {
      return node;
    }

    splitQueries.__path__.push(node);
    var result = this.traverse(node, splitQueries);
    splitQueries.__path__.pop();

    if (result && node.getInferredRootCallName()) {
      // The node is a ref query dependency; mark it as one.
      var key = node.getInferredPrimaryKey();
      var children = result.getChildren().map(function (child) {
        if (child instanceof RelayQuery.Field && child.getSchemaName() === key) {
          return child.cloneAsRefQueryDependency();
        } else {
          return child;
        }
      });
      result = result.clone(children);
    }

    return result;
  };

  GraphQLSplitDeferredQueries.prototype.visitFragment = function visitFragment(node, splitQueries) {
    if (!node.getChildren().length) {
      return null;
    }

    if (node.isDeferred()) {
      var path = splitQueries.__path__;
      var deferred = {
        __parent__: splitQueries,
        __path__: path,
        __refQuery__: null,
        deferred: [],
        required: null
      };
      var result = this.traverse(node, deferred);
      if (result) {
        var wrapped = wrapNode(result, path);
        if (wrapped instanceof RelayQuery.Root) {
          deferred.required = wrapped;
        } else if (wrapped instanceof RelayRefQueryDescriptor) {
          // for Flow
          deferred.__refQuery__ = wrapped;
        }
      }
      if (result || deferred.deferred.length) {
        splitQueries.deferred.push(deferred);
      }
      return null;
    } else if (node.hasDeferredDescendant()) {
      return this.traverse(node, splitQueries);
    } else {
      return node;
    }
  };

  GraphQLSplitDeferredQueries.prototype.visitRoot = function visitRoot(node, splitQueries) {
    var result;
    if (!node.hasDeferredDescendant()) {
      splitQueries.required = node;
      return node;
    } else {
      splitQueries.__path__.push(node);
      result = this.traverse(node, splitQueries);
      splitQueries.__path__.pop();
      splitQueries.required = result;
      return result;
    }
  };

  return GraphQLSplitDeferredQueries;
})(RelayQueryTransform);

var instrumented = RelayProfiler.instrument('splitDeferredRelayQueries', splitDeferredRelayQueries);

// #7573861: Type export collides with CommonJS export in presence of
// `instrument()` call:
module.exports = instrumented;