package sri.mobile.examples

import sri.mobile._
import sri.mobile.examples.router.routes.RouterExampleApp

import scala.scalajs.js.JSApp


object MobileApp extends JSApp {


  def main() = {

    val root = createMobileRoot(
      //                  HelloSriMobile()
      RouterExampleApp.router
      //      UIExplorerApp.router
      //      MoviesApp.router
    )
    ReactNative.AppRegistry.registerComponent("SriMobile", () => root)
  }
}
