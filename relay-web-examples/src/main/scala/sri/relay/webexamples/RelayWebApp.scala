package sri.relay.webexamples

import org.scalajs.dom
import sri.relay.Relay
import sri.web.all._
import sri.web.vdom.htmltags._
import sri.relay.container.RelayRootContainer
import sri.relay.network.DefaultNetworkLayer
import sri.relay.webexamples.starwars.components.{StarWarsApp, StarWarsShip}
import sri.relay.webexamples.starwars.queries.StarWarsAppHomeQuery
import sri.web.{ReactNativeWeb, ReactDOM}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object RelayWebApp extends JSApp {

  @JSExport
  override def main(): Unit = {

    Relay.injectNetworkLayer(new DefaultNetworkLayer("http://try-relay.sangria-graphql.org/graphql"))
    js.Dynamic.global.StarWarsShip = StarWarsShip.container
    val rc = RelayRootContainer(StarWarsApp.container, StarWarsAppHomeQuery(js.Array("empire", "rebels")),renderLoading = () => div()("Loading .."))
    ReactDOM.render(rc, dom.document.getElementById("react-root"))

  }

}

