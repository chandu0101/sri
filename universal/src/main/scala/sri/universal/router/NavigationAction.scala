package sri.universal.router

class NavigationAction private(val value : String) extends  AnyVal

object NavigationAction {

  val PUSH = new NavigationAction("PUSH")

  val REPLACE = new NavigationAction("REPLACE")

}

case class UniversalRouteNotFound(page : StaticPage,action : NavigationAction = NavigationAction.REPLACE)
