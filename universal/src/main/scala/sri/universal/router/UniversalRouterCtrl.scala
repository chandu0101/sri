package sri.universal.router

import sri.universal.components.NavigatorM

import scala.scalajs.js

final class UniversalRouterCtrl private[router](val navigator: NavigatorM, val config: UniversalRouterConfig) {


  /**
   * use this method to navigate to static pages ,it pushes new scene to the stack
   * @param page
   */
  def navigateTo(page: StaticPage) = {
    config.routes.get(page) match {
      case Some(route) => {
        navigator.push(route)
      }
      case None => handleNotFound()
    }
  }

  def navigateTo[T](page: DynamicPage[T], props: T, title: String) = config.routes.get(page) match {
    case Some(route) => {
      val obj = route.asInstanceOf[js.Dynamic]
      obj.updateDynamic("props")(props.asInstanceOf[js.Any])
      obj.updateDynamic("title")(title)
      navigator.push(obj.asInstanceOf[js.Object])
    }
    case None => handleNotFound()
  }


  /**
   * it will take you to initial route/home route
   */
  def navigateToHome() = navigator.popToTop()

  /**
   * navigates to previous route by unmounting current scene ,
   * if you call this on route stack on < 2 it will throw error so please us showbackButton() boolean as guard
   */
  def navigateBack() = navigator.pop()

  /**
   * it reloads the previous scene and pop current scene
   */
  def navigateBackAndReloadPrevious() = navigator.replacePreviousAndPop(previousRoute.get)

  /**
   * use this method to replace previous route with static route and go back
   */
  def navigateBackAndReplacePrevious(page: StaticPage) = {
    config.routes.get(page) match {
      case Some(route) => {
        navigator.replacePreviousAndPop(route)
      }
      case None => handleNotFound()
    }
  }

  /**
   * use this method to replace previous route with dynamic route and go back
   */
  def navigateBackAndReplacePrevious[T](page: DynamicPage[T], props: T, title: String) = config.routes.get(page) match {
    case Some(route) => {
      val obj = route.asInstanceOf[js.Dynamic]
      obj.updateDynamic("props")(props.asInstanceOf[js.Any])
      obj.updateDynamic("title")(title)
      navigator.replacePreviousAndPop(obj.asInstanceOf[js.Object])
    }
    case None => handleNotFound()
  }


  /**
   * use this method to replace the current scene with new scene
   * @param page
   */
  def replace(page: StaticPage) = {
    config.routes.get(page) match {
      case Some(route) => {
        navigator.replace(route)
      }
      case None => handleNotFound()
    }
  }

  /**
   * This is kinda hacky , use this method when you want to replace entire routestack with a new route
   * @param page
   */
  def resetStackWithNewRoute(page: StaticPage) = {
    config.routes.get(page) match {
      case Some(route) => {
        navigator.immediatelyResetRouteStack(js.Array(route))
      }
      case None => handleNotFound()
    }
  }

  def getCurrentRoutes() = navigator.getCurrentRoutes().toList.asInstanceOf[List[NavigatorRoute]]

  def currentRoute = navigator.getCurrentRoutes().last.asInstanceOf[NavigatorRoute]

  def previousRoute: js.UndefOr[NavigatorRoute] = if (navigator.getCurrentRoutes().length > 1) navigator.getCurrentRoutes().init.last.asInstanceOf[NavigatorRoute] else js.undefined


  /**
   * If you tried to navigate to a route that didn't registered then it looks for handleNotFoundConfig
   * and replaces the screen with handleNotFound configured page
    */
  private def handleNotFound() = {
    val route = config.routes.getOrElse(config.notFound.page, config.initialRoute._2)
    if (config.notFound.action == NavigationAction.REPLACE) navigator.replace(route)
    else navigator.push(route)
  }
}
