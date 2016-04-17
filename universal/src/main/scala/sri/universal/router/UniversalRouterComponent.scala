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
  def navigateTo(page: StaticPage) = ctrl.navigateTo(page)

  def navigateTo[T](page: DynamicPage[T], props: T, title: String) = ctrl.navigateTo(page, props, title)


  /**
   * it will take you to initial route/home route
   */
  def navigateToHome() = ctrl.navigateToHome()

  /**
   * navigates to previous route by unmounting current scene ,
   * if you call this on route stack on < 2 it will throw error so please us showbackButton() boolean as guard
   */
  def navigateBack() = ctrl.navigateBack()

  /**
   * it reloads the previous scene and pop current scene
   */
  def navigateBackAndReloadPrevious() = ctrl.navigateBackAndReloadPrevious()

  /**
   * use this method to replace previous route with static route and go back
   */
  def navigateBackAndReplacePrevious(page: StaticPage) = ctrl.navigateBackAndReplacePrevious(page)

  /**
   * use this method to replace previous route with dynamic route and go back
   */
  def navigateBackAndReplacePrevious[T](page: DynamicPage[T], props: T, title: String) = ctrl.navigateBackAndReplacePrevious(page,props,title)


  /**
   * use this method to replace the current scene with new scene
   * @param page
   */
  def replace(page: StaticPage) = ctrl.replace(page)
  /**
   * This is kinda hacky , use this method when you want to replace entire routestack with a new route
   * @param page
   */
  def resetStackWithNewRoute(page: StaticPage) = ctrl.resetStackWithNewRoute(page)

  def getCurrentRoutes() = ctrl.getCurrentRoutes()

  @inline def currentRoute = ctrl.currentRoute

  @inline def previousRoute: js.UndefOr[NavigatorRoute] = ctrl.previousRoute


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
  def navigateTo(page: StaticPage) = ctrl.navigateTo(page)

  def navigateTo[T](page: DynamicPage[T], props: T, title: String) = ctrl.navigateTo(page, props, title)


  /**
   * it will take you to initial route/home route
   */
  def navigateToHome() = ctrl.navigateToHome()

  /**
   * navigates to previous route by unmounting current scene ,
   * if you call this on route stack on < 2 it will throw error so please us showbackButton() boolean as guard
   */
  def navigateBack() = ctrl.navigateBack()

  /**
   * it reloads the previous scene and pop current scene
   */
  def navigateBackAndReloadPrevious() = ctrl.navigateBackAndReloadPrevious()

  /**
   * use this method to replace previous route with static route and go back
   */
  def navigateBackAndReplacePrevious(page: StaticPage) = ctrl.navigateBackAndReplacePrevious(page)

  /**
   * use this method to replace previous route with dynamic route and go back
   */
  def navigateBackAndReplacePrevious[T](page: DynamicPage[T], props: T, title: String) = ctrl.navigateBackAndReplacePrevious(page,props,title)


  /**
   * use this method to replace the current scene with new scene
   * @param page
   */
  def replace(page: StaticPage) = ctrl.replace(page)
  /**
   * This is kinda hacky , use this method when you want to replace entire routestack with a new route
   * @param page
   */
  def resetStackWithNewRoute(page: StaticPage) = ctrl.resetStackWithNewRoute(page)

  def getCurrentRoutes() = ctrl.getCurrentRoutes()

  @inline def currentRoute = ctrl.currentRoute

  @inline def previousRoute: js.UndefOr[NavigatorRoute] = ctrl.previousRoute

}
