package sri.test.router

import sri.core.ReactComponent
import sri.test.components.Text
import sri.web.all._
import sri.web.router
import sri.web.router.{WebRoute, WebRouterComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, UndefOr => U}


object StaticStateScreen {


  @ScalaJSDefined
  class Component extends ReactComponent[WebRoute, Unit] {
    def render() = {
      Text()(s"Welcome to StaticState Screen, State you passed is : ${JSON.stringify(props.state.getOrElse(js.Dictionary()))}")
    }
  }


  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])


  def apply(route: WebRoute, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, route, key = key, ref = ref)
}
