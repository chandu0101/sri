package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js

case class TouchableOpacity(onPressIn: js.UndefOr[() => Unit] = js.undefined,
                            onPress: js.UndefOr[() => Unit] = js.undefined,
                            style: js.UndefOr[js.Any] = js.undefined,
                            delayPressIn: js.UndefOr[Int] = js.undefined,
                            ref: js.UndefOr[TouchableOpacityM => _] = js.undefined,
                            onPressOut: js.UndefOr[() => Unit] = js.undefined,
                            key: js.UndefOr[String] = js.undefined,
                            onLongPress: js.UndefOr[() => Unit] = js.undefined,
                            delayPressOut: js.UndefOr[Int] = js.undefined,
                            delayLongPress: js.UndefOr[Int] = js.undefined,
                            activeOpacity: js.UndefOr[Int] = js.undefined,
                            accessible: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactElement) = {
    val props = JSMacro[TouchableOpacity](this)
    ReactNative.createElement(ReactNative.TouchableOpacity,props,children)
  }
}

@js.native
trait TouchableOpacityM extends js.Object