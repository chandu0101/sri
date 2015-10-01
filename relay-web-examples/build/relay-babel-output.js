/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};

/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {

/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId])
/******/ 			return installedModules[moduleId].exports;

/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			exports: {},
/******/ 			id: moduleId,
/******/ 			loaded: false
/******/ 		};

/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);

/******/ 		// Flag the module as loaded
/******/ 		module.loaded = true;

/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}


/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;

/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;

/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";

/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ function(module, exports) {

	
	// START OF QUERY

	'use strict';

	(function (sub_0, sub_1, sub_2, sub_3) {
	  var GraphQL = Relay.QL.__GraphQL;
	  return new GraphQL.QueryFragment('Relay', 'User', [new GraphQL.Field('completedCount', null, null, null, null, null, {
	    parentType: 'User'
	  }), new GraphQL.Field('todos', [new GraphQL.Field('edges', [new GraphQL.Field('node', [new GraphQL.Field('id', null, null, null, null, null, {
	    parentType: 'Todo',
	    requisite: true
	  })], [Relay.QL.__frag(sub_0)], null, null, null, {
	    parentType: 'TodoEdge',
	    rootCall: 'node',
	    pk: 'id',
	    requisite: true
	  }), new GraphQL.Field('cursor', null, null, null, null, null, {
	    parentType: 'TodoEdge',
	    generated: true,
	    requisite: true
	  })], null, null, null, null, {
	    parentType: 'TodoConnection',
	    plural: true
	  }), new GraphQL.Field('pageInfo', [new GraphQL.Field('hasNextPage', null, null, null, null, null, {
	    parentType: 'PageInfo',
	    generated: true,
	    requisite: true
	  }), new GraphQL.Field('hasPreviousPage', null, null, null, null, null, {
	    parentType: 'PageInfo',
	    generated: true,
	    requisite: true
	  })], null, null, null, null, {
	    parentType: 'TodoConnection',
	    generated: true,
	    requisite: true
	  })], [Relay.QL.__frag(sub_1)], [new GraphQL.Callv('status', new GraphQL.CallVariable('status')), new GraphQL.Callv('first', new GraphQL.CallVariable('limit'))], null, null, {
	    parentType: 'User',
	    connection: true,
	    nonFindable: true
	  }), new GraphQL.Field('totalCount', null, null, null, null, null, {
	    parentType: 'User'
	  }), new GraphQL.Field('id', null, null, null, null, null, {
	    parentType: 'User',
	    generated: true,
	    requisite: true
	  })], [Relay.QL.__frag(sub_2), Relay.QL.__frag(sub_3)]);
	})(Todo.getFragment('todo'), MarkAllTodosMutation.getFragment('todos'), MarkAllTodosMutation.getFragment('viewer'), Todo.getFragment('viewer'));

	// END OF QUERY

/***/ }
/******/ ]);