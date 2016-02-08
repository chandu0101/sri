package sri.web.examples

import sri.core._
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet
import sri.web.all._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}
import scala.util.Try

object Contact {


  @ScalaJSDefined
  class Component extends ReactComponent[Int, Unit] {
    def render() = {
      View(style = styles.container)(
        Text(style = styles.text)(s"Welcome to Sri Web "),
        Text(style = styles.text)(s"Hello Contact dude : ${props}")
      )
    }

  }

  object styles extends UniversalStyleSheet {

    val container = style(flexOne,
      backgroundColor := "rgb(175, 9, 119)",
      justifyContent.center,
      alignItems.center)

    val image = style(width := 256, height := 256, margin := 20)

    val text = style(fontWeight._500,
      fontSize := 18,
      color := "white")

  }

  def parser(str : String)  = Try(str.toInt).getOrElse(-1)

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(id : Int,key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor,id, key = key, ref = ref)
}
