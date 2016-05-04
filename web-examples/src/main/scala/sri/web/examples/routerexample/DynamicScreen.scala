package sri.web.examples.routerexample

import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.vdom.htmltags._

import scala.scalajs.js.{UndefOr => U}
import scala.util.Try


object DynamicScreen {

  val Component = (id: Int) => {
    div(style = Theme.flexOneAndCenter)(
      span(style = Theme.bigText)(s"Dynamic id passed is  :: $id")
    )
  }

  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int) = createStatelessFunctionElement(Component, id)

}
