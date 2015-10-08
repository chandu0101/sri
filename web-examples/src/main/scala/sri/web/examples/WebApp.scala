package sri.web.examples

import org.scalajs.dom
import sri.web.ReactDOM

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {


  @JSExport
  override def main(): Unit = {
    ReactDOM.render(HelloWeb(), dom.document.getElementById("app"))
    //    ReactDOM.render(UIExplorerApp.router, dom.document.getElementById("app"))
  }


}

