import WebpackDevServer from 'webpack-dev-server';
import webpack from 'webpack';
import express from 'express';
import graphQLHTTP from 'express-graphql';
import {Schema} from './data/schema';


const GRAPHQL_PORT = 8080;


//Expose a GraphQL endpoint
var graphQLServer = express();
graphQLServer.use('/', graphQLHTTP({schema: Schema, pretty: true}));
graphQLServer.listen(GRAPHQL_PORT, () => console.log(
    `GraphQL Server is now running on http://localhost:${GRAPHQL_PORT}`
));



var compiler = webpack({
    entry: {
        mainpage: './index.js'
    },
    output: {
        path: __dirname + '/assets',
        publicPath: "/assets/",
        filename: '[name]-bundle.js'
    },
    plugins: [
        new webpack.NoErrorsPlugin()
        //new CommonsChunkPlugin({
        //    name: "mainpage"
        //})
    ],
    //resolve: {
    //    alias: {
    //        react: path.resolve(__dirname + '/node_modules/react')
    //    }
    //},
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

});

var app = new WebpackDevServer(compiler, {
    proxy: {'/graphql': `http://localhost:8080`},
    publicPath: '/assets/',
    stats: {colors: true}
});


app.listen(8090,() => { console.log("App now running at 8090")})