package sri.mobile.apis.android

import scala.scalajs.js

@js.native
trait IntentAndroid extends js.Object {

  def openURL(url: String): Unit = js.native

  def canOpenURL(url: String, callback: js.Function): Unit = js.native

}
