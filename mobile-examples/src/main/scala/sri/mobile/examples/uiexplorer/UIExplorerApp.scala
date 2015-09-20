package sri.mobile.examples.uiexplorer

import sri.core.ReactElement
import sri.mobile.components.View
import sri.mobile.router._
import sri.mobile.styles.MobileStyleSheet

object UIExplorerApp {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends MobileRouterConfig {
    override def initialRoute = UIExplorerList -> StaticRoute("Scala.js - UIExplorer", UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, DynamicRoute((c: ReactElement) => c))

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = MobileStyleSheet.wholeContainer)(
        DefaultNavigationBar(route),
        super.renderScene(route)
      )

    }

    override def notFound: (StaticPage, StaticRoute) = initialRoute
  }

  object styles extends MobileStyleSheet {

  }
  val router = MobileRouter(Config)

}
