package sri.web.router

import sri.core.{ReactComponent, ReactComponentJS, ReactJSProps}
import sri.core._
import sri.universal.router.NavigationAction
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
abstract class WebRouterComponent[P, S] extends ReactComponent[P, S] {

  private var ctrl: WebRouterCtrl = _

  /**
   * reference to ctrl , you can use this to pass router control outside of component scope (example BackAndroid)
   * @return
   */
  def getRouterCtrl() = ctrl

  //TODO move this logic to secondary constructor ? when they are supported
  override def componentWillMount(): Unit = {
    ctrl = context.routerctrl.asInstanceOf[WebRouterCtrl]
  }


  /**
   * use this method to navigate to static pages ,it pushes new scene to the stack
   * @param page
   */
  def navigateTo(page: WebStaticPage, action: WebNavigationAction = WebNavigationAction.PUSH, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = {
    ctrl.config.staticRoutes.get(page) match {
      case Some(route) => {
        val location = new Location(pathname = route.path, query = query, state = state)
        if (action == WebNavigationAction.REPLACE) ctrl.history.replace(location)
        else ctrl.history.push(location)
      }
      case None => handleNotFound()
    }
  }

  def navigateToDynamic[T](page: WebDynamicPage[T], placeholder: String, action: WebNavigationAction = WebNavigationAction.PUSH, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = ctrl.config.dynamicRoutes.get(page) match {
    case Some(route) => {
      val location = new Location(pathname = s"${route.path}${placeholder.removeForwardSlashes}", query = query, state = state)
      if (action == WebNavigationAction.REPLACE) ctrl.history.replace(location)
      else ctrl.history.push(location)
    }
    case None => handleNotFound()
  }

  def navigateBack() = ctrl.history.goBack()

  def navigateForward() = ctrl.history.goForward()


  private def handleNotFound() = {
    val location = new Location(pathname = ctrl.config.staticRoutes.getOrElse(ctrl.config.notFound.page, ctrl.config.initialRoute._2).path)
    if (ctrl.config.notFound.action == WebNavigationAction.REPLACE) ctrl.history.replace(location)
    else ctrl.history.push(location)
  }

  def currentRoute = ctrl.currentRoute

  def previousRoute = ctrl.previousRoute

}

/**
 * router component for JS props type
 * //TODO why no trait support for @ScalaJSDefined too much copy paste :(
 * @tparam P
 * @tparam S
 */
@ScalaJSDefined
abstract class WebRouterComponentJS[P <: ReactJSProps, S] extends ReactComponentJS[P, S] {

  private var ctrl: WebRouterCtrl = _

  /**
   * reference to ctrl , you can use this to pass router control outside of component scope (example BackAndroid)
   * @return
   */
  def getRouterCtrl() = ctrl

  //TODO move this logic to secondary constructor ? when they are supported
  override def componentWillMount(): Unit = {
    ctrl = context.routerctrl.asInstanceOf[WebRouterCtrl]
  }


  /**
   * use this method to navigate to static pages ,it pushes new scene to the stack
   * @param page
   */
  def navigateTo(page: WebStaticPage, action: WebNavigationAction = WebNavigationAction.PUSH, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = {
    ctrl.config.staticRoutes.get(page) match {
      case Some(route) => {
        val location = new Location(pathname = route.path, query = query, state = state)
        if (action == WebNavigationAction.REPLACE) ctrl.history.replace(location)
        else ctrl.history.push(location)
      }
      case None => handleNotFound()
    }
  }

  def navigateToDynamic[T](page: WebDynamicPage[T], placeholder: String, action: WebNavigationAction = WebNavigationAction.PUSH, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = ctrl.config.dynamicRoutes.get(page) match {
    case Some(route) => {
      val location = new Location(pathname = s"${route.path}${placeholder.removeForwardSlashes}", query = query, state = state)
      if (action == WebNavigationAction.REPLACE) ctrl.history.replace(location)
      else ctrl.history.push(location)
    }
    case None => handleNotFound()
  }

  def navigateBack() = ctrl.history.goBack()

  def navigateForward() = ctrl.history.goForward()


  private def handleNotFound() = {
    val location = new Location(pathname = ctrl.config.staticRoutes.getOrElse(ctrl.config.notFound.page, ctrl.config.initialRoute._2).path)
    if (ctrl.config.notFound.action == WebNavigationAction.REPLACE) ctrl.history.replace(location)
    else ctrl.history.push(location)
  }

}
