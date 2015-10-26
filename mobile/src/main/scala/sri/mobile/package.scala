
package sri

import sri.core.{React, ReactElementU}
import sri.universal.UniversalAll
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g, literal => json}


package object mobile {

  trait MobileAll extends UniversalAll {


    lazy val Dimensions = load[js.Dynamic]("Dimensions")


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
      React.createClass(json(render = () => rootComponent, displayName = name))
    }
  }

  object all extends MobileAll
  
  private[mobile] val JSMacro = chandu0101.macros.tojs.JSMacro
  private[mobile] type U[T] = js.UndefOr[T]
  private[mobile] val undefined = js.undefined


}