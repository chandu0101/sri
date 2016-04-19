package sri.relay.mobile.examples

import org.scalajs.dom
import sri.mobile.ReactNative
import sri.relay.Relay
import sri.mobile.all._
import sri.relay.container.RelayRootContainer
import sri.relay.mobile.examples.starwars.components.{StarWarsApp, StarWarsShip}
import sri.relay.mobile.examples.starwars.queries.StarWarsAppHomeQuery
import sri.relay.network.DefaultNetworkLayer

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object RelayMobileApp extends JSApp {


  @JSExport
  override def main(): Unit = {

    Relay.injectNetworkLayer(new DefaultNetworkLayer("http://try-relay.sangria-graphql.org/graphql"))
    js.Dynamic.global.StarWarsShip = StarWarsShip.container
    val rc = RelayRootContainer(StarWarsApp.container, StarWarsAppHomeQuery(js.Array("empire", "rebels")))
    val root = createReactNativeRoot(
      rc
    )

    ReactNative.AppRegistry.registerComponent("SriRelayMobile", () => root)
  }

}

