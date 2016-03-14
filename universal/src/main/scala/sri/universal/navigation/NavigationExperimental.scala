package sri.universal.navigation

import sri.core.ReactClass
import sri.universal.navigation.reducer.NavigationReducer

import scala.scalajs.js

@js.native
trait NavigationExperimental extends js.Object {

  val StateUtils: NavigationStateUtils = js.native
  val Reducer: NavigationReducer = js.native

  val Container: NavigationContainer = js.native
  val RootContainer: ReactClass = js.native

  val View: ReactClass = js.native
  val AnimatedView: ReactClass = js.native

  val Card: ReactClass = js.native
  val CardStack: ReactClass = js.native
  val Header: ReactClass = js.native
  val HeaderTitle: ReactClass = js.native
  val HeaderBackButton: ReactClass = js.native
  val LegacyNavigator: ReactClass = js.native


}
