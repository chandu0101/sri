package sri.web.examples.routerexample

import sri.core._
import sri.universal.components._
import sri.web.all._
import sri.web.styles.WebStyleSheet
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


object HomeScreen {

  val Component = () => {
    View(style = styles.container)(
      Text(style = styles.text)("Home Screen")
    )
  }

  object styles extends WebStyleSheet {

    val container = style(flex := 1,
      alignItems.center,
      justifyContent.center)

    val text = style(fontWeight.bold,
      fontSize := "1.5em")

  }

  def apply() = createStatelessFunctionElementNoProps(Component)

}
