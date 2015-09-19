package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.{ReactElement, ReactNode}
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav


case class Modal(visible: js.UndefOr[Boolean] = js.undefined,
                 animated: js.UndefOr[Boolean] = js.undefined,
                 style: js.UndefOr[js.Any] = js.undefined,
                 ref: js.UndefOr[ModalM => _] = js.undefined,
                 key: js.UndefOr[String] = js.undefined,
                 transparent: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Modal](this)
    val f = ReactNative.createFactory(ReactNative.Modal)
    f(props, children: _*).asInstanceOf[ReactElement]
  }
}

//mounted Modal methods/vars
@js.native
trait ModalM extends js.Object