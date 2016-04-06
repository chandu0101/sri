package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.ReactUniversal
import sri.universal.components._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


case class Incremental(key: U[String] = undefined,
                       style: U[js.Any] = undefined,
                       onDone: U[() => _] = undefined,
                       name: U[String] = undefined,
                       disabled: U[Boolean] = undefined,
                       ref: U[IncrementalM => _] = undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Incremental](this)
    React.createElement(ReactUniversal.Incremental, props, children: _*)
  }

}

@js.native
trait IncrementalM extends js.Object