package sri.web.examples.uiexplorer

import sri.core.ReactElement
import sri.universal.components.DefaultNavigationBar.Style
import sri.universal.components.{ScrollView, DefaultNavigationBar, View}
import sri.universal.router._
import sri.universal.styles.UniversalStyleSheet

object UIExplorerApp {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends UniversalRouterConfig {

    override val initialRoute = defineInitialRoute(UIExplorerList, title = "UIExplorer", component = UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, component = (c: ReactElement) => c)

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = UniversalStyleSheet.wholeContainer)(
        DefaultNavigationBar(CustomNavigationBarTheme),
        ScrollView(style = UniversalStyleSheet.wholeContainer)(View(style = UIExplorerListScreen.styles.content)(
          super.renderScene(route)
        ))
      )

    }

    override val onWillFocus = (route: NavigatorRoute) => {
      println(s"will focus route ${route.title}")
    }

    override val onDidFocus = (route: NavigatorRoute) => {
      println(s"did focus route ${route.title}")
    }
    override val notFound = UniversalRouteNotFound(initialRoute._1)
  }

  object CustomNavigationBarTheme extends Style {

    override val navBar = styleE(super.navBar)(backgroundColor := "rgb(208, 18, 123)", borderBottomColor := "#ED4721")

    override val navBarTitleText = styleE(super.navBarTitleText)(color := "white")

    override val navBarLeftButton = super.navBarLeftButton

    override val navBarButtonText = styleE(super.navBarButtonText)(color := "white")

  }

  val router = UniversalRouter(Config)

}
