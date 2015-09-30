package sri.web.examples.relay.starterkit

import scala.scalajs.js.{UndefOr => U}

//
//object StarterkitApp {
//
//
//  @ScalaJSDefined
//  class Component extends ReactComponent[Props, Unit] {
//    def render() = {
//      println(s"props dynamic ${propsDynamic.viewer}")
//      React.createElement("div", null, s"hello relay starter kit reposne from server : ${JSON.stringify(propsDynamic.viewer)}")
//    }
//  }
//
//
//  val frag: js.Function = () => js.eval(RelayQL(
//    """
//      fragment on User {
//              widgets(first: 10) {
//                edges {
//                  node {
//                    id,
//                    name,
//                  },
//                },
//              },
//            }
//    """))
//  val container = Relay.createContainer(getTypedConstructor(js.constructorOf[Component],classOf[Component]),new RelayContainerConfig {
//    override var fragments: Dictionary[js.Function] = js.Dictionary("viewer" -> frag)
//  })
//
//  case class Props()
//
//}
