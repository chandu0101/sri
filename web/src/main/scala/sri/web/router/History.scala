package sri.web

package router

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U}

@js.native
trait History extends js.Object {

  def listen(listener: js.Function): js.Function0[_] = js.native

  def registerTransitionHook(hook: js.Function2[Location, js.Function, Any]): Unit = js.native

  def unregisterTransitionHook(hook: js.Function2[Location, js.Function, Any]): Unit = js.native

  def transitionTo(location: Location): Unit = js.native

  def pushState(state: U[js.Object] = ???, path: String): Unit = js.native

  def replaceState(state: U[js.Object] = ???, path: String): Unit = js.native

  def setState(state: js.Object): Unit = js.native

  def go(n: Int): Unit = js.native

  def goBack(): Unit = js.native

  def goForward(): Unit = js.native

  def createKey(): String = js.native

  def createPath(path: String): String = js.native

  def createHref(path: String): String = js.native

}


@js.native
trait Location extends js.Object {
  val pathname: String = js.native
  val search: String = js.native
  val query: js.Object = js.native
  val state: js.Object = js.native
  val action: js.Dynamic = js.native
  val key: String = js.native
}

