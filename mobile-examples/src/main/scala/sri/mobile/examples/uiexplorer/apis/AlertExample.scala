package sri.mobile.examples.uiexplorer.apis

import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.apis.AlertButton
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.JSRichGenTraversableOnce


object AlertExample extends UIExample {
  override def title: String = "Alert"


  val Component = () => {
    val a1 = () => ReactNative.Alert.alert("Foo title", "alert message")
    val a2 = () => ReactNative.Alert.alert("Foo title", "alert message", buttons = js.Array(new AlertButton { text = "Button"; onPress = (() => println("Button Pressed")): js.Function}))
    val a3 = () => ReactNative.Alert.alert(
      title = "Foo Title",
      message = "My Alert Msg",
      buttons = js.Array(new AlertButton { text = "Foo"; onPress = (() => println("Foo Button Pressed")):js.Function },
        new AlertButton { text = "Bar" ; onPress = (() => println("Bar Button Pressed")): js.Function }))
    val a4 = () => ReactNative.Alert.alert(
      title = "Foo Title",
      buttons = js.Array(new AlertButton { text = "Foo" ; onPress =  (() => println("Foo Button Pressed")):js.Function },
        new AlertButton{ text = "Bar"; onPress = (() => println("Bar Button Pressed")):js.Function },
        new AlertButton{ text = "Baz"; onPress = (() => println("Baz Button Pressed")): js.Function }))
    val a5 = () => ReactNative.Alert.alert(title = "Foo title",
      buttons = (1 to 10).map(i => new AlertButton{ text = s"Button $i" ; onPress = (() => println(s"Button $i pressed")):js.Function }).toJSArray)

    UIExplorerPage(
      UIExplorerBlock("Alerts")(
        View(style = json(flex = 1))(
          TouchableHighlight(style = styles.wrapper, onPress = a1)(
            View(style = styles.button)(
              Text()("Alert Message with default button")
            )
          ),
          TouchableHighlight(style = styles.wrapper, onPress = a2)(
            View(style = styles.button)(
              Text()("Alert with only one button")
            )
          ),
          TouchableHighlight(style = styles.wrapper, onPress = a3)(
            View(style = styles.button)(
              Text()("Alert with two buttons")
            )
          ),
          TouchableHighlight(style = styles.wrapper, onPress = a4)(
            View(style = styles.button)(
              Text()("Alert with 3 buttons")
            )
          ),
          TouchableHighlight(style = styles.wrapper, onPress = a5)(
            View(style = styles.button)(
              Text()("Alert with too many buttons")
            )
          )
        )
      )
    )
  }


  val component = () => createStatelessFunctionElementNoProps(Component)

  object styles extends UniversalStyleSheet {
    val alertsContainer = style(backgroundColor := "white",
      padding := 20)
    val wrapper = style(borderRadius := 5, marginBottom := 5)
    val button = style(backgroundColor := "#eeeeee", padding := 10)
  }

  override def description: String = "alerts and action sheets"
}
