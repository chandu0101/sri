package sri.web.examples.relay.hackernews

import scala.scalajs.js.Dynamic.{literal => json}

//object HNQuery {
//
//  val qfunc: js.Function = () => js.eval(RelayQL(
//    """
//       query root {
//              hn { ${Component.getFragment('store')} },
//            }
//    """))
//
//  def apply() = new RelayQueryConfig {
//    override val queries: Dictionary[Any] = Dictionary("store" -> qfunc)
//    override val name: String = "HackerNewsRoute"
//    override val params: UndefOr[Object] = json()
//  }
//}
