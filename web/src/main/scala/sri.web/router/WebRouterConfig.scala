package sri.web.router

import sri.core.ReactElement

import scala.scalajs.js


trait WebRouterConfig {

  private var _routes: Map[Content, Route] = Map()

  @inline lazy val routes: Map[Content, Route] = _routes.+(initialRoute)

  def initialRoute: (StaticContent, StaticRoute)

  def staticRoute(page: StaticContent, route: StaticRoute) = {
    _routes += page -> route
  }

  def dynamicRoute[T](page: DynamicContent[T], route: DynamicRoute[T]) = {
    _routes += page -> route
  }

  def moduleRoutes(config: MobileRouterModuleConfig) = {
    _routes ++= config.module_routes
  }

  def notFound: StaticRoute = initialRoute._2

  def renderScene(route: js.Dynamic): ReactElement = {
    if (!js.isUndefined(route.data)) {
      route.getComponent(route.data).asInstanceOf[ReactElement]
    } else {
      route.component().asInstanceOf[ReactElement]
    }
  }
}
