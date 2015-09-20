package sri.web.examples.starterkit

import sri.relay.{RelayQL, RelayQueryConfig}

import scala.scalajs.js
import scala.scalajs.js.{Dictionary, Object, UndefOr}

object StarterkitRoute {
  val  route = {
    new RelayQueryConfig {
      override val queries: Dictionary[js.Any] = js.Dictionary(("viewer", () => js.eval(RelayQL(
        """ query { viewer }
        """))))
      override val name: String = "AppHomeRoute"
      override val params: UndefOr[Object] = js.Dictionary().asInstanceOf[js.Object]
    }
  }
}
