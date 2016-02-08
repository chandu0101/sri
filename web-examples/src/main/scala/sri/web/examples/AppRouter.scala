package sri.web.examples

import sri.core.ReactElement
import sri.universal.components.{View}
import sri.universal.styles.UniversalStyleSheet
import sri.web.router.{WebRouter, WebRouterConfig, _}

import scala.scalajs.js.{Function1, UndefOr}

object AppRouter {


  object HomePage extends WebStaticPage

  object SecondPage extends WebStaticPage

  object ContactPage extends WebDynamicPage[Int]

  object Config extends WebRouterConfig {

    //    override val history = HistoryFactory.hashHistory(new HistoryOptions(queryKey = false,basename = "/base"))
    override val history = HistoryFactory.browserHistory()

    override val initialRoute = defineInitialRoute(HomePage, component = HelloWeb())

    staticRoute(SecondPage, "hello", HelloWeb2())

    dynamicRoute(ContactPage, path = "contact", component = (id: Int) => Contact(id), parser = Contact.parser)

    override def renderScene(route: WebRoute): ReactElement = {
      View(style = UniversalStyleSheet.wholeContainer)(
        super.renderScene(route)
      )
    }

    override val notFound = WebRouteNotFound(initialRoute._1)

  }


  val router = WebRouter(Config)

}
