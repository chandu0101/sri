package sri.relay.webexamples.starwars.components

import sri.relay.RelayElementFactory._
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.relay.query.RelayQL
import sri.relay.{RelayComponentProps, Relay, RelayComponent}
import sri.web.vdom.htmltags._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


object StarWarsApp {

  @ScalaJSDefined
  class Component extends RelayComponent[Props, Unit] {
    def render() = {
      val factions = props.factions.asInstanceOf[js.Array[js.Dynamic]]
      div()(
        factions.map(faction => div()(
          div()(span()(s"${faction.name}")),
          div()(
            faction.ships.edges.asInstanceOf[js.Array[js.Dynamic]].map(edge => div()(StarWarsShip(edge.node)))
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
