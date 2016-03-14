package sri.universal.navigation.reducer

import sri.universal.navigation.{NavigationState, NavigationParentState}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait NavigationTabsReducer extends js.Object{

  def apply(config : TabsReducerConfig) : NavigationReducer = js.native

  def JumpToAction(index : Int) :JumpToAction = js.native
}

@js.native
trait JumpToAction extends js.Object {
  val `type` : String = js.native
  val index : Int = js.native
}

@ScalaJSDefined
trait TabsReducerConfig extends js.Object {

 val key : String

  val initialIndex : Int

  val tabReducers : js.Array[NavigationReducer]
}