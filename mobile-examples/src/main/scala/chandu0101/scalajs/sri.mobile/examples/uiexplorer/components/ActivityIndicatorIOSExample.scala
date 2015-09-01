package chandu0101.scalajs.sri.mobile.examples.uiexplorer.components

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.{ReactComponent, RefType}
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object ActivityIndicatorIOSExample extends UIExample {


  object ToggleAnimatingActivityIndicator {

    case class State(animating: Boolean = true)


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      def render() = ActivityIndicatorIOS(animating = state.animating,
        style = styles.animating,
        size = ActivityIndicatorIOSSize.LARGE)

      override def componentDidMount() = {
        setToggleTimeout
      }

      def setToggleTimeout: Unit = dom.window.setTimeout(() => {
        setState(state.copy(animating = !state.animating))
        setToggleTimeout
      }, 1200)
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(key: js.UndefOr[String] = js.undefined, ref: RefType = null) = createElementNoProps(factory)
  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = UIExplorerPage(
      UIExplorerBlock("Default white")(
        ActivityIndicatorIOS(style = styles.default, color = "white")
      ),
      UIExplorerBlock("Gray")(
        ActivityIndicatorIOS(style = styles.default)
      ),
      UIExplorerBlock("Large")(
        ActivityIndicatorIOS(style = styles.default,
          color = "white",
          size = ActivityIndicatorIOSSize.LARGE)
      ),
      UIExplorerBlock("Large custom colors")(
        View(style = styles.horizontal)(
          ActivityIndicatorIOS(
            key = "3",
            color = "#00aa00",
            size = ActivityIndicatorIOSSize.LARGE)
        )
      ),
      UIExplorerBlock("Start/Stop")(
        ToggleAnimatingActivityIndicator()
      )
    )
  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(factory)


  object styles extends NativeStyleSheet {

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
