package sri.relay.external


import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSName

/**
 * Deferred provides a Promise-like API that exposes methods to resolve and
 * reject the Promise. It is most useful when converting non-Promise code to use
 * Promises.
 *
 * If you want to export the Promise without exposing access to the resolve and
 * reject methods, you should export `getPromise` which returns a Promise with
 * the same semantics excluding those methods.
 */
@js.native
trait Deferred[Tvalue, Treason] extends js.Object {

  def getPromise(): Promise[js.Any] = js.native

  def resolve(value: Tvalue): Unit = js.native

  def reject(reason: Treason): Unit = js.native

  @JSName("then")
  def thn(): Promise[js.Any] = js.native

  def done(): Unit = js.native

  def isSettled: Boolean = js.native
}

