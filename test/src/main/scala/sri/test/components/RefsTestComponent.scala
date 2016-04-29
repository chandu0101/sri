package sri.test.components

import org.scalajs.dom
import sri.core._
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, Function1, undefined => undefined}


object RefsTestComponent {


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      div(key = "hello", ref = (e: dom.html.Div) => divRef = e)("A div with key")
    }

    var divRef: dom.html.Div = _

    override def componentDidMount(): Unit = {
      assert(divRef.nodeName == "DIV")
      assert(divRef.innerHTML == "A div with key")
    }

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(key: U[String] = js.undefined, ref: Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)
}
