package chandu0101.scalajs.sri.mobile.router

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core._
import chandu0101.scalajs.sri.mobile.ReactNative
import chandu0101.scalajs.sri.mobile.components.NavigatorNavigationBarS._
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet._

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

case class DynamicRoute[T](getComponent: js.Function1[T, ReactElement], sceneConfig: js.UndefOr[String] = js.undefined) extends Route {

  def toJson = json(getComponent = getComponent, sceneConfig = sceneConfig)
}


object MobileRouter {

  private var _ctrl: MobileRouterCtrl = null

  @inline def routerCtrl = _ctrl


  val sceneStyle = NativeStyleSheet.style(marginTop := 44)


  /**
   * style for navigation bar
   */
  trait Style extends NativeStyleSheet {

    def navBar = style(backgroundColor := "rgb(248, 248, 248)",
      height := 64,
      paddingBottom := 5,
      borderBottomWidth := 1.0 / ReactNative.PixelRatio.get(),
      borderBottomColor := "rgb(200, 199, 204)"
    )

    def navBarTitleText = style(color := "black",
      fontWeight._500,
      marginVertical := 10)

    def navBarLeftButton = style(paddingLeft := 10)

    def navBarButtonText = style(
      fontSize := 16,
      marginVertical := 10,
      color := "rgb(21, 125, 251)")

  }

  object DefaultTheme extends Style {

    override val navBar = super.navBar

    override val navBarTitleText = super.navBarTitleText

    override val navBarLeftButton = super.navBarLeftButton

    override val navBarButtonText = super.navBarButtonText

  }


  @ScalaJSDefined
  class Component extends ReactComponent[Props, Unit] {

    override def render(): ReactElement = {

      val navigationBar: js.UndefOr[ReactElement] = if (props.navigationBarConfig == null) js.undefined
      else NavigatorNavigationBar(
        style = props.navigationBarConfig.theme.navBar,
        routeMapper = NavigationBarRouteMapper(
          Title = onTitle _,
          LeftButton = onLeftButton _,
          RightButton = onRightButton _))()

      Navigator(renderScene = renderScene _,
        ref = getNavRef,
        sceneStyle = props.sceneStyle,
        navigationBar = navigationBar,
        initialRoute = props.config.initialRoute._2.toJson,
        configureScene = configureScene _)()
    }

    val getNavRef: js.Function = (nav: NavigatorM) => {
      if (!js.isUndefined(nav) && nav != null) {
        _ctrl = new MobileRouterCtrl(nav, props.config)
      }
    }

    def configureScene(route: js.Dynamic) = {
      if (!js.isUndefined(route.sceneConfig)) route.sceneConfig.asInstanceOf[NavigatorSceneConfig]
      else NavigatorS.SceneConfigs.FloatFromRight
    }

    def renderScene(route: js.Dynamic, nav: NavigatorM) = {
      props.config.renderScene(route, nav)
    }

    def onLeftButton(route: js.Dynamic, navigator: NavigatorM, index: Int, navState: js.Dynamic): ReactElement = {
      if (props.navigationBarConfig.leftButton != null) props.navigationBarConfig.leftButton(route, navigator, index, navState)
      else {
        if (index > 0) {
          val routeStack = NavigationBarNavState.fromJson(navState).routeStack
          //          val previousRoute = routeStack(index - 1)
          TouchableOpacity(onPress = () => navigator.pop(), style = props.navigationBarConfig.theme.navBarLeftButton)(
            Text(style = props.navigationBarConfig.theme.navBarButtonText)("Back")
          )
        } else null
      }

    }

    def onRightButton(route: js.Dynamic, navigator: NavigatorM, index: Int, navState: js.Dynamic): ReactElement = {
      if (props.navigationBarConfig.rightButton != null) props.navigationBarConfig.rightButton(route, navigator, index, navState)
      else null
    }

    def onTitle(route: js.Dynamic, navigator: NavigatorM, index: Int, navState: js.Dynamic): ReactElement = {
      if (props.navigationBarConfig.title != null) props.navigationBarConfig.title(route, navigator, index, navState)
      else {
        Text(style = DefaultTheme.navBarTitleText)(
          s"${route.title}"
        )
      }
    }

  }

  case class NavigationBarConfig(theme: Style = DefaultTheme, leftButton: RouteMapperType = null, rightButton: RouteMapperType = null, title: RouteMapperType = null)

  case class Props(config: MobileRouterConfig, navigationBarConfig: NavigationBarConfig, sceneStyle: js.Any)

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply(routerConfig: MobileRouterConfig, navigationBarConfig: NavigationBarConfig = null, sceneStyle: js.Any = sceneStyle) = createElement(factory, Props(routerConfig, navigationBarConfig, sceneStyle))

}

