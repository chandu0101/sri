package sri.web.examples.routerexample

import sri.web.all._
import sri.web
import sri.web.examples.Button
import sri.web.examples.routerexample.WebRouterExample._
import sri.web.examples.styles.Colors
import sri.web.router.{WebDynamicPage, WebRouterComponent, WebStaticPage}
import sri.web.styles.WebStyleSheet
import sri.web.vdom.htmltags._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}


object TopNav {

  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {
    def render() = {
      div(style = styles.navMenu)(
        getStaticItem("Home", HomePage),
        getStaticItem("Static Query", StaticQueryPage, query = new StaticQuery(sorting = "ASC", option = js.undefined)),
        getStaticItem("Static State", StaticStatePage, state = json(counter = 10)),
        getDynamicItem("Dynamic", DynamicPage, "123"),
        getDynamicItem("Dynamic Query", DynamicQueryPage, "125", query = json(includeDuplicates = true)),
        getDynamicItem("Dynamic State", DynamicStatePage, "129", state = json(hasChild = true)),
        getStaticItem("Items", ItemsRouteModule.All)
      )
    }

    def getStaticItem(text: String, page: WebStaticPage, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = {
      Button(style = styles.menuItem(page == currentRoute.page),
        onPress = () => navigateTo(page, query = query, state = state))(
          span()(text)
        )
    }

    def getDynamicItem(text: String, page: WebDynamicPage[_], placeholder: String, query: js.UndefOr[js.Object] = js.undefined, state: js.UndefOr[js.Object] = js.undefined) = {
      Button(style = styles.menuItem(page == currentRoute.page),
        onPress = () => navigateToDynamic(page, placeholder = placeholder, query = query, state = state))(
          span()(text)
        )
    }
  }

  @ScalaJSDefined
  class StaticQuery(val sorting: String, val option: js.UndefOr[String] = js.undefined) extends js.Object


  object styles extends WebStyleSheet {


    val navMenu = style(
      display.flex,
      flexDirection.row,
      alignItems.center,
      backgroundColor := Colors.blue,
      margin := 0,
      paddingLeft := 40)

    def menuItem(selected: Boolean) = {
      val bg = if (selected) Colors.darkBlue else Colors.transparent
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

  ctor.contextTypes = web.router.routerContextTypes


  def apply(ref: js.UndefOr[String] = "", key: js.Any = {}) = createElementNoProps(ctor)

}

