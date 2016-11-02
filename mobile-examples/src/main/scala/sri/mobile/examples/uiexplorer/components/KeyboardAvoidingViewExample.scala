package sri.mobile.examples.uiexplorer.components

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.components.ios.SegmentedControlIOS
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components.{View, _}
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


object KeyboardAvoidingViewExample extends UIExample {

  case class State(behaviour: KeyboardAvoidingViewBehaviour = KeyboardAvoidingViewBehaviour.PADDING, modalOpen: Boolean = false)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = UIExplorerPage(
      UIExplorerBlock("Keyboard-avoiding views move out of the way of the keyboard.")(
        View(style = styles.outerContainer)(
          Modal(animationType = ModalAnimationType.FADE, visible = state.modalOpen)(
            KeyboardAvoidingView(behavior = state.behaviour, style = styles.container)(
              SegmentedControlIOS(onValueChange = onSegmentChange _,
                selectedIndex = if (state.behaviour == KeyboardAvoidingViewBehaviour.PADDING) 0 else 1,
                style = styles.segment,
                values = Seq(Padding, Position))(),
              TextInput(placeholder = "TextInput", style = styles.textInput)()
            ),
            TouchableHighlight(style = styles.closeButton, onPress = () => setState(state.copy(modalOpen = false)))(
              Text()("Close")
            )
          ),
          TouchableHighlight(onPress = () => setState(state.copy(modalOpen = true)))(
            Text()("Open Example")
          )
        )
      )
    )

    val Padding = "Padding"

    val Position = "Position"

    def onSegmentChange(segment: String): Unit = {
      val behaviour = segment match {
        case Padding => KeyboardAvoidingViewBehaviour.PADDING
        case Position => KeyboardAvoidingViewBehaviour.POSITION
      }
      setState(state.copy(behaviour = behaviour))
    }
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = () => createElementNoProps(ctor)

  object styles extends UniversalStyleSheet {

    val outerContainer = style(flexOne)

    val container = style(flex := 1,
      justifyContent.center,
      paddingHorizontal := 20,
      paddingTop := 20)


    val textInput = style(borderRadius := 5,
      borderWidth := 1,
      height := 44,
      paddingHorizontal := 10)

    val segment = style(marginBottom := 10)

    val closeButton = style(position.absolute,
      top := 30,
      left := 30)

  }


  override def title: String = "KeyboardAvoidingView"

  override def description: String = "Base component for views that automatically adjust their height or position to move out of the way of the keyboard."
}
