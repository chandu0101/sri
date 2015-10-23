package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{ReactNode, React}
import sri.universal.ReactUniversal

import scala.scalajs.js

case class Image(onLoaded: js.UndefOr[Boolean] = js.undefined,
                 source: js.UndefOr[ImageSource] = js.undefined,
                 style: js.UndefOr[js.Any] = js.undefined,
                 onLayout: js.UndefOr[js.Function] = js.undefined,
                 accessibilityLabel: js.UndefOr[String] = js.undefined,
                 onError: js.UndefOr[js.Dynamic => Unit] = js.undefined,
                 ref: js.UndefOr[ImageM => _] = js.undefined,
                 onLoadEnd: js.UndefOr[() => _] = js.undefined,
                 onLoad: js.UndefOr[() => _] = js.undefined,
                 onLoadAbort: js.UndefOr[js.Function] = js.undefined,
                 key: js.UndefOr[String] = js.undefined,
                 resizeMode: js.UndefOr[ImageResizeMode] = js.undefined,
                 testID: js.UndefOr[String] = js.undefined,
                 onLoadStart: js.UndefOr[js.Dynamic => Unit] = js.undefined,
                 defaultSource: js.UndefOr[ImageSource] = js.undefined,
                 onLoadProgress: js.UndefOr[js.Dynamic => Unit] = js.undefined,
                 accessible: js.UndefOr[Boolean] = js.undefined) {

  def apply(children : ReactNode*) = {
    val props = JSMacro[Image](this)
    React.createElement(ReactUniversal.Image,props,children: _*)
  }

}


class ImageResizeMode private(val value: String) extends AnyVal


object ImageResizeMode {

  val COVER = new ImageResizeMode("cover")
  val CONTAIN = new ImageResizeMode("contain")
  val STRETCH = new ImageResizeMode("stretch")

  def newMode(mode: String) = new ImageResizeMode(mode)

}

@js.native
trait ImageM extends js.Object