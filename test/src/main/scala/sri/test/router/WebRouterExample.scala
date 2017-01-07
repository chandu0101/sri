package sri.test.router

import sri.core.ReactElement
import sri.universal.components.View
import sri.web.router._
import sri.web.styles.WebStyleSheet

import scala.scalajs.js

object WebRouterExample {

  object HomePage extends WebStaticPage

  object StaticQueryPage extends WebStaticPage

  object StaticStatePage extends WebStaticPage

  object StaticStatePage2 extends WebStaticPage

  object DynamicPage extends WebDynamicPage[Int]

  object DynamicQueryPage extends WebDynamicPage[Int]

  object DynamicStatePage extends WebDynamicPage[Int]

  object Config extends WebRouterConfig {

    override val history: History = History.createMemoryHistory(js.undefined)

    override val initialRoute: (WebStaticPage, WebRoute) = defineInitialRoute(HomePage, (route: WebRoute) => HomeScreen())

    staticRoute(page = StaticQueryPage, path = "staticquery", component = (route: WebRoute) => StaticQueryScreen(route))

    staticRoute(page = StaticStatePage, path = "staticstate", component = (route: WebRoute) => StaticStateScreen(route))

    dynamicRoute(page = DynamicPage, path = "dynamic", parser = DynamicScreen.parser, component = (id: Int, route: WebRoute) => DynamicScreen(id, route))

    dynamicRoute(page = DynamicQueryPage, path = "dynamicquery", parser = DynamicQueryScreen.parser, component = (id: Int, route: WebRoute) => DynamicQueryScreen(id, route))

    dynamicRoute(page = DynamicStatePage, path = "dynamicstate", parser = DynamicQueryScreen.parser, component = (id: Int, route: WebRoute) => DynamicStateScreen(id, route))

    moduleRoutes(ItemsRouteModule)

    override val notFound: WebRouteNotFound = WebRouteNotFound(HomePage)

  }


  val router = WebRouter(Config)
}
