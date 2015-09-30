package sri.mobile.router

import sri.core.ReactElement
import sri.mobile.components.NavigatorSceneConfig

import scala.scalajs.js

trait MobileRouterModuleConfig {

  private var _module_routes: Map[Page, NavigatorRoute] = Map()

  lazy val module_routes: Map[Page, NavigatorRoute] = _module_routes

  def staticRoute(page: StaticPage, title: String, component: => ReactElement, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = {
    _module_routes += page -> NavigatorRoute(title = title, component = () => component, sceneConfig = sceneConfig, page = page)
  }

  def dynamicRoute[T](page: DynamicPage[T], component: js.Function1[T, ReactElement], sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = {
    _module_routes += page -> NavigatorRoute(title = "", component = component, sceneConfig = sceneConfig, page = page)
  }

}
