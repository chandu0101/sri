package chandu0101.scalajs.sri.mobile.examples

import chandu0101.scalajs.sri.mobile._
import chandu0101.scalajs.sri.mobile.examples.movies.MoviesApp
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.UIExplorerApp

import scala.scalajs.js.JSApp


object MobileApp extends JSApp {


  def main() = {

    val root = createMobileRoot(
//                  HelloSriMobile()
//                  RouterExample.routerElement
      UIExplorerApp.router
//      MoviesApp.router
    )
    ReactNative.AppRegistry.registerComponent("SriMobile", () => root)
  }
}
