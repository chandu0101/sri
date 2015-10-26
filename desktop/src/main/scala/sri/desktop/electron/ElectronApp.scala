package sri.desktop.electron

import scala.scalajs.js

@js.native
trait ElectronApp extends js.Object {

  def on(event: String, callback: js.Function): Unit = js.native

  def quit(): Unit = js.native

  def getAppPath(): String = js.native

  def getPath(name: String): String = js.native

  def getVersion(): String = js.native

  def getName(): String = js.native

}

@js.native
object ElectronApp extends ElectronApp
