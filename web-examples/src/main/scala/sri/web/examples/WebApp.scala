package sri.web.examples

import org.scalajs.dom
import sri.web.ReactDOM
import sri.web.examples.routerexample.WebRouterExample
import sri.web.examples.uiexplorer.UIExplorerApp
import sri.web.router.{HistoryOptions, HistoryFactory}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {


  @JSExport
  override def main(): Unit = {
//      ReactDOM.render(HelloWeb(), dom.document.getElementById("app"))
//        ReactDOM.render(AppRouter.router, dom.document.getElementById("app"))
        ReactDOM.render(WebRouterExample.router, dom.document.getElementById("app"))
  }


}

