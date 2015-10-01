package sri.web.components
package nativeweb

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.NEvent

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}


case class View(
                 onStartShouldSetResponder: U[js.Function] = undefined,
                 style: U[js.Any] = undefined,
                 onLayout: U[js.Function] = undefined,
                 accessibilityLabel: U[String] = undefined,
                 ref: U[ViewM => _] = undefined,
                 key: U[String] = undefined,
                 onAcccessibilityTap: U[js.Function] = undefined,
                 collapsible: U[Boolean] = undefined,
                 accessibilityRole: U[String] = undefined,
                 testID: U[String] = undefined,
                 component: U[String] = undefined,
                 onClick: U[NEvent => _] = undefined,
                 pointerEvents: U[PointerEvents] = undefined,
                 accessible: U[Boolean] = undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[View](this)
    React.createElement(ReactNativeWeb.View, props, children: _*)
  }
}


class PointerEvents private(val value: String) extends AnyVal


object PointerEvents {

  val BOX_NONE = new PointerEvents("box-none")
  val BOX_ONLY = new PointerEvents("box-only")
  val NONE = new PointerEvents("none")
  val AUTO = new PointerEvents("auto")
}

@js.native
trait ViewM extends js.Object