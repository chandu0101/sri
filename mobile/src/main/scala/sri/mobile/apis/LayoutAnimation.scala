package sri.mobile.apis

import scala.scalajs.js

@js.native
trait LayoutAnimation extends js.Object {

  def configureNext(config: LayoutConfig, onAnimationDidEnd: js.Function = ???): Unit = js.native

  def create(duration: Double, `type`: LayoutType, creationProps: LayoutProperty): LayoutConfig = js.native

  def easeInEaseOut(): Unit = js.native

  def linear(): Unit = js.native

  def spring(): Unit = js.native

  val Types: LayoutTypes = js.native
  val Properties: LayoutProperties = js.native
  val Presets: LayoutPresets = js.native
}

@js.native
trait LayoutType extends js.Object

@js.native
trait LayoutTypes extends js.Object {
  val spring: LayoutType = js.native
  val linear: LayoutType = js.native
  val easeInEaseOut: LayoutType = js.native
  val easeIn: LayoutType = js.native
  val easeOut: LayoutType = js.native
  val keyboard: LayoutType = js.native
}

@js.native
trait LayoutProperty extends js.Object

@js.native
trait LayoutProperties extends js.Object {

  val opacity: LayoutProperty = js.native
  val scaleXY: LayoutProperty = js.native
}

@js.native
trait LayoutAnim extends js.Object {
  val duration: js.UndefOr[Double] = js.native
  val delay: js.UndefOr[Double] = js.native
  val springDamping: js.UndefOr[Double] = js.native
  val initialVelocity: js.UndefOr[Double] = js.native
  val `type`: js.UndefOr[LayoutType] = js.native
  val property: js.UndefOr[LayoutProperty] = js.native
}

@js.native
trait LayoutConfig extends js.Object {
  val duration: js.UndefOr[Double] = js.native
  val create: js.UndefOr[LayoutAnim] = js.native
  val update: js.UndefOr[LayoutAnim] = js.native
  val delete: js.UndefOr[LayoutAnim] = js.native
}

@js.native
trait LayoutPresets extends js.Object {
  val easeInEaseOut: LayoutConfig = js.native
  val linear: LayoutConfig = js.native
  val spring: LayoutConfig = js.native
}

@js.native
trait Layout extends js.Object {
  val x : Double = js.native
  val y : Double = js.native
  val width : Double = js.native
  val height : Double = js.native
}

@js.native
trait LayoutEvent extends js.Object {
  val nativeEvent : LayoutNativeEvent = js.native
}

@js.native
trait LayoutNativeEvent extends js.Object {
  val layout : Layout = js.native
}