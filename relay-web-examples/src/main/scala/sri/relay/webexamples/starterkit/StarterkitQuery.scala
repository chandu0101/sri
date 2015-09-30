package sri.relay.webexamples.starterkit

import sri.relay.container.RootQueries
import sri.relay.query.RelayQL
import sri.relay.route.{Params, RelayQueryConfig}

import scala.scalajs.js.{UndefOr, Dictionary}
import scala.scalajs.js

//
//object StarterkitQuery {
//  val  route = {
//    new RelayQueryConfig {
//      override val queries = RootQueries(("viewer", () => js.eval(RelayQL(
//        """ query { viewer }
//        """))))
//      override val name: String = "AppHomeRoute"
//      override val params = Params()
//    }
//  }
//}
