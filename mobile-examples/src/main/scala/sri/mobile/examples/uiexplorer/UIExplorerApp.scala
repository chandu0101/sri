package sri.mobile.examples.uiexplorer

import sri.core.ReactElement
import sri.universal.components.{DefaultNavigationBar, View}
import sri.universal.router._
import sri.universal.styles.UniversalStyleSheet

object UIExplorerApp {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends UniversalRouterConfig {
    override val initialRoute = defineInitialRoute(UIExplorerList, title = "Scala.js - UIExplorer", component = UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, component = (c: ReactElement) => c)

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = UniversalStyleSheet.wholeContainer)(
        DefaultNavigationBar(),
        super.renderScene(route)
      )
    }

    override val onWillFocus = (route: NavigatorRoute) => {
      println(s"will focus route ${route.title}")
    }

    override val onDidFocus = (route: NavigatorRoute) => {
      println(s"did focus route ${route.title}")
    }

    override val notFound: (StaticPage, NavigatorRoute) = initialRoute
  }



  val router = UniversalRouter(Config)

}
