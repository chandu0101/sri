package chandu0101.scalajs.sri.mobile.examples.uiexplorer.components

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.{ReactComponent, ReactElement, RefType}
import chandu0101.scalajs.sri.mobile.NEvent
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.{UIExplorerPage, UIExample, UIExplorerBlock}
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{Date, UndefOr}
import scala.util.Try

object DatePickerIOSExample extends UIExample {

  object Heading {

    @ScalaJSDefined
    class Component extends ReactComponent[String, Unit] {
      def render() = View(style = styles.headingContainer)(
        Text(style = styles.heading)(
          props
        ))
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(props: String) = createElement(factory, props)

  }

  object WithLabel {

    @ScalaJSDefined
    class Component extends ReactComponent[String, Unit] {
      def render() = View(style = styles.headingContainer)(
        View(style = styles.labelView)(
          Text(style = styles.heading)(
            props
          ),
          children
        )

      )
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(props: String, key: UndefOr[String] = js.undefined, ref: RefType = null)(children: ReactElement) = createElementWithChildren(factory, props)(children)
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

      def onTimezoneChange(event: NEvent) = {
        val offset = Try(event.nativeEvent.text.toString.toInt).toOption
        if (offset.isDefined) setState(state.copy(timeZoneOffsetInHours = offset.get))
      }
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(props: js.Date, key: UndefOr[String] = js.undefined, ref: RefType = null) = createElement(factory, props)
  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = UIExplorerPage(
      UIExplorerBlock("DatePickerIOS")(
      DatePickerExample(new Date())
    )
    )
  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(factory)


  object styles extends NativeStyleSheet {

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
