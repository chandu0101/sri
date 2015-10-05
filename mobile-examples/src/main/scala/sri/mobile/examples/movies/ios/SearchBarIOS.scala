package sri.mobile.examples.movies.ios

import sri.core.ElementFactory._
import sri.core._
import sri.mobile._
import sri.mobile.components.ios.ActivityIndicatorIOS
import sri.mobile.components.{AutoCapitalize, TextInput, View}
import sri.mobile.styles.MobileStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object SearchBarIOS {


  @ScalaJSDefined
  class Component extends ReactComponent[Props, Unit] {

    def render() = View(style = styles.searchBar)(
      TextInput(autoCapitalize = AutoCapitalize.NONE, autoCorrect = false,
        onChange = props.onChange, onFocus = props.onFocus, placeholder = "Search a movie..", style = styles.searchBarInput
      )(),
      ActivityIndicatorIOS(animating = props.isLoading, style = styles.spinner)()
    )
  }

  object styles extends MobileStyleSheet {

    val searchBar = style(
      padding := 3,
      paddingLeft := 8,
      flexDirection.row,
      alignItems.center
    )

    val searchBarInput = style(
      fontSize := 15,
      flex := 1,
      height := 30
    )

    val spinner = style(
      width := 30
    )
  }

  case class Props(onChange: NEvent => Unit, onFocus: NEvent => Unit, isLoading: Boolean)

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  def apply(onChange: NEvent => Unit, onFocus: NEvent => Unit, isLoading: Boolean, key: UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElement(factory, Props(onChange, onFocus, isLoading), key = key, ref = ref)

}