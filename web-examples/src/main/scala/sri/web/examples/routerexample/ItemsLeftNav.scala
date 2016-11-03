package sri.web.examples.routerexample

import sri.core._
import sri.web.all._
import sri.web.examples.Button
import sri.web.router
import sri.web.router.{WebDynamicPage, WebRouterComponent}
import sri.web.styles.WebStyleSheet
import sri.web.vdom.htmltags._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined}


object ItemsLeftNav {

  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {
    def render() = {
      div(style = styles.container)(
        (1 until 10).toSeq.map(i => getItem(i.toString, ItemsRouteModule.Details))
      )
    }

    def getItem(id: String, page: WebDynamicPage[Int]) = {
      Button(style = styles.menuItem(id == currentRoute.placeholder.getOrElse("")),
        key = id,
        onPress = () => navigateToDynamic(page, id))(
        span()(s"Item $id")
      )
    }

  }

  object styles extends WebStyleSheet {
    val container = style(width := 190,
      paddingTop := 40,
      display.flex,
      flexDirection.column,
      border := 0,
      borderRightWidth := "1px",
      borderStyle := "solid",
      borderRightColor := "grey")

    def menuItem(selected: Boolean) = {

      val bg = if (selected) "grey" else "transparent"

      style(height := 40,
        justifyContent.center,
        display.flex,
        flexDirection.column,
        cursor.pointer,
        backgroundColor := bg,
        alignItems.center)
    }

  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)
}
