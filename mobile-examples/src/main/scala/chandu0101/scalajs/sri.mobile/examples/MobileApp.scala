package chandu0101.scalajs.sri.mobile.examples

import chandu0101.scalajs.sri.core.ElementFactory
import chandu0101.scalajs.sri.mobile._
import chandu0101.scalajs.sri.mobile.examples.router.AppRouter
import scala.scalajs.js.JSApp


object MobileApp extends JSApp {

  def main() = {
    val rootComponent = AppRouter.routerElement
    ReactNative.AppRegistry.registerComponent("SriMobile", () => createMobileRoot(rootComponent))
  }
}
