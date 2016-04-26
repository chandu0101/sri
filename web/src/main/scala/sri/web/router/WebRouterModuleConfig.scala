package sri.web.router

import sri.core.ReactElement
import sri.universal.components.NavigatorSceneConfig

import scala.scalajs.js

abstract class WebRouterModuleConfig(val modulename : String) extends WebRouteDefinitions with PathUtils {

  private[router] var _static_module_routes: Map[WebStaticPage, WebRoute] = Map()

  private[router] var _dynamic_module_routes: Map[WebDynamicPage[_], WebRoute] = Map()

  /**
   * use this method define static routes in app
   * @param page a StaticPage
   * @param component static component that should be rendered when navigated to this route
   */
  def staticRoute(page: WebStaticPage, path: String, component: WebRoute => ReactElement) = {
    _static_module_routes += page -> WebRoute(path = createStaticModulePath(modulename,path), component = component, page = page)
  }

  /**
   * use this method to define dynamic routes in app
   * @param page s DynamicePage[T]
   * @param component dynamic component that should be rendered when navigated to this route
   * @tparam T
   */
  def dynamicRoute[T](page: WebDynamicPage[T], path: String, component: (T, WebRoute) => ReactElement, parser: String => T) = {
    _dynamic_module_routes += page -> WebRoute(path = createDynamicModulePath(modulename,path), component = component, page = page, parser = parser)
  }


}
