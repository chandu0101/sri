package sri.mobile.examples

import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.examples.movies.MoviesApp
import sri.mobile.examples.uiexplorer.UIExplorerApp

import scala.scalajs.js.JSApp


object MobileApp extends JSApp {


  def main() = {

    val root = createMobileRoot(
                        HelloSriMobile()
//      RouterExampleApp.router
//            UIExplorerApp.router
//            MoviesApp.router
    )
    ReactNative.AppRegistry.registerComponent("SriMobile", () => root)
  }
}
