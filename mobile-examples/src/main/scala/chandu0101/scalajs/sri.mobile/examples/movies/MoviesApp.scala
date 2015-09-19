package chandu0101.scalajs.sri.mobile.examples.movies

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative
import chandu0101.scalajs.sri.mobile.components.View
import chandu0101.scalajs.sri.mobile.router._
import chandu0101.scalajs.sri.mobile.styles.MobileStyleSheet

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