package chandu0101.scalajs.sri.mobile.examples.uiexplorer.apis.android

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.ReactComponent
import chandu0101.scalajs.sri.mobile.apis.android.ToastAndroid
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import chandu0101.scalajs.sri.mobile.styles.MobileStyleSheet

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

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(factory)

  object styles extends MobileStyleSheet {
    val text = style(color := "black")
  }

}
