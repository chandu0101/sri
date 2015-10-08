package sri.mobile.components.ios

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.mobile.ReactNative

import scala.scalajs.js


case class SwitchIOS(style: js.UndefOr[js.Any] = js.undefined,
                     ref: js.UndefOr[SwitchIOS => _] = js.undefined,
                     tintColor: js.UndefOr[String] = js.undefined,
                     key: js.UndefOr[String] = js.undefined,
                     thumbTintColor: js.UndefOr[String] = js.undefined,
                     onValueChange: js.UndefOr[Boolean => Unit] = js.undefined,
                     onTintColor: js.UndefOr[String] = js.undefined,
                     disabled: js.UndefOr[Boolean] = js.undefined,
                     value: js.UndefOr[Boolean] = js.undefined) {

  def apply() = {
    val props = JSMacro[SwitchIOS](this)
    React.createElement(ReactNative.SwitchIOS,props)
  }

}

@js.native
trait SwitchIOSM extends js.Object