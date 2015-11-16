package sri.universal.router

import sri.core.ReactElement
import sri.universal.components.NavigatorSceneConfig

import scala.scalajs.js

trait UniversalRouterModuleConfig extends RouteDefinitions{

  private var _module_routes: Map[Page, NavigatorRoute] = Map()

  lazy val module_routes: Map[Page, NavigatorRoute] = _module_routes

  /**
   * use this method define static routes in app
   * @param page a StaticPage
   * @param title title/name for the route
   * @param component static component that should be rendered when navigated to this route
   * @param sceneConfig  page transition style/animation
   */
  override def staticRoute(page: StaticPage, title: String, component: => ReactElement, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined,leftButton : js.UndefOr[NavBarElementFunction] = js.undefined,rightButton : js.UndefOr[NavBarElementFunction] = js.undefined) = {
    _module_routes += page -> NavigatorRoute(title = title, component = () => component, sceneConfig = sceneConfig, page = page,leftButton = leftButton,rightButton = rightButton)
  }

  /**
   * use this method to define dynamic routes in app
   * @param page s DynamicePage[T]
   * @param component dynamic component that should be rendered when navigated to this route
   * @param sceneConfig page transition style/animation
   * @tparam T
   */
  override def dynamicRoute[T](page: DynamicPage[T], component: js.Function1[T, ReactElement], sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined,leftButton : js.UndefOr[NavBarElementFunction] = js.undefined,rightButton : js.UndefOr[NavBarElementFunction] = js.undefined) = {
    _module_routes += page -> NavigatorRoute(title = "", component = component, sceneConfig = sceneConfig, page = page,leftButton = leftButton,rightButton = rightButton)
  }

}
