package sri.mobile.router

import sri.core.ReactElement
import sri.mobile.components.NavigatorSceneConfig

import scala.scalajs.js


trait MobileRouterConfig {

  private var _routes: Map[Page, NavigatorRoute] = Map()

  @inline lazy val routes: Map[Page, NavigatorRoute] = _routes.+(initialRoute)

  val initialRoute: (StaticPage, NavigatorRoute)

  /**
   * use this method to define initial route for router
   * @param page a StaticPage
   * @param title title/name for the the route
   * @param component component that you want ot render on first load of your app
   * @param sceneConfig  page transition style/animation
   * @return
   */
  def defineInitialRoute(page: StaticPage, title: String, component: => ReactElement, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = {
    page -> NavigatorRoute(title = title, component = () => component, sceneConfig = sceneConfig, page = page)
  }

  /**
   * use this method define static routes in app
   * @param page a StaticPage
   * @param title title/name for the route
   * @param component static component that should be rendered when navigated to this route
   * @param sceneConfig  page transition style/animation
   */
  def staticRoute(page: StaticPage, title: String, component: => ReactElement, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = {
    _routes += page -> NavigatorRoute(title = title, component = () => component, sceneConfig = sceneConfig, page = page)
  }

  /**
   * use this method to define dynamic routes in app
   * @param page s DynamicePage[T]
   * @param component dynamic component that should be rendered when navigated to this route
   * @param sceneConfig page transition style/animation
   * @tparam T
   */
  def dynamicRoute[T](page: DynamicPage[T], component: js.Function1[T, ReactElement], sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = {
    _routes += page -> NavigatorRoute(title = "", component = component, sceneConfig = sceneConfig, page = page)
  }

  /**
   * use this method to register sub module routes
   * @param config
   */
  def moduleRoutes(config: MobileRouterModuleConfig) = {
    _routes ++= config.module_routes
  }

  /**
   * not found route
   * @return
   */
  val notFound: (StaticPage, NavigatorRoute)


  /**
   * this method is responsible for rendering components ,
   * @param route current route that is pushed to stack
   * @return
   */
  def renderScene(route: NavigatorRoute): ReactElement = {
    if (route.props.isDefined) {
      route.component.asInstanceOf[js.Function1[Any, ReactElement]](route.props.get)
    } else {
      route.component.asInstanceOf[js.Function0[ReactElement]]()
    }
  }
}

