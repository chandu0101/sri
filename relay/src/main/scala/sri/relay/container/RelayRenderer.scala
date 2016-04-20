package sri.relay.container

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.relay.tools.RelayInternalTypes.RelayQuerySet
import sri.relay.{RelayComponentProps, Relay}
import sri.relay.route.RelayQueryConfig
import sri.relay.store.RelayEnvironment
import sri.relay.tools.{Abortable, ReadyState}
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined}


case class RelayRenderer[P <: RelayComponentProps, S](key: U[String] = undefined,
                                                      ref: U[RelayRendererM => _] = undefined,
                                                      forceFetch: U[Boolean] = undefined,
                                                      Container: RelayContainer[P, S],
                                                      environment: RelayEnvironment,
                                                      onForceFetch: U[(RelayQuerySet, js.Function1[ReadyState, _]) => Abortable] = undefined,
                                                      onPrimeCache: U[(RelayQuerySet, js.Function1[ReadyState, _]) => Abortable] = undefined,
                                                      onReadyStateChange: U[ReadyState => _] = undefined,
                                                      queryConfig: RelayQueryConfig,
                                                      render: U[RelayRenderArgs[P] => ReactElement] = undefined
                                                       ) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[RelayRenderer[P, S]](this)
    React.createElement(Relay.Renderer, props, children: _*)
  }

}

@js.native
trait RelayRendererM extends js.Object

