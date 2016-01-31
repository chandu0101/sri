package sri.mobile.apis

import scala.scalajs.js

@js.native
trait AppState extends js.Object {

  def addEventListener(tpe: String, handler: js.Function1[String, _]): Unit = js.native

  def removeEventListener(tpe: String, handler: js.Function1[String, _]): Unit = js.native

  def currentState: js.UndefOr[String] = js.native
}
