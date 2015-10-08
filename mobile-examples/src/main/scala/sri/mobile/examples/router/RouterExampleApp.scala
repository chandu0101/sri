package sri.mobile.examples.router

import sri.core.ReactElement
import sri.mobile.components.DefaultNavigationBar
import sri.mobile.components.DefaultNavigationBar.Style
import sri.mobile.examples.router.components.{FourthScreen, HomeScreen, Person, SecondScreen}
import sri.mobile.examples.router.routes.ThirdModule
import sri.universal.components.View
import sri.universal.router._
import sri.universal.styles.SriStyleSheet


object RouterExampleApp {

  object Home extends StaticPage

  object Second extends StaticPage

  object Fourth extends DynamicPage[Person]

  object Config extends SriRouterConfig {

    override val initialRoute = defineInitialRoute(Home, "Home", HomeScreen())

    staticRoute(Second, "Second", SecondScreen())

    dynamicRoute(Fourth, (p: Person) => FourthScreen(p))

    moduleRoutes(ThirdModule)

    override val notFound: (StaticPage, NavigatorRoute) = initialRoute

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = SriStyleSheet.wholeContainer)(
        DefaultNavigationBar(route, CustomNavigationBarTheme),
        super.renderScene(route)
      )
    }
  }

  val router = SriRouter(Config)

}

object CustomNavigationBarTheme extends Style {

  override val navBar = styleE(super.navBar)(backgroundColor := "#343536", borderBottomColor := "#ED4721")

  override val navBarTitleText = styleE(super.navBarTitleText)(color := "orange")

  override val navBarLeftButton = super.navBarLeftButton

  override val navBarButtonText = styleE(super.navBarButtonText)(color := "white")

}