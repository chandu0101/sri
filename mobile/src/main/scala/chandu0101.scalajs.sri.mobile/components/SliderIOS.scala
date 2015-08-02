package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js

/**
 *
 *
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
  maximumTrackTintColor: PropTypes.string,
     maximumValue: PropTypes.Double,
     minimumTrackTintColor: PropTypes.string,
     minimumValue: PropTypes.Double,
     onSlidingComplete: PropTypes.Double => Unit,
    onValueChange: PropTypes.Double => Unit,
     value: PropTypes.Double,
 */




object SliderIOS {

  def apply(style : js.UndefOr[js.Any] = js.undefined,
            minimumTrackTintColor : js.UndefOr[String] = js.undefined,
            minimumValue : js.UndefOr[Double] = js.undefined,
            onSlidingComplete : js.UndefOr[Double => Unit] = js.undefined,
            ref : js.UndefOr[String] = js.undefined,
            maximumTrackTintColor : js.UndefOr[String] = js.undefined,
            key : js.UndefOr[String] = js.undefined,
            onValueChange : js.UndefOr[Double => Unit] = js.undefined,
            value : js.UndefOr[Double] = js.undefined,
            maximumValue : js.UndefOr[Double] = js.undefined) = {

    val p = js.Dynamic.literal()
    style.foreach(v => p.updateDynamic("style")(v))
    minimumTrackTintColor.foreach(v => p.updateDynamic("minimumTrackTintColor")(v))
    minimumValue.foreach(v => p.updateDynamic("minimumValue")(v))
    onSlidingComplete.foreach(v => p.updateDynamic("onSlidingComplete")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    maximumTrackTintColor.foreach(v => p.updateDynamic("maximumTrackTintColor")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    onValueChange.foreach(v => p.updateDynamic("onValueChange")(v))
    value.foreach(v => p.updateDynamic("value")(v))
    maximumValue.foreach(v => p.updateDynamic("maximumValue")(v))

    val f = ReactNative.createFactory(ReactNative.SliderIOS)
    f(p).asInstanceOf[ReactElement]
  }

}
