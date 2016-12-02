package sri.web

import org.scalajs.dom
import org.scalajs.dom.raw.Element
import sri.core._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}

@js.native
@JSImport("react-dom", JSImport.Namespace)
object ReactDOM extends js.Object {

  def render(elm: ReactElement, dom: Element, callback: js.Function = ???): ReactElementM[_, _] = js.native

  def unmountComponentAtNode(container: js.Any): Boolean = js.native

  def findDOMNode(component: ReactComponent[_, _]): dom.Node = js.native

  def renderToStaticMarkup(element: ReactElement): String = js.native

  def initializeTouchEvents(shouldUseTouch: Boolean): Unit = js.native
}

@js.native
@JSImport("react-dom/server", JSImport.Namespace)
object ReactDOMServer extends js.Object {

  def renderToString(element: ReactElement): String = js.native

  def renderToStaticMarkup(element: ReactElement): String = js.native


}