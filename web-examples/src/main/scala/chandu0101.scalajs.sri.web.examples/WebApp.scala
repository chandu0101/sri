package chandu0101.scalajs.sri.web.examples

import chandu0101.scalajs.sri.relay._
import chandu0101.scalajs.sri.web.ReactDOM
import chandu0101.scalajs.sri.web.examples.starterkit.{StarterkitApp, StarterkitRoute}
import org.scalajs.dom

import scala.scalajs.js.Dynamic.{global => g, literal => json}
import scala.scalajs.js._
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

//
//case class StarWarsRoute(factionNames: js.Array[String]) {
//  def route() = {
//    val p = JSMacro[StarWarsRoute](this)
//    new RelayQueryConfig {
//      override val queries: Dictionary[js.Any] = js.Dictionary(("factions", () => js.eval(RelayQL(
//        """ query { factions(names: $factionNames) }
//        """))))
//      override val name: String = "StarWarsAppHomeRoute"
//      override val params: UndefOr[Object] = p
//    }
//  }
//}
//
//object Ship {
//
//  @ScalaJSDefined
//  class StarWarsShip extends ReactComponent[Unit, Unit] {
//    override def render(): ReactElement = {
//      println(s"ship : ${JSON.stringify(propsDynamic.ship)} ")
//      React.createElement("div",null,
//        React.createElement("div",null, s"Man ships ${propsDynamic.ship.name}")
//      )
//    }
//  }
//
//  val ctor = getTypedConstructor(js.constructorOf[StarWarsShip], classOf[StarWarsShip])
//
//  val sfunc: js.Function = () => js.eval(RelayQL( """fragment on Ship {name }"""))
//
//  val StarWarsShip = Relay.createContainer(ctor, new RelayContainerConfig {
//    override var fragments: Dictionary[js.Function] = js.Dictionary("ship" -> sfunc)
//  })
//
//  val cfactory = React.createFactory(StarWarsShip)
//
//    def apply(ship : js.Dynamic) = cfactory(js.Dictionary("ship" -> ship)).asInstanceOf[ReactElement]
////  def apply(ship: js.Dynamic) = React.createElement(StarWarsShip, js.Dictionary("ship" -> ship))
//}
//
//
//object StarApp {
//
//  @ScalaJSDefined
//  class StarWarsApp extends ReactComponent[Unit, Unit] {
//    override def render(): ReactElement = {
//      val factions = propsDynamic.factions.asInstanceOf[js.Array[js.Dynamic]]
//      println(s"factions ${JSON.stringify(factions)}")
//      val ships = factions.head.ships.edges.asInstanceOf[js.Array[js.Dynamic]]
//      React.createElement("div",null,ships.map(s => Ship(s.node))
//      )
//    }
//  }
//
//
//  val ctor = getTypedConstructor(js.constructorOf[StarWarsApp], classOf[StarWarsApp])
//
//}
//
