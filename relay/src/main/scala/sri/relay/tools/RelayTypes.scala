package sri.relay.tools

import org.scalajs.dom.raw.ParentNode
import sri.relay.mutation.RelayMutationTransaction
import sri.relay.query.RelayFragmentReference
import sri.relay.query.RelayQL.RelayConcreteNode
import sri.relay.route.RelayQueryConfig
import sri.relay.tools.RelayInternalTypes.DataID
import sri.relay.tools.RelayTypes._

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

object RelayTypes {
  type RelayMutationTransactionCommitSuccessCallback = js.Function1[js.Dictionary[js.Any], Unit]
  type RelayMutationTransactionCommitFailureCallback = (RelayMutationTransaction, () => Unit) => Unit
  type ReadyStateChangeCallback = (ReadyState) => Unit
  type ComponentReadyStateChangeCallback = js.Function1[ComponentReadyState, Unit]
  type StoreReaderData = js.Object
  type Variables = js.Object
  type FileMap = js.Dictionary[js.Any]
  type MutationFragment = js.Any
  type RelayMutationConfig = js.Array[FieldsChangeMutationConfig | RangeAddMutationConfig | NodeDeleteMutationConfig | RangeDeleteMutationConfig | RequiredChildrenMutationConfig]
}

@ScalaJSDefined
class FieldsChangeMutationConfig(val `type`: String = "FIELDS_CHANGE", val fieldIDs: js.Dictionary[DataID | js.Array[DataID]]) extends js.Object

@ScalaJSDefined
class RangeAddMutationConfig(val `type`: String = "RANGE_ADD", val parentName: String, val parentID: String, val connectionName: String, val edgeName: String, val rangeBehaviors: js.Dictionary[String]) extends js.Object

@ScalaJSDefined
class NodeDeleteMutationConfig(val `type`: String = "NODE_DELETE", val parentName: String, val parentID: String, val connectionName: String, val deletedIDFieldName: String) extends js.Object

@ScalaJSDefined
class RangeDeleteMutationConfig(val `type`: String = "RANGE_DELETE", val parentName: String, val parentID: String, val connectionName: String, val deletedIDFieldName: String, val pathToConnection: js.Array[String]) extends js.Object

@ScalaJSDefined
class RequiredChildrenMutationConfig(val `type`: String = "REQUIRED_CHILDREN", val children: js.Array[RelayConcreteNode]) extends js.Object


@js.native
trait ComponentReadyState extends js.Object {
  val aborted: Boolean = js.native
  val done: Boolean = js.native
  val error: js.UndefOr[js.Error] = js.native
  val mounted: Boolean = js.native
  val ready: Boolean = js.native
  val stale: Boolean = js.native
}

@js.native
trait ComponentFetchState extends js.Object {
  val done: Boolean = js.native
  val stale: Boolean = js.native
}

@js.native
trait ReadyState extends js.Object {
  val aborted: Boolean = js.native
  val done: Boolean = js.native
  val error: js.UndefOr[js.Error] = js.native
  val ready: Boolean = js.native
  val stale: Boolean = js.native
}

@js.native
trait RelayMutationTransactionCommitCallbacks extends js.Object {
  val onFailure: js.UndefOr[RelayMutationTransactionCommitFailureCallback] = js.native
  val onSuccess: js.UndefOr[RelayMutationTransactionCommitSuccessCallback] = js.native
}

@js.native
trait Observable[T] extends js.Object {
  def subscribe(callbacks: SubscriptionCallbacks[T]): Subscription = js.native
}

@js.native
trait MultiObservable[T] extends js.Object {
  def subscribe(callbacks: SubscriptionCallbacks[Seq[T]]): Subscription = js.native

  def setDataIDs(dataIDs: Seq[DataID]): Unit = js.native
}

@js.native
trait Subscription extends js.Object {
  def dispose(): Unit = js.native
}

@js.native
trait SubscriptionCallbacks[T] extends js.Object {
  def onNext: (T) => Unit = js.native

  def onError: (js.Error) => Unit = js.native

  def onCompleted: () => Unit = js.native
}

@js.native
trait StoreReaderOptions extends js.Object {
  val traverseFragmentReferences: js.UndefOr[Boolean] = js.native
  val traverseGeneratedFields: js.UndefOr[Boolean] = js.native
}

@js.native
trait RequestOptions extends js.Object {
  val data: js.Any = js.native
  val errorHandler: js.UndefOr[(XHRErrorData) => Unit] = js.native
  val headers: js.UndefOr[js.Dictionary[String]] = js.native
  val method: String = js.native
  val rawData: js.UndefOr[js.Any] = js.native
  val responseHandler: js.UndefOr[(String, js.UndefOr[String], Boolean) => Unit] = js.native
  val timeout: js.UndefOr[Int] = js.native
  val timeoutHandler: js.UndefOr[() => Unit] = js.native
  val transportBuilder: js.UndefOr[js.Any] = js.native
}

@js.native
trait XHRErrorData extends js.Object {
  val errorCode: js.UndefOr[String] = js.native
  val errorMsg: js.UndefOr[String] = js.native
  val errorType: js.UndefOr[String] = js.native
}

@ScalaJSDefined
abstract class MutationResult extends js.Object {
  val response: js.Object
}

@ScalaJSDefined
abstract class QueryResult extends js.Object {
  val error: js.UndefOr[js.Error] = js.undefined
  @JSName("ref_params")
  val refParams: js.UndefOr[js.Dictionary[js.Any]] = js.undefined
  val response: js.Object
}

@js.native
trait Abortable extends js.Object {
  val abort: () => Unit = js.native
}

@js.native
trait RelayProp extends js.Object {

  var route: RelayQueryConfig = js.native

  var variables: js.Dynamic = js.native

  /**
   * Requests an update to variables. This primes the cache for the new
   * variables and notifies the caller of changes via the callback. As data
   * becomes ready, the component will be updated.
   */
  def setVariables(partialVariables: Variables = ???, callback: ComponentReadyStateChangeCallback = ???): Unit = js.native

  /**
   * Requests an update to variables. Unlike `setVariables`, this forces data
   * to be fetched and written for the supplied variables. Any data that
   * previously satisfied the queries will be overwritten.
   */
  def forceFetch(partialVariables: Variables = ???, callback: ComponentReadyStateChangeCallback = ???): Unit = js.native

  /**
   * Determine if the supplied record reflects an optimistic update.
   */
  def hasOptimisticUpdate(record: js.Object): Boolean = js.native

  /**
   * Returns the pending mutation transactions affecting the given record.
   */
  def getPendingTransactions(record: js.Object): js.UndefOr[js.Array[RelayMutationTransaction]] = js.native

  /**
   * Returns any error related to fetching data for a deferred fragment.
   */
  def getFragmentError(fragmentReference: RelayFragmentReference, record: js.Object): js.UndefOr[js.Error] = js.native

  /**
   * Checks if data for a deferred fragment is ready. This method should
   * *always* be called before rendering a child component whose fragment was
   * deferred (unless that child can handle null or missing data).
   */
  def hasFragmentData(fragmentReference: RelayFragmentReference, record: js.Object): Boolean = js.native

}