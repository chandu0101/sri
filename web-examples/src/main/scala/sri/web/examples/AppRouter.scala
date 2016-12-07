package sri.web.examples

import sri.core.ReactElement
import sri.web.examples.styles.Theme
import sri.web.router.{WebRouter, WebRouterConfig, _}
import sri.web.vdom.htmltags._

object AppRouter {


  object HomePage extends WebStaticPage

  object SecondPage extends WebStaticPage

  object ContactPage extends WebDynamicPage[Int]

  object Config extends WebRouterConfig {

    override val history = HistoryFactory.hashHistory()

    override val initialRoute = defineInitialRoute(HomePage, component = (route: WebRoute) => HelloWeb())

    override def renderScene(route: WebRoute): ReactElement = {
      div(style = Theme.flexOneAndDirectionVertical)(
        super.renderScene(route)
      )
    }

    override val notFound = WebRouteNotFound(initialRoute._1)

  }


  val router = WebRouter(Config)

}
