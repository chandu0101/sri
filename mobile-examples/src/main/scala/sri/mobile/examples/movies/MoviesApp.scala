package sri.mobile.examples.movies

import sri.core.ReactElement
import sri.mobile.all._
import sri.mobile.components.DefaultNavigationBar
import sri.mobile.examples.movies.android.DefaultAndroidNavigationBar
import sri.universal.components.View
import sri.universal.router._
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js

object MoviesApp {

  object Home extends StaticPage

  object DetailsPage extends DynamicPage[js.Dynamic]

  object Config extends UniversalRouterConfig {

    val initialRoute = defineInitialRoute(Home, "Movies", SearchScreen())

    dynamicRoute(DetailsPage, (movie: js.Dynamic) => MovieDetails(movie))

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = styles.c)(
        if (isIOSPlatform) DefaultNavigationBar(route)
        else {
          if (route.page != Home)
            DefaultAndroidNavigationBar(route)
          else null
        },
        super.renderScene(route)
      )
    }

    override val notFound: (StaticPage, NavigatorRoute) = initialRoute
  }

  val router = UniversalRouter(Config)


}

object styles extends SriStyleSheet {
  val c = style(flexOne)
}