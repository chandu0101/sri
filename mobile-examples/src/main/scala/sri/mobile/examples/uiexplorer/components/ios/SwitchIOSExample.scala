package sri.mobile.examples.uiexplorer.components.ios

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.components.ios.SwitchIOS
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object SwitchIOSExample extends UIExample {

  case class BasicState(trueSwitchIsOn: Boolean = true, falseSwitchIsOn: Boolean = false)

  object BasicSwitchExample {


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, BasicState] {

      initialState(BasicState())

      def render() = View()(
        SwitchIOS(onValueChange = handleFalseSwitch _,
          style = styles.basicFalseSwitch,
          value = state.falseSwitchIsOn)(),
        SwitchIOS(onValueChange = handleTrueSwitch _,
          value = state.trueSwitchIsOn)()
      )

      def handleFalseSwitch(value: Boolean) = {
        setState(state.copy(falseSwitchIsOn = value))
      }

      def handleTrueSwitch(value: Boolean) = {
        setState(state.copy(trueSwitchIsOn = value))
      }
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElementNoProps(factory, key = key, ref = ref)

  }


  object DisabledSwitchExample {

    @ScalaJSDefined
    class Component extends ReactComponent[Unit, Unit] {
      def render() = View()(
        SwitchIOS(disabled = true, style = styles.basicFalseSwitch, value = true)(),
        SwitchIOS(disabled = true,
          value = false)()
      )
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElementNoProps(factory, key = key, ref = ref)
  }


  object ColorSwitchExample {


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, BasicState] {

      initialState(BasicState())

      def render() = View()(
        SwitchIOS(onValueChange = handleFalseSwitch _,
          style = styles.basicFalseSwitch,
          onTintColor = "#00ff00",
          tintColor = "#ff0000",
          value = state.falseSwitchIsOn)(),
        SwitchIOS(onValueChange = handleTrueSwitch _,
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

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElementNoProps(factory, key = key, ref = ref)

  }


  object EventSwitchExample {

    case class State(eventSwitchIsOn: Boolean = false, eventSwitchRegressionIsOn: Boolean = true)


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      def render() = View(style = styles.eventsContainer)(
        View()(
          SwitchIOS(onValueChange = handleEventSwitch _,
            style = styles.basicFalseSwitch,
            value = state.eventSwitchIsOn)(),
          SwitchIOS(onValueChange = handleEventSwitch _,
            style = styles.basicFalseSwitch,
            value = state.eventSwitchIsOn)(),
          Text()(if (state.eventSwitchIsOn) "On" else "Off")
        ),
        View()(
          SwitchIOS(onValueChange = handleEventSwitchRegression _,
            style = styles.basicFalseSwitch,
            value = state.eventSwitchRegressionIsOn)(),
          SwitchIOS(onValueChange = handleEventSwitchRegression _,
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

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElementNoProps(factory, key = key, ref = ref)

  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {

    def render() = UIExplorerPage(
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

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(factory)


  object styles extends SriStyleSheet {

    val basicFalseSwitch = style(marginBottom := 10)

    val eventsContainer = style(flexDirection.row,
      justifyContent.spaceAround)
  }

  override def title: String = "SwitchIOSExample"

  override def description: String = "Native boolean input"
}
