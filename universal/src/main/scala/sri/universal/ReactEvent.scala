package sri.universal

import scala.scalajs.js

@js.native
trait ReactEvent[T <: js.Object] extends js.Object{

  val nativeEvent: T = js.native
}

@js.native
trait TextInputEvent extends js.Object {

  val text : String = js.native
}