package sri.relay

import sri.core._
import sri.relay.tools.RelayProp

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
abstract class RelayComponent[P <: RelayComponentProps,S] extends ReactComponentJS[P,S]{
}

@ScalaJSDefined
abstract class RelayComponentProps extends ReactJSProps {
  val relay : RelayProp = null
}