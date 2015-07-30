package chandu0101.scalajs.sri.web.examples

import chandu0101.scalajs.sri.web.ReactDOM
import org.scalajs.dom
import sri.{JSProps, React, ReactComponent}

import scala.scalajs.js
import scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

object ReactApp extends JSApp{

  case class HelloProps(name : String)

  @ScalaJSDefined
  class Hello extends ReactComponent[HelloProps,Any] {

    val displayName : String = "asdsadsa"

    def render() = {
      React.createElement("div",json(id = "huh",onClick = onClick _),"dudedsa")
    }

    def typedProps = jsProps.sinstance

    def onClick(e : js.Dynamic) = {
      println(s"heh")
      g.he = e
      println(s"props ${typedProps.name}")
    }

    override def componentDidMount() = {
      println(s"dude 4")
    }
  }

  object Hello {

    //   def apply(props : HelloProps):js.Any = ReactJS.createElement(g.Hello,json(v = props.asInstanceOf[js.Any] ,key = "hmmk" ,name = "kiki"))
    def apply(props : HelloProps):js.Any = React.createElement(() => new Hello,JSProps(sinstance = HelloProps("hola"),key = "mehe"))

    def apply(props : HelloProps)(children: js.Any*) = ???
  }

  @JSExport
  override def main(): Unit = {
    val dummyHello = new Hello
    val ctor = dummyHello.asInstanceOf[js.Dynamic].constructor
    js.Dynamic.global.Hello = ctor
    ReactDOM.render(Hello(props = HelloProps("dude2")), dom.document.getElementById("container"))
  }
}
