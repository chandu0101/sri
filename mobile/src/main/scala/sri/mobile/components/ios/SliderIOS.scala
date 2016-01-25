package sri.mobile.components.ios

import chandu0101.macros.tojs.{rename, JSMacro}
import sri.core.React
import sri.mobile.ReactNative
import sri.universal.components.ImageSource

import scala.scalajs.js


case class SliderIOS(style: js.UndefOr[js.Any] = js.undefined,
                     minimumTrackTintColor: js.UndefOr[String] = js.undefined,
                     minimumValue: js.UndefOr[Double] = js.undefined,
                     onSlidingComplete: js.UndefOr[Double => Unit] = js.undefined,
                     ref: js.UndefOr[SliderIOSM => _] = js.undefined,
                     maximumTrackTintColor: js.UndefOr[String] = js.undefined,
                     key: js.UndefOr[String] = js.undefined,
                     thumbImage: js.UndefOr[ImageSource] = js.undefined,
                     @rename("thumbImage") thumbImageDynamic: js.UndefOr[ImageSource] = js.undefined,
                     trackImage: js.UndefOr[ImageSource] = js.undefined,
                     @rename("trackImage") trackImageDynamic: js.UndefOr[ImageSource] = js.undefined,
                     minimumTrackImage: js.UndefOr[ImageSource] = js.undefined,
                     @rename("minimumTrackImage") minimumTrackImageDynamic: js.UndefOr[ImageSource] = js.undefined,
                     maximumTrackImage: js.UndefOr[ImageSource] = js.undefined,
                     @rename("maximumTrackImage") maximumTrackImageDynamic: js.UndefOr[ImageSource] = js.undefined,
                     onValueChange: js.UndefOr[Double => Unit] = js.undefined,
                     value: js.UndefOr[Double] = js.undefined,
                     maximumValue: js.UndefOr[Double] = js.undefined) {

  def apply() = {
    val props = JSMacro[SliderIOS](this)
    React.createElement(ReactNative.SliderIOS, props)
  }

}

@js.native
trait SliderIOSM extends js.Object