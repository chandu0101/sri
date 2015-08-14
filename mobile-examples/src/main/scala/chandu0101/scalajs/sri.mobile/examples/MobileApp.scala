package chandu0101.scalajs.sri.mobile.examples

import chandu0101.scalajs.sri.mobile._
import chandu0101.scalajs.sri.mobile.examples.HelloSriMobile.Component
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.UIExplorerRouter

import scala.scalajs.js
import scala.scalajs.js.JSApp


object MobileApp extends JSApp {

  def main() = {

    val root = createMobileRoot(
      //      HelloSriMobile()
      //      RouterExample.routerElement
      UIExplorerRouter.router
    )
    ReactNative.AppRegistry.registerComponent("SriMobile", () => root)
  }
}
