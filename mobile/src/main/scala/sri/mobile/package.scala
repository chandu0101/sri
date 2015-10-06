
package sri

import sri.core.ReactElementU
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g, literal => json}


package object mobile {

  @inline def load[T](lib: String): T = g.require(lib).asInstanceOf[T]

  lazy val Dimensions = load[js.Dynamic]("Dimensions")

  type NEvent = js.Dynamic

  def createListViewDataSource[T, H](rowHasChanged: (T, T) => Boolean,
                                     sectionHeaderHasChanged: js.UndefOr[(H, H) => Boolean] = js.undefined,
                                     getRowData: js.UndefOr[(_, String, String) => _] = js.undefined,
                                     getSectionHeaderData: js.UndefOr[(_, String) => _] = js.undefined): ListViewDataSource[T, H] = {
    val j = json(rowHasChanged = rowHasChanged)
    sectionHeaderHasChanged.foreach(v => j.updateDynamic("sectionHeaderHasChanged")(v))
    getRowData.foreach(v => j.updateDynamic("getRowData")(v))
    getSectionHeaderData.foreach(v => j.updateDynamic("getSectionHeaderData")(v))
    new ListViewDataSource[T, H](j)
  }


  /**
   * use this method to create root component of sri.mobile, use the output to register..
   * @param rootComponent
   * @return
   */
  def createMobileRoot[P, S](rootComponent: => ReactElementU[P, S], name: String = "SriMobileApp") = {
    ReactNative.createClass(json(render = () => rootComponent, displayName = name))
  }

  private[mobile] val JSMacro = chandu0101.macros.tojs.JSMacro
  private[mobile] type U[T] = js.UndefOr[T]
  private[mobile] val undefined = js.undefined


}