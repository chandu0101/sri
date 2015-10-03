var getbabelRelayPlugin = require('babel-relay-plugin');
var schema = require('../data/starWarsSchema.json');

module.exports = getbabelRelayPlugin(schema.data);
