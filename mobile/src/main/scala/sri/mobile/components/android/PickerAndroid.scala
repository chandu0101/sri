package sri.mobile.components.android

import chandu0101.macros.tojs.JSMacroAny
import sri.core.{React, ReactNode}
import sri.mobile.ReactNative

import scala.scalajs.js


case class PickerAndroid[T](style: js.UndefOr[js.Any] = js.undefined,
                        ref: js.UndefOr[js.Function1[PickerAndroidItemM,_]] = js.undefined,
                        key: js.UndefOr[String] = js.undefined,
                        prompt: js.UndefOr[String] = js.undefined,
                        enabled: js.UndefOr[Boolean] = js.undefined,
                        mode: js.UndefOr[PickerAndroidMode] = js.undefined,
                        onSelect: js.UndefOr[js.Function2[T,Int, _]] = js.undefined,
                        testID: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacroAny[PickerAndroid[T]](this)
    React.createElement(ReactNative.PickerAndroid,props,children :_*)
  }
}

@js.native
trait PickerAndroidM extends js.Object

class PickerAndroidMode private(val value : String) extends AnyVal

object PickerAndroidMode {

  val MODE_DIALOG = new PickerAndroidMode("dialog")

  val MODE_DROPDOWN = new PickerAndroidMode("dropdown")

}

case class PickerAndroidItem[T](style: js.UndefOr[js.Any] = js.undefined,
                            text: js.UndefOr[String] = js.undefined,
                            color: js.UndefOr[String] = js.undefined,
                            testID: js.UndefOr[String] = js.undefined,
                            selected: js.UndefOr[Boolean] = js.undefined,
                            ref: js.UndefOr[PickerAndroidItemM => _] = js.undefined,
                            key: js.UndefOr[String] = js.undefined,
                            value: js.UndefOr[T] = js.undefined) {

  def apply() = {
    val props = JSMacroAny[PickerAndroidItem[T]](this)
    React.createElement(ReactNative.PickerAndroid.asInstanceOf[js.Dynamic].Item,props)
  }

}

@js.native
trait PickerAndroidItemM extends js.Object