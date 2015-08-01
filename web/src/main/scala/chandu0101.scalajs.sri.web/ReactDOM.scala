package chandu0101.scalajs.sri.web


import chandu0101.scalajs.sri.core._
import org.scalajs.dom.raw.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


object ReactDOM extends js.Object {

  // i know what i am doing! okay go a head ..
  @JSName("render") def renderJS(elm: js.Any, dom: js.Any, callback: js.Function = ???): js.Any = js.native

  def render[P,S](elm: ReactComponentU[P,S], dom: Element, callback: js.Function = ???): ReactComponentM[P,S] = js.native

  def unmountComponentAtNode(container: js.Any): Boolean = js.native

  def findDOMNode[N](component: ReactComponent[Any, Any]): N = js.native

  def renderToString(element: ReactElement): String = js.native

  def renderToStaticMarkup(element: ReactElement): String = js.native

  def Addons: js.Dynamic = js.native

  def initializeTouchEvents(shouldUseTouch: Boolean): Unit = js.native
}

object ReactDOMServer extends js.Object {

  def renderToString(element: ReactElement): String = js.native

  def renderToStaticMarkup(element: ReactElement): String = js.native


}