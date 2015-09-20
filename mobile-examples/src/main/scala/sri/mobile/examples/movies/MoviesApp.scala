package sri.mobile.examples.movies

import sri.core.ReactElement
import sri.mobile.ReactNative
import sri.mobile.components.View
import sri.mobile.router._
import sri.mobile.styles.MobileStyleSheet

import scala.scalajs.js

object MoviesApp {


  object Home extends StaticPage

  object DetailsPage extends DynamicPage[js.Dynamic]

  object Config extends MobileRouterConfig {

    val initialRoute = Home -> StaticRoute("Movies", SearchScreen())

    dynamicRoute(DetailsPage, DynamicRoute((movie: js.Dynamic) => MovieDetails(movie)))

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = styles.c)(
        if (ReactNative.Platform.OS == "ios") DefaultNavigationBar(route)
        else {
          if (route.title.toString.toLowerCase != "movies")
            DefaultAndroidNavigationBar(route)
          else null
        },
        super.renderScene(route)
      )
    }

    override def notFound: (StaticPage, StaticRoute) = initialRoute
  }

  val router = MobileRouter(Config)


}

object styles extends MobileStyleSheet {
  val c = style(flexOne)
}