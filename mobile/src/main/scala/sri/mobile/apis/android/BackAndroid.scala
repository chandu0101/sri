package sri.mobile.apis.android

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait BackAndroid extends js.Object {

  def exitApp() : Unit = js.native

  def addEventListener(eventName: String, handler: js.Function):AddEventListenerReturn = js.native

  def removeEventListener(eventName: String, handler: js.Function):Unit = js.native

}

@js.native
trait AddEventListenerReturn extends js.Object{
  val remove : js.Function0[Unit] = js.native
}