package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement}
import sri.universal.ReactUniversal

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}


case class ListView[T, H](zoomScale: js.UndefOr[Int] = js.undefined,
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
                          ref: js.UndefOr[ListViewM => _] = js.undefined,
                          onScroll: js.UndefOr[() => Unit] = js.undefined,
                          dataSource: ListViewDataSource[T, H],
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
                          scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined) {

  def apply() = {
    val props = JSMacro[ListView[T, H]](this)
    React.createElement(ReactUniversal.ListView,props)
  }

}

case class VisibleRows(sectionID: VisibleSection) {
  val toJS = JSMacro[VisibleRows](this)
}

object VisibleRows {
  def fromJson(obj: js.Dynamic) = VisibleRows(sectionID = VisibleSection.fromJson(obj.sectionID))
}

case class VisibleSection(rowID: Boolean) {
  val toJS = JSMacro[VisibleSection](this)
}

object VisibleSection {
  def fromJson(obj: js.Dynamic) = VisibleSection(rowID = obj.rowID.asInstanceOf[Boolean])
}

@js.native
trait ListViewM extends js.Object {

  def getScrollResponder(): ScrollViewM = js.native

  def scrollTo(destY : Double = 0,destX : Double = 0): Unit = js.native
}