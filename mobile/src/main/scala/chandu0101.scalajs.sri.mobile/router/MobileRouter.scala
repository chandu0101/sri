package chandu0101.scalajs.sri.mobile.router

import chandu0101.scalajs.sri.core.{ElementFactory, ReactComponent, ReactElement}
import chandu0101.scalajs.sri.mobile.components.{Navigator, NavigatorM}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


sealed trait Page

trait StaticPage extends Page

trait DynamicPage[T] extends Page

sealed trait Route {
  def toJson: js.Dynamic
}

class StaticRoute private(component: => ReactElement, sceneConfig: js.UndefOr[String]) extends Route {
  def toJson = json(component = () => component, sceneConfig = sceneConfig)
}

object StaticRoute {
  def apply(component: => ReactElement, sceneConfig: js.UndefOr[String] = js.undefined) = new StaticRoute(component, sceneConfig)
}

case class DynamicRoute[T](getComponent: js.Function1[T, ReactElement], sceneConfig: js.UndefOr[String] = js.undefined) extends Route {

  def toJson = json(getComponent = getComponent, sceneConfig = sceneConfig)
}


object MobileRouter {

  private var _ctrl: MobileRouterCtrl = null

  @inline def routerCtrl = _ctrl


  @ScalaJSDefined
  class Component extends ReactComponent[Props, Unit] {

    override def render(): ReactElement = {
      Navigator(renderScene = renderScene _,
        ref = "navigator",
        initialRoute = props.config.initialRoute._2.toJson,
        configureScene = configureScene _)
    }


    override def componentDidMount(): Unit = {
      val navigator = getRef("navigator", classOf[NavigatorM])
      _ctrl = new MobileRouterCtrl(navigator, props.config)
    }

    def configureScene(route: js.Dynamic) = {
      if (!js.isUndefined(route.sceneConfig)) route.sceneConfig
      else Navigator.SceneConfigs.FloatFromRight
    }

    def renderScene(route: js.Dynamic, nav: NavigatorM) = {
      props.config.renderScene(route)
    }
  }

  case class Props(config: MobileRouterConfig)

  def apply(config: MobileRouterConfig) = ElementFactory(new Component).props(Props(config)).build

}

