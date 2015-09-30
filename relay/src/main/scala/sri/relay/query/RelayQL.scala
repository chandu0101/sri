package sri.relay.query

import sri.relay.macros.RelayMacro

import scala.language.experimental.macros
import scala.scalajs.js

object RelayQL {
  type RelayConcreteNode = js.Any

  def apply(code: String): String = macro RelayMacro.relay_macro_impl
}
