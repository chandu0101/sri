package sri.web.router

import sri.core.ReactElement
import sri.universal.components.NavigatorSceneConfig
import sri.universal.router.NavigationAction

import scala.scalajs.js
import scala.scalajs.js.`|`


abstract class WebRouterConfig extends WebRouteDefinitions with PathUtils {

  private var _staticRoutes: Map[WebStaticPage, WebRoute] = Map()

  private var _dynamicRoutes: Map[WebDynamicPage[_], WebRoute] = Map()

  lazy val staticRoutes: Map[WebStaticPage, WebRoute] = _staticRoutes.+(initialRoute)

  lazy val dynamicRoutes: Map[WebDynamicPage[_], WebRoute] = _dynamicRoutes

  lazy val staticRoutesByPath: Map[String, WebRoute] = staticRoutes.map { case (k, v) => (v.path, v)}

  lazy val dynamicRoutesByPath: Map[String, WebRoute] = dynamicRoutes.map { case (k, v) => (v.path, v)}

  val history: History

  val initialRoute: (WebStaticPage, WebRoute)

  /**
   * use this method to define initial route for router
   * @param page a StaticPage
   * @param component component that you want ot render on first load of your app
   * @return
   */
  def defineInitialRoute(page: WebStaticPage, component: WebRoute => ReactElement) = {
    page -> WebRoute(path = "/", component = component, page = page)
  }

  /**
   * use this method define static routes in app
   * @param page a StaticPage
   * @param component static component that should be rendered when navigated to this route
   */
  def staticRoute(page: WebStaticPage, path: String, component: WebRoute => ReactElement) = {
    _staticRoutes += page -> WebRoute(path = createStaticPath(path), component = component, page = page)
  }

  /**
   * use this method to define dynamic routes in app
   * @param page s DynamicePage[T]
   * @param component dynamic component that should be rendered when navigated to this route
   * @tparam T
   */
  def dynamicRoute[T](page: WebDynamicPage[T], path: String, component: (T, WebRoute) => ReactElement, parser: String => T) = {
    _dynamicRoutes += page -> WebRoute(path = createDynamicPath(path), component = component, page = page, parser = parser)
  }

  /**
   * use this method to register sub module routes
   * @param config
   */
  def moduleRoutes(config: WebRouterModuleConfig) = {
    _staticRoutes ++= config._static_module_routes
    _dynamicRoutes ++= config._dynamic_module_routes
  }

  /**
   * not found route
   * @return
   */
  val notFound: WebRouteNotFound


  /**
   * Implement this to intercept routes before transition
   */
  val interceptTransition: WebRoute => Boolean | String = null

  /**
   * this method is responsible for rendering components ,
   * @param route current route that is pushed to stack
   * @return
   */
  def renderScene(route: WebRoute): ReactElement = {
    if (route.page.isInstanceOf[WebStaticPage]) route.component.asInstanceOf[(WebRoute) => ReactElement](route)
    else route.component.asInstanceOf[(Any, WebRoute) => ReactElement](route.parser.get(route.placeholder.get), route)
  }
}

