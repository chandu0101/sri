package sri.web.examples.routerexample

import sri.universal.components._
import sri.web.all._
import sri.web.examples.styles.Theme

import scala.scalajs.js.{UndefOr => U}
import scala.util.Try


object DynamicScreen {

  val Component = (id: Int) => {
    View(style = Theme.flexOneAndCenter)(
      Text(style = Theme.bigText)(s"Dynamic id passed is  :: $id")
    )
  }

  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int) = createStatelessFunctionElement(Component, id)

}
