package sri.web.examples.relay.starwars.components

//object StarWarsApp {
//
//  @ScalaJSDefined
//  class Component extends ReactComponent[Props, Unit] {
//    def render() = dom.div(null, s"out here : ${JSON.stringify(propsDynamic.factions)}")
//  }
//
//  case class Props()
//
//  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])
//
//  val container = Relay.createContainer(ctor, new RelayContainerConfig {
//    override var fragments: Dictionary[js.Function] = Dictionary("factions" -> (() => js.eval(RelayQL(
//      """
//        fragment on Faction @relay(plural: true) {
//                name,
//                ships(first: 10) {
//                  edges {
//                    node {
//                      ${StarWarsShip.getFragment('ship')}
//                    }
//                  }
//                }
//              }
//      """))))
//  })
//
//  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])
//
//  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElement(factory, null, key = key, ref = ref)
//
//}
