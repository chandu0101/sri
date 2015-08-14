package chandu0101.scalajs.sri.mobile.examples.uiexplorer

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.router.MobileRouter.NavigationBarConfig
import chandu0101.scalajs.sri.mobile.router._

object UIExplorerRouter {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends MobileRouterConfig {
    override def initialRoute = UIExplorerList -> StaticRoute("Scala.js - UIExplorer", UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, DynamicRoute((c: ReactElement) => c))

  }


  val router = MobileRouter(Config, NavigationBarConfig())

}
