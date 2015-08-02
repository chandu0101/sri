package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.{ReactClass, ReactElement}
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

/**
 * Created by chandrasekharkode on 4/2/15.
 *
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
onValueChange: PropTypes.(T) => Unit,
    selectedValue: PropTypes.T,

 */




case class PickerIOS[T](style : js.UndefOr[js.Any] = js.undefined,
                     ref : js.UndefOr[String] = js.undefined,
                     key : js.UndefOr[String] = js.undefined,
                     onValueChange : js.UndefOr[(T) => Unit] = js.undefined,
                     selectedValue : js.UndefOr[T] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    style.foreach(v => p.updateDynamic("style")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    onValueChange.foreach(v => p.updateDynamic("onValueChange")(v))
    selectedValue.foreach(v => p.updateDynamic("selectedValue")(v.asInstanceOf[js.Any]))
    p
  }

  def apply(children : ReactElement*) = {
    val f = ReactNative.createFactory(ReactNative.PickerIOS)
    f(toJS,children.toJSArray).asInstanceOf[ReactElement]
  }
}


/**
 *key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
value:PropTypes.T,
label:PropTypes.string

 */
object PickerItemIOS {

  def apply[T](style : js.UndefOr[js.Any] = js.undefined,
            label : js.UndefOr[String] = js.undefined,
            ref : js.UndefOr[String] = js.undefined,
            key : js.UndefOr[String] = js.undefined,
            value : js.UndefOr[T] = js.undefined) = {

    val p = js.Dynamic.literal()
    style.foreach(v => p.updateDynamic("style")(v))
    label.foreach(v => p.updateDynamic("label")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    value.foreach(v => p.updateDynamic("value")(v.asInstanceOf[js.Any]))

    val f = ReactNative.createFactory(ReactNative.PickerIOS.asInstanceOf[js.Dynamic].Item.asInstanceOf[ReactClass])
    f(p).asInstanceOf[ReactElement]
  }

}
