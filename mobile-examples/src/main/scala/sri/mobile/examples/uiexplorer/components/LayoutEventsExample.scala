package sri.mobile.examples.uiexplorer.components

import org.scalajs.dom
import sri.core._
import sri.mobile.ReactNative
import sri.mobile.all._
import sri.universal.apis.{LayoutEvent, Layout}
import sri.mobile.examples.uiexplorer.{UIExplorerPage, UIExample}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, JSON, undefined}

object LayoutEventsExample extends UIExample {

  case class State(containerStyle: js.UndefOr[js.Dictionary[Any]] = undefined, extraText: String = "", imageLayout: js.UndefOr[Layout] = undefined, textLayout: js.UndefOr[Layout] = undefined, viewLayout: js.UndefOr[Layout] = undefined, viewStyle: js.UndefOr[js.Dictionary[Any]] = js.undefined)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {
    initialState(State(viewStyle = styles.dynamicView(20)))

    def render() = {
      UIExplorerPage(
        View(style = styles.containerStyle)(
          Text()(
            "layout events are called on mount and whenever layout is recalculated. Note that the layout event will typically be received",
            Text(style = styles.italicText)("before"),
            "the layout has updated on screen, especially when using layout animations.",
            Text(style = styles.pressText, onPress = animateViewLayout _)(" Press here to change layout.")
          ),
          View(onLayout = onViewLayout _, style = styles.view(state.viewStyle.getOrElse(null)))(
            Image(onLayout = onImageLayout _, style = styles.image, source = ImageSource(uri = "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851561_767334496626293_1958532586_n.png"))(),
            Text()(s"ViewLayout : ${JSON.stringify(state.viewLayout)} \n\n"),
            Text(style = styles.text, onLayout = onTextLayout _)(s"A simple piece of text.${state.extraText}"),
            Text()(
              s"""
                 |
                 |Text w/h : ${if (state.textLayout.isDefined) s"${state.textLayout.get.width}/${state.textLayout.get.height}" else "?/?"}
                  |Image x/y : ${if (state.imageLayout.isDefined) s"${state.imageLayout.get.x}/${state.imageLayout.get.y}" else "?/?"}
           """.stripMargin
            )
          )
        )
      )
    }


    def onViewLayout(e: LayoutEvent) = {
      dom.window.console.log(s"received view layout event \n", e.nativeEvent)
      setState(state.copy(viewLayout = e.nativeEvent.layout))
    }

    def onTextLayout(e: LayoutEvent) = {
      dom.window.console.log(s"received text layout event \n", e.nativeEvent)
      setState(state.copy(textLayout = e.nativeEvent.layout))
    }

    def onImageLayout(e: LayoutEvent) = {
      dom.window.console.log(s"received image layout event \n", e.nativeEvent)
      setState(state.copy(imageLayout = e.nativeEvent.layout))
    }

    def animateViewLayout() = {
      ReactNative.LayoutAnimation.configureNext(ReactNative.LayoutAnimation.Presets.spring, () => {
        println(s"layout animation done")
        setState(state.copy(extraText = " And a bunch more text to wrap around a few lines", containerStyle = styles.containerStyle))
      })
      setState(state.copy(viewStyle = styles.dynamicView(if (state.viewStyle.getOrElse("margin", 0).asInstanceOf[Double] > 20) 20 else 60)))
    }
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(ctor)


  object styles extends UniversalStyleSheet {

    def view(another: js.Dictionary[Any]) = styleE(another)(padding := 12,
      borderColor := "black",
      borderWidth := 0.5,
      backgroundColor := "transparent")

    val text = style(alignSelf.flexStart,
      borderColor := "rgba(0, 0, 255, 0.2)",
      borderWidth := 0.5)

    val image = style(width := 50,
      height := 50,
      marginBottom := 10,
      alignSelf.center)

    val pressText = style(fontWeight.bold)

    val italicText = style(fontStyle.italic)

    val containerStyle = style(width := 280)

    def dynamicView(value: Double) = style(margin := value)

  }

  override def title: String = "Layout Events"

  override def description: String = "Examples that show how Layout events can be used to measure view size and position"

}
