package sri.mobile.examples.movies.android

import sri.core._
import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.components.android.{ProgressBarAndroid, ProgressBarAndroidStyle}
import sri.mobile.components.{TouchableNativeFeedback, TouchableNativeFeedbackS}
import sri.universal.ReactEvent
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object SearchBarAndroid {


  @ScalaJSDefined
  class Component extends ReactComponent[Props, Unit] {

    def render() = {

      val loadingView = if (props.isLoading) ProgressBarAndroid(styleAttr = ProgressBarAndroidStyle.LARGE, style = styles.spinner)()
      else View(style = styles.spinner)()

      val background = if (IS_RIPPLE_EFFECT_SUPPORTED) TouchableNativeFeedbackS.SelectableBackgroundBorderless() else TouchableNativeFeedbackS.SelectableBackground()

      View(style = styles.searchBar)(
        TouchableNativeFeedback(background = background, onPress = focusInput _)(
          View()(
            Image(sourceDynamic = androidSearchWhite, style = styles.icon)()
          )
        ),
        TextInput(ref = storeTextInputRef _, autoCapitalize = AutoCapitalize.NONE, autoCorrect = false,
          onChange = props.onChange, onFocus = props.onFocus, placeholder = "Search a movie..", style = styles.searchBarInput
        )(),
        loadingView
      )
    }

    val IS_RIPPLE_EFFECT_SUPPORTED = ReactNative.Platform.Version >= 21

    var textInputRef: TextInputM = null

    val androidSearchWhite = load[js.Dynamic]("./images/android_search_white.png")

    def storeTextInputRef(tref: TextInputM) = {
      textInputRef = tref
    }

    def focusInput() = {
      if (textInputRef != null) textInputRef.focus()
    }

    def onNativeFeedbackPress() = {
      if (textInputRef != null) textInputRef.focus()
    }
  }

  object styles extends UniversalStyleSheet {

    val searchBar = style(
      height := 56,
      backgroundColor := "#a9a9a9",
      flexDirection.row,
      alignItems.center
    )

    val searchBarInput = style(
      fontSize := 20,
      flex := 1,
      height := 50,
      fontWeight.bold,
      color := "white",
      padding := 0,
      backgroundColor := "transparent"
    )

    val spinner = style(
      width := 30,
      height := 30
    )

    val icon = style(width := 24,
      height := 24,
      marginHorizontal := 8)
  }

  case class Props(onChange: ReactEvent => Unit, onFocus: ReactEvent => Unit, isLoading: Boolean)

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(onChange: ReactEvent => Unit, onFocus: ReactEvent => Unit, isLoading: Boolean, key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, Props(onChange, onFocus, isLoading), key = key, ref = ref)

}