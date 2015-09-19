package chandu0101.scalajs.sri.mobile.examples.router

import chandu0101.scalajs.sri.mobile.router._


object RouterExampleApp {

  object Home extends StaticPage

  object Second extends StaticPage

  object Config extends MobileRouterConfig {

    override val initialRoute = Home -> StaticRoute("Home", HomeScreen())

    staticRoute(Second, StaticRoute("Second", SecondScreen()))

    override def notFound: (StaticPage, StaticRoute) = initialRoute
  }

  val router = MobileRouter(Config)

}