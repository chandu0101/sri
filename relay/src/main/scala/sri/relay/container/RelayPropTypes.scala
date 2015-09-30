package sri.relay.container

import scala.scalajs.js

@js.native
trait RelayPropTypes extends js.Object {
  val Container: (js.Object, String) => js.UndefOr[js.Error] = js.native
  val QueryConfig: () => js.UndefOr[js.Error] = js.native
}


