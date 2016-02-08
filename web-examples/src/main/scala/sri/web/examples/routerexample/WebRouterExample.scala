package sri.web.examples.routerexample

import sri.core.ReactElement
import sri.universal.components.View
import sri.web.router._
import sri.web.styles.WebStyleSheet

object WebRouterExample {

  object HomePage extends WebStaticPage


  object Config extends WebRouterConfig {

    override val history: History = HistoryFactory.browserHistory()

    override val initialRoute: (WebStaticPage, WebRoute) = defineInitialRoute(HomePage, HomeScreen())

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
