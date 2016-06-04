package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait ReactPlatForm extends js.Object {
  val OS: String = js.native
  val Version: Double = js.native
  def select(obj : PlatformSelect) : js.Object = js.native
}

@ScalaJSDefined
class PlatformSelect(val ios : js.Object,val android : js.Object) extends js.Object