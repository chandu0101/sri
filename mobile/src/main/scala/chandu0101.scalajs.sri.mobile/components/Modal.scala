package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.{ReactElement, ReactNode}
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav


case class Modal(visible: js.UndefOr[Boolean] = js.undefined,
                 animated: js.UndefOr[Boolean] = js.undefined,
                 style: js.UndefOr[js.Any] = js.undefined,
                 ref: js.UndefOr[js.Function1[ModalM,_]] = js.undefined,
                 key: js.UndefOr[String] = js.undefined,
                 transparent: js.UndefOr[Boolean] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    visible.foreach(v => p.updateDynamic("visible")(v))
    animated.foreach(v => p.updateDynamic("animated")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    transparent.foreach(v => p.updateDynamic("transparent")(v))
    p
  }

  def apply(children: ReactNode*) = {
    val f = ReactNative.createFactory(ReactNative.Modal)
    f(toJS, children.toJSArray).asInstanceOf[ReactElement]
  }
}

//mounted Modal methods/vars
@js.native
trait ModalM extends js.Object