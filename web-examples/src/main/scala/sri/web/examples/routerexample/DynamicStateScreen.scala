package sri.web.examples.routerexample

import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.router.WebRoute
import sri.web.vdom.htmltags._

import scala.scalajs.js
import scala.scalajs.js.{JSON, UndefOr => U}
import scala.util.Try


object DynamicStateScreen {


  val Component = (props: Props) => {
    div(style = Theme.flexOneAndCenter)(
      span(style = Theme.bigText)(s"Welcome to Dynamic State Screen, Passed Id : ${props.id}  and passed State  : ${JSON.stringify(props.route.state.getOrElse(js.Dictionary()))}")
    )
  }

  case class Props(id: Int, route: WebRoute)

  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int, route: WebRoute) = createStatelessFunctionElement(Component, Props(id, route))
}
