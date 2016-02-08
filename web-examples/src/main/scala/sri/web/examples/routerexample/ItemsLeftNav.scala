package sri.web.examples.routerexample

import sri.core._
import sri.universal.components._
import sri.web.all._
import sri.web.router
import sri.web.router.{WebDynamicPage, WebStaticPage, WebRouterComponent}
import sri.web.styles.WebStyleSheet
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


object ItemsLeftNav {

  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {
    def render() = {
      View(style = styles.container)(
        (1 until 10).toSeq.map(i => getItem(i.toString, ItemsRouteModule.Details))
      )
    }

    def getItem(id: String, page: WebDynamicPage[Int]) = {
      TouchableHighlight(style = styles.menuItem(id == currentRoute.placeholder.getOrElse("")),
        key = id,
        onPress = () => navigateToDynamic(page, id))(
          Text()(s"Item $id")
        )
    }

  }

  object styles extends WebStyleSheet {
    val container = style(width := 190,
      paddingTop := 40,
      borderRightWidth := "1px",
      borderStyle := "solid",
      borderRightColor := "grey")

    def menuItem(selected: Boolean) = {

      val bg = if (selected) "grey" else "transparent"

      style(height := 40,
        justifyContent.center,
        cursor.pointer,
        backgroundColor := bg,
        alignItems.center)
    }

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  ctor.contextTypes = router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)
}
