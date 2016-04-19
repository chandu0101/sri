package sri.web.examples

import org.scalajs.dom
import sri.universal.{all, ReactUniversal}
import sri.web.{ReactNativeWeb, ReactDOM}
import sri.web.examples.routerexample.WebRouterExample
import sri.web.router.{HistoryOptions, HistoryFactory}
import scala.scalajs.js.Dynamic.{literal => json}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {


  @JSExport
  override def main(): Unit = {

    val root = all.createReactNativeRoot(WebRouterExample.router)
    ReactNativeWeb.AppRegistry.registerComponent("MyApp", () => root)
    ReactNativeWeb.AppRegistry.runApplication("MyApp", json(rootTag = dom.document.getElementById("react-root")))

  }


}

