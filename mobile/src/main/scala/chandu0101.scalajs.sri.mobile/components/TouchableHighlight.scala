package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js


case class TouchableHighlight(onPressIn: js.UndefOr[() => Unit] = js.undefined,
                              onPress: js.UndefOr[() => Unit] = js.undefined,
                              style: js.UndefOr[js.Any] = js.undefined,
                              delayPressIn: js.UndefOr[Int] = js.undefined,
                              onHideUnderlay: js.UndefOr[() => Unit] = js.undefined,
                              ref: js.UndefOr[TouchableHighlightM => _] = js.undefined,
                              onPressOut: js.UndefOr[() => Unit] = js.undefined,
                              key: js.UndefOr[String] = js.undefined,
                              onLongPress: js.UndefOr[() => Unit] = js.undefined,
                              underlayColor: js.UndefOr[String] = js.undefined,
                              delayPressOut: js.UndefOr[Int] = js.undefined,
                              delayLongPress: js.UndefOr[Int] = js.undefined,
                              onShowUnderlay: js.UndefOr[() => Unit] = js.undefined,
                              activeOpacity: js.UndefOr[Int] = js.undefined,
                              accessible: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactElement) = {
    val props = JSMacro[TouchableHighlight](this)
    val f = ReactNative.createFactory(ReactNative.TouchableHighlight)
    f(props, children).asInstanceOf[ReactElement]
  }
}

@js.native
trait TouchableHighlightM extends js.Object