package sri.relay.webexamples.starwars.components

import org.scalajs.dom
import sri.core.React
import sri.relay.RelayElementFactory._
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.relay.query.RelayQL
import sri.relay.{Relay, RelayComponent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.{JSON, UndefOr => U}


object StarWarsApp {

  @ScalaJSDefined
  class Component extends RelayComponent[Props, Unit] {
    def render() = {
      val factions = propsDynamic.factions.asInstanceOf[js.Array[js.Dynamic]]
      val edges = factions.head.ships.edges.asInstanceOf[js.Array[js.Dynamic]]
      println(s"edges count : ${edges.length}")
      dom.window.console.log(edges.head.node)
      null
//      React.createElement("div", json(onClick = increaseLimit _), s"out here : ${JSON.stringify(factions.head)}", StarWarsShip(props = json(ship = edges.head.node)))
    }

    def increaseLimit() = {
      println(s"incrementing babae")
      relay.setVariables(js.Dictionary("limit" -> 2))
    }


    override def componentDidMount(): Unit = {
      println(s"app mounted")
    }

    @JSName("sComponentWillReceiveProps")
    override def componentWillReceiveProps(nextProps: => Props): Unit = {
      println(s"receiving props babe")
      super.componentWillReceiveProps(nextProps)
    }
  }


  case class Props()

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

//  val container = Relay.createContainer(ctor, new RelayContainerSpec {
//
//    override val initialVariables : js.UndefOr[js.Object] = json(limit = 1)
//
//    override val fragments = Fragments("factions" -> (() => js.eval(RelayQL(
//      """
//        fragment on Faction @relay(plural: true) {
//                name,
//                ships(first: $limit) {
//                  edges {
//                    node {
//                      ${StarWarsShip.getFragment('ship')}
//                    }
//                  }
//                }
//              }
//      """))))
//  })


}
