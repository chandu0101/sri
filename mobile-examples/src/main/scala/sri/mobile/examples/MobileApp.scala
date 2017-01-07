package sri.mobile.examples

import chandu0101.macros.tojs.FunctionMacro
import org.scalajs.dom
import sri.core.ReactClass
import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.examples.movies.MoviesApp
import sri.mobile.examples.router.RouterExampleApp
import sri.mobile.examples.uiexplorer.UIExplorerApp

import scala.scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSImport


object MobileApp extends JSApp {

  object man {
    def apply(hello : String,hello1: js.UndefOr[String]  = js.undefined):js.Object = {
      val p = FunctionMacro()
      p
    }
  }

  def main() = {
    val mo = man(hello = "scalajs-man")
//    dom.window.console.log(mo)
    println(mo)
    val root = createReactNativeRoot(
      //                              HelloSriMobile()
      //            RouterExampleApp.router
      UIExplorerApp.router
      //                  MoviesApp.router
    )
    ReactNative.AppRegistry.registerComponent("SriMobile", () => root)
  }
}
