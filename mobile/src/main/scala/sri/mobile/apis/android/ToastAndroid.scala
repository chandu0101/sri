package sri.mobile.apis.android

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait ToastAndroid extends js.Object {

  val SHORT: Int = js.native

  val LONG: Int = js.native

  val TOP: Int = js.native

  val BOTTOM: Int = js.native

  val CENTER: Int = js.native

  def show(message: String, duration: Int): Unit = js.native

  def showWithGravity(message: String, duration: Int, gravity: Int): Unit = js.native

}
