package sri.universal.components

import chandu0101.macros.tojs.JSMacro

import scala.scalajs.js


case class ImageSource(uri: String, isStatic: js.UndefOr[Boolean] = js.undefined,scale : js.UndefOr[Double] = js.undefined) {
  val toJS: js.Object = JSMacro[ImageSource](this)
}

object ImageSource {
  def fromJson(obj: js.Dynamic) = {
    ImageSource(obj.uri.toString, if (js.isUndefined(obj.isStatic)) js.undefined else obj.isStatic.asInstanceOf[Boolean])
  }
}