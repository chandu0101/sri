package sri.web.components

package nativeweb

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js


case class Text(
                 onPress: U[() => Unit] = undefined,
                 style: U[js.Any] = undefined,
                 accessible: U[Boolean] = undefined,
                 onLayout: U[js.Function] = undefined,
                 component: U[String] = undefined,
                 numberOfLines: U[Int] = undefined,
                 ref: U[TextM => _] = undefined,
                 key: U[String] = undefined,
                 accessibilityLabel: U[String] = undefined,
                 testID: U[String] = undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Text](this)
    React.createElement(ReactNativeWeb.Text, props, children: _*)
  }
}

@js.native
trait TextM extends js.Object