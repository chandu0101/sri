package sri.web.examples.uiexplorer

import sri.core.ReactElement
import sri.universal.components.DefaultNavigationBar.Style
import sri.universal.components.{DefaultNavigationBar, View}
import sri.universal.router._
import sri.web.styles.WebStyleSheet

object UIExplorerApp {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends UniversalRouterConfig {
    override val initialRoute = defineInitialRoute(UIExplorerList, title = "UIExplorer", component = UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, component = (c: ReactElement) => c)

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = WebStyleSheet.wholeContainer)(
                DefaultNavigationBar(route,CustomNavigationBarTheme),
        View(style = UIExplorerListScreen.styles.content)(
          super.renderScene(route)
        )
      )

    }

    override val notFound: (StaticPage, NavigatorRoute) = initialRoute
  }

  object CustomNavigationBarTheme extends Style {

    override val navBar = styleE(super.navBar)(backgroundColor := "rgb(208, 18, 123)", borderBottomColor := "#ED4721")

    override val navBarTitleText = styleE(super.navBarTitleText)(color := "white")

    override val navBarLeftButton = super.navBarLeftButton

    override val navBarButtonText = styleE(super.navBarButtonText)(color := "white")

  }

  val router = UniversalRouter(Config)

}
