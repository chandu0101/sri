package sri.relay.webexamples.starwars.components

import org.scalajs.dom
import sri.core.React
import sri.relay.RelayElementFactory._
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.relay.query.RelayQL
import sri.relay.{Relay, RelayComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}


object StarWarsShip {


  @ScalaJSDefined
  class Component extends RelayComponent[Props, Unit] {
    def render() = {
      dom.window.console.log(propsDynamic)
      React.createElement("div", null, propsDynamic.ship.name.toString)
    }
  }

  case class Props()

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val container = Relay.createContainer(ctor, new RelayContainerSpec {
    override val fragments = Fragments("ship" -> (() => js.eval(RelayQL( """fragment on Ship { name }"""))))
  })

  def apply(props: js.Dynamic, key: U[String] = js.undefined, ref: js.Function1[Component, _] = null) = React.createElement(container, props)

}
