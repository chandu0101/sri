package sri.relay.webexamples.starwars.components

import sri.relay.RelayElementFactory._
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.relay.query.RelayQL
import sri.relay.{Relay, RelayComponent, RelayComponentProps}
import sri.web.vdom.htmltags._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}


object StarWarsShip {

  @ScalaJSDefined
  class Component extends RelayComponent[Props, Unit] {
    def render() = {
      val ship = props.ship
      div()(span()(ship.name.toString))
    }
  }

  @ScalaJSDefined
  class Props(val ship : js.Dynamic) extends RelayComponentProps

  val ctor = getRelayTypedConstructor(js.constructorOf[Component], classOf[Component])

  val container = Relay.createContainer(ctor, new RelayContainerSpec {
    override val fragments = Fragments("ship" -> (() => js.eval(RelayQL( """fragment on Ship { name }"""))))
  })

  def apply(ship: js.Dynamic, key: U[String] = js.undefined, ref: js.Function1[Component, _] = null) = createRelayElement(container,new Props(ship))

}
