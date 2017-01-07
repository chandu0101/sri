package sri.mobile.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core.{ReactComponent, _}
import sri.mobile.ReactNative
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object UIExplorerPageLazyLoad {

  case class State(isLoading: Boolean = true)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      if (state.isLoading) View(style = styles.spinner)(ActivityIndicator(size = ActivityIndicatorSize.LARGE, color = "black")())
      else ScrollView(style = UniversalStyleSheet.wholeContainer, keyboardShouldPersistTaps = ScrollViewKeyboardPersistTaps.HANDLED,
        keyboardDismissMode = keyboardDismissMode.INTERACTIVE)(
        children
      )
    }

    override def componentDidMount(): Unit = {
      ReactNative.InteractionManager.runAfterInteractions(() => {
        setState(state.copy(isLoading = false))
      })
    }
  }

  object styles extends UniversalStyleSheet {
    val spinner = style(justifyContent.center,
      alignItems.center,
      marginTop := 40)
  }


  def apply(children: ReactNode*) = makeElementNoPropsWithChildren[Component]()(children: _*)

}
