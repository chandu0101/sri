'use strict';

var webpack = require('webpack');
var path = require('path');
var CommonsChunkPlugin = webpack.optimize.CommonsChunkPlugin;

var getbabelRelayPlugin = require('babel-relay-plugin');
var schema = require('./data/schema.json');

var plugin = getbabelRelayPlugin(schema.data);

module.exports = {

    entry: {
        input: './build/relay-babel-input.js'
    },
    output: {
        path: __dirname + '/build',
        filename: 'relay-babel-output.js'
    },
    module: {
        loaders: [
            {
                test: /\.js$/,
                loader: 'babel',
                query: {stage: 0, plugins: ['./build/babelRelayPlugin']}
                //query: {stage: 0, plugins: [plugin]}
            }
        ]
    }


};