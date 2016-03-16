package sri.mobile.examples.uiexplorer.components

import sri.core.{ReactElement, ReactComponent, ReactNode}
import sri.mobile.all._
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.{TextInputEvent, ReactEvent}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined


object TextInputExample extends UIExample {


  object WithLabel {

    val Component = (props: String, children: ReactElement) => {
      View(style = styles.labelContainer, key = props)(
        View(style = styles.label, key = "lab")(
          Text(key = "tex")(
            props
          )
        ),
        children
      )
    }

    def apply(label: String, key: UndefOr[String] = js.undefined)(children: ReactNode*) = createStatelessFunctionElementWithChildren(Component, label, key = key)(children: _*)
  }

  object TextEventsExample {

    case class State(curText: String = "No Event", prevText: String = "No Event")


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      def render() = View()(
        TextInput(autoCapitalize = AutoCapitalize.NONE,
          placeholder = "Enter text to see events",
          autoCorrect = false,
          onFocus = (e: ReactEvent[TextInputEvent]) => upDateTex("onFocus"),
          onBlur = (e: ReactEvent[TextInputEvent]) => upDateTex("onBlur"),
          onChange = (e: ReactEvent[TextInputEvent]) => upDateTex(s"onChange text ${e.nativeEvent.text}"),
          onEndEditing = (e: ReactEvent[TextInputEvent]) => upDateTex(s"onEndEditing text ${e.nativeEvent.text}"),
          onSubmitEditing = (e: ReactEvent[TextInputEvent]) => upDateTex(s"onSubmitEditing text ${e.nativeEvent.text}"),
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

      def handleInputEvent(e: ReactEvent[TextInputEvent]) = {

      }
    }

    val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)


  }


  val Component = () => {
    UIExplorerPage(
      UIExplorerBlock("Auto-focus")(
        TextInput(autoFocus = true, style = styles.default)()
      ),
      UIExplorerBlock("Auto-capitalize")(
        View()(
          WithLabel("none")(TextInput(autoCapitalize = AutoCapitalize.NONE, key = "none", style = styles.default)()),
          WithLabel("sentences")(TextInput(autoCapitalize = AutoCapitalize.SENTENCES, key = "sentences", style = styles.default)()),
          WithLabel("words")(TextInput(autoCapitalize = AutoCapitalize.WORDS, key = "words", style = styles.default)()),
          WithLabel("characters")(TextInput(autoCapitalize = AutoCapitalize.CHARACTERS, key = "chars", style = styles.default)())
        )
      ),
      UIExplorerBlock("Event handling")(
        TextEventsExample()
      ),
      UIExplorerBlock("Auto-correct")(
        View()(
          WithLabel("true")(TextInput(autoCorrect = true, key = "none", style = styles.default)()),
          WithLabel("false")(TextInput(autoCorrect = false, key = "none", style = styles.default)())
        )
      ),
      UIExplorerBlock("Clear button mode")(
        View()(
          WithLabel("never")(TextInput(clearButtonMode = "never", key = "never", style = styles.default)()),
          WithLabel("while editing")(TextInput(clearButtonMode = "while-editing", key = "sentences", style = styles.default)()),
          WithLabel("unless editing")(TextInput(clearButtonMode = "unless-editing", key = "unless-editing", style = styles.default)()),
          WithLabel("always")(TextInput(clearButtonMode = "always", key = "chars", style = styles.default)())
        )
      )
    )
  }

  val component = createStatelessFunctionElementNoProps(Component)

  object styles extends UniversalStyleSheet {

    val page = style(paddingBottom := 30)

    val default = style(height := 26,
      borderWidth := 0.5,
      borderColor := "#0f0f0f",
      flex := 1,
      fontSize := 13)

    val multiline = style(borderWidth := 0.5,
      borderColor := "#0f0f0f",
      flex := 1,
      fontSize := 13,
      height := 50)

    val label = style(width := 120,
      justifyContent.flexEnd,
      flexDirection.row,
      marginRight := 10,
      paddingTop := 2)

    val eventLabel = style(margin := 3, fontSize := 12)

    val labelContainer = style(flexDirection.row, marginVertical := 2, flex := 1)

  }

  override def title: String = "TextInput"

  override def description: String = "Single line text inputs"
}
