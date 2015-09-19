package chandu0101.scalajs.sri.web.nativeweb

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.{ReactNode, React, ReactElement}

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.{UndefOr => U}

case class View( style : U[js.Any] = js.undefined,
                 accessibilityLabel : U[String] = js.undefined,
                component:U[String] = js.undefined,
                pointerEvents:U[PointerEvents] = js.undefined,
                 testID : U[String] = js.undefined) {

  def apply(children : ReactNode*) = {
    val props = JSMacro[View](this)
//    val c = children.toSeq
    React.createElement(ReactNativeWeb.View,props,children: _*)
//    val f = React.createFactory(ReactNativeWeb.View)
//    f(props, children: _*).asInstanceOf[ReactElement]
  }


}


class PointerEvents private(val value: String) extends AnyVal

object PointerEvents {

  val AUTO = new PointerEvents("auto")
  val BOX_ONE = new PointerEvents("box-none")
  val BOX_ONLY = new PointerEvents("box-only")
  val NONE = new PointerEvents("none")

}
