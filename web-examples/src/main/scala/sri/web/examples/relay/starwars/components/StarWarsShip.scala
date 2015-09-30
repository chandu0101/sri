package sri.web.examples.relay.starwars.components

import scala.scalajs.js.{UndefOr => U}


//object StarWarsShip {
//
//
//  @ScalaJSDefined
//  class Component extends ReactComponent[Props, Unit] {
//    def render() = div(null,propsDynamic.ship.name.toString)
//  }
//
//  case class Props()
//
//  val ctor = getTypedConstructor(js.constructorOf[Component],classOf[Component])
//
//  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])
//
//
//  val container = Relay.createContainer(ctor,new RelayContainerConfig {
//    override var fragments: Dictionary[js.Function] = Dictionary("ship" -> (() => js.eval(RelayQL("""fragment on Ship { name }"""))))
//  })
//
//  def apply(key: U[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElement(factory, null, key = key, ref = ref)
//
//
//}
