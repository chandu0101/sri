package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.{ReactNode, ReactElement}
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav


case class ScrollView(zoomScale: js.UndefOr[Int] = js.undefined,
                      contentContainerStyle: js.UndefOr[js.Any] = js.undefined,
                      contentInset: js.UndefOr[EdgeInsets] = js.undefined,
                      alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined,
                      decelerationRate: js.UndefOr[Int] = js.undefined,
                      minimumZoomScale: js.UndefOr[Double] = js.undefined,
                      scrollsToTop: js.UndefOr[Boolean] = js.undefined,
                      keyboardDismissMode: js.UndefOr[keyboardDismissMode] = js.undefined,
                      style: js.UndefOr[js.Any] = js.undefined,
                      horizontal: js.UndefOr[Boolean] = js.undefined,
                      contentOffset: js.UndefOr[PointProp] = js.undefined,
                      centerContent: js.UndefOr[Boolean] = js.undefined,
                      removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
                      ref: js.UndefOr[ScrollViewM => _] = js.undefined,
                      onScroll: js.UndefOr[() => Unit] = js.undefined,
                      scrollEventThrottle: js.UndefOr[Int] = js.undefined,
                      throttleScrollCallbackMS: js.UndefOr[Int] = js.undefined,
                      showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
                      key: js.UndefOr[String] = js.undefined,
                      scrollEnabled: js.UndefOr[Boolean] = js.undefined,
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
                      canCancelContentTouches: js.UndefOr[Boolean] = js.undefined,
                      showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
                      scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined) {

  def apply(children: ReactNode*): ReactElement = {
    val props = JSMacro[ScrollView](this)
    ReactNative.createElement(ReactNative.ScrollView,props,children :_*)
  }
}

class keyboardDismissMode private(val value: String) extends AnyVal

object keyboardDismissMode {

  val NONE = new keyboardDismissMode("none")
  val INTERACTIVE = new keyboardDismissMode("interactive")
  val ON_DRAG = new keyboardDismissMode("on-drag")

  def newMode(mode: String) = new keyboardDismissMode(mode)
}

@js.native
trait ScrollViewM extends js.Object {

  def scrollTo(destY: Double = 0, destX: Double = 0): Unit = js.native
}
     
