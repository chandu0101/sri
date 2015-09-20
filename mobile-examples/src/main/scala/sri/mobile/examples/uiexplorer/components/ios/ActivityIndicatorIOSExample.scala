package sri.mobile.examples.uiexplorer.components.ios

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.components._
import sri.mobile.components.ios.{ActivityIndicatorIOS, ActivityIndicatorIOSSize}
import sri.mobile.examples.uiexplorer.UIExplorerPage
import sri.mobile.styles.MobileStyleSheet
import org.scalajs.dom
import sri.mobile.examples.uiexplorer.{UIExplorerPage, UIExample, UIExplorerBlock}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object ActivityIndicatorIOSExample extends UIExample {


  object ToggleAnimatingActivityIndicator {

    case class State(animating: Boolean = true)


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      var timers : Seq[Int] = List()

      def render() = ActivityIndicatorIOS(animating = state.animating,
        style = styles.animating,
        size = ActivityIndicatorIOSSize.LARGE)()

      override def componentDidMount() = {
        setToggleTimeout
      }

      override def componentWillUnmount(): Unit = {
        timers.foreach(id => dom.window.clearTimeout(id))
      }

      def setToggleTimeout: Unit = {
        val id =   dom.window.setTimeout(() => {
          setState(state.copy(animating = !state.animating))
          setToggleTimeout
        }, 1200)
        timers +:= id
      }
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function = null) = createElementNoProps(factory)
  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = UIExplorerPage(
      UIExplorerBlock("Default white")(
        ActivityIndicatorIOS(style = styles.default, color = "white")()
      ),
      UIExplorerBlock("Gray")(
        ActivityIndicatorIOS(style = styles.default)()
      ),
      UIExplorerBlock("Large")(
        ActivityIndicatorIOS(style = styles.default,
          color = "white",
          size = ActivityIndicatorIOSSize.LARGE)()
      ),
      UIExplorerBlock("Large custom colors")(
        View(style = styles.horizontal)(
          ActivityIndicatorIOS(
            key = "3",
            color = "#00aa00",
            size = ActivityIndicatorIOSSize.LARGE)()
        )
      ),
      UIExplorerBlock("Start/Stop")(
        ToggleAnimatingActivityIndicator()
      )
    )
  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(factory)


  object styles extends MobileStyleSheet {

    val centering = style(
      alignItems.center,
      justifyContent.center
    )

    val gray = style(backgroundColor := "#cccccc")

    val horizontal = style(flexDirection.row, justifyContent.center)

    val default = styleE(centering, gray)(height := 40)

    val animating = styleE(centering)(height := 80)
  }

  override def title: String = "ActivityIndicatorIOS"

  override def description: String = "Animated loading indicators."
}
