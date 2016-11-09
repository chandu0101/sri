package sri.universal

package components

import chandu0101.macros.tojs.JSMacro
import sri.core.React

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}

case class Switch(key: U[String] = undefined,
                  style: U[js.Any] = undefined,
                  ref: U[SwitchM => _] = undefined,
                  value: U[Boolean] = undefined,
                  disabled: U[Boolean] = undefined,
                  onValueChange: U[Boolean => _] = undefined,
                  testID: U[String] = undefined,
                  tintColor: U[String] = undefined,
                  onTintColor: U[String] = undefined,
                  thumbTintColor: U[String] = undefined
                   ) {
  def apply() = {
    val props = JSMacro[Switch](this)
    React.createElement(ReactUniversal.Switch, props)
  }

}

@js.native
trait SwitchM extends js.Object
