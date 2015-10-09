package sri.mobile.examples.uiexplorer.apis.android

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.apis.android.ToastAndroid
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


object ToastAndroidExample extends UIExample {

  override val title: String = "Toast Example"
  override val description: String = "Example that demonstrates the use of an Android Toast to provide feedback."


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      UIExplorerPage(
        UIExplorerBlock("Simple toast")(
          TouchableWithoutFeedback(onPress = () => ToastAndroid.show("This is a toast with short duration", ToastAndroid.SHORT))(
            Text(style = styles.text)("Click me.")
          )
        ),
        UIExplorerBlock("Toast with long duration")(
          TouchableWithoutFeedback(onPress = () => ToastAndroid.show("This is a toast with long duration", ToastAndroid.LONG))(
            Text(style = styles.text)("Click me too.")
          )
        )
      )
    }
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(ctor)

  object styles extends SriStyleSheet {
    val text = style(color := "black")
  }

}
