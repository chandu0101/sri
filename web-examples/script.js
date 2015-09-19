var getbabelRelayPlugin = require('babel-relay-plugin');
var schema = require('./schema.json');
var source = require("./test.js")
var plugin = getbabelRelayPlugin(schema.data);
var Relay = require(`react-relay`);


require("babel/register")({plugins: [plugin]});

require("babel").transform(source, {
    plugins: [plugin]
});