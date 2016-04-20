package sri.relay.container

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.relay.{RelayComponentProps, Relay}
import sri.relay.route.RelayQueryConfig
import sri.relay.store.RelayEnvironment
import sri.relay.tools.ReadyState
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined}


case class RelayReadyStateRenderer[P <: RelayComponentProps, S](key: U[String] = undefined,
                                                                ref: U[RelayReadyStateRendererM => _] = undefined,
                                                                Container: RelayContainer[P, S],
                                                                environment: RelayEnvironment,
                                                                queryConfig: RelayQueryConfig,
                                                                readyState: U[ReadyState] = undefined,
                                                                render: U[RelayRenderArgs[P] => ReactElement] = undefined,
                                                                retry: U[() => _] = undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[RelayReadyStateRenderer[P, S]](this)
    React.createElement(Relay.ReadyStateRenderer, props, children: _*)
  }

}

@js.native
trait RelayReadyStateRendererM extends js.Object

@ScalaJSDefined
trait RelayRenderArgs[P] extends js.Object {

  val done: Boolean
  val error: U[js.Dynamic]
  val props: U[P]
  val retry: U[js.Function0[_]]
  val stale: Boolean
}