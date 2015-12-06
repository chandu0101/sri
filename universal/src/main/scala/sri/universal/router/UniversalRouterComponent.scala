package sri.universal.router

import sri.core.{ReactComponentJS, ReactJSProps, ReactComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
abstract class UniversalRouterComponent[P, S] extends ReactComponent[P, S] {

  private var ctrl: UniversalRouterCtrl = _

  /**
   * reference to ctrl , you can use this to pass router control outside of component scope (example BackAndroid)
   * @return
   */
  def getRouterCtrl() = ctrl

  //TODO move this logic to secondary constructor ? when they are supported
  override def componentWillMount(): Unit = {
    ctrl = context.routerctrl.asInstanceOf[UniversalRouterCtrl]
  }


  /**
   * use this method to navigate to static pages ,it pushes new scene to the stack
   * @param page
   */
  def navigateTo(page: StaticPage) = {
    ctrl.config.routes.get(page) match {
      case Some(route) => {
        ctrl.navigator.push(route.toJS)
      }
      case None => handleNotFound()
    }
  }

  def navigateTo[T](page: DynamicPage[T], props: T, title: String) = ctrl.config.routes.get(page) match {
    case Some(route) => {
      val obj = route.toJS.asInstanceOf[js.Dynamic]
      obj.updateDynamic("props")(props.asInstanceOf[js.Any])
      obj.updateDynamic("title")(title)
      ctrl.navigator.push(obj.asInstanceOf[js.Object])
    }
    case None => handleNotFound()
  }


  /**
   * it will take you to initial route/home route
   */
  def navigateToHome() = ctrl.navigator.popToTop()

  /**
   * navigates to previous route by unmounting current scene ,
   * if you call this on route stack on < 2 it will throw error so please us showbackButton() boolean as guard
   */
  def navigateBack() = ctrl.navigator.pop()

  /**
   * it reloads the previous scene and pop current scene
   */
  def navigateBackAndReloadPrevious() = ctrl.navigator.replacePreviousAndPop(previousRoute.get.toJS)

  /**
   * use this method to replace previous route with static route and go back
   */
  def navigateBackAndReplacePrevious(page: StaticPage) = {
    ctrl.config.routes.get(page) match {
      case Some(route) => {
        ctrl.navigator.replacePreviousAndPop(route.toJS)
      }
      case None => handleNotFound()
    }
  }

  /**
   * use this method to replace previous route with dynamic route and go back
   */
  def navigateBackAndReplacePrevious[T](page: DynamicPage[T], props: T, title: String) = ctrl.config.routes.get(page) match {
    case Some(route) => {
      val obj = route.toJS.asInstanceOf[js.Dynamic]
      obj.updateDynamic("props")(props.asInstanceOf[js.Any])
      obj.updateDynamic("title")(title)
      ctrl.navigator.replacePreviousAndPop(obj.asInstanceOf[js.Object])
    }
    case None => handleNotFound()
  }

  def getCurrentRoutes() = ctrl.navigator.getCurrentRoutes().toList.map(NavigatorRoute.fromJson)

  @inline def currentRoute = NavigatorRoute.fromJson(ctrl.navigator.getCurrentRoutes().last)

  @inline def previousRoute: js.UndefOr[NavigatorRoute] = if (ctrl.navigator.getCurrentRoutes().length > 1) NavigatorRoute.fromJson(ctrl.navigator.getCurrentRoutes().init.last) else js.undefined


  //TODO may be add strategy flag ? (replace/push)
  private def handleNotFound() = {
    ctrl.navigator.push(ctrl.config.notFound._2.toJS)
  }


}

/**
 * router component for JS props type
 * //TODO why no trait support for @ScalaJSDefined too much copy paste :(
 * @tparam P
 * @tparam S
 */
@ScalaJSDefined
abstract class UniversalRouterComponentJS[P <: ReactJSProps, S] extends ReactComponentJS[P, S] {


  private var ctrl: UniversalRouterCtrl = _

  /**
   * reference to ctrl , you can use this to pass router control outside of component scope (example BackAndroid)
   * @return
   */
  def getRouterCtrl() = ctrl

  //TODO move this logic to secondary constructor ? when they are supported
  override def componentWillMount(): Unit = {
    ctrl = context.routerctrl.asInstanceOf[UniversalRouterCtrl]
  }


  /**
   * use this method to navigate to static pages ,it pushes new scene to the stack
   * @param page
   */
  def navigateTo(page: StaticPage) = {
    ctrl.config.routes.get(page) match {
      case Some(route) => {
        ctrl.navigator.push(route.toJS)
      }
      case None => handleNotFound()
    }
  }

  def navigateTo[T](page: DynamicPage[T], props: T, title: String) = ctrl.config.routes.get(page) match {
    case Some(route) => {
      val obj = route.toJS.asInstanceOf[js.Dynamic]
      obj.updateDynamic("props")(props.asInstanceOf[js.Any])
      obj.updateDynamic("title")(title)
      ctrl.navigator.push(obj.asInstanceOf[js.Object])
    }
    case None => handleNotFound()
  }


  /**
   * it will take you to initial route/home route
   */
  def navigateToHome() = ctrl.navigator.popToTop()

  /**
   * navigates to previous route by unmounting current scene ,
   * if you call this on route stack on < 2 it will throw error so please us showbackButton() boolean as guard
   */
  def navigateBack() = ctrl.navigator.pop()

  /**
   * it reloads the previous scene and pop current scene
   */
  def navigateBackAndReloadPrevious() = ctrl.navigator.replacePreviousAndPop(previousRoute.get.toJS)

  /**
   * use this method to replace previous route with static route and go back
   */
  def navigateBackAndReplacePrevious(page: StaticPage) = {
    ctrl.config.routes.get(page) match {
      case Some(route) => {
        ctrl.navigator.replacePreviousAndPop(route.toJS)
      }
      case None => handleNotFound()
    }
  }

  /**
   * use this method to replace previous route with dynamic route and go back
   */
  def navigateBackAndReplacePrevious[T](page: DynamicPage[T], props: T, title: String) = ctrl.config.routes.get(page) match {
    case Some(route) => {
      val obj = route.toJS.asInstanceOf[js.Dynamic]
      obj.updateDynamic("props")(props.asInstanceOf[js.Any])
      obj.updateDynamic("title")(title)
      ctrl.navigator.replacePreviousAndPop(obj.asInstanceOf[js.Object])
    }
    case None => handleNotFound()
  }

  def getCurrentRoutes() = ctrl.navigator.getCurrentRoutes().toList.map(NavigatorRoute.fromJson)

  @inline def currentRoute = NavigatorRoute.fromJson(ctrl.navigator.getCurrentRoutes().last)

  @inline def previousRoute: js.UndefOr[NavigatorRoute] = if (ctrl.navigator.getCurrentRoutes().length > 1) NavigatorRoute.fromJson(ctrl.navigator.getCurrentRoutes().init.last) else js.undefined


  //TODO may be add strategy flag ? (replace/push)
  private def handleNotFound() = {
    ctrl.navigator.push(ctrl.config.notFound._2.toJS)
  }

}
