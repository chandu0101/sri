package sri.mobile.apis.ios

import scala.scalajs.js

@js.native
@deprecated("AppStateIOS deprecated use AppState instead")
trait AppStateIOS extends js.Object {

  def addEventListener(tpe: String, handler: js.Function1[String, _]): Unit = js.native

  def removeEventListener(tpe: String, handler: js.Function1[String, _]): Unit = js.native

  def currentState: js.UndefOr[String] = js.native
}
