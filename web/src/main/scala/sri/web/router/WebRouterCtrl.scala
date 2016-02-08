package sri.web.router

import scala.scalajs.js

final class WebRouterCtrl private[router](val history: History, val config: WebRouterConfig) {

  private[router] var currentRoute: WebRoute = config.initialRoute._2

  private[router] var previousRoute: js.UndefOr[WebRoute] = js.undefined
}
