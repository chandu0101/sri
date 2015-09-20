package sri.web.router

import sri.core.ElementFactory._
import sri.core._
import sri.web.nativeweb.View

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSON
import scala.scalajs.js.annotation.ScalaJSDefined


sealed trait Content

trait StaticContent extends Content

trait DynamicContent[T] extends Content

sealed trait Route {
  def toJson: js.Dynamic
}

case class StaticRoute (path: String, component: js.Function0[ReactElement]) extends Route {
  def toJson = json(path = path, component = component)
}


case class DynamicRoute[T](getComponent: js.Function1[T, ReactElement], sceneConfig: js.UndefOr[String] = js.undefined) extends Route {

  def toJson = json(getComponent = getComponent, sceneConfig = sceneConfig)
}


object WebRouter {

  private var _ctrl: WebRouterCtrl = null

  @inline def routerCtrl = _ctrl


  @ScalaJSDefined
  class Component extends ReactComponent[Props, State] {

    initialState(State())

    override def render(): ReactElement = {
      println(s"ok context in home ${JSON.stringify(context)}")
      View()(
        renderScene
      )
    }

    var unlisten: js.Function0[_] = null

    override def componentWillMount(): Unit = {
      context  = json("hello" -> "hello")
      val history = js.Dynamic.global.createHistory.createHistory().asInstanceOf[History]
      unlisten = history.listen((error: js.Dynamic, routeState: js.Dynamic) => updateRoute(error))
      _ctrl = new WebRouterCtrl(history, props.config)
      _ctrl.navigateTo(props.config.initialRoute._1)
    }

    override def componentWillUnmount(): Unit = {
      if (unlisten != null) unlisten()
    }

    def updateRoute(routeState: js.Dynamic) = {
      println(s"updating route : ${JSON.stringify(routeState)}")
      setState(state.copy(route = routeState.state))
    }

    def renderScene = {
      props.config.renderScene(state.route)
    }

    def getChildContext() = {
      val x = json("hello" -> "hello")
      context  = x
      println(s"getting child context ${JSON.stringify(x)}")
      x
    }

  }

  js.constructorOf[Component].childContextTypes = js.Dictionary("hello" -> React.PropTypes.`string`.isRequired)

  js.constructorOf[WebRouterComponent[_,_]].contextTypes = js.Dictionary("hello" -> React.PropTypes.`string`.isRequired)

  case class State(route: js.Dynamic = null)

  case class Props(config: WebRouterConfig)

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply(routerConfig: WebRouterConfig) = createElement(factory, Props(routerConfig))

}

