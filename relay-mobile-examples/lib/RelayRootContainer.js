/**
 * Copyright 2013-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule RelayRootContainer
 * @typechecks
 * 
 */

'use strict';

var _inherits = require('babel-runtime/helpers/inherits')['default'];

var _classCallCheck = require('babel-runtime/helpers/class-call-check')['default'];

var _extends = require('babel-runtime/helpers/extends')['default'];

var GraphQLFragmentPointer = require('./GraphQLFragmentPointer');
var React = require('react-native');
var RelayDeprecated = require('./RelayDeprecated');

var RelayStore = require('./RelayStore');
var RelayStoreData = require('./RelayStoreData');
var RelayPropTypes = require('./RelayPropTypes');

var StaticContainer = require('react-static-container');

var getRelayQueries = require('./getRelayQueries');
var invariant = require('fbjs/lib/invariant');
var mapObject = require('fbjs/lib/mapObject');

var PropTypes = React.PropTypes;

var storeData = RelayStoreData.getDefaultInstance();

/**
 * @public
 *
 * RelayRootContainer sends requests for data required to render the supplied
 * `Component` and `route`. The `Component` must be a container created using
 * `Relay.createContainer`.
 *
 * See the `RelayStore` module for documentation on `onReadyStateChange`.
 *
 * === Render Callbacks ===
 *
 * Whenever the RelayRootContainer renders, one of three render callback props
 * are invoked depending on whether data is being loaded, can be resolved, or if
 * an error is incurred.
 *
 *  ReactDOM.render(
 *    <RelayRootContainer
 *      Component={FooComponent}
 *      route={fooRoute}
 *      renderLoading={function() {
 *        return <View>Loading...</View>;
 *      }}
 *      renderFetched={function(data) {
 *        // Must spread `data` into <FooComponent>.
 *        return <FooComponent {...data} />;
 *      }}
 *      renderFailure={function(error) {
 *        return <View>Error: {error.message}</View>;
 *      }}
 *    />,
 *    ...
 *  );
 *
 * If a callback is not supplied, it has a default behavior:
 *
 *  - Without `renderFetched`, `Component` will be rendered with fetched data.
 *  - Without `renderFailure`, an error will render to null.
 *  - Without `renderLoading`, the existing view will continue to render. If
 *    this is the initial mount (with no existing view), renders to null.
 *
 * In addition, supplying a `renderLoading` that returns undefined has the same
 * effect as not supplying the callback. (Usually, an undefined return value is
 * an error in React).
 *
 * === Refs ===
 *
 * References to elements rendered by any of these callbacks can be obtained by
 * using the React `ref` prop. For example:
 *
 *   <FooComponent {...data} ref={handleFooRef} />
 *
 *   function handleFooRef(component) {
 *     // Invoked when `<FooComponent>` is mounted or unmounted. When mounted,
 *     // `component` will be the component. When unmounted, `component` will
 *     // be null.
 *   }
 *
 */

var RelayRootContainer = (function (_React$Component) {
  _inherits(RelayRootContainer, _React$Component);

  function RelayRootContainer(props, context) {
    _classCallCheck(this, RelayRootContainer);

    _React$Component.call(this, props, context);
    this.mounted = true;
    this.state = this._runQueries(this.props);
  }

  RelayRootContainer.prototype.getChildContext = function getChildContext() {
    return { route: this.props.route };
  };

  /**
   * @private
   */

  RelayRootContainer.prototype._runQueries = function _runQueries(_ref) {
    var _this = this;

    var Component = _ref.Component;
    var forceFetch = _ref.forceFetch;
    var refetchRoute = _ref.refetchRoute;
    var route = _ref.route;

    var querySet = getRelayQueries(Component, route);
    var onReadyStateChange = function onReadyStateChange(readyState) {
      if (!_this.mounted) {
        _this._handleReadyStateChange(_extends({}, readyState, { mounted: false }));
        return;
      }
      var _state = _this.state;
      var fragmentPointers = _state.fragmentPointers;
      var pendingRequest = _state.pendingRequest;

      if (request !== pendingRequest) {
        // Ignore (abort) ready state if we have a new pending request.
        return;
      }
      if (readyState.aborted || readyState.done || readyState.error) {
        pendingRequest = null;
      }
      if (readyState.ready && !fragmentPointers) {
        fragmentPointers = mapObject(querySet, function (query) {
          return query ? GraphQLFragmentPointer.createForRoot(storeData.getRecordStore(), query) : null;
        });
      }
      _this.setState({
        activeComponent: Component,
        activeRoute: route,
        error: readyState.error,
        fragmentPointers: fragmentPointers,
        pendingRequest: pendingRequest,
        readyState: _extends({}, readyState, { mounted: true }),
        fetchState: {
          done: readyState.done,
          stale: readyState.stale
        }
      });
    };

    if (typeof refetchRoute !== 'undefined') {
      RelayDeprecated.warn({
        was: 'RelayRootContainer.refetchRoute',
        now: 'RelayRootContainer.forceFetch'
      });
      forceFetch = refetchRoute;
    }

    var request = forceFetch ? RelayStore.forceFetch(querySet, onReadyStateChange) : RelayStore.primeCache(querySet, onReadyStateChange);

    return {
      activeComponent: null,
      activeRoute: null,
      error: null,
      fragmentPointers: null,
      pendingRequest: request,
      readyState: null,
      fetchState: {
        done: false,
        stale: false
      }
    };
  };

  /**
   * Returns whether or not the view should be updated during the current render
   * pass. This is false between invoking `Relay.Store.{primeCache,forceFetch}`
   * and the first invocation of the `onReadyStateChange` callback.
   *
   * @private
   */

  RelayRootContainer.prototype._shouldUpdate = function _shouldUpdate() {
    return this.props.Component === this.state.activeComponent && this.props.route === this.state.activeRoute;
  };

  /**
   * Exposed as the second argument to the `onFailure` prop.
   *
   * @private
   */

  RelayRootContainer.prototype._retry = function _retry() {
    !this.state.error ? process.env.NODE_ENV !== 'production' ? invariant(false, 'RelayRootContainer: Can only invoke `retry` in a failure state.') : invariant(false) : undefined;
    this.setState(this._runQueries(this.props));
  };

  RelayRootContainer.prototype.componentWillReceiveProps = function componentWillReceiveProps(nextProps) {
    if (nextProps.Component !== this.props.Component || nextProps.route !== this.props.route) {
      if (this.state.pendingRequest) {
        this.state.pendingRequest.abort();
      }
      this.setState(this._runQueries(nextProps));
    }
  };

  RelayRootContainer.prototype.componentDidUpdate = function componentDidUpdate(prevProps, prevState) {
    // `prevState` should exist; the truthy check is for Flow soundness.
    var readyState = this.state.readyState;
    if (readyState) {
      if (!prevState || readyState !== prevState.readyState) {
        this._handleReadyStateChange(readyState);
      }
    }
  };

  /**
   * @private
   */

  RelayRootContainer.prototype._handleReadyStateChange = function _handleReadyStateChange(readyState) {
    var onReadyStateChange = this.props.onReadyStateChange;
    if (onReadyStateChange) {
      onReadyStateChange(readyState);
    }
  };

  RelayRootContainer.prototype.componentWillUnmount = function componentWillUnmount() {
    if (this.state.pendingRequest) {
      this.state.pendingRequest.abort();
    }
    this.mounted = false;
  };

  RelayRootContainer.prototype.render = function render() {
    var children = null;
    var shouldUpdate = this._shouldUpdate();
    if (shouldUpdate && this.state.error) {
      var renderFailure = this.props.renderFailure;
      if (renderFailure) {
        children = renderFailure(this.state.error, this._retry.bind(this));
      }
    } else if (shouldUpdate && this.state.fragmentPointers) {
      var renderFetched = this.props.renderFetched;
      if (renderFetched) {
        children = renderFetched(_extends({}, this.props.route.params, this.state.fragmentPointers), this.state.fetchState);
      } else {
        var Component = this.props.Component;
        children = React.createElement(Component, _extends({}, this.props.route.params, this.state.fragmentPointers));
      }
    } else {
      var renderLoading = this.props.renderLoading;
      if (renderLoading) {
        children = renderLoading();
      } else {
        children = undefined;
      }
      if (children === undefined) {
        children = null;
        shouldUpdate = false;
      }
    }
    return React.createElement(
      StaticContainer,
      { shouldUpdate: shouldUpdate },
      children
    );
  };

  return RelayRootContainer;
})(React.Component);

RelayRootContainer.propTypes = {
  Component: RelayPropTypes.Container,
  forceFetch: PropTypes.bool,
  onReadyStateChange: PropTypes.func,
  renderFailure: PropTypes.func,
  renderFetched: PropTypes.func,
  renderLoading: PropTypes.func,
  route: RelayPropTypes.QueryConfig.isRequired
};

RelayRootContainer.childContextTypes = {
  route: RelayPropTypes.QueryConfig.isRequired
};

module.exports = RelayRootContainer;
// TODO: Deprecate, #6247867.