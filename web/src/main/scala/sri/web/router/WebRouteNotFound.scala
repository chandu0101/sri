package sri.web.router

case class WebRouteNotFound(page : WebStaticPage,action : WebNavigationAction = WebNavigationAction.REPLACE)
