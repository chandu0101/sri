package sri.relay.route

import scala.scalajs.js

@js.native
object RelayMetaRoute extends js.Object {
  def get(name: String): RelayMetaRoute = js.native
}

/**
 * Meta route based on the real route; provides access to the route name in
 * queries.
 */
@js.native
class RelayMetaRoute(name: String) extends js.Object

