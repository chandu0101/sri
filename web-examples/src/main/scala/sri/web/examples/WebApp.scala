package sri.web.examples

import org.scalajs.dom
import sri.web.ReactDOM
import sri.web.examples.routerexample.WebRouterExample
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {


  @JSExport
  override def main(): Unit = {
    //
    //    val root = all.createReactNativeRoot(WebRouterExample.router)
    //    ReactNativeWeb.AppRegistry.registerComponent("MyApp", () => root)
    //    ReactNativeWeb.AppRegistry.runApplication("MyApp", json(rootTag = dom.document.getElementById("react-root")))
    ReactDOM.render(WebRouterExample.router, dom.document.getElementById("react-root"))

    //    ReactDOM.render(AppRouter.router, dom.document.getElementById("react-root"))
  }


}

