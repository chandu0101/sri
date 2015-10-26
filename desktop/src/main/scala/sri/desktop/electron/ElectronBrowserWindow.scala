package sri.desktop.electron

import scala.scalajs.js

@js.native
class ElectronBrowserWindow(options : js.Object) extends js.Object{

  def on(event : String,callback : js.Function): Unit = js.native

  def openDevTools() : Unit = js.native

  def loadUrl(url : String): Unit = js.native
}
