package chandu0101.scalajs.sri.mobile.examples.router

import chandu0101.scalajs.sri.mobile.router.MobileRouter.NavigationBarConfig
import chandu0101.scalajs.sri.mobile.router._


object RouterExample {

  object Home extends StaticPage

  object Second extends StaticPage

  object Config extends MobileRouterConfig {

    override val initialRoute = Home -> StaticRoute("Home", HomeScreen())

    staticRoute(Second, StaticRoute("Second",SecondScreen()))

  }

  val routerElement = MobileRouter(Config,NavigationBarConfig())

}