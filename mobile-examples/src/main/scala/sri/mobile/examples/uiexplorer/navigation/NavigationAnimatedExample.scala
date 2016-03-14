package sri.mobile.examples.uiexplorer.navigation

import sri.mobile.ReactNative
import sri.universal.navigation.{reducer, NavigationState, NavigationParentState}
import sri.universal.navigation.reducer._

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, Object}

object NavigationAnimatedExample {

  val NavigationBasicReducer = ReactNative.NavigationExperimental.Reducer.StackReducer(new StackReducerConfig {
    override val getReducerForState: js.Function1[NavigationState, ReducerFunc] = (initialState: NavigationState) => {
      defaultReducerFunc(initialState)
    }
    override val initialState: NavigationParentState = null
    override val getPushedReducerForAction: js.Function1[js.Object, ReducerFunc] = null
  })
}
