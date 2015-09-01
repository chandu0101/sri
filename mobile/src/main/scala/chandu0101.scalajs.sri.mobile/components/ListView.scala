package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}

/**
 * Created by chandrasekharkode on 4/1/15.
 *
key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.ListViewM => Unit,
automaticallyAdjustContentInsets: PropTypes.bool,
bounces: PropTypes.bool,
bouncesZoom: PropTypes.bool,
horizontal: PropTypes.bool,
canCancelContentTouches: PropTypes.bool,
directionalLockEnabled: PropTypes.bool,
    contentInset: PropTypes.EdgeInsets,
    contentOffset: PropTypes.PointProp,
    onScroll: PropTypes.() => Unit,
    onScrollAnimationEnd: PropTypes.() => Unit,
    scrollEnabled: PropTypes.bool,
    scrollIndicatorInsets: PropTypes.EdgeInsets,
    showsHorizontalScrollIndicator: PropTypes.bool,
    showsVerticalScrollIndicator: PropTypes.bool,
    throttleScrollCallbackMS: PropTypes.number,
    scrollEventThrottle: PropTypes.number,
    alwaysBounceHorizontal: PropTypes.bool,
    alwaysBounceVertical: PropTypes.bool,
    centerContent: PropTypes.bool,
    contentContainerStyle: PropTypes.js.Any,
    decelerationRate: PropTypes.number,
    horizontal: PropTypes.bool,
    keyboardDismissMode: PropTypes.keyboardDismissMode,
    keyboardShouldPersistTaps: PropTypes.bool,
    maximumZoomScale: PropTypes.Double,
    minimumZoomScale: PropTypes.Double,
    pagingEnabled: PropTypes.bool,
    scrollsToTop: PropTypes.bool,
    stickyHeaderIndices: PropTypes.arrayOf(PropTypes.number),
    removeClippedSubviews: PropTypes.bool,
    zoomScale: PropTypes.number,
    dataSource: PropTypes.ListViewDataSource.isRequired,
    initialListSize: PropTypes.number,
    onChangeVisibleRows: PropTypes.(VisibleRows,VisibleRows) => Unit,
    onEndReached: PropTypes.() => Unit,
    onEndReachedThreshold: PropTypes.number,
    pageSize: PropTypes.number,
    renderFooter: PropTypes.() => ReactElement,
    renderHeader: PropTypes.() => ReactElement,
    renderRow: PropTypes.(T,String,String) => ReactElement.isRequired,
    renderScrollComponent: PropTypes.js.Dynamic => ReactElement,
    renderSectionHeader: PropTypes.(H,H) => ReactElement,
    renderSeparator:PropTypes.(String,String,Boolean) => ReactElement
    scrollRenderAheadDistance:PropTypes.number,
 */


object ListView {

  def apply[T, H](zoomScale: js.UndefOr[Int] = js.undefined,
                  scrollRenderAheadDistance: js.UndefOr[Int] = js.undefined,
                  renderFooter: js.UndefOr[() => ReactElement] = js.undefined,
                  contentContainerStyle: js.UndefOr[js.Any] = js.undefined,
                  contentInset: js.UndefOr[EdgeInsets] = js.undefined,
                  alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined,
                  pageSize: js.UndefOr[Int] = js.undefined,
                  decelerationRate: js.UndefOr[Int] = js.undefined,
                  minimumZoomScale: js.UndefOr[Double] = js.undefined,
                  scrollsToTop: js.UndefOr[Boolean] = js.undefined,
                  renderHeader: js.UndefOr[() => ReactElement] = js.undefined,
                  keyboardDismissMode: js.UndefOr[keyboardDismissMode] = js.undefined,
                  style: js.UndefOr[js.Any] = js.undefined,
                  renderRow: (T, String, String) => ReactElement,
                  horizontal: js.UndefOr[Boolean] = js.undefined,
                  contentOffset: js.UndefOr[PointProp] = js.undefined,
                  centerContent: js.UndefOr[Boolean] = js.undefined,
                  removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
                  onEndReachedThreshold: js.UndefOr[Int] = js.undefined,
                  ref: js.UndefOr[ListViewM => Unit] = js.undefined,
                  onScroll: js.UndefOr[() => Unit] = js.undefined,
                  dataSource: ListViewDataSource[T,H],
                  scrollEventThrottle: js.UndefOr[Int] = js.undefined,
                  throttleScrollCallbackMS: js.UndefOr[Int] = js.undefined,
                  showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
                  key: js.UndefOr[String] = js.undefined,
                  scrollEnabled: js.UndefOr[Boolean] = js.undefined,
                  bouncesZoom: js.UndefOr[Boolean] = js.undefined,
                  renderScrollComponent: js.UndefOr[js.Dynamic => ReactElement] = js.undefined,
                  alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined,
                  bounces: js.UndefOr[Boolean] = js.undefined,
                  maximumZoomScale: js.UndefOr[Double] = js.undefined,
                  onEndReached: js.UndefOr[() => Unit] = js.undefined,
                  automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
                  initialListSize: js.UndefOr[Int] = js.undefined,
                  onScrollAnimationEnd: js.UndefOr[() => Unit] = js.undefined,
                  stickyHeaderIndices: js.UndefOr[js.Array[Int]] = js.undefined,
                  directionalLockEnabled: js.UndefOr[Boolean] = js.undefined,
                  keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined,
                  renderSeparator: js.UndefOr[(String, String, Boolean) => ReactElement] = js.undefined,
                  onChangeVisibleRows: js.UndefOr[(VisibleRows, VisibleRows) => Unit] = js.undefined,
                  pagingEnabled: js.UndefOr[Boolean] = js.undefined,
                  renderSectionHeader: js.UndefOr[(H, H) => ReactElement] = js.undefined,
                  canCancelContentTouches: js.UndefOr[Boolean] = js.undefined,
                  showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
                  scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined) = {

    val p = js.Dynamic.literal()
    zoomScale.foreach(v => p.updateDynamic("zoomScale")(v))
    scrollRenderAheadDistance.foreach(v => p.updateDynamic("scrollRenderAheadDistance")(v))
    renderFooter.foreach(v => p.updateDynamic("renderFooter")(v))
    contentContainerStyle.foreach(v => p.updateDynamic("contentContainerStyle")(v))
    contentInset.foreach(v => p.updateDynamic("contentInset")(v.toJson))
    alwaysBounceVertical.foreach(v => p.updateDynamic("alwaysBounceVertical")(v))
    pageSize.foreach(v => p.updateDynamic("pageSize")(v))
    decelerationRate.foreach(v => p.updateDynamic("decelerationRate")(v))
    minimumZoomScale.foreach(v => p.updateDynamic("minimumZoomScale")(v))
    scrollsToTop.foreach(v => p.updateDynamic("scrollsToTop")(v))
    renderHeader.foreach(v => p.updateDynamic("renderHeader")(v))
    keyboardDismissMode.foreach(v => p.updateDynamic("keyboardDismissMode")(v.mode))
    style.foreach(v => p.updateDynamic("style")(v))
    p.updateDynamic("renderRow")(renderRow)
    horizontal.foreach(v => p.updateDynamic("horizontal")(v))
    contentOffset.foreach(v => p.updateDynamic("contentOffset")(v.toJson))
    centerContent.foreach(v => p.updateDynamic("centerContent")(v))
    removeClippedSubviews.foreach(v => p.updateDynamic("removeClippedSubviews")(v))
    onEndReachedThreshold.foreach(v => p.updateDynamic("onEndReachedThreshold")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    onScroll.foreach(v => p.updateDynamic("onScroll")(v))
    p.updateDynamic("dataSource")(dataSource)
    scrollEventThrottle.foreach(v => p.updateDynamic("scrollEventThrottle")(v))
    throttleScrollCallbackMS.foreach(v => p.updateDynamic("throttleScrollCallbackMS")(v))
    showsHorizontalScrollIndicator.foreach(v => p.updateDynamic("showsHorizontalScrollIndicator")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    scrollEnabled.foreach(v => p.updateDynamic("scrollEnabled")(v))
    bouncesZoom.foreach(v => p.updateDynamic("bouncesZoom")(v))
    renderScrollComponent.foreach(v => p.updateDynamic("renderScrollComponent")(v))
    alwaysBounceHorizontal.foreach(v => p.updateDynamic("alwaysBounceHorizontal")(v))
    bounces.foreach(v => p.updateDynamic("bounces")(v))
    maximumZoomScale.foreach(v => p.updateDynamic("maximumZoomScale")(v))
    onEndReached.foreach(v => p.updateDynamic("onEndReached")(v))
    automaticallyAdjustContentInsets.foreach(v => p.updateDynamic("automaticallyAdjustContentInsets")(v))
    initialListSize.foreach(v => p.updateDynamic("initialListSize")(v))
    onScrollAnimationEnd.foreach(v => p.updateDynamic("onScrollAnimationEnd")(v))
    stickyHeaderIndices.foreach(v => p.updateDynamic("stickyHeaderIndices")(v))
    directionalLockEnabled.foreach(v => p.updateDynamic("directionalLockEnabled")(v))
    keyboardShouldPersistTaps.foreach(v => p.updateDynamic("keyboardShouldPersistTaps")(v))
    renderSeparator.foreach(v => p.updateDynamic("renderSeparator")(v))
    onChangeVisibleRows.foreach(v => p.updateDynamic("onChangeVisibleRows")((c1: js.Dynamic, c2: js.Dynamic) => v(VisibleRows.fromJson(c1), VisibleRows.fromJson(c2))))
    pagingEnabled.foreach(v => p.updateDynamic("pagingEnabled")(v))
    renderSectionHeader.foreach(v => p.updateDynamic("renderSectionHeader")(v))
    canCancelContentTouches.foreach(v => p.updateDynamic("canCancelContentTouches")(v))
    showsVerticalScrollIndicator.foreach(v => p.updateDynamic("showsVerticalScrollIndicator")(v))
    scrollIndicatorInsets.foreach(v => p.updateDynamic("scrollIndicatorInsets")(v.toJson))

    val f = ReactNative.createFactory(ReactNative.ListView)
    f(p).asInstanceOf[ReactElement]
  }

}

case class VisibleRows(sectionID: VisibleSection) {
  def toJson = json(sectionID = sectionID.toJson)
}

object VisibleRows {
  def fromJson(obj: js.Dynamic) = VisibleRows(sectionID = VisibleSection.fromJson(obj.sectionID))
}

case class VisibleSection(rowID: Boolean) {
  def toJson = json(rowID = rowID)
}

object VisibleSection {
  def fromJson(obj: js.Dynamic) = VisibleSection(rowID = obj.rowID.asInstanceOf[Boolean])
}

@js.native
trait ListViewM extends js.Object {

  def getScrollResponder(): ScrollViewM = js.native

}