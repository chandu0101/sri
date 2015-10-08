/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayMutationQuery
 * @typechecks
 * 
 */

'use strict';

var _toConsumableArray = require('babel-runtime/helpers/to-consumable-array')['default'];

var GraphQLStoreDataHandler = require('./GraphQLStoreDataHandler');
var RelayConnectionInterface = require('./RelayConnectionInterface');

var RelayMetaRoute = require('./RelayMetaRoute');
var RelayMutationType = require('./RelayMutationType');
var RelayQuery = require('./RelayQuery');

var RelayStoreData = require('./RelayStoreData');

var flattenRelayQuery = require('./flattenRelayQuery');
var forEachObject = require('fbjs/lib/forEachObject');
var nullthrows = require('fbjs/lib/nullthrows');
var inferRelayFieldsFromData = require('./inferRelayFieldsFromData');
var intersectRelayQuery = require('./intersectRelayQuery');
var invariant = require('fbjs/lib/invariant');
var refragmentRelayQuery = require('./refragmentRelayQuery');

var CLIENT_MUTATION_ID = RelayConnectionInterface.CLIENT_MUTATION_ID;

/**
 * @internal
 *
 * Constructs query fragments that are sent with mutations, which should ensure
 * that any records changed as a result of mutations are brought up-to-date.
 *
 * The fragments are a minimal subset created by intersecting the "fat query"
 * (fields that a mutation declares may have changed) with the "tracked query"
 * (fields representing data previously queried and written into the store).
 */
var RelayMutationQuery = {
  /**
   * Accepts a mapping from field names to data IDs. The field names must exist
   * as top-level fields in the fat query. These top-level fields are used to
   * re-fetch any data that has changed for records identified by the data IDs.
   *
   * The supplied mapping may contain multiple field names. In addition, each
   * field name may map to an array of data IDs if the field is plural.
   */
  buildFragmentForFields: function buildFragmentForFields(_ref) {
    var tracker = _ref.tracker;
    var fatQuery = _ref.fatQuery;
    var fieldIDs = _ref.fieldIDs;

    var queryTracker = tracker || RelayStoreData.getDefaultInstance().getQueryTracker();
    var mutatedFields = [];
    forEachObject(fieldIDs, function (dataIDOrIDs, fieldName) {
      var fatField = getFieldFromFatQuery(fatQuery, fieldName);
      var dataIDs = [].concat(dataIDOrIDs);
      var trackedChildren = [];
      dataIDs.forEach(function (dataID) {
        trackedChildren.push.apply(trackedChildren, _toConsumableArray(queryTracker.getTrackedChildrenForID(dataID)));
      });
      var trackedField = fatField.clone(trackedChildren);
      if (trackedField) {
        var mutationField = intersectRelayQuery(trackedField, fatField);
        if (mutationField) {
          mutatedFields.push(mutationField);
        }
      }
    });
    return buildMutationFragment(fatQuery, mutatedFields);
  },

  /**
   * Creates a fragment used to update any data as a result of a mutation that
   * deletes an edge from a connection. The primary difference between this and
   * `createForFields` is whether or not the connection edges are re-fetched.
   *
   * `connectionName`
   *   Name of the connection field from which the edge is being deleted.
   *
   * `parentID`
   *   ID of the parent record containing the connection which may have metadata
   *   that needs to be re-fetched.
   *
   * `parentName`
   *   Name of the top-level field in the fat query that corresponds to the
   *   parent record.
   */
  buildFragmentForEdgeDeletion: function buildFragmentForEdgeDeletion(_ref2) {
    var tracker = _ref2.tracker;
    var fatQuery = _ref2.fatQuery;
    var connectionName = _ref2.connectionName;
    var parentID = _ref2.parentID;
    var parentName = _ref2.parentName;

    tracker = tracker || RelayStoreData.getDefaultInstance().getQueryTracker();
    var fatParent = getFieldFromFatQuery(fatQuery, parentName);
    var mutatedFields = [];
    var trackedParent = fatParent.clone(tracker.getTrackedChildrenForID(parentID));
    if (trackedParent) {
      var filterUnterminatedRange = function filterUnterminatedRange(node) {
        return node.getSchemaName() === connectionName;
      };
      var mutatedField = intersectRelayQuery(trackedParent, fatParent, filterUnterminatedRange);
      if (mutatedField) {
        mutatedFields.push(mutatedField);
      }
    }
    return buildMutationFragment(fatQuery, mutatedFields);
  },

  /**
   * Creates a fragment used to fetch data necessary to insert a new edge into
   * an existing connection.
   *
   * `connectionName`
   *   Name of the connection field into which the edge is being inserted.
   *
   * `parentID`
   *   ID of the parent record containing the connection which may have metadata
   *   that needs to be re-fetched.
   *
   * `edgeName`
   *   Name of the top-level field in the fat query that corresponds to the
   *   newly inserted edge.
   *
   * `parentName`
   *   Name of the top-level field in the fat query that corresponds to the
   *   parent record. If not supplied, metadata on the parent record and any
   *   connections without entries in `rangeBehaviors` will not be updated.
   */
  buildFragmentForEdgeInsertion: function buildFragmentForEdgeInsertion(_ref3) {
    var tracker = _ref3.tracker;
    var fatQuery = _ref3.fatQuery;
    var connectionName = _ref3.connectionName;
    var parentID = _ref3.parentID;
    var edgeName = _ref3.edgeName;
    var parentName = _ref3.parentName;
    var rangeBehaviors = _ref3.rangeBehaviors;

    tracker = tracker || RelayStoreData.getDefaultInstance().getQueryTracker();
    var trackedChildren = tracker.getTrackedChildrenForID(parentID);

    var mutatedFields = [];
    var trackedConnections = trackedChildren.filter(function (trackedChild) {
      return trackedChild instanceof RelayQuery.Field && trackedChild.getSchemaName() === connectionName;
    }); // $FlowIssue

    if (trackedConnections.length) {
      var keysWithoutRangeBehavior = {};
      var mutatedEdgeFields = [];
      trackedConnections.forEach(function (trackedConnection) {
        var trackedEdge = trackedConnection.getFieldByStorageKey('edges');
        if (trackedEdge == null) {
          return;
        }
        if (getRangeBehaviorKey(trackedConnection) in rangeBehaviors) {
          // Include edges from all connections that exist in `rangeBehaviors`.
          // This may add duplicates, but they will eventually be flattened.
          mutatedEdgeFields.push.apply(mutatedEdgeFields, _toConsumableArray(trackedEdge.getChildren()));
        } else {
          // If the connection is not in `rangeBehaviors`, re-fetch it.
          var key = trackedConnection.getSerializationKey();
          keysWithoutRangeBehavior[key] = true;
        }
      });
      if (mutatedEdgeFields.length) {
        mutatedFields.push(buildEdgeField(parentID, edgeName, mutatedEdgeFields));
      }

      // TODO: Do this even if there are no tracked connections.
      if (parentName != null) {
        var fatParent = getFieldFromFatQuery(fatQuery, parentName);
        var trackedParent = fatParent.clone(trackedChildren);
        if (trackedParent) {
          var filterUnterminatedRange = function filterUnterminatedRange(node) {
            return !keysWithoutRangeBehavior.hasOwnProperty(node.getSerializationKey());
          };
          var mutatedParent = intersectRelayQuery(trackedParent, fatParent, filterUnterminatedRange);
          if (mutatedParent) {
            mutatedFields.push(mutatedParent);
          }
        }
      }
    }
    return buildMutationFragment(fatQuery, mutatedFields);
  },

  /**
   * Creates a fragment used to fetch the given optimistic response.
   */
  buildFragmentForOptimisticUpdate: function buildFragmentForOptimisticUpdate(_ref4) {
    var response = _ref4.response;
    var fatQuery = _ref4.fatQuery;

    // Silences RelayQueryNode being incompatible with sub-class RelayQueryField
    // A detailed error description is available in #7635477
    var mutatedFields = inferRelayFieldsFromData(response);
    return buildMutationFragment(fatQuery, mutatedFields);
  },

  /**
   * Creates a RelayQuery.Mutation used to fetch the given optimistic response.
   */
  buildQueryForOptimisticUpdate: function buildQueryForOptimisticUpdate(_ref5) {
    var response = _ref5.response;
    var fatQuery = _ref5.fatQuery;
    var mutation = _ref5.mutation;

    var children = [nullthrows(RelayMutationQuery.buildFragmentForOptimisticUpdate({
      response: response,
      fatQuery: fatQuery
    }))];
    // TODO: Can this method ever return null? Task #7705258.
    return nullthrows(flattenRelayQuery(RelayQuery.Node.buildMutation('OptimisticQuery', fatQuery.getType(), mutation.calls[0].name, null, children)));
  },

  /**
   * Creates a RelayQuery.Mutation for the given config. See type
   * `MutationConfig` and the `buildFragmentForEdgeInsertion`,
   * `buildFragmentForEdgeDeletion` and `buildFragmentForFields` methods above
   * for possible configs.
   */
  buildQuery: function buildQuery(_ref6) {
    var configs = _ref6.configs;
    var fatQuery = _ref6.fatQuery;
    var mutationName = _ref6.mutationName;
    var mutation = _ref6.mutation;
    var tracker = _ref6.tracker;
    return (function () {
      tracker = tracker || RelayStoreData.getDefaultInstance().getQueryTracker();

      var children = [RelayQuery.Node.buildField(CLIENT_MUTATION_ID, null, null, { 'requisite': true })];

      configs.forEach(function (config) {
        switch (config.type) {
          case RelayMutationType.REQUIRED_CHILDREN:
            children = children.concat(config.children.map(function (child) {
              return RelayQuery.Node.create(child, RelayMetaRoute.get('$buildQuery'), {});
            }));
            break;

          case RelayMutationType.RANGE_ADD:
            children.push(RelayMutationQuery.buildFragmentForEdgeInsertion({
              connectionName: config.connectionName,
              edgeName: config.edgeName,
              fatQuery: fatQuery,
              parentID: config.parentID,
              parentName: config.parentName,
              rangeBehaviors: config.rangeBehaviors,
              tracker: tracker
            }));
            break;

          case RelayMutationType.RANGE_DELETE:
          case RelayMutationType.NODE_DELETE:
            children.push(RelayMutationQuery.buildFragmentForEdgeDeletion({
              connectionName: config.connectionName,
              fatQuery: fatQuery,
              parentID: config.parentID,
              parentName: config.parentName,
              tracker: tracker
            }));
            children.push(RelayQuery.Node.buildField(config.deletedIDFieldName));
            break;

          case RelayMutationType.FIELDS_CHANGE:
            children.push(RelayMutationQuery.buildFragmentForFields({
              fatQuery: fatQuery,
              fieldIDs: config.fieldIDs,
              tracker: tracker
            }));
            break;
        }
      });

      // TODO: Can this method ever return null? Task #7705258.
      return nullthrows(flattenRelayQuery(RelayQuery.Node.buildMutation(mutationName, fatQuery.getType(), mutation.calls[0].name, null, children, mutation.metadata)));
    })();
  }
};

function getFieldFromFatQuery(fatQuery, fieldName) {
  var field = fatQuery.getFieldByStorageKey(fieldName);
  !field ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayMutationQuery: Invalid field name on fat query, `%s`.', fieldName) : invariant(false) : undefined;
  return field;
}

function buildMutationFragment(fatQuery, fields) {
  // create a dummy field to re-fragment the input `fields`
  var fragmentedFields = fields.length ? refragmentRelayQuery(RelayQuery.Node.buildField('build_mutation_fragment', null, fields)) : null;

  var fragment = RelayQuery.Node.buildFragment('MutationQuery', fatQuery.getType(), fragmentedFields ? fragmentedFields.getChildren() : null);
  if (fragment) {
    !(fragment instanceof RelayQuery.Fragment) ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayMutationQuery: Expected a fragment.') : invariant(false) : undefined;
    return fragment;
  }
  return null;
}

function buildEdgeField(parentID, edgeName, edgeFields) {
  var fields = [RelayQuery.Node.buildField('cursor')];
  if (RelayConnectionInterface.EDGES_HAVE_SOURCE_FIELD && !GraphQLStoreDataHandler.isClientID(parentID)) {
    fields.push(RelayQuery.Node.buildField('source', null, [RelayQuery.Node.buildField('id')]));
  }
  fields.push.apply(fields, edgeFields);
  return RelayQuery.Node.buildField(edgeName, null, fields);
}

function getRangeBehaviorKey(connectionField) {
  // TODO: Replace `rangeBehavior` keys with `getStorageKey()`.
  return connectionField.getStorageKey().substr(connectionField.getSchemaName().length + 1);
}

module.exports = RelayMutationQuery;

/* Previously each element of configs had the type mixed, which meant
 * that they couldn't be used in configs.forEach without being
 * inspected at runtime. I think this is probably a good use case for
 * disjoin unions (flowtype.org/blog/2015/07/03/Disjoint-Unions.html)
 */