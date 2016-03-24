package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement}
import sri.universal.ReactUniversal

import scala.scalajs.js

case class TouchableOpacity(onPressIn: js.UndefOr[() => _] = js.undefined,
                            onPress: js.UndefOr[() => _] = js.undefined,
                            style: js.UndefOr[js.Any] = js.undefined,
                            delayPressIn: js.UndefOr[Int] = js.undefined,
                            ref: js.UndefOr[TouchableOpacityM => _] = js.undefined,
                            onPressOut: js.UndefOr[() => _] = js.undefined,
                            key: js.UndefOr[String] = js.undefined,
                            accessibilityLabel: js.UndefOr[String] = js.undefined,
                            accessibilityTraits: js.UndefOr[String] = js.undefined,
                            accessibilityComponentType: js.UndefOr[String] = js.undefined,
                            onLongPress: js.UndefOr[() => _] = js.undefined,
                            delayPressOut: js.UndefOr[Int] = js.undefined,
                            delayLongPress: js.UndefOr[Int] = js.undefined,
                            disabled: js.UndefOr[Boolean] = js.undefined,
                            activeOpacity: js.UndefOr[Double] = js.undefined,
                            accessible: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactElement) = {
    val props = JSMacro[TouchableOpacity](this)
    React.createElement(ReactUniversal.TouchableOpacity,props,children)
  }
}

@js.native
trait TouchableOpacityM extends js.Object