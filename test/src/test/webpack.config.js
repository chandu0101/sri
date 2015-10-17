'use strict';

var webpack = require('webpack');
var path = require('path');
var CommonsChunkPlugin = webpack.optimize.CommonsChunkPlugin;

module.exports = {

    entry: {
        test: './index.js'
    },
    output: {
        path: __dirname + '/resources',
        filename: '[name]-bundle.js'
    },
    plugins: [
        new webpack.NoErrorsPlugin()
        //new webpack.optimize.UglifyJsPlugin({
        //    compress: {
        //        warnings: false,
        //        drop_console: true,
        //        hoist_vars: true,
        //        unsafe: true
        //    }
        //})
    ],
    module: {
        loaders: [
            {
                test: /\.css$/,
                loader: 'style-loader!css-loader'
            },

            {
                test: /\.(png|jpg|svg)$/,
                loaders: [
                    'url-loader?limit=8192',
                    'image-webpack?optimizationLevel=7&progressive=true']
            } // inline base64 URLs for <=8k images, direct URLs for the rest
        ]
    }


};