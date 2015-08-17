package chandu0101.scalajs.sri.mobile.examples.movies

import chandu0101.scalajs.sri.mobile.router.MobileRouter.NavigationBarConfig
import chandu0101.scalajs.sri.mobile.router._

import scala.scalajs.js

object MoviesRouter {


  object Home extends StaticPage

  object DetailsPage extends DynamicPage[js.Dynamic]

  object Config extends MobileRouterConfig {

    val initialRoute = Home -> StaticRoute("Movies", SearchScreen())

    dynamicRoute(DetailsPage, DynamicRoute((movie: js.Dynamic) => MovieDetails(movie)))

  }

  val router = MobileRouter(Config, NavigationBarConfig())


}
