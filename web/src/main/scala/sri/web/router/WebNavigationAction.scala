package sri.web.router

class WebNavigationAction private(val value : String) extends  AnyVal

object WebNavigationAction {

  val PUSH = new WebNavigationAction("PUSH")

  val REPLACE = new WebNavigationAction("REPLACE")

}