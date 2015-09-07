package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js

case class Image(onLoaded: js.UndefOr[Boolean] = js.undefined,
                 source: js.UndefOr[ImageSource] = js.undefined,
                 style: js.UndefOr[js.Any] = js.undefined,
                 onLayout: js.UndefOr[js.Function] = js.undefined,
                 accessibilityLabel: js.UndefOr[String] = js.undefined,
                 onLoadError: js.UndefOr[js.Dynamic => Unit] = js.undefined,
                 ref: js.UndefOr[String] = js.undefined,
                 onLoadAbort: js.UndefOr[js.Function] = js.undefined,
                 key: js.UndefOr[String] = js.undefined,
                 resizeMode: js.UndefOr[ImageResizeMode] = js.undefined,
                 testID: js.UndefOr[String] = js.undefined,
                 onLoadStart: js.UndefOr[js.Dynamic => Unit] = js.undefined,
                 defaultSource: js.UndefOr[ImageSource] = js.undefined,
                 onLoadProgress: js.UndefOr[js.Dynamic => Unit] = js.undefined,
                 accessible: js.UndefOr[Boolean] = js.undefined) {

  def apply() = {
    val props = JSMacro[Image](this)
    val f = ReactNative.createFactory(ReactNative.Image)
    f(props).asInstanceOf[ReactElement]
  }

}


class ImageResizeMode private(val value: String) extends AnyVal


object ImageResizeMode {

  val COVER = new ImageResizeMode("cover")
  val CONTAIN = new ImageResizeMode("contain")
  val STRETCH = new ImageResizeMode("stretch")

  def newMode(mode: String) = new ImageResizeMode(mode)

}