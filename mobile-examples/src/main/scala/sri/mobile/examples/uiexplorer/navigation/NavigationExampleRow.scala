package sri.mobile.examples.uiexplorer.navigation

import sri.core._
import sri.mobile.ReactNative
import sri.universal.components._
import sri.mobile.all._
import sri.universal.styles.UniversalStyleSheet
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


object NavigationExampleRow {

  val Component = (props: Props) => {
    if (props.onPress.isDefined) TouchableHighlight(onPress = props.onPress, style = styles.row, underlayColor = "#D0D0D0")(
      Text(style = styles.buttonText)(props.text)
    )
    else View(style = styles.row)(Text(style = styles.buttonText)(props.text))
  }

  case class Props(text: String, onPress: js.UndefOr[() => _])

  object styles extends UniversalStyleSheet {

    val row = style(padding := 15,
      backgroundColor := "white",
      borderBottomWidth := ReactNative.StyleSheet.hairlineWidth,
      borderBottomColor := "#CDCDCD"
    )

    val rowText = style(fontSize := 17)

    val buttonText = style(fontSize := 17,
      fontWeight._500)
  }

  def apply(text: String, onPress: js.UndefOr[() => _] = js.undefined) = createStatelessFunctionElement(Component, Props(text, onPress))
}
