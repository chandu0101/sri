package sri.mobile.examples.movies

import sri.core.ReactElement
import sri.mobile
import sri.mobile.components.View
import sri.mobile.router._
import sri.mobile.styles.MobileStyleSheet

import scala.scalajs.js

object MoviesApp {


  object Home extends StaticPage

  object DetailsPage extends DynamicPage[js.Dynamic]

  object Config extends MobileRouterConfig {

    val initialRoute = defineInitialRoute(Home, "Movies", SearchScreen())

    dynamicRoute(DetailsPage, (movie: js.Dynamic) => MovieDetails(movie))

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = styles.c)(
        if (mobile.isIOSPlatform) DefaultNavigationBar(route)
        else {
          if (route.page != Home)
            DefaultAndroidNavigationBar(route)
          else null
        },
        super.renderScene(route)
      )
    }

    override def notFound: (StaticPage, NavigatorRoute) = initialRoute
  }

  val router = MobileRouter(Config)


}

object styles extends MobileStyleSheet {
  val c = style(flexOne)
}