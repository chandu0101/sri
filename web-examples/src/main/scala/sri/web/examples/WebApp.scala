package sri.web.examples

import org.scalajs.dom
import sri.relay.RelayRootContainer
import sri.web.ReactDOM
import sri.web.examples.relay.starterkit.{StarterkitApp, StarterkitRoute}

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {


  @JSExport
  override def main(): Unit = {

    //    js.Dynamic.global.StarWarsShip = Ship.StarWarsShip
    //    val afunc: js.Function = () => js.eval(RelayQL( """fragment on Faction @relay(plural: true) { name,
    //                                                         ships(first: 10) {
    //                                                           edges {
    //                                                             node {
    //                                                               ${StarWarsShip.getFragment('ship')}
    //                                                             }
    //                                                           }
    //                                                         }
    //                                                       }"""))
    //    val container = Relay.createContainer(StarApp.ctor, new RelayContainerConfig {
    //      override var fragments: Dictionary[js.Function] = js.Dictionary("factions" -> afunc)
    //    })
    //
    //    val rc = RelayRootContainer(container, StarWarsRoute(js.Array("empire", "rebels")).route())
    //
    val rc = RelayRootContainer(StarterkitApp.container, StarterkitRoute.route)
    ReactDOM.renderJS(rc, dom.document.getElementById("container"))

    //    ReactDOM.renderJS(AppRouter.router, dom.document.getElementById("container"))
  }

}
