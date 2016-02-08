package sri.web.examples.routerexample

import sri.core._
import sri.universal.components._
import sri.web.all._
import sri.web.styles.WebStyleSheet
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


object ItemsScreen {
  val Component = () => {
    View(style = styles.container)(
      ItemsLeftNav(),
      View(style = styles.content)(
        Text(style = styles.text)("Items Screen")
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

  def apply() = createStatelessFunctionElementNoProps(Component)
}
