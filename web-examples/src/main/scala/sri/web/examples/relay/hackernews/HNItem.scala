package sri.web.examples.relay.hackernews

import scala.scalajs.js.{UndefOr => U}


//object HNItem {
//
//
//  @ScalaJSDefined
//  class Component extends ReactComponent[Props, Unit] {
//    def render() = dom.div(null, s"rn store ${JSON.stringify(propsDynamic.store.item)}")
//  }
//
//  case class Props()
//
//  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])
//
//  val container = Relay.createContainer(ctor, new RelayContainerConfig {
//    override var fragments: Dictionary[js.Function] = Dictionary("store" -> (() => js.eval(RelayQL(
//      """
//          fragment on HackerNewsAPI {
//                item(id: 8863) {
//                  title,
//                  score,
//                  url
//                  by {
//                    id
//                  }
//                }
//              }
//      """))))
//  })
//
//
//  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])
//
//  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElement(factory, null, key = key, ref = ref)
//
//}
