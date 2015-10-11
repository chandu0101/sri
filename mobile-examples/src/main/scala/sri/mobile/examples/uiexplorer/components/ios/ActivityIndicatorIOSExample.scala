package sri.mobile.examples.uiexplorer.components.ios

import org.scalajs.dom
import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.components.ios.{ActivityIndicatorIOS, ActivityIndicatorIOSSize}
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

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

    val ctor = getTypedConstructor(js.constructorOf[Component],classOf[Component])

    def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElementNoProps(ctor)
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

  val ctor = getTypedConstructor(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(ctor)


  object styles extends UniversalStyleSheet {

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
