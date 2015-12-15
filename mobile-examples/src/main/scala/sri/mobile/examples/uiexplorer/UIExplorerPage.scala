package sri.mobile.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core.{ReactComponent, _}
import sri.mobile.ReactNative
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.{Function1, UndefOr}
import scala.scalajs.js.annotation.ScalaJSDefined

object UIExplorerPage {

  case class State(isLoading: Boolean = true)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      if (state.isLoading) Text()("Loading")
      else ScrollView(style = UniversalStyleSheet.wholeContainer, keyboardShouldPersistTaps = true,
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

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(children: ReactNode*) = createElementNoPropsWithChildren(ctor)(children: _*)

}
