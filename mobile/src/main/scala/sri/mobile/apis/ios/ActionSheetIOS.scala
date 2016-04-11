package sri.mobile.apis.ios

import scala.scalajs.js

@js.native
trait ActionSheetIOS extends js.Object {

  def showActionSheetWithOptions(options: js.Object, callback: js.Function): Unit = js.native

  def showShareActionSheetWithOptions(options: js.Object, failureCallback: js.Function, successCallback: js.Function): Unit = js.native

}
