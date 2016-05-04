package sri.web.examples.routerexample

import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.router.WebRoute
import sri.web.vdom.htmltags._

import scala.scalajs.js
import scala.scalajs.js.{JSON, UndefOr => U}


object StaticStateScreen {

  val Component = (route: WebRoute) => {
    div(style = Theme.flexOneAndCenter)(
      div(style = Theme.bigText)(s"Welcome to StaticState Screen, State you passed is : ${JSON.stringify(route.state.getOrElse(js.Dictionary()))}")
    )
  }

  def apply(route: WebRoute) = createStatelessFunctionElement(Component, route)
 }
