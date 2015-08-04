package chandu0101.scalajs.sri.mobile.router

import chandu0101.scalajs.sri.mobile.components.NavigatorM

import scala.scalajs.js

final class MobileRouterCtrl private[router](navigator: NavigatorM, config: MobileRouterConfig) {


  def navigateTo(page: StaticPage) = {
    navigator.push(config.routes.get(page).get.toJson)
  }

  def navigateToDynamic[T](page: DynamicPage[T], data: T) = config.routes.get(page) match {

    case Some(route) => {
      val obj = route.toJson
      obj.updateDynamic("dtata")(data.asInstanceOf[js.Any])
      navigator.push(obj)
    }

    case None => navigator.push(config.notFound.toJson)
  }

}
