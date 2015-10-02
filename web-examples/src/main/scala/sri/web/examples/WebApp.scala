package sri.web.examples

import org.scalajs.dom
import sri.relay.container.RelayContainer.Fragments
import sri.relay.container.RelayContainer.Fragments
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.web.ReactDOM
import sri.web.examples.uiexplorer.UIExplorerApp

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {


  @JSExport
  override def main(): Unit = {
    dom.console.log(new RelayContainerSpec {
      override val fragments: Fragments = Fragments()
    } )
    //    ReactDOM.render(HelloWeb(), dom.document.getElementById("container"))
    ReactDOM.render(UIExplorerApp.router, dom.document.getElementById("container"))
  }


}

