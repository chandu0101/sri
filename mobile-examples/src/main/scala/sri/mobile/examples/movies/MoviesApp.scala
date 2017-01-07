package sri.mobile.examples.movies

import sri.core.ReactElement
import sri.mobile.all._
import sri.mobile.examples.movies.android.DefaultAndroidNavigationBar
import sri.universal.components.{DefaultNavigationBar, View}
import sri.universal.router._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js

object MoviesApp {

  object Home extends StaticPage

  object DetailsPage extends DynamicPage[js.Dynamic]

  object Config extends UniversalRouterConfig {

    val initialRoute = defineInitialRoute(Home, "Movies", SearchScreen())

    dynamicRoute(DetailsPage, (movie: js.Dynamic) => MovieDetails(movie))

    override def renderScene(route: NavigatorRoute,ctrl: UniversalRouterCtrl): ReactElement = {
      View(style = styles.c)(
        if (isIOSPlatform) DefaultNavigationBar()
        else {
          if (route.page != Home)
            DefaultAndroidNavigationBar(route)
          else null
        },
        super.renderScene(route,ctrl)
      )
    }

    override val notFound = UniversalRouteNotFound(initialRoute._1)

  }

  val router = UniversalRouter(Config)


}

object styles extends UniversalStyleSheet {
  val c = style(flexOne)
}