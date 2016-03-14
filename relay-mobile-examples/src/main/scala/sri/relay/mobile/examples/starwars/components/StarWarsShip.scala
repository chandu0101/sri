package sri.relay.mobile.examples.starwars.components

import sri.core.React
import sri.relay.RelayElementFactory._
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.relay.query.RelayQL
import sri.relay.{RelayComponentProps, Relay, RelayComponent}
import sri.universal.components.{Text, View}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}


object StarWarsShip {


  @ScalaJSDefined
  class Component extends RelayComponent[Props, Unit] {
    def render() = {
      val ship = props.ship
      View()(Text()(ship.name.toString))
    }
  }

  @ScalaJSDefined
  trait Props extends RelayComponentProps {
    val ship : js.Dynamic
  }
  val ctor = getRelayTypedConstructor(js.constructorOf[Component], classOf[Component])

  val container = Relay.createContainer(ctor, new RelayContainerSpec {
    override val fragments = Fragments("ship" -> (() => js.eval(RelayQL( """fragment on Ship { name }"""))))
  })

  def apply(shipi: js.Dynamic, key: U[String] = js.undefined, ref: js.Function1[Component, _] = null) = createRelayElement(container,new Props {
    override val ship: js.Dynamic = shipi
  })

}
