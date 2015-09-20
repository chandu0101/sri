package sri.web.nativeweb

import sri.core.ReactClass

import scala.scalajs.js

@js.native
trait ReactNativeWeb extends js.Object {

  val View : ReactClass = js.native

  val Text : ReactClass = js.native
}

@js.native
object ReactNativeWeb extends ReactNativeWeb