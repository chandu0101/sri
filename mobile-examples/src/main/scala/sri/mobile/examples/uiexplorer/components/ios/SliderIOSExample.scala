package sri.mobile.examples.uiexplorer.components.ios

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.components.ios.SliderIOS
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

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
            onValueChange = handleValueChnage _)()
        )
      )
    )

    def handleValueChnage(value: Double): Unit = {
      setState(state.copy(value = value))
    }
  }

  val ctor = getTypedConstructor(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(ctor)


  object styles extends UniversalStyleSheet {
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
