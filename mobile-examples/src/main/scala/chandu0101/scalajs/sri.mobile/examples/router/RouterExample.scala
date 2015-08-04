package chandu0101.scalajs.sri.mobile.examples.router

import chandu0101.scalajs.sri.mobile.router.{MobileRouter, StaticRoute, MobileRouterConfig, StaticPage}





object Home extends StaticPage

object Second extends StaticPage

object Config extends MobileRouterConfig {

//  initialRoute(Home,StaticRoute(HomeScreen()))
  addStaticRoute(Home,StaticRoute(HomeScreen()))
  addStaticRoute(Second,StaticRoute(SecondScreen()))

  override val initialRoute: (StaticPage, StaticRoute) = Home -> StaticRoute(HomeScreen())
}

object  AppRouter {

  val routerElement = MobileRouter(Config)

}