package sri.mobile.examples.uiexplorer.components

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.components.{ImageSource, _}
import sri.mobile.examples.uiexplorer.UIExplorerPage
import sri.mobile.styles.MobileStyleSheet
import sri.mobile.examples.uiexplorer.{UIExplorerPage, UIExample, UIExplorerBlock}

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined


object TouchableExample extends UIExample {

  val heartImage = ImageSource(uri = "https://pbs.twimg.com/media/BlXBfT3CQAA6cVZ.png:small")

  object TouchableFeedbackEvents {

    case class State(eventLog: js.Array[String] = js.Array())

    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      def render() = View()(
        View(style = styles.wrapper)(
          TouchableOpacity(style = styles.wrapper,
            onPress = () => appendEvent("press"),
            onPressIn = () => appendEvent("pressIn"),
            onPressOut = () => appendEvent("pressOut"),
            onLongPress = () => appendEvent("longPress"))(
              Text(style = styles.button)("Press Me")
            )
        ),
        View(style = styles.eventLogBox)(
          state.eventLog.zipWithIndex.map {
            case (e, i) => Text(key = i.toString)(e)
          }
        )
      )

      def appendEvent(name: String) = {
        val eventLog = state.eventLog.slice(0, 5)
        setState(state.copy(eventLog = name +: eventLog))
      }
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function = null) = createElementNoProps(factory, key = key, ref = ref)


  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = UIExplorerPage(
      UIExplorerBlock(title = "TouchableHighlight")(
        View(style = styles.row)(
          TouchableHighlight(style = styles.wrapper, onPress = () => println("stock THW image - highlight"))(
            Image(source = heartImage, style = styles.image)()
          ),
          TouchableHighlight(style = styles.wrapper,
            activeOpacity = 1,
            underlayColor = "rgb(210, 230, 255)",
            onPress = () => println("custom THW text - hightlight"))(
              Text(style = styles.text)(
                "Tap Here For Custom Highlight!"
              )
            )
        )
      ),
      UIExplorerBlock(title = "Touchable feedback events")(
        TouchableFeedbackEvents()
      )
    )
  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(factory)


  object styles extends MobileStyleSheet {

    val row = style(justifyContent.center,
      flexDirection.row)

    val icon = style(width := 24,
      height := 24)

    val image = style(width := 50,
      height := 50)

    val text = style(fontSize := 15)

    val button = style(color := "#007AFF")

    val wrapper = style(borderRadius := 8)

    val wrapperCustom = style(
      borderRadius := 8,
      padding := 6
    )
    val logBox = style(
      padding := 20,
      margin := 10,
      borderWidth := 1.0 / ReactNative.PixelRatio.get(),
      borderColor := "#f0f0f0",
      backgroundColor := "#f9f9f9"
    )
    val eventLogBox = style(
      padding := 10,
      margin := 10,
      height := 120,
      borderWidth := 1.0 / ReactNative.PixelRatio.get(),
      borderColor := "#f0f0f0",
      backgroundColor := "#f9f9f9"
    )

    val textBlock = style(
      fontWeight._500,
      color := "blue"
    )
  }

  override def title: String = "Touchable*"

  override def description: String = "TouchableHighlight,TouchableOpacity .."

}

