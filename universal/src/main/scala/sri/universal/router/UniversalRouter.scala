package sri.universal

package router

import chandu0101.macros.tojs.JSMacroAny
import sri.core._
import sri.universal.all._
import sri.universal.components.NavigatorNavigationBarS.RouteMapperType
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


sealed trait Page

trait StaticPage extends Page

trait DynamicPage[T] extends Page

sealed trait Route {
  def toJson: js.Dynamic
}


case class NavigatorRoute(title: String,
                          component: js.Any,
                          props: js.UndefOr[Any] = js.undefined,
                          page: Page,
                          leftButton: js.UndefOr[NavBarElementFunction] = js.undefined,
                          rightButton: js.UndefOr[NavBarElementFunction] = js.undefined,
                          sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) {
  val toJS = JSMacroAny[NavigatorRoute](this)
}

object NavigatorRoute {
  def fromJson(obj: js.Dynamic) = {
    NavigatorRoute(title = obj.title.toString,
      component = obj.component,
      props = obj.props,
      page = obj.page.asInstanceOf[Page],
      leftButton = if(js.isUndefined(obj.leftButton)) js.undefined else obj.leftButton.asInstanceOf[NavBarElementFunction],
      rightButton = if(js.isUndefined(obj.rightButton)) js.undefined else obj.rightButton.asInstanceOf[NavBarElementFunction],
      sceneConfig = if(js.isUndefined(obj.sceneConfig)) js.undefined else obj.sceneConfig.asInstanceOf[NavigatorSceneConfig])
  }

}

object UniversalRouter {

  object MobileRouterContext {

    @ScalaJSDefined
    class Component extends ReactComponent[Props, Unit] {
      def render() = children

      def getChildContext() = {
        js.Dictionary("routerctrl" -> props.ctrl)
      }
    }

    case class Props(ctrl: UniversalRouterCtrl)

    val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

    ctor.childContextTypes = routerContextTypes

    def apply(ctrl: UniversalRouterCtrl, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null)(children: ReactNode*) = createElementWithChildren(ctor, Props(ctrl), key = key, ref = ref)(children: _*)

  }


  @ScalaJSDefined
  class Component extends ReactComponent[Props, Unit] {

    override def render(): ReactElement = {
      Navigator(renderScene = renderScene _,
        ref = storeNavRef _,
        style = props.style,
        sceneStyle = props.sceneStyle,
        initialRoute = props.config.initialRoute._2.toJS,
        configureScene = configureScene _)()
    }

    var ctrl: UniversalRouterCtrl = _

    var willFocusSubscription: js.Dynamic = null

    var didFocusSubscription: js.Dynamic = null

    def storeNavRef(navigator: NavigatorM) = {
      if (navigator == null) {
        // when unmounting
        unSubscribeFocusEvents()
      }
    }

    def subscribeFocusEvents(navigator: NavigatorM) = {
      val navContext = navigator.navigationContext
      willFocusSubscription = navContext.addListener("willfocus", (event: js.Dynamic) => {
        if (props.config.onWillFocus != null) props.config.onWillFocus(NavigatorRoute.fromJson(event.data.route))
      })
      didFocusSubscription = navContext.addListener("didfocus", (event: js.Dynamic) => {
        if (props.config.onDidFocus != null) props.config.onDidFocus(NavigatorRoute.fromJson(event.data.route))
      })
    }

    def unSubscribeFocusEvents() = {
      if (willFocusSubscription != null) willFocusSubscription.remove()
      if (didFocusSubscription != null) didFocusSubscription.remove()
    }

    def configureScene(route: js.Dynamic) = {
      if (!js.isUndefined(route.sceneConfig)) route.sceneConfig.asInstanceOf[NavigatorSceneConfig]
      else if(props.sceneConfig.isDefined) props.sceneConfig.get
      else if (isAndroidPlatform) NavigatorS.SceneConfigs.FadeAndroid
      else NavigatorS.SceneConfigs.FloatFromRight
    }

    def renderScene(route: js.Dynamic, navigator: NavigatorM) = {
      if (ctrl == null) {
        ctrl = new UniversalRouterCtrl(navigator, props.config)
        subscribeFocusEvents(navigator) // we must subscribe before initial render
      }
      MobileRouterContext(ctrl)(props.config.renderScene(NavigatorRoute.fromJson(route))
      )
    }
  }


  case class Props(config: UniversalRouterConfig,sceneConfig : js.UndefOr[NavigatorSceneConfig], style: js.UndefOr[js.Dictionary[Any]], sceneStyle: js.UndefOr[js.Dictionary[Any]])

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(routerConfig: UniversalRouterConfig,sceneConfig : js.UndefOr[NavigatorSceneConfig] = js.undefined, style: js.UndefOr[js.Dictionary[Any]] = js.undefined, sceneStyle: js.UndefOr[js.Dictionary[Any]] = js.undefined) = createElement(ctor, Props(routerConfig,sceneConfig, style, sceneStyle))

}

