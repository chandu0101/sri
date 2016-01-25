package sri.universal.apis

import org.scalajs.dom.raw.Promise

import scala.scalajs.js


@js.native
trait Clipboard extends js.Object{

  def setString(content : String) : Unit = js.native

  def getString() : Promise[String] = js.native
}
