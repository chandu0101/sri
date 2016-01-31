import WebpackDevServer from 'webpack-dev-server';
import webpack from 'webpack';
import express from 'express';
import graphQLHTTP from 'express-graphql';
import {schema} from './data/starWarsSchema';
import cors from 'cors';


const GRAPHQL_PORT = 8088;


////Expose a GraphQL endpoint
var graphQLServer = express();
graphQLServer.use(cors());
graphQLServer.use('/', graphQLHTTP({schema: schema, pretty: true}));
graphQLServer.listen(GRAPHQL_PORT, () => console.log(
    `GraphQL Server is now running on http://localhost:${GRAPHQL_PORT}`
));
