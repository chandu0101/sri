package sri.web.router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@js.native
trait History extends js.Object {

  def listen(listener: js.Function1[Location, _]): js.Function0[_] = js.native

  def listenBefore(hook: js.Function1[Location, _]): js.Function0[_] = js.native

  def push(location: Location): Unit = js.native

  def replace(location: Location): Unit = js.native

  def goBack(): Unit = js.native

  def goForward(): Unit = js.native

  def go(n: Int): Unit = js.native

  def createHref(location: js.Object): String = js.native

  def createPath(location: js.Object): String = js.native

  def createKey(): String = js.native
}

@js.native
object History extends js.Object {

  type HistoryFunc = js.Function1[js.UndefOr[HistoryOptions], History]

  val createHistory: HistoryFunc = js.native

  val createHashHistory: HistoryFunc = js.native

  val createMemoryHistory: HistoryFunc = js.native

  def useQueries(history: HistoryFunc): HistoryFunc = js.native

  def useBasename(history: HistoryFunc): HistoryFunc = js.native

}

@ScalaJSDefined
class Location(val pathname: String,
               val basename: js.UndefOr[String] = js.undefined,
               val hash: js.UndefOr[String] = js.undefined,
               val search: js.UndefOr[String] = js.undefined,
               val state: js.UndefOr[js.Object] = js.undefined,
               val query: js.UndefOr[js.Object] = js.undefined,
               val action: js.UndefOr[String] = js.undefined,
               val key: String = "") extends js.Object {

}

@ScalaJSDefined
class HistoryOptions(val getCurrentLocation: js.UndefOr[js.Function0[Location]] = js.undefined, val queryKey: js.UndefOr[String | Boolean] = js.undefined, val basename: js.UndefOr[String] = js.undefined) extends js.Object

object HistoryFactory {

  /**
   * recommended for prod
   * @param options
   * @return
   */
  def browserHistory(options: js.UndefOr[HistoryOptions] = js.undefined) = if (options.isDefined && options.get.basename.isDefined) History.useQueries(History.useBasename(History.createHistory))(options)
  else History.useQueries(History.createHistory)(options)

  /**
   * use this only development purpose
   * @param options
   * @return
   */
  def hashHistory(options: js.UndefOr[HistoryOptions] = new HistoryOptions(queryKey = false)) = if (options.isDefined && options.get.basename.isDefined) History.useQueries(History.useBasename(History.createHashHistory))(options)
  else History.useQueries(History.createHashHistory)(options)


}