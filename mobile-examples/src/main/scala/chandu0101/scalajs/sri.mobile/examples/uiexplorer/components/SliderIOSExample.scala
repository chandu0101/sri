package chandu0101.scalajs.sri.mobile.examples.uiexplorer.components

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.ReactComponent
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


object SliderIOSExample extends UIExample {

  case class State(value: Double = 0)


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = UIExplorerPage(
      UIExplorerBlock("SliderIOS")(
        View()(
          Text(style = styles.text)(
            state.value
          ),
          SliderIOS(style = styles.slider,
            onValueChange = handleValueChnage _)
        )
      )
    )

    def handleValueChnage(value: Double): Unit = {
      setState(state.copy(value = value))
    }
  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(factory)


  object styles extends NativeStyleSheet {
    val slider = style(height := 10, margin := 10)

    val text = style(
      fontSize := 14,
      textAlign.center,
      fontWeight._500,
      margin := 10
    )

  }

  override def title: String = "SliderIOS"

  override def description: String = "Slider Example"
}
