package sri.web.examples.routerexample

import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.vdom.htmltags._

import scala.scalajs.js.{UndefOr => U}


object ItemsScreen {
  val Component = () => {
    div(style = Theme.flexOneAndDirectionRow)(
      ItemsLeftNav(),
      div(style = Theme.flexOneAndCenter)(
        span(style = Theme.bigText)("Items Screen")
      )
    )
  }

  def apply() = createStatelessFunctionElementNoProps(Component)
}
