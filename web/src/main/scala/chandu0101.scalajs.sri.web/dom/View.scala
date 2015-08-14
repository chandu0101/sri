package chandu0101.scalajs.sri.web.dom

import chandu0101.scalajs.sri.core.{ReactNode, ReactElement}
import chandu0101.scalajs.sri.web.styles.WebStyleSheet._
import org.scalajs.dom.raw.HTMLDivElement

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

object View {

  def apply(key: js.UndefOr[String] = js.undefined,
            style: js.UndefOr[js.Dictionary[Any]] = js.undefined,
            ref: js.UndefOr[HTMLDivElement => Unit] = js.undefined)(children: ReactNode*) = {

    val p = js.Dynamic.literal()
    key.foreach(v => p.updateDynamic("key")(v))
    p.updateDynamic("style")(if(style.isDefined) styleE(defaultStyle,style.get)() else defaultStyle)
    ref.foreach(v => p.updateDynamic("ref")(v))

    div(p, children.toJSArray).asInstanceOf[ReactElement]
  }

  val defaultStyle = style(alignItems.stretch,
    borderWidth := 0,
    borderStyle.none,
    boxSizing.`border-box`,
    display.flex,
    flexBasis := "auto",
    flexDirection.column,
    flexShrink := 0,
    listStyle := "none",
    margin := 0,
    padding := 0,
    position.relative)
}