package sri.mobile.examples

import sri.mobile.all._
import sri.mobile.components.android.{ProgressBarAndroid, ProgressBarAndroidStyle}
import sri.mobile.components.ios.{ActivityIndicatorIOS, ActivityIndicatorIOSSize}
import sri.universal.styles.UniversalStyleSheet

object Spinner {

  val Component  = (props: Props) => {
    if (isIOSPlatform) ActivityIndicatorIOS(animating = true,
      size = if(props.large) ActivityIndicatorIOSSize.LARGE else ActivityIndicatorIOSSize.SMALL,
      color = "black")()
    else {
      ProgressBarAndroid(styleAttr = if(props.large) ProgressBarAndroidStyle.Inverse else ProgressBarAndroidStyle.SMALL)()
    }

  }

  object styles extends UniversalStyleSheet {

    val spinner = style(width := 40,
      height := 40)
  }
  case class Props(color : String,large: Boolean)

  def apply(color : String = "grey",large: Boolean = true,key : String= "spinner") = createStatelessFunctionElement(Component, Props(color,large),key)
}