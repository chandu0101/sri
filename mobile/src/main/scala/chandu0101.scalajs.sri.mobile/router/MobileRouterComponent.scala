package chandu0101.scalajs.sri.mobile.router

import chandu0101.scalajs.sri.core.ReactComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
abstract class MobileRouterComponent[P, S] extends ReactComponent[P, S] {

  private var ctrl: MobileRouterCtrl = _

  /**
   * reference to ctrl , you can use this to pass router control outside of component scope (example BackAndroid)
   * @return
   */
  def getRouterCtrl() = ctrl

  //TODO move this logic to secondary constructor ? when they are supported
  override def componentWillMount(): Unit = {
    ctrl = context.routerctrl.asInstanceOf[MobileRouterCtrl]
  }


  /**
   *  use this method to navigate to static pages ,it pushes new scene to the stack
   * @param page
   */
  def navigateToStatic(page: StaticPage) = {
    ctrl.config.routes.get(page) match {
      case Some(route) => {
        val r = route.toJson
        r.updateDynamic("page")(page.asInstanceOf[js.Any])
        ctrl.navigator.push(r)
      }
      case None => handleNotFound()
    }
  }

  def navigateToDynamic[T](page: DynamicPage[T], data: T, title: String) = ctrl.config.routes.get(page) match {
    case Some(route) => {
      val obj = route.toJson
      obj.updateDynamic("data")(data.asInstanceOf[js.Any])
      obj.updateDynamic("title")(title)
      obj.updateDynamic("page")(page.asInstanceOf[js.Any])
      ctrl.navigator.push(obj)
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
    val page = ctrl.config.notFound._1
    val route = ctrl.config.notFound._2.toJson
    route.updateDynamic("page")(page.asInstanceOf[js.Any])
    ctrl.navigator.push(route)
  }

}
