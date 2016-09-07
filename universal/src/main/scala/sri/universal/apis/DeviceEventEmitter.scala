package sri.universal.apis

import sri.core.ReactClass

import scala.scalajs.js

@js.native
trait DeviceEventEmitter extends js.Object {

  def removeListener(eventType : String,listener : js.Function): Unit = js.native

  def emit(eventType : String): Unit = js.native


}
