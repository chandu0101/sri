package sri.universal.navigation.reducer

import sri.universal.navigation.{NavigationState, NavigationParentState}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait NavigationStackReducer extends js.Object{

  def apply(config : StackReducerConfig) : NavigationReducer = js.native

}

@ScalaJSDefined
trait StackReducerConfig extends js.Object {

  val initialState: NavigationParentState

  val getReducerForState : js.Function1[NavigationState,ReducerFunc]

  val getPushedReducerForAction : js.Function1[js.Object,ReducerFunc]
}