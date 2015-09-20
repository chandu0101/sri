package sri.mobile.router

import sri.core.ElementFactory._
import sri.core._
import sri.mobile.U
import sri.mobile.components._
import sri.mobile.styles.MobileStyleSheet
import sri.mobile.styles.MobileStyleSheet._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


sealed trait Page

trait StaticPage extends Page

trait DynamicPage[T] extends Page

sealed trait Route {
  def toJson: js.Dynamic
}

class StaticRoute private(title: String, component: => ReactElement, sceneConfig: js.UndefOr[NavigatorSceneConfig]) extends Route {
  def toJson = json(title = title, component = () => component, sceneConfig = sceneConfig)
}

object StaticRoute {
  def apply(title: String, component: => ReactElement, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = new StaticRoute(title, component, sceneConfig)
}

case class DynamicRoute[T](component: js.Function1[T, ReactElement], sceneConfig: js.UndefOr[String] = js.undefined) extends Route {

  def toJson = json(component = component, sceneConfig = sceneConfig)
}

case  class NavigatorRoute(title : String,component: js.Dynamic,data: js.Dynamic , page : Page ,sceneConfig: NavigatorSceneConfig)

object NavigatorRoute {
  def fromJson(obj : js.Dynamic) = {
    NavigatorRoute(title = obj.title.toString,component = obj.component,data = obj.data,page = obj.page.asInstanceOf[Page],sceneConfig = obj.sceneConfig.asInstanceOf[NavigatorSceneConfig])
  }

}

object MobileRouter {

  val sceneStyle = MobileStyleSheet.style(marginTop := 44)


  object MobileRouterContext {


    @ScalaJSDefined
    class Component extends ReactComponent[Props, Unit] {
      def render() = children

      def getChildContext() = {
        js.Dictionary("routerctrl" -> props.ctrl)
      }
    }

    case class Props(ctrl: MobileRouterCtrl)

    val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

    js.constructorOf[Component].childContextTypes = routerContextTypes

    def apply(ctrl: MobileRouterCtrl, key: U[String] = js.undefined, ref: js.Function = null)(children: ReactNode*) = createElementWithChildren(factory, Props(ctrl), key = key, ref = ref)(children: _*)

  }


  @ScalaJSDefined
  class Component extends ReactComponent[Props, Unit] {

    override def render(): ReactElement = {

      Navigator(renderScene = renderScene _,
        //        sceneStyle = props.sceneStyle,
        initialRoute = props.config.initialRoute._2.toJson,
        configureScene = configureScene _)()
    }

    var ctrl: MobileRouterCtrl = _

    def configureScene(route: js.Dynamic) = {
      if (!js.isUndefined(route.sceneConfig)) route.sceneConfig.asInstanceOf[NavigatorSceneConfig]
      else NavigatorS.SceneConfigs.FloatFromRight
    }

    def renderScene(route: js.Dynamic, nav: NavigatorM) = {
      if (ctrl == null) ctrl = new MobileRouterCtrl(nav, props.config)
      MobileRouterContext(ctrl)(props.config.renderScene(NavigatorRoute.fromJson(route))
      )
    }

  }

  case class Props(config: MobileRouterConfig, sceneStyle: js.Any)

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply(routerConfig: MobileRouterConfig, sceneStyle: js.Any = sceneStyle) = createElement(factory, Props(routerConfig, sceneStyle))

}

