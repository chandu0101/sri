package chandu0101.scalajs.sri.mobile.components.ios

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

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
    val f = ReactNative.createFactory(ReactNative.SwitchIOS)
    f(props).asInstanceOf[ReactElement]
  }

}

@js.native
trait SwitchIOSM extends js.Object