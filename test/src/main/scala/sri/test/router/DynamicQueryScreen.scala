package sri.test.router

import sri.core.ReactComponent
import sri.test.components.Text
import sri.web.all._
import sri.web.router
import sri.web.router.{WebRoute, WebRouterComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, UndefOr => U}
import scala.util.Try


object DynamicQueryScreen {


  @ScalaJSDefined
  class Component extends ReactComponent[Props, Unit] {
    def render() = Text()(s"Welcome to Dynamic Query Screen, Passed Id : ${props.id}  and passed Query  : ${JSON.stringify(props.route.query.getOrElse(js.Dictionary()))}")

  }

  case class Props(id: Int, route: WebRoute)

  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int, route: WebRoute, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component](Props(id, route), key = key, ref = ref)
}
