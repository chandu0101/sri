package sri.web.router

import sri.core.String_Ext_Methods

import scala.scalajs.js

final class WebRouterCtrl private[router](val history: History, val config: WebRouterConfig) {

  private[router] var currentRoute: WebRoute = config.initialRoute._2

  private[router] var previousRoute: js.UndefOr[WebRoute] = js.undefined


  /**
   * use this method to navigate to static pages ,it pushes new scene to the stack
   * @param page
   */
  def navigateTo(page: WebStaticPage, action: WebNavigationAction = WebNavigationAction.PUSH, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = {
    config.staticRoutes.get(page) match {
      case Some(route) => {
        val location = new Location(pathname = route.path, query = query, state = state)
        if (action == WebNavigationAction.REPLACE) history.replace(location)
        else history.push(location)
      }
      case None => handleNotFound()
    }
  }

  def navigateToDynamic[T](page: WebDynamicPage[T], placeholder: String, action: WebNavigationAction = WebNavigationAction.PUSH, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = config.dynamicRoutes.get(page) match {
    case Some(route) => {
      val location = new Location(pathname = s"${route.path}${placeholder.removeForwardSlashes}", query = query, state = state)
      if (action == WebNavigationAction.REPLACE) history.replace(location)
      else history.push(location)
    }
    case None => handleNotFound()
  }

  def navigateBack() = history.goBack()

  def navigateForward() = history.goForward()


  private def handleNotFound() = {
    val location = new Location(pathname = config.staticRoutes.getOrElse(config.notFound.page, config.initialRoute._2).path)
    if (config.notFound.action == WebNavigationAction.REPLACE) history.replace(location)
    else history.push(location)
  }


}
