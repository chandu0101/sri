package sri.mobile.apis.android

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait ToastAndroid extends js.Object {

  val SHORT: Int = js.native

  val LONG: Int = js.native

  def show(message: String, duration: Int): Unit = js.native

}
