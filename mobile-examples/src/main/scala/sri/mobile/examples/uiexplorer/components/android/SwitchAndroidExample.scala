package sri.mobile.examples.uiexplorer.components.android

import sri.core.ElementFactory._
import sri.core._
import sri.mobile.components.android.SwitchAndroid
import sri.mobile.examples.uiexplorer.UIExplorerPage
import sri.mobile.styles.MobileStyleSheet
import sri.mobile.examples.uiexplorer.{UIExplorerPage, UIExample, UIExplorerBlock}

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
