package sri.universal.navigation

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait NavigationScene extends js.Object {

  val key: String
  val index: Int
  val isStale: Boolean
}
