package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.universal.ReactUniversal
import sri.universal.apis.LayoutEvent

import scala.scalajs.js


case class Text(suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
                onPress: js.UndefOr[() => Unit] = js.undefined,
                style: js.UndefOr[js.Any] = js.undefined,
                allowFontScaling: js.UndefOr[Boolean] = js.undefined,
                selectable: js.UndefOr[Boolean] = js.undefined,
                adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined,
                onLayout: js.UndefOr[LayoutEvent => _] = js.undefined,
                numberOfLines: js.UndefOr[Int] = js.undefined,
                ref: js.UndefOr[TextM => _] = js.undefined,
                key: js.UndefOr[String] = js.undefined,
                lineBreakMode: js.UndefOr[LineBreakMode] = js.undefined,
                testID: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Text](this)
    React.createElement(ReactUniversal.Text, props, children: _*)
  }
}

@js.native
trait TextM extends js.Object

class LineBreakMode private(val value: String) extends AnyVal

object LineBreakMode {

  val HEAD = new LineBreakMode("head")
  val MIDDLE = new LineBreakMode("middle")
  val TAIL = new LineBreakMode("tail")
  val CLIP = new LineBreakMode("clip")
}