package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

/**
 * Created by chandrasekharkode on 4/1/15.
 *

key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
     alwaysBounceHorizontal: PropTypes.bool,
     alwaysBounceVertical: PropTypes.bool,
automaticallyAdjustContentInsets: PropTypes.bool,
bounces: PropTypes.bool,
bouncesZoom: PropTypes.bool,
 canCancelContentTouches: PropTypes.bool,
  centerContent: PropTypes.bool,
    contentContainerStyle: PropTypes.js.Any,
 contentInset: PropTypes.EdgeInsets,
    contentOffset: PropTypes.PointProp,
     decelerationRate: PropTypes.number,
    directionalLockEnabled: PropTypes.bool,
    horizontal: PropTypes.bool,
    keyboardDismissMode: PropTypes.keyboardDismissMode,
    keyboardShouldPersistTaps: PropTypes.bool,
    maximumZoomScale: PropTypes.Double,
    minimumZoomScale: PropTypes.Double,
    onScroll: PropTypes.() => Unit,
    onScrollAnimationEnd: PropTypes.() => Unit,
    pagingEnabled: PropTypes.bool,
    scrollEnabled: PropTypes.bool,
    scrollIndicatorInsets: PropTypes.EdgeInsets,
    showsHorizontalScrollIndicator: PropTypes.bool,
    showsVerticalScrollIndicator: PropTypes.bool,
    throttleScrollCallbackMS: PropTypes.number,
    scrollEventThrottle: PropTypes.number,
    scrollsToTop: PropTypes.bool,
    stickyHeaderIndices: PropTypes.arrayOf(PropTypes.number),
    removeClippedSubviews: PropTypes.bool,
    zoomScale: PropTypes.number,

 */


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
                      ref: js.UndefOr[String] = js.undefined,
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
  def toJS = {
    val p = js.Dynamic.literal()
    zoomScale.foreach(v => p.updateDynamic("zoomScale")(v))
    contentContainerStyle.foreach(v => p.updateDynamic("contentContainerStyle")(v))
    contentInset.foreach(v => p.updateDynamic("contentInset")(v.toJson))
    alwaysBounceVertical.foreach(v => p.updateDynamic("alwaysBounceVertical")(v))
    decelerationRate.foreach(v => p.updateDynamic("decelerationRate")(v))
    minimumZoomScale.foreach(v => p.updateDynamic("minimumZoomScale")(v))
    scrollsToTop.foreach(v => p.updateDynamic("scrollsToTop")(v))
    keyboardDismissMode.foreach(v => p.updateDynamic("keyboardDismissMode")(v.mode))
    style.foreach(v => p.updateDynamic("style")(v))
    horizontal.foreach(v => p.updateDynamic("horizontal")(v))
    contentOffset.foreach(v => p.updateDynamic("contentOffset")(v.toJson))
    centerContent.foreach(v => p.updateDynamic("centerContent")(v))
    removeClippedSubviews.foreach(v => p.updateDynamic("removeClippedSubviews")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    onScroll.foreach(v => p.updateDynamic("onScroll")(v))
    scrollEventThrottle.foreach(v => p.updateDynamic("scrollEventThrottle")(v))
    throttleScrollCallbackMS.foreach(v => p.updateDynamic("throttleScrollCallbackMS")(v))
    showsHorizontalScrollIndicator.foreach(v => p.updateDynamic("showsHorizontalScrollIndicator")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    scrollEnabled.foreach(v => p.updateDynamic("scrollEnabled")(v))
    bouncesZoom.foreach(v => p.updateDynamic("bouncesZoom")(v))
    alwaysBounceHorizontal.foreach(v => p.updateDynamic("alwaysBounceHorizontal")(v))
    bounces.foreach(v => p.updateDynamic("bounces")(v))
    maximumZoomScale.foreach(v => p.updateDynamic("maximumZoomScale")(v))
    automaticallyAdjustContentInsets.foreach(v => p.updateDynamic("automaticallyAdjustContentInsets")(v))
    onScrollAnimationEnd.foreach(v => p.updateDynamic("onScrollAnimationEnd")(v))
    stickyHeaderIndices.foreach(v => p.updateDynamic("stickyHeaderIndices")(v))
    directionalLockEnabled.foreach(v => p.updateDynamic("directionalLockEnabled")(v))
    keyboardShouldPersistTaps.foreach(v => p.updateDynamic("keyboardShouldPersistTaps")(v))
    pagingEnabled.foreach(v => p.updateDynamic("pagingEnabled")(v))
    canCancelContentTouches.foreach(v => p.updateDynamic("canCancelContentTouches")(v))
    showsVerticalScrollIndicator.foreach(v => p.updateDynamic("showsVerticalScrollIndicator")(v))
    scrollIndicatorInsets.foreach(v => p.updateDynamic("scrollIndicatorInsets")(v.toJson))
    p
  }

  def apply(children: ReactElement*) = {
    val f = ReactNative.createFactory(ReactNative.ScrollView)
    f(toJS, children.toJSArray).asInstanceOf[ReactElement]
  }
}

class keyboardDismissMode private(val mode: String) extends AnyVal

object keyboardDismissMode {

  val NONE = new keyboardDismissMode("none")
  val INTERACTIVE = new keyboardDismissMode("interactive")
  val ON_DRAG = new keyboardDismissMode("on-drag")

  def newMode(mode: String) = new keyboardDismissMode(mode)
}

trait ScrollViewM extends js.Object {

  def scrollTo(destY: Double = 0, destX: Double = 0): Unit = js.native
}
     
