package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.universal.ReactUniversal

import scala.scalajs.js
import scala.scalajs.js.{undefined, UndefOr => U}

case class Button(key: U[String] = undefined,
                  style: U[js.Any] = undefined,
                  ref: U[ButtonM => _] = undefined,
                  title: String,
                  disabled: U[Boolean] = undefined,
                  onPress: () => _,
                  testID: U[String] = undefined,
                  color: U[String] = undefined,
                  accessibilityLabel: U[String] = undefined) {
  def apply() = {
    val props = JSMacro[Button](this)
    React.createElement(ReactUniversal.Button, props)
  }

}

@js.native
trait ButtonM extends js.Object
