package sri.mobile.examples.uiexplorer.components

import sri.core.{ReactComponent, ReactElement}
import sri.mobile.ReactNative
import sri.mobile.all._
import sri.core._
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerButton, UIExplorerPage}
import sri.universal.XYValue
import sri.universal.apis.{AnimatedValue, AnimatedValueXY, TimingAnimationConfig}
import sri.universal.components.{Slider, Text, View}
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.|

object AnimatedExample extends UIExample {

  object FadeInView {

    case class State(fadeAnim: AnimatedValue = new AnimatedValue(0))

    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      def render() = {
        View(animatedView = true, style = styles.fadeInViewStyle(state.fadeAnim))(
          children
        )
      }

      override def componentDidMount(): Unit = {
        ReactNative.Animated.timing(state.fadeAnim, new TimingAnimationConfig {
          toValue = 1
          duration = 2000
        }).start()
      }
    }

    def apply(children: ReactElement) = makeElementNoPropsWithChildren[Component]()(children)

  }

  object FadeInExample {

    case class State(show: Boolean = true)

    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      def render() = {
        View()(
          UIExplorerButton(() => setState(state.copy(show = !state.show)))(
            s"Press to ${if (state.show) "Hide" else "Show"}"
          ),
          state.show ?= FadeInView(View(style = styles.content)(Text()("FadeInView")))
        )
      }

    }

    def apply() = makeElement[Component]

  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {


    def render() = UIExplorerPage(
      UIExplorerBlock("FadeInView",
        description = "Uses a simple timing animation to bring opacity from 0 to 1 when the component mounts.")(
        FadeInExample()
      )
//      ,
//      UIExplorerBlock("Transform Bounce",
//        description = "One `Animated.Value` is driven by a  spring with custom constants and mapped to an  ordered set of transforms.  Each transform has  an interpolation to convert the value into the  right range and units.")(
//        FadeInExample()
//      )
    )


  }

  val component = () => makeElement[Component]


  object styles extends UniversalStyleSheet {

    def fadeInViewStyle(value: AnimatedValue) = style(opacity := value)

    val content = style(backgroundColor := "deepskyblue",
      borderWidth := 1,
      borderColor := "dodgerblue",
      padding := 20,
      margin := 20,
      borderRadius := 10,
      alignItems.center)

  }

  override def title: String = "Animated"

  override def description: String = "Animated Example"
}
