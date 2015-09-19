package chandu0101.scalajs.sri.mobile.examples.uiexplorer.components.android

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core._
import chandu0101.scalajs.sri.mobile._
import chandu0101.scalajs.sri.mobile.components.android.{SwitchAndroid, ToolbarAndroid, ToolbarAndroidAction, ToolbarAndroidActionShow}
import chandu0101.scalajs.sri.mobile.components.{ImageSource, Text, View}
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import chandu0101.scalajs.sri.mobile.styles.MobileStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object SwitchAndroidExample extends UIExample {

  override val title: String = "SwitchAndroid"

  override val description: String = "Standard Android two-state toggle component."

  case class State(trueSwitchIsOn: Boolean = true,falseSwitchIsOn: Boolean= false,colorTrueSwitchIsOn:Boolean = true,colorFalseSwitchIsOn:Boolean = false,eventSwitchIsOn: Boolean = false)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      UIExplorerPage(
        UIExplorerBlock("Switches can be set to true or false")(
          SwitchAndroid(style = styles.bottom10,onValueChange = (value: Boolean) => setState(state.copy(falseSwitchIsOn = value)),value = state.falseSwitchIsOn)(),
          SwitchAndroid(onValueChange = (value: Boolean) => setState(state.copy(trueSwitchIsOn = value)),value = state.trueSwitchIsOn)()
        )
      )
    }

  }

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(factory)


  object styles extends MobileStyleSheet {

    val bottom10 = style(marginBottom := 10)
  }

}
