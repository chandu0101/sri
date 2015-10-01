package sri.web.router

import sri.core.ReactElement
import sri.web.components.nativeweb.NavigatorSceneConfig

import scala.scalajs.js


trait WebRouterConfig {

  private var _routes: Map[Page, NavigatorRoute] = Map()

  @inline lazy val routes: Map[Page, NavigatorRoute] = _routes.+(initialRoute)

  val initialRoute: (StaticPage, NavigatorRoute)

  def defineInitialRoute(page: StaticPage, title: String, component: => ReactElement, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = {
    page -> NavigatorRoute(title = title, component = () => component, sceneConfig = sceneConfig, page = page)
  }

  def staticRoute(page: StaticPage, title: String, component: => ReactElement, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = {
    _routes += page -> NavigatorRoute(title = title, component = () => component, sceneConfig = sceneConfig, page = page)
  }

  def dynamicRoute[T](page: DynamicPage[T], component: js.Function1[T, ReactElement], sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined) = {
    _routes += page -> NavigatorRoute(title = "", component = component, sceneConfig = sceneConfig, page = page)
  }

  def moduleRoutes(config: WebRouterModuleConfig) = {
    _routes ++= config.module_routes
  }

  def notFound: (StaticPage, NavigatorRoute)

  def renderScene(route: NavigatorRoute): ReactElement = {
    if (route.props.isDefined) {
      route.component.asInstanceOf[js.Function1[Any, ReactElement]](route.props.get)
    } else {
      route.component.asInstanceOf[js.Function0[ReactElement]]()
    }
  }
}

