package sri.web.examples.routerexample

import sri.web.router.{WebRoute, WebDynamicPage, WebRouterModuleConfig, WebStaticPage}

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenTraversableOnce

object ItemsRouteModule extends WebRouterModuleConfig("items") {

  object All extends WebStaticPage

  object Details extends WebDynamicPage[Int]

  // final path /items
  staticRoute(page = All, path = "/", component = (route : WebRoute) => ItemsScreen())

  // final path /items/:id
  dynamicRoute(page = Details, path = "/", parser = ItemDetailsScreen.parser, component = (id: Int,route : WebRoute) => ItemDetailsScreen(id))
}
