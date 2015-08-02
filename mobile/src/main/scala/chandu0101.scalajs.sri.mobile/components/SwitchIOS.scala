package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js

/**
 * Created by chandrasekharkode on 4/1/15.
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
  disabled: PropTypes.bool,
    onTintColor: PropTypes.string,
    onValueChange: PropTypes.Boolean => Unit,
    thumbTintColor: PropTypes.string,
    tintColor: PropTypes.string,
    value: PropTypes.bool,

 */


object SwitchIOS {

  def apply(style: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            tintColor: js.UndefOr[String] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            thumbTintColor: js.UndefOr[String] = js.undefined,
            onValueChange: js.UndefOr[Boolean => Unit] = js.undefined,
            onTintColor: js.UndefOr[String] = js.undefined,
            disabled: js.UndefOr[Boolean] = js.undefined,
            value: js.UndefOr[Boolean] = js.undefined) = {

    val p = js.Dynamic.literal()
    style.foreach(v => p.updateDynamic("style")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    tintColor.foreach(v => p.updateDynamic("tintColor")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    thumbTintColor.foreach(v => p.updateDynamic("thumbTintColor")(v))
    onValueChange.foreach(v => p.updateDynamic("onValueChange")(v))
    onTintColor.foreach(v => p.updateDynamic("onTintColor")(v))
    disabled.foreach(v => p.updateDynamic("disabled")(v))
    value.foreach(v => p.updateDynamic("value")(v))

    val f = ReactNative.createFactory(ReactNative.SwitchIOS)
    f(p).asInstanceOf[ReactElement]
  }

}
