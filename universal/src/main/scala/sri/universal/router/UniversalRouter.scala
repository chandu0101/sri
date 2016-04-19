package sri.universal

package router

import sri.core._
import sri.universal.all._
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


sealed trait Page

trait StaticPage extends Page

trait DynamicPage[T] extends Page

@ScalaJSDefined
abstract class NavigatorRoute extends js.Object {

  val title: String

  val component: js.Any

  val props: js.UndefOr[Any] = js.undefined

  val page: Page

  val leftButton: js.UndefOr[NavBarElementFunction] = js.undefined

  val rightButton: js.UndefOr[NavBarElementFunction] = js.undefined

  val sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined

}

object NavigatorRoute {

  def apply(title: String, component: js.Any, props: js.UndefOr[Any] = js.undefined, page: Page, leftButton: js.UndefOr[NavBarElementFunction] = js.undefined, rightButton: js.UndefOr[NavBarElementFunction] = js.undefined, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = {
    val title_sh = title
    val component_sh = component
    val props_sh = props
    val page_sh = page
    val leftButton_sh = leftButton
    val rightButton_sh = rightButton
    val sceneConfig_sh = sceneConfig
    new NavigatorRoute {
      val title = title_sh
      val component = component_sh
      override val props = props_sh
      val page = page_sh
      override val leftButton = leftButton_sh
      override val rightButton = rightButton_sh
      override val sceneConfig = sceneConfig_sh
    }
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
        initialRoute = props.config.initialRoute._2,
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
        if (props.config.onWillFocus != null) props.config.onWillFocus(event.data.route.asInstanceOf[NavigatorRoute])
      })
      didFocusSubscription = navContext.addListener("didfocus", (event: js.Dynamic) => {
        if (props.config.onDidFocus != null) props.config.onDidFocus(event.data.route.asInstanceOf[NavigatorRoute])
      })
    }

    def unSubscribeFocusEvents() = {
      if (willFocusSubscription != null) willFocusSubscription.remove()
      if (didFocusSubscription != null) didFocusSubscription.remove()
    }

    def configureScene(route: js.Dynamic) = {
      if (!js.isUndefined(route.sceneConfig)) route.sceneConfig.asInstanceOf[NavigatorSceneConfig]
      else if (props.sceneConfig.isDefined) props.sceneConfig.get
      else if (isAndroidPlatform) Navigator.SceneConfigs.FadeAndroid
      else Navigator.SceneConfigs.FloatFromRight
    }

    def renderScene(route: js.Dynamic, navigator: NavigatorM) = {
      if (ctrl == null) {
        ctrl = new UniversalRouterCtrl(navigator, props.config)
        subscribeFocusEvents(navigator) // we must subscribe before initial render
      }
      MobileRouterContext(ctrl)(props.config.renderScene(route.asInstanceOf[NavigatorRoute])
      )
    }
  }


  case class Props(config: UniversalRouterConfig, sceneConfig: js.UndefOr[NavigatorSceneConfig], style: js.UndefOr[js.Dictionary[Any]], sceneStyle: js.UndefOr[js.Dictionary[Any]])

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(routerConfig: UniversalRouterConfig, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined, style: js.UndefOr[js.Dictionary[Any]] = js.undefined, sceneStyle: js.UndefOr[js.Dictionary[Any]] = js.undefined) = createElement(ctor, Props(routerConfig, sceneConfig, style, sceneStyle))

}

