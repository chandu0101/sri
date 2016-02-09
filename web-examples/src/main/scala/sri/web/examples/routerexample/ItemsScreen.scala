package sri.web.examples.routerexample

import sri.universal.components._
import sri.web.all._
import sri.web.examples.styles.Theme

import scala.scalajs.js.{UndefOr => U, undefined}


object ItemsScreen {
  val Component = () => {
    View(style = Theme.flexOneAndDirectionRow)(
      ItemsLeftNav(),
      View(style = Theme.flexOneAndCenter)(
        Text(style = Theme.bigText)("Items Screen")
      )
    )
  }

  def apply() = createStatelessFunctionElementNoProps(Component)
}
