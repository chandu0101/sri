package chandu0101.scalajs.sri.mobile.examples

import chandu0101.scalajs.sri.core.{ElementFactory, ReactElement, ReactComponent}
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet

import scala.scalajs.js.annotation.ScalaJSDefined


case class State(count : Int = 0)

@ScalaJSDefined
class HelloSriMobile  extends ReactComponent[Unit,State]{
  val displayName  = "Test"
  override def render(): ReactElement = {
    View(style = styles.container)(
      Text(style = styles.text)("Welcome to Sri Mobile"),
      Image(style = styles.image,source = ImageSource(uri = "http://www.scala-js.org/images/scala-js-logo-256.png")),
      Text(style = styles.text)("Scala.js - Future of app development!")
    )
  }
}



object styles extends NativeStyleSheet {

  val container = style(flexOne,
   backgroundColor := "rgb(76, 73, 75)",
   justifyContent.center,
   alignItems.center)

  val image = style(width := 256,height := 256,margin := 20)

  val text = style(fontWeight._500,
  fontSize := 18,
  color := "white")

}
