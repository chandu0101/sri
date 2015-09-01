package chandu0101.scalajs.sri.web.examples

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.{ReactComponent, _}
import chandu0101.scalajs.sri.web.ReactDOM
import chandu0101.scalajs.sri.web.dom.View
import chandu0101.scalajs.sri.web.examples.WebApp.Hello.Component
import chandu0101.scalajs.sri.web.examples.WebApp.SmallHello
import chandu0101.scalajs.sri.web.styles.WebStyleSheet
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g, literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}


object WebApp extends JSApp {

  object SmallHello {


    case class SmallHelloProps(name: String)

    @ScalaJSDefined
    class Component extends ReactComponent[String, Any] {

      //    val displayName : String = "asdsadsa"


      def render() = {
        React.createElement("div", json(id = "huh"),props)
      }

      //    state = JSSt State()

      def onClick(e: js.Dynamic) = {
        println(s"small props ${props}")
      }


      override def componentDidMount() = {
        println(s"small one mounted")
      }

      val displayName: String = "SmallHello"
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(props: String) = createElement(props = props, factory = factory, ref = "smallman")
//    def apply(props: String) = React.createElement(js.Dynamic.global.SmallHello,JSProps(sprops = props))
  }


  object styles extends WebStyleSheet {

    val div = style(border := "1px solid grey",
      padding := "10px")
  }

  object Hello {

    case class HelloProps(name: String)

    case class State(count: Int = 0)

    @ScalaJSDefined
    class Component extends ReactComponent[HelloProps, State] {

      val displayName: String = "Hello"


      initialState(State())

      def render() = {
        View()("dude","  lol")
      }

      def onClick(e: js.Dynamic) = {
        setState(state.copy(count = state.count + 1))
      }

      override def componentDidMount() = {
        println(s"component mounted ")
      }


      //    @JSName("sComponentWillUpdate") override def componentWillUpdate(nextProps : Unit,nextState : State) : Unit = {
      //      println(s"ok whats going on ")
      //    }


    }

    def apply(props: HelloProps) =
      ElementFactory_DONTUSE(new Component()).key("dude").props(props).build
  }

  @JSExport
  override def main(): Unit = {
    val dummyHello = new Component()
    val x = List(1, 2, 3)
    println(s" list x $x")
    js.Dynamic.global.DHello = dummyHello
    val ctor = dummyHello.asInstanceOf[js.Dynamic].constructor
    js.Dynamic.global.Hello = ctor

    val dummySmall = new SmallHello.Component()
    val ctor1 = dummySmall.asInstanceOf[js.Dynamic].constructor
    js.Dynamic.global.SmallHello = ctor1

    ReactDOM.renderJS(React.createElement(js.Dynamic.global.Hello, json(dude = "dude5")), dom.document.getElementById("container"))
  }
}

