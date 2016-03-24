package sri.relay.container

import sri.core.{React, ReactElement, ReactElementU}
import sri.relay.{RelayComponentProps, Relay}
import sri.relay.route.RelayQueryConfig
import sri.relay.tools.{ComponentFetchState, ReadyState}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr => U}

object RelayRootContainer {
  type GraphQLFragmentPointers = js.Dictionary[js.UndefOr[js.Dynamic]]

  def apply[P <: RelayComponentProps,S](Component: RelayContainer[P,S],
            query: RelayQueryConfig,
            forceFetch: U[Boolean] = js.undefined,
            renderLoading: U[() => ReactElement] = js.undefined,
            renderFetched: U[(js.Dynamic, ComponentFetchState) => ReactElement] = js.undefined,
            renderFailure: U[(js.Error, js.Function0[_]) => ReactElement] = js.undefined,
            onReadyStateChange: U[ReadyState => _] = js.undefined) = {

    val props = json(Component = Component, route = query)
    forceFetch.foreach(v => props.updateDynamic("forceFetch")(v))
    renderLoading.foreach(v => props.updateDynamic("renderLoading")(v))
    renderFetched.foreach(v => props.updateDynamic("renderFetched")(v))
    renderFailure.foreach(v => props.updateDynamic("renderFailure")(v))
    onReadyStateChange.foreach(v => props.updateDynamic("onReadyStateChange")(v))
    React.createElement(Relay.RootContainer, props).asInstanceOf[ReactElementU[_, _]]
  }
}



