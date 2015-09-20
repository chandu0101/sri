package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacroAny
import chandu0101.scalajs.sri.core.{ReactNode, ReactClass, ReactElement}
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav


case class PickerIOS[T](style: js.UndefOr[js.Any] = js.undefined,
                        ref: js.UndefOr[js.Function1[PickerIOSM,_]] = js.undefined,
                        key: js.UndefOr[String] = js.undefined,
                        onValueChange: js.UndefOr[js.Function1[T, _]] = js.undefined,
                        selectedValue: js.UndefOr[T] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacroAny[PickerIOS[T]](this)
    ReactNative.createElement(ReactNative.PickerIOS,props,children :_*)
  }
}

@js.native
trait PickerIOSM extends js.Object

case class PickerItemIOS[T](style: js.UndefOr[js.Any] = js.undefined,
                            label: js.UndefOr[String] = js.undefined,
                            ref: js.UndefOr[PickerItemIOSM => _] = js.undefined,
                            key: js.UndefOr[String] = js.undefined,
                            value: js.UndefOr[T] = js.undefined) {

  def apply() = {
    val props = JSMacroAny[PickerItemIOS[T]](this)
    ReactNative.createElement(ReactNative.PickerIOS.asInstanceOf[js.Dynamic].Item,props)
  }

}

@js.native
trait PickerItemIOSM extends js.Object