package sri.mobile.examples.uiexplorer.apis

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object AppStateExample extends UIExample {

  val AppState = ReactNative.AppState


  object AppStateSubscription {

    case class State(appState: String = AppState.currentState.get, previousAppSates: js.Array[String] = js.Array())

    @ScalaJSDefined
    class Component extends ReactComponent[Boolean, State] {

      initialState(State())

      def render() = View()(
        if (props) Text()(state.appState)
        else Text()(state.previousAppSates.mkString(","))
      )

      val handleAppStateChange = (appState: String) => {
        setState(state.copy(appState, state.previousAppSates.+:(appState)))
      }

      override def componentDidMount(): Unit = AppState.addEventListener("change", handleAppStateChange)

      override def componentWillUnmount(): Unit = AppState.removeEventListener("change", handleAppStateChange)
    }

    def apply(state: Boolean, key: UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component](state, key = key, ref = ref)

  }

  val Component = () => {
    UIExplorerPage(
      UIExplorerBlock("AppState.currentState")(
        Text()(AppState.currentState.get)
      ),
      UIExplorerBlock("Subscribed AppState:")(
        AppStateSubscription(true)
      ),
      UIExplorerBlock("Previous states:")(
        AppStateSubscription(false)
      )
    )
  }

  val component = () =>  createStatelessFunctionElementNoProps(Component)


  override def title: String = "AppState"

  override def description: String = "app background status"
}
