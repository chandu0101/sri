package chandu0101.scalajs.sri.mobile.examples.uiexplorer

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.components.View
import chandu0101.scalajs.sri.mobile.router._
import chandu0101.scalajs.sri.mobile.styles.MobileStyleSheet

import scala.scalajs.js.Dynamic

object UIExplorerApp {


  object UIExplorerList extends StaticPage

  object UIExplorerDetails extends DynamicPage[ReactElement]


  object Config extends MobileRouterConfig {
    override def initialRoute = UIExplorerList -> StaticRoute("Scala.js - UIExplorer", UIExplorerListScreen())

    dynamicRoute(UIExplorerDetails, DynamicRoute((c: ReactElement) => c))

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = MobileStyleSheet.wholeContainer)(
        DefaultNavigationBar(route),
        super.renderScene(route)
      )

    }

    override def notFound: (StaticPage, StaticRoute) = initialRoute
  }

  object styles extends MobileStyleSheet {

  }
  val router = MobileRouter(Config)

}
