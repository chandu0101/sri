package sri.mobile.apis

import scala.scalajs.js

@js.native
trait InteractionManager extends js.Object {

  def runAfterInteractions(callback: js.Function): Unit = js.native

  def createInteractionHandle(): Unit = js.native

  def clearInteractionHandle(handle: Int): Unit = js.native

}
