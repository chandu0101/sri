package sri.mobile.examples.uiexplorer.apis

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object AppStateIOSExample extends UIExample {

  val AppSateIOS = ReactNative.AppStateIOS


  object AppStateSubscription {

    case class State(appState: String = AppSateIOS.currentState.get, previousAppSates: js.Array[String] = js.Array())

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

      override def componentDidMount(): Unit = AppSateIOS.addEventListener("change", handleAppStateChange)

      override def componentWillUnmount(): Unit = AppSateIOS.removeEventListener("change", handleAppStateChange)
    }


    val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

    def apply(state: Boolean, key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, state, key = key, ref = ref)

  }

  val Component = () => {
    UIExplorerPage(
      UIExplorerBlock("AppStateIOS.currentState")(
        Text()(AppSateIOS.currentState.get)
      ),
      UIExplorerBlock("Subscribed AppStateIOS:")(
        AppStateSubscription(true)
      ),
      UIExplorerBlock("Previous states:")(
        AppStateSubscription(false)
      )
    )
  }

  val component = () =>  createStatelessFunctionElementNoProps(Component)


  override def title: String = "AppStateIOS"

  override def description: String = "iOS app background status"
}
