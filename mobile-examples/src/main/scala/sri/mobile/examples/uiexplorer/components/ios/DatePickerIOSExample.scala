package sri.mobile.examples.uiexplorer.components.ios

import sri.core.{ReactComponent, ReactElement}
import sri.mobile.all._
import sri.mobile.components.ios.{DatePickerIOS, DatePickerIOSMode, MinuteInterval}
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.{TextInputEvent, ReactEvent}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{Date, UndefOr}
import scala.util.Try

object DatePickerIOSExample extends UIExample {

  object Heading {

    val Component = (props: String) => {
      View(style = styles.headingContainer)(
        Text(style = styles.heading)(
          props
        ))
    }

    def apply(props: String) = createStatelessFunctionElement(Component, props)

  }

  object WithLabel {

    val Component = (props: String, children: ReactElement) => {
      View(style = styles.headingContainer)(
        View(style = styles.labelView)(
          Text(style = styles.heading)(
            props
          ),
          children
        )

      )
    }

    def apply(props: String, key: UndefOr[String] = js.undefined)(children: ReactElement) = createStatelessFunctionElementWithChildren(Component, props)(children)
  }


  val x = (-1) * (new Date()).getTimezoneOffset() / 60


  object DatePickerExample {

    case class State(date: js.Date, timeZoneOffsetInHours: Double)

    @ScalaJSDefined
    class Component extends ReactComponent[js.Date, State] {

      override def componentWillMount() = {
        initialState(State(props, (-1) * (new Date()).getTimezoneOffset() / 60.0))
      }


      def render() =
        View()(
          WithLabel("Value :")(
            Text()(s"${state.date.toLocaleDateString()} ${state.date.toLocaleTimeString()}")),
          WithLabel("Timezone :")(
            TextInput(style = styles.textInput,
              value = state.timeZoneOffsetInHours.toString,
              onChange = onTimezoneChange _)()),
          Heading("Date + TimePicker"),
          DatePickerIOS(date = state.date,
            mode = DatePickerIOSMode.DATE_TIME, timeZoneOffsetInMinutes = (state.timeZoneOffsetInHours * 60).toInt,
            onDateChange = onDateChange _)(),
          Heading("Date Picker"),
          DatePickerIOS(date = state.date,
            mode = DatePickerIOSMode.DATE, timeZoneOffsetInMinutes = (state.timeZoneOffsetInHours * 60).toInt,
            onDateChange = onDateChange _)(),
          Heading("Time picker 10-minute interval"),
          DatePickerIOS(date = state.date,
            mode = DatePickerIOSMode.TIME,
            timeZoneOffsetInMinutes = (state.timeZoneOffsetInHours * 60).toInt,
            onDateChange = onDateChange _,
            minuteInterval = MinuteInterval._10)()

        )

      def onDateChange(date: js.Date) = {
        setState(state.copy(date = date))
      }

      def onTimezoneChange(event: ReactEvent[TextInputEvent]) = {
        val offset = Try(event.nativeEvent.text.toInt).toOption
        if (offset.isDefined) setState(state.copy(timeZoneOffsetInHours = offset.get))
      }
    }

    val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

    def apply(props: js.Date, key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, props)
  }


  val Component = () => {
    UIExplorerPage(
      UIExplorerBlock("DatePickerIOS")(
        DatePickerExample(new Date())
      )
    )
  }

  val component = () =>  createStatelessFunctionElementNoProps(Component)


  object styles extends UniversalStyleSheet {

    val container = style(flexOne, paddingTop := 50)

    val textInput = style(height := 26,
      width := 50,
      borderWidth := 0.5,
      borderColor := "#0f0f0f",
      padding := 4,
      fontSize := 13)

    val labelContainer = style(flexDirection.row,
      alignItems.center,
      marginVertical := 2)

    val labelView = style(marginRight := 10,
      paddingVertical := 2)

    val label = style(fontWeight._500)

    val headingContainer = style(padding := 4,
      backgroundColor := "#f6f7f8")

    val heading = style(fontWeight._500, fontSize := 14)

  }

  override val title: String = "DatePickerIOS"

  override val description: String = "Select dates and times using the native UIDatePicker."

}
