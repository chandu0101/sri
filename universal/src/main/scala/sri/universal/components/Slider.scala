package sri.universal.components

import chandu0101.macros.tojs.{rename, JSMacro}
import sri.core._
import sri.universal.ReactUniversal
import sri.universal.components._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


case class Slider(key: U[String] = undefined,
                  style: U[js.Any] = undefined,
                  ref: U[SliderM => _] = undefined,
                  minimumTrackTintColor: js.UndefOr[String] = js.undefined,
                  minimumValue: js.UndefOr[Double] = js.undefined,
                  onSlidingComplete: js.UndefOr[Double => _] = js.undefined,
                  maximumTrackTintColor: js.UndefOr[String] = js.undefined,
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
                  step: js.UndefOr[Double] = js.undefined,
                  disabled: js.UndefOr[Boolean] = js.undefined,
                  testID: js.UndefOr[String] = js.undefined,
                  maximumValue: js.UndefOr[Double] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Slider](this)
    React.createElement(ReactUniversal.Slider, props, children: _*)
  }

}

@js.native
trait SliderM extends js.Object
