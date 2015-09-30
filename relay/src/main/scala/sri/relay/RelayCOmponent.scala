package sri.relay

import sri.core.ReactComponent
import sri.relay.tools.RelayProp

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
abstract class RelayComponent[P,S] extends ReactComponent[P,S]{

  def relay = propsDynamic.relay.asInstanceOf[RelayProp]
}
