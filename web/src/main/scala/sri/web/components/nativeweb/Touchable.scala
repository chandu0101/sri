package sri.web.components
package nativeweb

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.NEvent

import scala.scalajs.js

case class Touchable(
                      ref: U[TouchableM => _] = undefined,
                      key: U[String] = undefined,
                      style: U[js.Any] = undefined,
                      accessibilityLabel: U[String] = undefined,
                      accessibilityRole: U[String] = undefined,
                      accessible: U[Boolean] = undefined,
                      activeOpacity: U[Double] = undefined,
                      activeUnderlayColor: U[String] = undefined,
                      delayLongPress: U[Int] = undefined,
                      delayPressIn: U[Int] = undefined,
                      delayPressOut: U[Int] = undefined,
                      onLayout: U[() => _] = undefined,
                      onLongPress: U[NEvent => _] = undefined,
                      onPress: U[NEvent => _] = undefined,
                      onPressIn: U[NEvent => _] = undefined,
                      onPressOut: U[NEvent => _] = undefined
                      ) {

  def apply(children: ReactNode) = {
    val props = JSMacro[Touchable](this)
    React.createElement(ReactNativeWeb.TouchableOpacity, props, children)
  }

}

@js.native
trait TouchableM extends js.Object