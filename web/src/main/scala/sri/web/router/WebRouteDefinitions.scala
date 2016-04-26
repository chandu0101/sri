package sri.web.router

import sri.core.ReactElement
import sri.universal.components.NavigatorSceneConfig

import scala.scalajs.js

private[router]trait WebRouteDefinitions {

  /**
   * use this method define static routes in app
   * @param page a StaticPage
   * @param component static component that should be rendered when navigated to this route
   */
  def staticRoute(page: WebStaticPage, path: String, component: WebRoute => ReactElement)

  /**
   * use this method to define dynamic routes in app
   * @param page s DynamicePage[T]
   * @param component dynamic component that should be rendered when navigated to this route
   * @tparam T
   */
  def dynamicRoute[T](page: WebDynamicPage[T], path: String, component: (T, WebRoute) => ReactElement, parser: String => T)

}
