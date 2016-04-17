package sri.web.router

import sri.core.{ReactComponent, ReactComponentJS, ReactJSProps}

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
    ctrl.navigateTo(page, action, query, state)
  }

  def navigateToDynamic[T](page: WebDynamicPage[T], placeholder: String, action: WebNavigationAction = WebNavigationAction.PUSH, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = {
    ctrl.navigateToDynamic(page, placeholder, action, query, state)
  }


  def navigateBack() = ctrl.navigateBack()

  def navigateForward() = ctrl.navigateForward()


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
    ctrl.navigateTo(page, action, query, state)
  }

  def navigateToDynamic[T](page: WebDynamicPage[T], placeholder: String, action: WebNavigationAction = WebNavigationAction.PUSH, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = {
    ctrl.navigateToDynamic(page, placeholder, action, query, state)
  }


  def navigateBack() = ctrl.navigateBack()

  def navigateForward() = ctrl.navigateForward()


  def currentRoute = ctrl.currentRoute

  def previousRoute = ctrl.previousRoute

}
