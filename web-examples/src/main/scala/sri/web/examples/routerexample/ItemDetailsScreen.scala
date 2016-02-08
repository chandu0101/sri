package sri.web.examples.routerexample

import sri.core._
import sri.universal.components._
import sri.web.all._
import sri.web.styles.WebStyleSheet
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}
import scala.util.Try


object ItemDetailsScreen {

  val Component = (id: Int) => {
    View(style = styles.container)(
      ItemsLeftNav(),
      View(style = styles.content)(
        Text(style = styles.text)(s"${if (id >= 0) s"Item details of :: $id" else "Item not found"}")
      )
    )
  }

  object styles extends WebStyleSheet {

    val container = style(flex := 1, flexDirection.row)

    val content = style(flex := 1,
      alignItems.center,
      justifyContent.center)

    val text = style(fontWeight.bold,
      fontSize := "1.5em")

  }


  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int) = createStatelessFunctionElement(Component, id)

}
