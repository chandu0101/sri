package sri.mobile.examples.uiexplorer.apis

import org.scalajs
import org.scalajs.dom.window
import org.scalajs.dom.raw.{PositionOptions, PositionError, Position}
import sri.core.ReactElement
import sri.mobile.examples.uiexplorer.UIExample
import sri.core._
import sri.universal.components._
import sri.mobile.all._
import sri.universal.styles.UniversalStyleSheet
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr => U, JSON, undefined => undefined}

object GeolocationExample extends UIExample {


  case class State(initialPosition: String = "unknown", lastPosition: String = "unknown")

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      View()(
        Text()(
          Text(style = styles.title)("Initial position:"),
          state.initialPosition
        ),
        Text()(
          Text(style = styles.title)("Current position:"),
          state.lastPosition
        )
      )
    }

    var watchId: js.UndefOr[Int] = undefined

    override def componentDidMount(): Unit = {
      val positionOptions = json(enableHighAccuracy = true,
        timeout = 20000,
        maximumAge = 1000)

      window.navigator.geolocation.getCurrentPosition(
        (position: Position) => setState(state.copy(initialPosition = JSON.stringify(position))),
        (error: PositionError) => window.alert(error.message),
        positionOptions.asInstanceOf[PositionOptions]
      )

      watchId = window.navigator.geolocation.watchPosition((position: Position) => {
        setState(state.copy(lastPosition = JSON.stringify(position)))

      })
    }

    override def componentWillUnmount(): Unit = {
      if (watchId.isDefined) window.navigator.geolocation.clearWatch(watchId.get)
    }
  }

  object styles extends UniversalStyleSheet {
    val title = style(fontWeight._500)
  }


  override val component = () => makeElement[Component]

  override def title: String = "Geolocation"


  override def description: String = "Examples of using the Geolocation API."
}
