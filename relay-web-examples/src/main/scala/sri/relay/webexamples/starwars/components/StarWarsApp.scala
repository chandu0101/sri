package sri.relay.webexamples.starwars.components

import org.scalajs.dom
import sri.core.React
import sri.relay.RelayElementFactory._
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.relay.query.RelayQL
import sri.relay.{Relay, RelayComponent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, UndefOr => U}


object StarWarsApp {

  @ScalaJSDefined
  class Component extends RelayComponent[Props, Unit] {
    def render() = {
      val factions = propsDynamic.factions.asInstanceOf[js.Array[js.Dynamic]]
      val edges = factions.head.ships.edges.asInstanceOf[js.Array[js.Dynamic]]
      dom.window.console.log(edges.head.node)
      React.createElement("div", null, s"out here : ${JSON.stringify(factions.head)}", StarWarsShip(props = json(ship = edges.head.node)))
    }
  }


  case class Props()

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val container = Relay.createContainer(ctor, new RelayContainerSpec {
    override val fragments = Fragments("factions" -> (() => js.eval(RelayQL(
      """
        fragment on Faction @relay(plural: true) {
                name,
                ships(first: 10) {
                  edges {
                    node {
                      ${StarWarsShip.getFragment('ship')}
                    }
                  }
                }
              }
      """))))
  })


}
