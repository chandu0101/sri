package chandu0101.scalajs.sri.web.nativeweb

import chandu0101.scalajs.sri.core.ReactClass

import scala.scalajs.js

@js.native
trait ReactNativeWeb extends js.Object {

  val View : ReactClass = js.native

  val Text : ReactClass = js.native
}

@js.native
object ReactNativeWeb extends ReactNativeWeb