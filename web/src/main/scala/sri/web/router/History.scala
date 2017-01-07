package sri.web.router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSImport, JSName, ScalaJSDefined}

@js.native
trait History extends js.Object {

//  def getCurrentLocation(): Location = js.native

  def listen(listener: js.Function2[Location,String, _]): js.Function0[_] = js.native

  def block(listener: js.Function2[Location,String, _]): js.Function0[_] = js.native

  def block(message : String): js.Function0[_] = js.native

  def push(location: Location): Unit = js.native

  def replace(location: Location): Unit = js.native

  def goBack(): Unit = js.native

  def goForward(): Unit = js.native

  def go(n: Int): Unit = js.native

  def canGo(n: Int): Unit = js.native

  def createHref(location: js.Object): String = js.native

  def createPath(location: js.Object): String = js.native

  def createKey(): String = js.native

  val location: Location = js.native

  val action : String = js.native

  val length: Int = js.native
}

@js.native
@JSImport("history", JSImport.Namespace)
object History extends js.Object {

  type HistoryFunc = js.Function1[js.UndefOr[HistoryOptions], History]

 @JSName("createBrowserHistory") val createHistory: HistoryFunc = js.native

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
class HistoryOptions(val getUserConfirmation: js.UndefOr[js.Function] = js.undefined,
                     val hashType: js.UndefOr[String] = js.undefined,
                     val forceRefresh: js.UndefOr[Boolean] = js.undefined,
                     val basename: js.UndefOr[String] = js.undefined) extends js.Object

object HistoryFactory {

  /**
   * recommended for prod
   * @param options
   * @return
   */
  def browserHistory(options: js.UndefOr[HistoryOptions] = js.undefined) = History.createHistory(options)

  /**
   * use this only for development purpose
   * @param options
   * @return
   */
  def hashHistory(options: js.UndefOr[HistoryOptions] = js.undefined) = History.createHashHistory(options)


}