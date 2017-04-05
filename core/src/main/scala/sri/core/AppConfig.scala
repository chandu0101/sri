package sri.core

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@js.native
trait AppConfig extends js.Object {
  def appKey: String = js.native
  def component: UndefOr[js.Function0[ReactClass]] = js.native
  def run: UndefOr[js.Function]
}
