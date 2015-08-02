package chandu0101.scalajs.sri.mobile.apis

import scala.scalajs.js

trait ActionSheetIOS extends js.Object {

  def showActionSheetWithOptions(options: js.Object, callback: js.Function): Unit = js.native

  def showShareActionSheetWithOptions(options: js.Object, failureCallback: js.Function, successCallback: js.Function): Unit = js.native

}
