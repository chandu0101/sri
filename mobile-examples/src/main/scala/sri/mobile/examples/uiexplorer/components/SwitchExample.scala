package sri.mobile.examples.uiexplorer.components

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object SwitchExample extends UIExample {

  case class BasicState(trueSwitchIsOn: Boolean = true, falseSwitchIsOn: Boolean = false)

  object BasicSwitchExample {

    @ScalaJSDefined
    class Component extends ReactComponent[Unit, BasicState] {

      initialState(BasicState())

      def render() = View()(
        Switch(onValueChange = handleFalseSwitch _,
          style = styles.basicFalseSwitch,
          value = state.falseSwitchIsOn)(),
        Switch(onValueChange = handleTrueSwitch _,
          value = state.trueSwitchIsOn)()
      )

      def handleFalseSwitch(value: Boolean) = {
        setState(state.copy(falseSwitchIsOn = value))
      }

      def handleTrueSwitch(value: Boolean) = {
        setState(state.copy(trueSwitchIsOn = value))
      }
    }

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)

  }


  object DisabledSwitchExample {

    @ScalaJSDefined
    class Component extends ReactComponent[Unit, Unit] {
      def render() = View()(
        Switch(disabled = true, style = styles.basicFalseSwitch, value = true)(),
        Switch(disabled = true,
          value = false)()
      )
    }

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)
  }


  object ColorSwitchExample {


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, BasicState] {

      initialState(BasicState())

      def render() = View()(
        Switch(onValueChange = handleFalseSwitch _,
          style = styles.basicFalseSwitch,
          onTintColor = "#00ff00",
          tintColor = "#ff0000",
          value = state.falseSwitchIsOn)(),
        Switch(onValueChange = handleTrueSwitch _,
          onTintColor = "#00ff00",
          tintColor = "#ff0000",
          value = state.trueSwitchIsOn)()
      )

      def handleFalseSwitch(value: Boolean) = {
        setState(state.copy(falseSwitchIsOn = value))
      }

      def handleTrueSwitch(value: Boolean) = {
        setState(state.copy(trueSwitchIsOn = value))
      }
    }

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)

  }


  object EventSwitchExample {

    case class State(eventSwitchIsOn: Boolean = false, eventSwitchRegressionIsOn: Boolean = true)


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      def render() = View(style = styles.eventsContainer)(
        View()(
          Switch(onValueChange = handleEventSwitch _,
            style = styles.basicFalseSwitch,
            value = state.eventSwitchIsOn)(),
          Switch(onValueChange = handleEventSwitch _,
            style = styles.basicFalseSwitch,
            value = state.eventSwitchIsOn)(),
          Text()(if (state.eventSwitchIsOn) "On" else "Off")
        ),
        View()(
          Switch(onValueChange = handleEventSwitchRegression _,
            style = styles.basicFalseSwitch,
            value = state.eventSwitchRegressionIsOn)(),
          Switch(onValueChange = handleEventSwitchRegression _,
            style = styles.basicFalseSwitch,
            value = state.eventSwitchRegressionIsOn)(),
          Text()(if (state.eventSwitchRegressionIsOn) "On" else "Off")
        )
      )

      def handleEventSwitch(value: Boolean) = {
        setState(state.copy(eventSwitchIsOn = value))
      }

      def handleEventSwitchRegression(value: Boolean) = {
        setState(state.copy(eventSwitchRegressionIsOn = value))
      }
    }

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)

  }


  val Component = () => {
    UIExplorerPage(
      UIExplorerBlock("Basic Switch")(
        BasicSwitchExample()
      ),
      UIExplorerBlock("Disabled Switches")(
        DisabledSwitchExample()
      ),
      UIExplorerBlock("Colored Switches")(
        ColorSwitchExample()
      ),
      UIExplorerBlock("Change events can be detected")(
        EventSwitchExample()
      )
    )
  }


  val component = () => createStatelessFunctionElementNoProps(Component)


  object styles extends UniversalStyleSheet {

    val basicFalseSwitch = style(marginBottom := 10)

    val eventsContainer = style(flexDirection.row,
      justifyContent.spaceAround)
  }

  override def title: String = "Switch"

  override def description: String = "Native boolean input"
}