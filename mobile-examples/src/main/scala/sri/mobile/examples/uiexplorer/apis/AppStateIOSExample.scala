package sri.mobile.examples.uiexplorer.apis

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.components._
import sri.mobile.examples.uiexplorer.UIExplorerPage
import sri.mobile.examples.uiexplorer.{UIExplorerPage, UIExample, UIExplorerBlock}

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


    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(state: Boolean, key: UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElement(factory, state, key = key, ref = ref)

  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = UIExplorerPage(
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

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(factory)


  override def title: String = "AppStateIOS"

  override def description: String = "iOS app background status"
}
