package sri.web.examples.routerexample

import sri.core.ReactElement
import sri.web.examples.styles.Theme
import sri.web.router._
import sri.web.vdom.htmltags._

object WebRouterExample {

  object HomePage extends WebStaticPage

  object StaticQueryPage extends WebStaticPage

  object StaticStatePage extends WebStaticPage

  object DynamicPage extends WebDynamicPage[Int]

  object DynamicQueryPage extends WebDynamicPage[Int]

  object DynamicStatePage extends WebDynamicPage[Int]

  object Config extends WebRouterConfig {

    override val history: History = HistoryFactory.browserHistory()

    override val initialRoute: (WebStaticPage, WebRoute) = defineInitialRoute(HomePage, (route: WebRoute) => HomeScreen())

    staticRoute(page = StaticQueryPage, path = "staticquery", component = (route: WebRoute) => StaticQueryScreen(route))

    staticRoute(page = StaticStatePage, path = "staticstate", component = (route: WebRoute) => StaticStateScreen(route))

    dynamicRoute(page = DynamicPage, path = "dynamic", parser = DynamicScreen.parser, component = (id: Int, route: WebRoute) => DynamicScreen(id))

    dynamicRoute(page = DynamicQueryPage, path = "dynamicquery", parser = DynamicQueryScreen.parser, component = (id: Int, route: WebRoute) => DynamicQueryScreen(id, route))

    dynamicRoute(page = DynamicStatePage, path = "dynamicstate", parser = DynamicQueryScreen.parser, component = (id: Int, route: WebRoute) => DynamicStateScreen(id, route))

    moduleRoutes(ItemsRouteModule)

    override val notFound: WebRouteNotFound = WebRouteNotFound(HomePage)

    /**
     * this method is responsible for rendering components ,
     * @param route current route that is pushed to stack
     * @return
     */
    override def renderScene(route: WebRoute): ReactElement = {
      div(style = Theme.flexOneAndDirectionVertical)(
        TopNav(),
        super.renderScene(route)
      )
    }
  }


  val router = WebRouter(Config)
}
