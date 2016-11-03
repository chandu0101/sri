package sri.test.router

import sri.core.ReactComponent
import sri.test.components.Text
import sri.web.all._
import sri.web.router
import sri.web.router.{WebRoute, WebRouterComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, UndefOr => U, undefined}


object StaticQueryScreen {


  @ScalaJSDefined
  class Component extends ReactComponent[WebRoute, Unit] {
    def render() = {
      Text()(s"Welcome to StaticQuery Screen, Query you passed is : ${JSON.stringify(props.query.getOrElse(js.Dictionary()))}")
    }
  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(route: WebRoute, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component](route, key = key, ref = ref)
}
