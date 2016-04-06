package sri.universal.navigation

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
abstract class NavigationAction extends js.Object {
  val `type`: String
}

@ScalaJSDefined
trait NavigationState extends js.Object {

  val key: String
}

@ScalaJSDefined
trait NavigationParentState extends NavigationState {

  val index: Int
  val children: js.Array[NavigationState]

}

@ScalaJSDefined
trait NavigationScene extends js.Object {

  val key: String
  val index: Int
  val isStale: Boolean
}


@js.native
trait NavigationLayout extends js.Object {
  val index: Int = js.native
  val isStale: Boolean = js.native
  val key: String = js.native
  val navigationState: NavigationState = js.native
}

@js.native
trait NavigationSceneRendererProps extends js.Object {

  val layout: NavigationLayout = js.native

  val navigationState: NavigationParentState = js.native

  val onNavigate : js.Function = js.native

  val position : Int = js.native

  val scene : NavigationScene = js.native

  val scenes : js.Array[NavigationScene] = js.native

}