
package chandu0101.scalajs.sri


import chandu0101.scalajs.sri.core.ReactElementU
import chandu0101.scalajs.sri.mobile.components.ListViewDataSource

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g, literal => json}


package object mobile {
  @inline def load[T](lib: String): T = g.require(lib).asInstanceOf[T]

  lazy val Dimensions = load[js.Dynamic]("Dimensions")

  type NEvent = js.Dynamic

  def createListViewDataSource[T, H](rowHasChanged: (T, T) => Boolean,
                                     sectionHeaderHasChanged: js.UndefOr[(H, H) => Boolean] = js.undefined,
                                     getRowData: js.UndefOr[(_, String, String) => _] = js.undefined,
                                     getSectionHeaderData: js.UndefOr[(_, String) => _] = js.undefined): ListViewDataSource[T,H] = {
    val j = json(rowHasChanged = rowHasChanged)
    sectionHeaderHasChanged.foreach(v => j.updateDynamic("sectionHeaderHasChanged")(v))
    getRowData.foreach(v => j.updateDynamic("getRowData")(v))
    getSectionHeaderData.foreach(v => j.updateDynamic("getSectionHeaderData")(v))
     new ListViewDataSource[T,H](j)
  }


  /**
   * use this method to create root component of mobile, use the output to register..
   * @param rootComponent
   * @return
   */
  def createMobileRoot[P , S ](rootComponent: => ReactElementU[P, S],name : String = "SriMobileApp") = {
    ReactNative.createClass(json(render = () => rootComponent ,displayName = name))
  }

}