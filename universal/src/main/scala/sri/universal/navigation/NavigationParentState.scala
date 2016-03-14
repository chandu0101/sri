package sri.universal.navigation

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait NavigationParentState extends NavigationState {

  val index: Int
  val children: js.Array[NavigationState]

}
