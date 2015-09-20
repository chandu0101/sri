package sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import sri.core.ReactNode
import sri.mobile.ReactNative

import scala.scalajs.js

case class TouchableWithoutFeedback(onPressIn: js.UndefOr[() => Unit] = js.undefined,
                                    onPress: js.UndefOr[() => Unit] = js.undefined,
                                    style: js.UndefOr[js.Any] = js.undefined,
                                    delayPressIn: js.UndefOr[Int] = js.undefined,
                                    ref: js.UndefOr[TouchableWithoutFeedbackM => _] = js.undefined,
                                    onPressOut: js.UndefOr[() => Unit] = js.undefined,
                                    key: js.UndefOr[String] = js.undefined,
                                    onLongPress: js.UndefOr[() => Unit] = js.undefined,
                                    delayPressOut: js.UndefOr[Int] = js.undefined,
                                    delayLongPress: js.UndefOr[Int] = js.undefined,
                                    accessible: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[TouchableWithoutFeedback](this)
    ReactNative.createElement(ReactNative.TouchableWithoutFeedback,props,children : _*)
  }
}

@js.native
trait TouchableWithoutFeedbackM extends js.Object