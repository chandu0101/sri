package sri.web.examples.routerexample

import sri.core.{ReactElement, ReactNode}
import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.vdom.htmltags._

object HomeScreen {


  val Component = () => {
    div(style = Theme.flexOneAndCenter)(
      span(style = Theme.bigText)("Home Screen")
    )
  }

  def apply() = createStatelessFunctionElementNoProps(Component)

}
