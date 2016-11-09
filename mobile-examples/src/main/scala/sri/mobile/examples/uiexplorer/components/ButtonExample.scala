package sri.mobile.examples.uiexplorer.components

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object ButtonExample extends UIExample {

  val Component = () => {
    UIExplorerPage(
      UIExplorerBlock("Simple Button")(
        Text()("The title and onPress handler are required. It is recommended to set accessibilityLabel to help make your app usable by everyone. "),
        Button(title = "Press Me",
          accessibilityLabel = "See an informative alert",
          onPress = onButtonPress _)()
      ),
      UIExplorerBlock("Adjusted color")(
        Text()("adjusts the color in a way that looks standard on each platform. On iOS, the color prop controls the color of the text. On  Android, the color adjusts the background color of the button. "),
        Button(title = "Press Purple",
          accessibilityLabel = "Learn more about purple",
          color="#841584",
          onPress = onButtonPress _)()
      ),
      UIExplorerBlock("Fit to text layout")(
        Text()("This layout strategy lets the title define the width of the button "),
        View(style = styles.button)(
          Button(title = "This looks great!",
            accessibilityLabel = "This sounds great!",
            onPress = onButtonPress _)(),
          Button(title = "OK!",
            accessibilityLabel = "Ok, Great!",
            color="#841584",
            onPress = onButtonPress _)()
        )
      ),
      UIExplorerBlock("Disabled Button")(
        Text()("All interactions for the component are disabled."),
        Button(title = "I Am Disabled",
          disabled = true,
          accessibilityLabel = "See an informative alert",
          onPress = onButtonPress _)()
      )
    )
  }

  def onButtonPress() = ReactNative.Alert.alert("Button has been pressed")


  val component = () => createStatelessFunctionElementNoProps(Component)


  object styles extends UniversalStyleSheet {

   val button = style(flexDirection.row,justifyContent.spaceBetween)
  }

  override def title: String = "Button"

  override def description: String = "Simple React Native button component."
}