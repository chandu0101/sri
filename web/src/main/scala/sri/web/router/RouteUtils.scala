package sri.web.router

import sri.core._

object RouteUtils {

  def getRoute(loc: Location, ctrl: WebRouterCtrl) = {
    var result: WebRoute = null
    var placeholder = ""
    // first check in static routes
    val sr = ctrl.config.staticRoutesByPath.get(if(loc.pathname != "/") loc.pathname.removeTrailingSlash else loc.pathname)
    if (sr.isDefined) {
      result = sr.get
    }
    else {
      // if not found in staticroutes then check dynamic routes
      val dr = ctrl.config.dynamicRoutesByPath.find { case (k, v) => {
        loc.pathname.contains(k) && loc.pathname.replace(k, "").removeTrailingSlash.count(c => c == '/') == 0
      }
      }
      if (dr.isDefined) {
        val r = dr.get._2
        placeholder = loc.pathname.replace(r.path, "").removeTrailingSlash
        result = r
      } else {
        // if not found in dynamic routes also then get route from not found config
       result =  ctrl.config.staticRoutes.getOrElse(ctrl.config.notFound.page, ctrl.config.initialRoute._2)
      }
    }
    if (ctrl.currentRoute.action.isDefined) ctrl.previousRoute = ctrl.currentRoute
    result = result.copy(action = loc.action, search = loc.search, query = loc.query, state = loc.state, placeholder = placeholder)
    ctrl.currentRoute = result
    result
  }

}
