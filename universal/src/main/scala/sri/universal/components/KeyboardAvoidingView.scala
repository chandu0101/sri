package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.universal.apis.LayoutEvent
import sri.universal.ReactUniversal

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.annotation.ScalaJSDefined


case class KeyboardAvoidingView(onResponderReject: js.UndefOr[js.Function] = js.undefined,
                                renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
                                onStartShouldSetResponder: js.UndefOr[js.Function] = js.undefined,
                                onResponderRelease: js.UndefOr[js.Function] = js.undefined,
                                onMagicTap: js.UndefOr[js.Function] = js.undefined,
                                onResponderMove: js.UndefOr[js.Function] = js.undefined,
                                style: js.UndefOr[js.Any] = js.undefined,
                                contentContainerStyle: js.UndefOr[js.Any] = js.undefined,
                                collapsable: js.UndefOr[Boolean] = js.undefined,
                                keyboardVerticalOffset: js.UndefOr[Double] = js.undefined,
                                shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
                                onLayout: js.UndefOr[LayoutEvent => _] = js.undefined,
                                behavior: js.UndefOr[KeyboardAvoidingViewBehaviour] = js.undefined,
                                onAccessibilityTap: js.UndefOr[() => _] = js.undefined,
                                accessibilityLabel: js.UndefOr[String] = js.undefined,
                                AccessibilityComponentType: js.UndefOr[js.Any] = js.undefined,
                                onMoveShouldSetResponder: js.UndefOr[js.Function] = js.undefined,
                                removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
                                ref: js.UndefOr[KeyboardAvoidingViewM => _] = js.undefined,
                                accessibilityTraits: js.UndefOr[Seq[AccessibilityTraits]] = js.undefined,
                                onAcccessibilityTap: js.UndefOr[js.Function] = js.undefined,
                                collapsible: js.UndefOr[Boolean] = js.undefined,
                                needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
                                key: js.UndefOr[String] = js.undefined,
                                onResponderTerminationRequest: js.UndefOr[js.Function] = js.undefined,
                                testID: js.UndefOr[String] = js.undefined,
                                pointerEvents: js.UndefOr[PointerEvents] = js.undefined,
                                onResponderTerminate: js.UndefOr[js.Function] = js.undefined,
                                onStartShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined,
                                onResponderGrant: js.UndefOr[js.Function] = js.undefined,
                                importantForAccessibility: js.UndefOr[ImportantForAccessibility] = js.undefined,
                                accessible: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[KeyboardAvoidingView](this)
    React.createElement(ReactUniversal.KeyboardAvoidingView, props, children: _*)
  }
}

class KeyboardAvoidingViewBehaviour private(val value: String) extends AnyVal

object KeyboardAvoidingViewBehaviour {

  val HEIGHT = new KeyboardAvoidingViewBehaviour("height")

  val POSITION = new KeyboardAvoidingViewBehaviour("position")

  val PADDING = new KeyboardAvoidingViewBehaviour("padding")

}

@ScalaJSDefined
trait ScreenRect extends js.Object {
  var screenX: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
}

@ScalaJSDefined
trait  KeyboardChangeEvent extends js.Object {

  var startCoordinates: js.UndefOr[ScreenRect] = js.undefined

  var endCoordinates: ScreenRect

  var duration: js.UndefOr[Double] = js.undefined

  var easing: js.UndefOr[String] = js.undefined

}

@js.native
trait KeyboardAvoidingViewM extends js.Object {

  def relativeKeyboardHeight(keyboardFrame: ScreenRect): Double = js.native

  def onKeyboardChange(event: KeyboardChangeEvent = ???): Unit = js.native

  def onLayout(event : LayoutEvent): Unit = js.native
}