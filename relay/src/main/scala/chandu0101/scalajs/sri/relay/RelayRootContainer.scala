package chandu0101.scalajs.sri.relay

import chandu0101.scalajs.sri.core.{ReactElement, React}
import scala.scalajs.js
import scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr => U}

object RelayRootContainer {

  def apply(Component: RelayContainer[_, _],
            route: RelayQueryConfig,forceFetch : U[Boolean] = js.undefined,
            renderLoading : U[() => ReactElement] = js.undefined,
            renderFetched :U[(js.Dynamic,FetchState) => ReactElement] = js.undefined,
            renderFailure : U[(RelayError,js.Function) => ReactElement] = js.undefined,
            onReadyStateChange : U[ReadyState => _] = js.undefined ) = {

    val js = json(Component = Component, route = route)
    forceFetch.foreach(v => js.updateDynamic("forceFetch")(v))
    renderLoading.foreach(v => js.updateDynamic("renderLoading")(v))
    renderFetched.foreach(v => js.updateDynamic("renderFetched")(v))
    renderFailure.foreach(v => js.updateDynamic("renderFailure")(v))
    onReadyStateChange.foreach(v => js.updateDynamic("onReadyStateChange")(v))

    val f = React.createFactory(Relay.RootContainer)
    f(js).asInstanceOf[ReactElement]
  }
}

@js.native
trait FetchState extends js.Object {
  val stale : Boolean = js.native
}

@js.native
trait RelayError extends js.Object {
  val message : String = js.native
}

@js.native
trait ReadyState extends js.Object {
  val aborted: Boolean = js.native
  val done : Boolean = js.native
  val error : U[RelayError] = js.native
  val ready : Boolean = js.native
  val stale : Boolean = js.native
}