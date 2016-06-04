package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement, ReactNode}
import sri.universal.{ReactEvent, ReactUniversal}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


case class ScrollView(zoomScale: js.UndefOr[Int] = js.undefined,
                      contentContainerStyle: js.UndefOr[js.Any] = js.undefined,
                      contentInset: js.UndefOr[EdgeInsets] = js.undefined,
                      alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined,
                      decelerationRate: js.UndefOr[Double] = js.undefined,
                      minimumZoomScale: js.UndefOr[Double] = js.undefined,
                      scrollsToTop: js.UndefOr[Boolean] = js.undefined,
                      keyboardDismissMode: js.UndefOr[keyboardDismissMode] = js.undefined,
                      style: js.UndefOr[js.Any] = js.undefined,
                      horizontal: js.UndefOr[Boolean] = js.undefined,
                      contentOffset: js.UndefOr[PointProp] = js.undefined,
                      centerContent: js.UndefOr[Boolean] = js.undefined,
                      removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
                      ref: js.UndefOr[ScrollViewM => _] = js.undefined,
                      onScroll: js.UndefOr[(ReactEvent[ScrollEvent]) => Unit] = js.undefined,
                      scrollEventThrottle: js.UndefOr[Int] = js.undefined,
                      throttleScrollCallbackMS: js.UndefOr[Int] = js.undefined,
                      showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
                      key: js.UndefOr[String] = js.undefined,
                      endFillColor: js.UndefOr[String] = js.undefined,
                      refreshControl: js.UndefOr[ReactElement] = js.undefined,
                      scrollEnabled: js.UndefOr[Boolean] = js.undefined,
                      indicatorStyle: js.UndefOr[ScrollViewIndicatorStyle] = js.undefined,
                      bouncesZoom: js.UndefOr[Boolean] = js.undefined,
                      alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined,
                      bounces: js.UndefOr[Boolean] = js.undefined,
                      maximumZoomScale: js.UndefOr[Double] = js.undefined,
                      automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
                      onScrollAnimationEnd: js.UndefOr[() => Unit] = js.undefined,
                      stickyHeaderIndices: js.UndefOr[js.Array[Int]] = js.undefined,
                      directionalLockEnabled: js.UndefOr[Boolean] = js.undefined,
                      keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined,
                      pagingEnabled: js.UndefOr[Boolean] = js.undefined,
                      scrollPerfTag: js.UndefOr[String] = js.undefined,
                      canCancelContentTouches: js.UndefOr[Boolean] = js.undefined,
                      showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
                      scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined) {

  def apply(children: ReactNode*): ReactElement = {
    val props = JSMacro[ScrollView](this)
    React.createElement(ReactUniversal.ScrollView, props, children: _*)
  }
}

class keyboardDismissMode private(val value: String) extends AnyVal

object keyboardDismissMode {

  val NONE = new keyboardDismissMode("none")
  val INTERACTIVE = new keyboardDismissMode("interactive")
  val ON_DRAG = new keyboardDismissMode("on-drag")

  def newMode(mode: String) = new keyboardDismissMode(mode)
}

class ScrollViewIndicatorStyle private(val value: String) extends AnyVal

object ScrollViewIndicatorStyle {

  val DEFAULT = new ScrollViewIndicatorStyle("default")
  val BLACK = new ScrollViewIndicatorStyle("black")
  val WHITE = new ScrollViewIndicatorStyle("white")
}

@ScalaJSDefined
class ScrollPosition(val x : Double = 0,val y : Double = 0,val animated: Boolean = false) extends js.Object


@js.native
trait ScrollViewM extends js.Object {

  def scrollTo(position : ScrollPosition): Unit = js.native
}
     
@js.native
trait ScrollEvent extends js.Object {

  val contentInset: ContentInset = js.native

  val contentOffset: ContentOffset = js.native

  val layoutMeasurement: Size2d = js.native

  val contentSize: Size2d = js.native

  val zoomScale: Double = js.native
}

@js.native
trait ContentInset extends js.Object {

  val top: Double = js.native

  val left: Double = js.native

  val right: Double = js.native

  val bottom: Double = js.native
}
@js.native
trait ContentOffset extends js.Object {

  val x: Double = js.native

  val y: Double = js.native
}

@js.native
trait Size2d extends js.Object {

  val width: Double = js.native

  val height: Double = js.native
}
