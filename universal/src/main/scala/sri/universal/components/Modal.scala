package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.universal.ReactUniversal

import scala.scalajs.js


case class Modal(visible: js.UndefOr[Boolean] = js.undefined,
                 style: js.UndefOr[js.Any] = js.undefined,
                 animationType: js.UndefOr[ModalAnimationType] = js.undefined,
                 onDismiss: js.UndefOr[() => _] = js.undefined,
                 ref: js.UndefOr[ModalM => _] = js.undefined,
                 key: js.UndefOr[String] = js.undefined,
                 transparent: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Modal](this)
    React.createElement(ReactUniversal.Modal,props,children: _*)
  }
}

//mounted Modal methods/vars
@js.native
trait ModalM extends js.Object

class ModalAnimationType private(val value : String) extends AnyVal

object ModalAnimationType {

  val SLIDE = new ModalAnimationType("slide")
  val FADE = new ModalAnimationType("fade")
  val NONE = new ModalAnimationType("none")

}