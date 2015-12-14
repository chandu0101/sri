package sri.mobile.examples.uiexplorer.apis.android

import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.components.TouchableNativeFeedback
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

object IntentAndroidExample extends UIExample {

  override val title: String = "IntentAndroidExample"
  override val description: String = "Shows how to use Android Intents to open URLs."

  object OpenURLButton {

    val Component = (props: String) => TouchableNativeFeedback(onPress = () => handleClick(props))(
      View(style = styles.button)(
        Text(style = styles.text)(s"Open ${props}")
      )
    )

    def handleClick(url: String): Unit = {
      ReactNative.IntentAndroid.canOpenURL(url, (supported: Boolean) => {
        if (supported) ReactNative.IntentAndroid.openURL(url)
        else println(s"Dont know how to open this url ${url}")
      })
    }

    def apply(url: String) = createStatelessFunctionElement(Component, url)
  }

  val Component = () => {
    UIExplorerPage(
      UIExplorerBlock("OPen external URLs")(
        OpenURLButton("http://www.scala-js.org/"),
        OpenURLButton("https://www.facebook.com"),
        OpenURLButton("http://facebook.com"),
        OpenURLButton("geo:37.484847,-122.148386")
      )
    )
  }

  val component = createStatelessFunctionElementNoProps(Component)

  object styles extends UniversalStyleSheet {
    val container = style(flexOne,
      backgroundColor := "white",
      padding := 10,
      paddingTop := 30)

    val button = style(padding := 10,
      backgroundColor := "#3B5998",
      marginBottom := 10)
    val text = style(color := "white")
  }

}
