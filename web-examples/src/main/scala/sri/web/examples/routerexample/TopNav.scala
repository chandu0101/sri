package sri.web.examples.routerexample

import sri.universal.components._
import sri.web.all._
import sri.web.examples.routerexample.WebRouterExample.HomePage
import sri.web.router
import sri.web.router.{WebStaticPage, WebPage, WebRouterComponent}
import sri.web.styles.WebStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined}


object TopNav {


  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {
    def render() = {
      View(style = styles.navMenu)(
        getItem("Home", HomePage),
        getItem("Items", ItemsRouteModule.All)
      )
    }

    def getItem(text: String, page: WebStaticPage) = {
      println(s" current page : ${currentRoute.page} , passed page : $page , are they equal : ${page == currentRoute.page}")
      TouchableHighlight(style = styles.menuItem(page == currentRoute.page),
        onPress = () => navigateTo(page))(
          Text()(text)
        )
    }
  }


  object styles extends WebStyleSheet {


    val navMenu = style(display.flex,
      flexDirection.row,
      alignItems.center,
      backgroundColor := "#0B8AA9",
      margin := 0,
      paddingLeft := 40)

    def menuItem(selected: Boolean) = {
      val bg = if (selected) "#126884" else "transparent"
      val fw = if (selected) "500" else "normal"
      style(
        padding := 20,
        fontSize := "1.5em",
        cursor.pointer,
        color := "rgb(244, 233, 233)",
        backgroundColor := bg,
        fontWeight := fw,
        marginLeft := "10px",
        marginRight := "10px"

      )
    }

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  ctor.contextTypes = router.routerContextTypes


  def apply(ref: js.UndefOr[String] = "", key: js.Any = {}) = createElementNoProps(ctor)

}

