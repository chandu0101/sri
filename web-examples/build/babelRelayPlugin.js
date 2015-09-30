var getbabelRelayPlugin = require('babel-relay-plugin');
//var schema = require('../data/schema.json');
//var schema = require('../data/starWarsSchema.json');
var schema = require('../data/todoSchema.json');

module.exports = getbabelRelayPlugin(schema.data);

// inside that file
//var babelRelayPlugin   = require('babel-relay-plugin');
//var introspectionQuery = require('graphql/utilities').introspectionQuery;
//var request            = require('sync-request');
//
//var graphqlHubUrl = 'http://www.GraphQLHub.com/graphql';
//var response = request('GET', graphqlHubUrl, {
//    qs: {
//        query: introspectionQuery
//    }
//});
//
//var schema = JSON.parse(response.body.toString('utf-8'));
//
//module.exports = babelRelayPlugin(schema.data, {
//    abortOnError: true,
//});