package sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import sri.core.ReactNode
import sri.mobile._

import scala.scalajs.js


case class Text(suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
                onPress: js.UndefOr[() => Unit] = js.undefined,
                style: js.UndefOr[js.Any] = js.undefined,
                allowFontScaling: js.UndefOr[Boolean] = js.undefined,
                onLayout: js.UndefOr[js.Function] = js.undefined,
                numberOfLines: js.UndefOr[Int] = js.undefined,
                ref: js.UndefOr[TextM => _] = js.undefined,
                key: js.UndefOr[String] = js.undefined,
                testID: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Text](this)
    ReactNative.createElement(ReactNative.Text,props,children :_*)
  }
}

@js.native
trait TextM extends js.Object