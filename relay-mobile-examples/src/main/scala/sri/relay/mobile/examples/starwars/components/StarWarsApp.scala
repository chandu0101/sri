package sri.relay.mobile.examples.starwars.components

import sri.relay.RelayElementFactory._
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.relay.query.RelayQL
import sri.relay.{RelayComponentProps, Relay, RelayComponent}
import sri.universal.components.{Text, View}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}


object StarWarsApp {

  @ScalaJSDefined
  class Component extends RelayComponent[Props, Unit] {
    def render() = {
      println(s"rendering app $props")
      val factions = props.factions.asInstanceOf[js.Array[js.Dynamic]]
      View()(
        factions.map(faction => View()(
          View()(Text()(s"${faction.name}")),
          View()(
            faction.ships.edges.asInstanceOf[js.Array[js.Dynamic]].map(edge => View()(StarWarsShip(edge.node)))
          )
        ))
      )
    }

  }


  @ScalaJSDefined
  trait  Props extends RelayComponentProps {
    val factions : js.Dynamic
  }


  val ctor = getRelayTypedConstructor(js.constructorOf[Component], classOf[Component])

  val container = Relay.createContainer(ctor, new RelayContainerSpec {

    override val fragments = Fragments("factions" -> (() => js.eval(RelayQL(
      """
        fragment on Faction @relay(plural: true) {
                name,
                ships(first: 3) {
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
