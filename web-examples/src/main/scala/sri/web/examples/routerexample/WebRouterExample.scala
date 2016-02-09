package sri.web.examples.routerexample

import sri.core.ReactElement
import sri.universal.components.View
import sri.web.router._
import sri.web.styles.WebStyleSheet

object WebRouterExample {

  object HomePage extends WebStaticPage

  object StaticQueryPage extends WebStaticPage

  object StaticStatePage extends WebStaticPage

  object DynamicPage extends WebDynamicPage[Int]

  object DynamicQueryPage extends WebDynamicPage[Int]

  object DynamicStatePage extends WebDynamicPage[Int]

  object Config extends WebRouterConfig {

    override val history: History = HistoryFactory.browserHistory()

    override val initialRoute: (WebStaticPage, WebRoute) = defineInitialRoute(HomePage, HomeScreen())

    staticRoute(page = StaticQueryPage, path = "staticquery", component = StaticQueryScreen())

    staticRoute(page = StaticStatePage, path = "staticstate", component = StaticStateScreen())

    dynamicRoute(page = DynamicPage, path = "dynamic", parser = DynamicScreen.parser, component = (id: Int) => DynamicScreen(id))

    dynamicRoute(page = DynamicQueryPage, path = "dynamicquery", parser = DynamicQueryScreen.parser, component = (id: Int) => DynamicQueryScreen(id))

    dynamicRoute(page = DynamicStatePage, path = "dynamicstate", parser = DynamicQueryScreen.parser, component = (id: Int) => DynamicStateScreen(id))

    moduleRoutes(ItemsRouteModule)

    override val notFound: WebRouteNotFound = WebRouteNotFound(HomePage)

    /**
     * this method is responsible for rendering components ,
     * @param route current route that is pushed to stack
     * @return
     */
    override def renderScene(route: WebRoute): ReactElement = {
      View(style = WebStyleSheet.wholeContainer)(
        TopNav(),
        super.renderScene(route)
      )
    }
  }


  val router = WebRouter(Config)
}
