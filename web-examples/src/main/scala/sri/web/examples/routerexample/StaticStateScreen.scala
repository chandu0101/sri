package sri.web.examples.routerexample

import sri.universal.components._
import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.router
import sri.web.router.{WebRoute, WebRouterComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, UndefOr => U, undefined}


object StaticStateScreen {

  val Component = (route: WebRoute) => {
    View(style = Theme.flexOneAndCenter)(
      Text(style = Theme.bigText)(s"Welcome to StaticState Screen, State you passed is : ${JSON.stringify(route.state.getOrElse(js.Dictionary()))}")
    )
  }

  def apply(route: WebRoute) = createStatelessFunctionElement(Component, route)
 }
