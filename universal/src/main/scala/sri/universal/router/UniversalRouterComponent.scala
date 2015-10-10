package sri.universal.router

import sri.core.ReactComponent

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
  def navigateToStatic(page: StaticPage) = {
    ctrl.config.routes.get(page) match {
      case Some(route) => {
        ctrl.navigator.push(route.toJS)
      }
      case None => handleNotFound()
    }
  }

  def navigateToDynamic[T](page: DynamicPage[T], props: T, title: String) = ctrl.config.routes.get(page) match {
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
   * use this guard when you calling navigateBack
   * @return
   */
  def showBackButton() = if (ctrl.navigator.getCurrentRoutes().length > 1) true else false


  def getCurrentRoutes() = ctrl.navigator.getCurrentRoutes().toList.map(NavigatorRoute.fromJson)


  //TODO may be add strategy flag ? (replace/push)
  private def handleNotFound() = {
    ctrl.navigator.push(ctrl.config.notFound._2.toJS)
  }

}
