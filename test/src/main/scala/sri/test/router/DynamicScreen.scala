package sri.test.router

import sri.test.components.Text
import sri.web.all._
import sri.web.router.WebRoute

import scala.scalajs.js.{UndefOr => U}
import scala.util.Try


object DynamicScreen {

  val Component = (props: Props) => {

    Text()(s"Dynamic id passed is  :: ${props.id}")

  }

  case class Props(id: Int, route: WebRoute)

  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int, route: WebRoute) = createStatelessFunctionElement(Component, Props(id, route))

}
