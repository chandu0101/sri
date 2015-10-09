package sri.mobile.examples.uiexplorer.components.ios

import sri.core.ElementFactory._
import sri.core.{ReactComponent, ReactNode}
import sri.mobile.components.Modal
import sri.mobile.components.ios.SwitchIOS
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object ModalExample extends UIExample {


  object Button {

    case class State(active: Boolean = false)

    @ScalaJSDefined
    class Component extends ReactComponent[Props, State] {

      initialState(State())

      def render() = {
        TouchableHighlight(onHideUnderlay = onUnhighlight _,
          onPress = props.onPress,
          onShowUnderlay = onHighlight _,
          style = styles.buttonStyle(props.style),
          underlayColor = "#a9d9d4")(
            Text(style = styles.buttonTextStyle(state.active))(children)
          )
      }

      def onHighlight() = setState(state.copy(active = true))

      def onUnhighlight() = setState(state.copy(active = false))

    }

    case class Props(onPress: () => Unit, style: js.Dictionary[Any])

    val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

    def apply(onPress: () => Unit, style: js.Dictionary[Any] = js.Dictionary(), key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null)(children: ReactNode) = createElementWithChildren(ctor, Props(onPress, style), key = key, ref = ref)(children)

  }

  case class State(animated: Boolean = true, modalVisible: Boolean = false, transparent: Boolean = false)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      UIExplorerPage(
        Modal(animated = state.animated,
          transparent = state.transparent,
          visible = state.modalVisible)(
            View(style = styles.customContainer(state.transparent))(
              View(style = styles.customInnerContainer(state.transparent))(
                Text()(s"This modal was presented ${if (state.animated) "with" else "without"} animation"),
                Button(onPress = () => setModalVisible(false),
                  style = styles.modalButton)(
                    "Close"
                  )
              )
            )
          ),
        View(style = styles.row)(
          Text(style = styles.rowTitle)("Animated"),
          SwitchIOS(value = state.animated, onValueChange = toggleAnimated _)()
        ),
        View(style = styles.row)(
          Text(style = styles.rowTitle)("Transparent"),
          SwitchIOS(value = state.transparent, onValueChange = toggleTransparent _)()
        ),
        Button(onPress = () => setModalVisible(true))("Present")
      )
    }

    def setModalVisible(visible: Boolean) = {
      setState(state.copy(modalVisible = visible))
    }

    def toggleAnimated(value: Boolean) = {
      setState(state.copy(animated = !state.animated))
    }

    def toggleTransparent(value: Boolean) = {
      setState(state.copy(transparent = !state.transparent))
    }

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(ctor)


  object styles extends SriStyleSheet {
    val container = style(flexOne,
      justifyContent.center,
      padding := 20)
    val innerContainer = style(borderRadius := 10)
    val row = style(alignItems.center,
      flexOne,
      flexDirection.row,
      marginBottom := 20)

    val rowTitle = style(flexOne,
      fontWeight.bold)

    val button = style(borderRadius := 5,
      flexOne,
      height := 44,
      justifyContent.center,
      overflow.hidden)

    val buttonText = style(fontSize := 18,
      margin := 5,
      textAlign.center)

    val modalButton = style(marginTop := 10)

    def buttonStyle(userStyle: js.Dictionary[Any]) = styleE(button, userStyle)()

    def buttonTextStyle(active: Boolean) = {
      val c = if (active) "#fff" else "#000"
      styleE(buttonText)(color := c)
    }

    def customContainer(transparent: Boolean) = {
      val c = if (transparent) "rgba(0, 0, 0, 0.5)" else "#f5fcff"
      styleE(container)(backgroundColor := c)
    }

    def customInnerContainer(transparent: Boolean) = {
      val c = if (transparent) style(backgroundColor := "#fff", padding := 20) else style()
      styleE(innerContainer, c)()
    }
  }

  override def title: String = "Modal"

  override def description: String = "Component for presenting modal views."
}
