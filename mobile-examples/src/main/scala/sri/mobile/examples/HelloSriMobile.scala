package sri.mobile.examples

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.components._
import sri.mobile.styles.MobileStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


object HelloSriMobile {

  object styles extends MobileStyleSheet {

    val container = style(flexOne,
      backgroundColor := "rgb(76, 73, 75)",
      justifyContent.center,
      alignItems.center)

    val image = style(width := 256, height := 256, margin := 20)

    val text = style(fontWeight._500,
      fontSize := 18,
      color := "white")

  }

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {

    def render() = {
      View(style = styles.container)(
        Text(style = styles.text)(s"Welcome to Sri Mobile(${ReactNative.Platform.OS})"),
        Image(style = styles.image, source = ImageSource(uri = "http://www.scala-js.org/images/scala-js-logo-256.png"))(),
        Text(style = styles.text)("Scala.js - Future of app development!")
      )
    }
  }

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply() = createElementNoProps(factory)

}

