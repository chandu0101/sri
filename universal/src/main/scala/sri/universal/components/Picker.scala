package sri.universal.components

import chandu0101.macros.tojs.JSMacroAny
import sri.core.{React, ReactNode}
import sri.universal.ReactUniversal

import scala.scalajs.js


case class Picker[T](style: js.UndefOr[js.Any] = js.undefined,
                     ref: js.UndefOr[js.Function1[PickerItemM, _]] = js.undefined,
                     key: js.UndefOr[String] = js.undefined,
                     itemStyle: js.UndefOr[js.Any] = js.undefined,
                     prompt: js.UndefOr[String] = js.undefined,
                     enabled: js.UndefOr[Boolean] = js.undefined,
                     mode: js.UndefOr[PickerMode] = js.undefined,
                     onValueChange: js.UndefOr[js.Function1[T, _]] = js.undefined,
                     selectedValue: js.UndefOr[T] = js.undefined,
                     testID: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacroAny[Picker[T]](this)
    React.createElement(ReactUniversal.Picker, props, children: _*)
  }
}

object Picker {

  val MODE_DIALOG: PickerMode = ReactUniversal.Picker.asInstanceOf[js.Dynamic].MODE_DIALOG.asInstanceOf[PickerMode]

  val MODE_DROPDOWN: PickerMode = ReactUniversal.Picker.asInstanceOf[js.Dynamic].MODE_DROPDOWN.asInstanceOf[PickerMode]

}

@js.native
trait PickerM extends js.Object

@js.native
trait PickerMode extends js.Object

case class PickerItem[T](style: js.UndefOr[js.Any] = js.undefined,
                         label: js.UndefOr[String] = js.undefined,
                         color: js.UndefOr[String] = js.undefined,
                         testID: js.UndefOr[String] = js.undefined,
                         ref: js.UndefOr[PickerItemM => _] = js.undefined,
                         key: js.UndefOr[String] = js.undefined,
                         value: js.UndefOr[T] = js.undefined) {

  def apply() = {
    val props = JSMacroAny[PickerItem[T]](this)
    React.createElement(ReactUniversal.Picker.asInstanceOf[js.Dynamic].Item, props)
  }

}

@js.native
trait PickerItemM extends js.Object