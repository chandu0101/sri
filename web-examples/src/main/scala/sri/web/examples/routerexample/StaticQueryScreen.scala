package sri.web.examples.routerexample

import sri.universal.components._
import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.router.WebRoute

import scala.scalajs.js
import scala.scalajs.js.{JSON, UndefOr => U, undefined}


object StaticQueryScreen {


  val Component = (route: WebRoute) => {
    View(style = Theme.flexOneAndCenter)(
      Text(style = Theme.bigText)(s"Welcome to StaticQuery Screen, Query you passed is : ${JSON.stringify(route.query.getOrElse(js.Dictionary()))}")
    )
  }

  def apply(route: WebRoute) = createStatelessFunctionElement(Component, route)
}
