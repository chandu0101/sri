package chandu0101.scalajs.sri.web.router

import scala.scalajs.js
import scala.scalajs.js.JSON

final class WebRouterCtrl private[router](navigator: History, config: WebRouterConfig) {

  def navigateTo(page: StaticContent) = {
    config.routes.get(page) match {
      case Some(route) => {
        println(s"navigating to path : ${JSON.stringify(route.toJson)}")
        navigator.pushState(route.toJson, route.toJson.path.toString)
      }
      case None => handleNotFound()
    }
  }

  /**
   * It will go to first scene in stack , unmounting every other scene
   */
  //  def navigateToHome() = navigator.popToTop()

  def navigateToDynamic[T](page: DynamicContent[T], data: T, path: String) = config.routes.get(page) match {
    case Some(route) => {
      val obj = route.toJson
      obj.updateDynamic("data")(data.asInstanceOf[js.Any])
      navigator.pushState(obj, path)
    }
    case None => handleNotFound()
  }

  //TODO may be add strategy flag ? (replace/push)
  private def handleNotFound() = navigator.pushState(config.notFound.toJson, "")

}
