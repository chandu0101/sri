package sri.mobile.examples.uiexplorer

import sri.core.ReactElement
import sri.mobile.components.DefaultNavigationBar
import sri.universal.components.View
import sri.universal.router._
import sri.universal.styles.SriStyleSheet

object UIExplorerApp {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends UniversalRouterConfig {
    override val initialRoute = defineInitialRoute(UIExplorerList, title = "Scala.js - UIExplorer", component = UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, component = (c: ReactElement) => c)

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = SriStyleSheet.wholeContainer)(
        DefaultNavigationBar(route),
        super.renderScene(route)
      )
    }

    override val notFound: (StaticPage, NavigatorRoute) = initialRoute
  }


  val router = UniversalRouter(Config)

}
