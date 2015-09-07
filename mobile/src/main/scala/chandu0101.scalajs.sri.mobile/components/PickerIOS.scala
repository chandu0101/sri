package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacroAny
import chandu0101.scalajs.sri.core.{ReactClass, ReactElement}
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav


case class PickerIOS[T](style: js.UndefOr[js.Any] = js.undefined,
                        ref: js.UndefOr[String] = js.undefined,
                        key: js.UndefOr[String] = js.undefined,
                        onValueChange: js.UndefOr[js.Function1[T, _]] = js.undefined,
                        selectedValue: js.UndefOr[T] = js.undefined) {

  def apply(children: ReactElement*) = {
    val props = JSMacroAny[PickerIOS[T]](this)
    val f = ReactNative.createFactory(ReactNative.PickerIOS)
    f(props, children.toJSArray).asInstanceOf[ReactElement]
  }
}


case class PickerItemIOS[T](style: js.UndefOr[js.Any] = js.undefined,
                            label: js.UndefOr[String] = js.undefined,
                            ref: js.UndefOr[String] = js.undefined,
                            key: js.UndefOr[String] = js.undefined,
                            value: js.UndefOr[T] = js.undefined) {

  def apply() = {
    val props = JSMacroAny[PickerItemIOS[T]](this)
    val f = ReactNative.createFactory(ReactNative.PickerIOS.asInstanceOf[js.Dynamic].Item.asInstanceOf[ReactClass])
    f(props).asInstanceOf[ReactElement]
  }

}
