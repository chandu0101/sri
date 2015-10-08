package sri.web.examples.uiexplorer.components

import sri.core.ElementFactory._
import sri.core.{ReactComponent, ReactNode}
import sri.universal.ReactEvent
import sri.universal.components.{Text, TextInput, View}
import sri.web.NEvent
import sri.web.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.web.styles.WebStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined


object TextInputExample extends UIExample {


  object WithLabel {

    @ScalaJSDefined
    class Component extends ReactComponent[String, Unit] {
      //        initialState(State())

      def render() = View(style = styles.labelContainer, key = props)(
        View(style = styles.label, key = "lab")(
          Text(key = "tex")(
            props
          )
        ),
        children
      )
    }

    val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

    def apply(label: String, key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null)(children: ReactNode*) = createElementWithChildren(factory, label, key = key, ref = ref)(children: _*)


  }

  object TextEventsExample {

    case class State(curText: String = "No Event", prevText: String = "No Event")


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      def render() = View()(
        TextInput(
          placeholder = "Enter text to see events",
          onFocus = (e: ReactEvent) => upDateTex("onFocus"),
          onBlur = (e: ReactEvent) => upDateTex("onBlur"),
          onChange = (e: ReactEvent) => upDateTex(s"onChange text ${e.nativeEvent.text}"),
          style = styles.default
        )(),
        Text(style = styles.eventLabel)(
          state.curText,
          s"\n prev : ${state.prevText}"
        )
      )

      def upDateTex(text: String) = {
        setState(state.copy(text, state.curText))
      }

      def handleInputEvent(e: NEvent) = {

      }
    }

    val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(factory, key = key, ref = ref)


  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {

    def render() = UIExplorerPage(
      UIExplorerBlock("Auto-focus")(
        TextInput(autoFocus = true, style = styles.default)()
      ),
      UIExplorerBlock("Event handling")(
        TextEventsExample()
      )
    )
  }

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(factory)

  object styles extends WebStyleSheet {

    val page = styleM(paddingBottom := 30)

    val default = styleM(height := 26,
      borderWidth := 0.5,
      borderColor := "#0f0f0f",
      flex := 1,
      fontSize := 13)

    val multiline = styleM(borderWidth := 0.5,
      borderColor := "#0f0f0f",
      flex := 1,
      fontSize := 13,
      height := 50)

    val label = styleM(width := 120,
      justifyContent.flexEnd,
      flexDirection.row,
      marginRight := 10,
      paddingTop := 2)

    val eventLabel = styleM(margin := 3, fontSize := 12)

    val labelContainer = styleM(flexDirection.row,
      flex := 1)

  }

  override def title: String = "TextInput"

  override def description: String = "Single line text inputs"
}
