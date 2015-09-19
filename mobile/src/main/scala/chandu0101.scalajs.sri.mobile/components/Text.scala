package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.{ReactElement, ReactNode}
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js


case class Text(suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
                onPress: js.UndefOr[() => Unit] = js.undefined,
                style: js.UndefOr[js.Any] = js.undefined,
                onLayout: js.UndefOr[js.Function] = js.undefined,
                numberOfLines: js.UndefOr[Int] = js.undefined,
                ref: js.UndefOr[TextM => _] = js.undefined,
                key: js.UndefOr[String] = js.undefined,
                testID: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Text](this)
    val f = ReactNative.createFactory(ReactNative.Text)
    f(props, children: _*).asInstanceOf[ReactElement]
  }
}

@js.native
trait TextM extends js.Object