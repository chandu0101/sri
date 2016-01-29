package sri.universal.apis

import scala.scalajs.js

@js.native
trait PixelRatio extends js.Object {

  def get(): Double = js.native

  def getFontScale(): Double = js.native

  def getPixelSizeForLayoutSize(layoutSize: Double): Double = js.native

  def roundToNearestPixel(layoutSize: Double): Double = js.native
}
