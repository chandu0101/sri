package sri.relay.webexamples.starterkit

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr => U}


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
//  val frag: Fragment = () => js.eval(RelayQL(
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
//  val container = Relay.createContainer(getTypedConstructor(js.constructorOf[Component], classOf[Component]), new RelayContainerSpec {
//    override val fragments = Fragments("viewer" -> frag)
//  })
//
//  case class Props()
//
//}
