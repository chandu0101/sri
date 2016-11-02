package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.universal.ReactUniversal

import scala.scalajs.js

case class TouchableWithoutFeedback(onPressIn: js.UndefOr[() => _] = js.undefined,
                                    onPress: js.UndefOr[() => _] = js.undefined,
                                    style: js.UndefOr[js.Any] = js.undefined,
                                    delayPressIn: js.UndefOr[Int] = js.undefined,
                                    ref: js.UndefOr[TouchableWithoutFeedbackM => _] = js.undefined,
                                    onPressOut: js.UndefOr[() => _] = js.undefined,
                                    accessibilityLabel: js.UndefOr[String] = js.undefined,
                                    accessibilityTraits: js.UndefOr[String] = js.undefined,
                                    accessibilityComponentType: js.UndefOr[String] = js.undefined,
                                    key: js.UndefOr[String] = js.undefined,
                                    disabled: js.UndefOr[Boolean] = js.undefined,
                                    shouldBlockResponder: js.UndefOr[Boolean] = js.undefined,
                                    onLongPress: js.UndefOr[() => _] = js.undefined,
                                    delayPressOut: js.UndefOr[Int] = js.undefined,
                                    delayLongPress: js.UndefOr[Int] = js.undefined,
                                    accessible: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[TouchableWithoutFeedback](this)
    React.createElement(ReactUniversal.TouchableWithoutFeedback,props,children : _*)
  }
}

@js.native
trait TouchableWithoutFeedbackM extends js.Object