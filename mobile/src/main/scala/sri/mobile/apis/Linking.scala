package sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.Promise

@js.native
trait Linking extends js.Object {

  def addEventListener(tpe: String, handler: js.Function): Unit = js.native

  def removeEventListener(tpe: String, handler: js.Function): Unit = js.native

  def openURL(url: String): Promise[Boolean] = js.native

  def getInitialURL(): Promise[String] = js.native

  def canOpenURL(url: String): Promise[Boolean] = js.native

}
