package sri.test.router

import sri.test.components.Text
import sri.web.all._

import scala.scalajs.js.{UndefOr => U}


object ItemsScreen {
  val Component = () => {

    Text()("Items Screen")
  }

  def apply() = createStatelessFunctionElementNoProps(Component)
}
