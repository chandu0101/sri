package sri.universal.apis


import scala.scalajs.js
import scala.scalajs.js.Promise


@js.native
trait Clipboard extends js.Object {

  def setString(content: String): Unit = js.native

  def getString(): Promise[String] = js.native
}
