package sri.mobile.apis.android

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("React.BackAndroid")
object BackAndroid extends js.Object {

  def exitApp() : Unit = js.native

  def addEventListener(eventName: String, handler: js.Function):Unit = js.native

  def removeEventListener(eventName: String, handler: js.Function):Unit = js.native

}


