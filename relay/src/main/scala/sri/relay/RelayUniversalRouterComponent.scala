package sri.relay

import sri.relay.tools.RelayProp
import sri.universal.router.UniversalRouterComponent

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
abstract class RelayUniversalRouterComponent[P, S] extends UniversalRouterComponent[P, S] {

  def relay = propsDynamic.relay.asInstanceOf[RelayProp]
}
