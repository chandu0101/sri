package sri.mobile.examples.uiexplorer

import sri.core.ReactElement
import sri.mobile.components.View
import sri.mobile.router._
import sri.mobile.styles.MobileStyleSheet

object UIExplorerApp {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends MobileRouterConfig {
    override val initialRoute = defineInitialRoute(UIExplorerList, title = "Scala.js - UIExplorer", component = UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, component = (c: ReactElement) => c)

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = MobileStyleSheet.wholeContainer)(
        DefaultNavigationBar(route),
        super.renderScene(route)
      )

    }

    override def notFound: (StaticPage, NavigatorRoute) = initialRoute
  }


  val router = MobileRouter(Config)

}
