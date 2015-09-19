package chandu0101.scalajs.sri.web.router

trait MobileRouterModuleConfig {

  private var _module_routes: Map[Content, Route] = Map()

  lazy val module_routes: Map[Content, Route] = _module_routes

  def staticRoute(page: StaticContent, route: StaticRoute) = {
    _module_routes += page -> route
  }

  def dynamicRoute[T](page: DynamicContent[T], route: DynamicRoute[T]) = {
    _module_routes += page -> route
  }

}
