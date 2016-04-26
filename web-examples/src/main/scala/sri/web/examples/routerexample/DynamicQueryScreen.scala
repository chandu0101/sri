package sri.web.examples.routerexample

import sri.universal.components._
import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.router
import sri.web.router.{WebRoute, WebRouterComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, UndefOr => U, undefined}
import scala.util.Try


object DynamicQueryScreen {

  val Component = (props: Props) => {
    View(style = Theme.flexOneAndCenter)(
      Text(style = Theme.bigText)(s"Welcome to Dynamic Query Screen, Passed Id : ${props.id}  and passed Query  : ${JSON.stringify(props.route.query.getOrElse(js.Dictionary()))}")
    )
  }

  case class Props(id: Int, route: WebRoute)

  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int, route: WebRoute) = createStatelessFunctionElement(Component, Props(id, route))
}
