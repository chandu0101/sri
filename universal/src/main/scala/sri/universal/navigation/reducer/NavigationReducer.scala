package sri.universal.navigation.reducer

import scala.scalajs.js

@js.native
trait NavigationReducer extends js.Object {

  val FindReducer: NavigationFindReducer
  val StackReducer: NavigationStackReducer
  val TabsReducer: NavigationTabsReducer
}

