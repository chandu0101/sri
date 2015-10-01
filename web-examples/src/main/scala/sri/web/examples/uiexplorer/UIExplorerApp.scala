package sri.web.examples.uiexplorer

import sri.core.ReactElement
import sri.web.components.nativeweb.View
import sri.web.router._
import sri.web.styles.WebStyleSheet

object UIExplorerApp {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends WebRouterConfig {
    override val initialRoute = defineInitialRoute(UIExplorerList, title = "Scala.js - UIExplorer", component = UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, component = (c: ReactElement) => c)

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = WebStyleSheet.wholeContainer)(
//        DefaultNavigationBar(route),
        super.renderScene(route)
      )

    }

    override def notFound: (StaticPage, NavigatorRoute) = initialRoute
  }


  val router = WebRouter(Config)

}
