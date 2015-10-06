package sri.web.examples.uiexplorer


import sri.core.ElementFactory._
import sri.universal.components.{Text, TouchableOpacity, View}
import sri.universal.router
import sri.universal.router.SriRouterComponent
import sri.web.styles.WebStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}


object TopNavBar {

  object styles extends WebStyleSheet {

    val nav = style(display.flex,
      position.fixed,
      width := "100%",
      top := 0,
      flexDirection.row,
      backgroundColor := "rgb(208, 18, 123)",
      height := "64px",
      color := "white",
      alignItems.center,
      justifyContent.spaceBetween,
      zIndex := 100)

    val block = style(flex := 1)

    val back = style(marginLeft := "40px",
      width := "50px")
    val next = style(width := "50px")
    val text = style(color := "white")

  }

  @ScalaJSDefined
  class Component extends SriRouterComponent[Unit, Unit] {
    def render() = View(style = styles.nav)(
      View(style = styles.back)(
        if (showBackButton()) TouchableOpacity(onPress = () => navigateBack())(
          Text(style = styles.text)("Back")
        )
        else null
      ),
      View(style = styles.block)(Text(style = styles.text)("Title")),
      View(style = styles.next)(Text(style = styles.text)(""))
    )
  }


  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(factory, key = key, ref = ref)
}
