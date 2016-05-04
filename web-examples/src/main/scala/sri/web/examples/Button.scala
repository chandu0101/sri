package sri.web.examples

import sri.core._
import sri.web.all._
import sri.web.vdom.htmltags._

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


object Button {

  val Component = (props: Props,children : ReactElement) => {
    div(style = props.style, onClick = (e: ReactMouseEventH) => props.onPress())(children)
  }

  case class Props(style: js.UndefOr[js.Any], onPress: () => _)

  def apply(style: js.UndefOr[js.Any], onPress: () => _,key : js.UndefOr[String] = js.undefined)(children : ReactNode*) = createStatelessFunctionElementWithChildren(Component, Props(style, onPress),key = key)(children : _*)

}
