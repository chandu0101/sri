package chandu0101.scalajs.sri.web

import chandu0101.scalajs.sri.core.React


package object dom {


  val div = React.createFactory("div")

  val img = React.createFactory("img")


  class PointerEvent private(val event: String) extends AnyVal

  object PointerEvent {

    val AUTO = new PointerEvent("auto")
    val BOX_ONE = new PointerEvent("box-none")
    val BOX_ONLY = new PointerEvent("box-only")
    val NONE = new PointerEvent("none")

  }

}
