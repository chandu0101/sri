package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.{ReactEvent, ReactUniversal}

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class WindowedListView[T](key: U[String] = undefined,
                               style: U[js.Any] = undefined,
                               data: js.Array[T],
                               renderRow: (T, Int, Int, String) => ReactElement,
                               renderWindowBoundaryIndicator: U[() => ReactElement] = undefined,
                               renderFooter: U[() => ReactElement] = undefined,
                               onScroll: U[ReactEvent[js.Object] => _] = undefined,
                               onVisibleRowsChanged: U[(Int, Int) => _] = undefined,
                               onViewableRowsChanged: U[js.Array[Int] => _] = undefined,
                               viewablePercentThreshold: U[Double] = undefined,
                               initialNumToRender: U[Int] = undefined,
                               maxNumToRender: U[Int] = undefined,
                               numToRenderAhead: U[Int] = undefined,
                               recomputeRowsBatchingPeriod: U[Int] = undefined,
                               renderScrollComponent: U[js.Object => ReactElement] = undefined,
                               enableDangerousRecycling: U[Boolean] = undefined,
                               disableIncrementalRendering: U[Boolean] = undefined,
                               asyncRowPerfEventName: U[String] = undefined,
                               ref: U[WindowedListViewM => _] = undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[WindowedListView[T]](this)
    React.createElement(ReactUniversal.WindowedListView, props, children: _*)
  }

}

@js.native
trait WindowedListViewM extends js.Object
