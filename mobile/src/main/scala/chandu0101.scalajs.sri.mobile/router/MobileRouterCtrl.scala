package chandu0101.scalajs.sri.mobile.router

import chandu0101.scalajs.sri.mobile.components.NavigatorM

import scala.scalajs.js

final class MobileRouterCtrl private[router](navigator: NavigatorM, config: MobileRouterConfig) {

  def navigateTo(page: StaticPage) = {
    config.routes.get(page) match {
      case Some(route) => navigator.push(route.toJson)
      case None => handleNotFound()
    }
  }

  /**
   * It will go to first scene in stack , unmounting every other scene
   */
  def navigateToHome() = navigator.popToTop()

  def navigateToDynamic[T](page: DynamicPage[T], data: T, title: String) = config.routes.get(page) match {
    case Some(route) => {
      val obj = route.toJson
      obj.updateDynamic("data")(data.asInstanceOf[js.Any])
      obj.updateDynamic("title")(title)
      navigator.push(obj)
    }
    case None => handleNotFound()
  }

  //TODO may be add strategy flag ? (replace/push)
  private def handleNotFound() = navigator.push(config.notFound.toJson)

}
