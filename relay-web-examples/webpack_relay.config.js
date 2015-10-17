'use strict';

var webpack = require('webpack');
var path = require('path');
var CommonsChunkPlugin = webpack.optimize.CommonsChunkPlugin;

var introspectionQuery = require('graphql/utilities').introspectionQuery;


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