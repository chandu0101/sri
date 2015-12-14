package sri.mobile.components

import sri.core.{React, ReactNode}
import sri.mobile._

import scala.scalajs.js


case class TouchableNativeFeedback(key: U[String] = undefined,
                                   style: U[js.Any] = undefined,
                                   ref: U[TouchableNativeFeedbackM => _] = undefined,
                                   onPressIn: U[() => Unit] = undefined,
                                   onPress: U[() => Unit] = undefined,
                                   delayPressIn: U[Int] = undefined,
                                   onPressOut: U[() => Unit] = undefined,
                                   onLongPress: U[() => Unit] = undefined,
                                   delayPressOut: U[Int] = undefined,
                                   delayLongPress: U[Int] = undefined,
                                   accessible: U[Boolean] = undefined,
                                   background: U[NativeFeedbackBackgroundType] = undefined) {

  def apply(children: ReactNode) = {
    val props = JSMacro[TouchableNativeFeedback](this)
    React.createElement(ReactNative.TouchableNativeFeedback,props,children)
  }


}

object TouchableNativeFeedbackS {

  def SelectableBackground(): NativeFeedbackBackgroundType = ReactNative.TouchableNativeFeedback.asInstanceOf[js.Dynamic].SelectableBackground().asInstanceOf[NativeFeedbackBackgroundType]

  def SelectableBackgroundBorderless(): NativeFeedbackBackgroundType = ReactNative.TouchableNativeFeedback.asInstanceOf[js.Dynamic].SelectableBackgroundBorderless().asInstanceOf[NativeFeedbackBackgroundType]

  def Ripple(color: String, borderless: Boolean): NativeFeedbackBackgroundType = ReactNative.TouchableNativeFeedback.asInstanceOf[js.Dynamic].Ripple(color, borderless).asInstanceOf[NativeFeedbackBackgroundType]

}

@js.native
trait TouchableNativeFeedbackM extends js.Object


@js.native
trait NativeFeedbackBackgroundType extends js.Object