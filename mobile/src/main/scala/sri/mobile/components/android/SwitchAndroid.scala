package sri.mobile.components.android

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.mobile._

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class SwitchAndroid(key: U[String] = undefined,
                         style: U[js.Any] = undefined,
                         ref: U[SwitchAndroidM => _] = undefined,
                         value: U[Boolean] = undefined,
                         disabled: U[Boolean] = undefined,
                         onValueChange: U[Boolean => _] = undefined,
                         testID: U[String] = undefined) {

  def apply() = {
    val props = JSMacro[SwitchAndroid](this)
    React.createElement(ReactNative.SwitchAndroid,props)
  }

}

@js.native
trait SwitchAndroidM extends js.Object