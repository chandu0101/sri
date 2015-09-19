package chandu0101.scalajs.sri.relay

import scala.language.experimental.macros

object RelayQL {

  def apply(code: String): String = macro RelayMacro.relay_macro_impl
}
