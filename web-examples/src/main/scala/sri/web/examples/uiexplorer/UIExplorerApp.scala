package sri.web.examples.uiexplorer

import sri.core.ReactElement
import sri.universal.components.View
import sri.universal.router._
import sri.web.styles.WebStyleSheet

object UIExplorerApp {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends UniversalRouterConfig {
    override val initialRoute = defineInitialRoute(UIExplorerList, title = "Scala.js - UIExplorer", component = UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, component = (c: ReactElement) => c)

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = WebStyleSheet.wholeContainer)(
        //        DefaultNavigationBar(route),
        TopNavBar(),
        View(style = UIExplorerListScreen.styles.content)(
          super.renderScene(route)
        )
      )

    }

    override val notFound: (StaticPage, NavigatorRoute) = initialRoute
  }


  val router = UniversalRouter(Config)

}
