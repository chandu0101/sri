package chandu0101.scalajs.sri.mobile.router

trait MobileRouterModuleConfig {

  private var _module_routes: Map[Page, Route] = Map()

  lazy val module_routes: Map[Page, Route] = _module_routes

  def staticRoute(page: StaticPage, route: StaticRoute) = {
    _module_routes += page -> route
  }

  def dynamicRoute[T](page: DynamicPage[T], route: DynamicRoute[T]) = {
    _module_routes += page -> route
  }

}
