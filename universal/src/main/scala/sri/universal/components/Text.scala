package sri.universal.components

import chandu0101.macros.tojs.{JSMacro, exclude}
import sri.core.{React, ReactNode}
import sri.universal.{ReactEvent, ReactUniversal, SyntheticEvent}
import sri.universal.apis.LayoutEvent

import scala.scalajs.js


case class Text(suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
                onPress: js.UndefOr[ReactEvent[SyntheticEvent] => Unit] = js.undefined,
                onLongPress: js.UndefOr[ReactEvent[SyntheticEvent] => Unit] = js.undefined,
                style: js.UndefOr[js.Any] = js.undefined,
                allowFontScaling: js.UndefOr[Boolean] = js.undefined,
                selectable: js.UndefOr[Boolean] = js.undefined,
                adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined,
                includeFontPadding: js.UndefOr[Boolean] = js.undefined,
                onLayout: js.UndefOr[LayoutEvent => _] = js.undefined,
                numberOfLines: js.UndefOr[Int] = js.undefined,
                ref: js.UndefOr[TextM => _] = js.undefined,
                key: js.UndefOr[String] = js.undefined,
                @exclude animatedText: Boolean = false,
                lineBreakMode: js.UndefOr[LineBreakMode] = js.undefined,
                testID: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Text](this)
    val ctor = if(animatedText) ReactUniversal.Animated.Text else ReactUniversal.Text
    React.createElement(ctor, props, children: _*)
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