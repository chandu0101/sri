package sri.relay.store

import sri.relay.mutation.{RelayMutationTransaction, RelayMutation}
import sri.relay.network.NetworkLayer
import sri.relay.query.{RelayQueryNode, RelayQueryRoot}
import sri.relay.tools.RelayInternalTypes.{DataID, RelayQuerySet}
import sri.relay.tools.RelayTypes.{ReadyStateChangeCallback, StoreReaderData}
import sri.relay.tools._

import scala.scalajs.js

@js.native
trait RelayEnvironment extends js.Object {

  def injectDefaultNetworkLayer(networkLayer: NetworkLayer = ???): Unit = js.native

  def injectNetworkLayer(networkLayer: NetworkLayer = ???): Unit = js.native

  def injectTaskScheduler(scheduler: RelayTaskScheduler = ???): Unit = js.native


  def getStoreData(): RelayStoreData = js.native

  /**
   * Primes the store by sending requests for any missing data that would be
   * required to satisfy the supplied set of queries.
   */
  def primeCache(querySet: RelayQuerySet, callback: ReadyStateChangeCallback): Abortable = js.native

  /**
   * Forces the supplied set of queries to be fetched and written to the store.
   * Any data that previously satisfied the queries will be overwritten.
   */
  def forceFetch(querySet: RelayQuerySet, callback: ReadyStateChangeCallback): Abortable = js.native

  /**
   * Reads query data anchored at the supplied data ID.
   */
  def read(node: RelayQueryNode, dataID: DataID, options: js.UndefOr[StoreReaderOptions]): js.UndefOr[StoreReaderData] = js.native

  /**
   * Reads query data anchored at the supplied data IDs.
   */
  def readAll(node: RelayQueryNode, dataIDs: Seq[DataID], options: js.UndefOr[StoreReaderOptions]): Seq[js.UndefOr[StoreReaderData]] = js.native

  /**
   * Reads query data, where each element in the result array corresponds to a
   * root call argument. If the root call has no arguments, the result array
   * will contain exactly one element.
   */
  def readQuery(root: RelayQueryRoot, options: js.UndefOr[StoreReaderOptions]): Seq[js.UndefOr[StoreReaderData]] = js.native

  /**
   * Reads and subscribes to query data anchored at the supplied data ID. The
   * returned observable emits updates as the data changes over time.
   */
  def observe(node: RelayQueryNode, dataID: DataID, options: js.UndefOr[StoreReaderOptions]): Observable[StoreReaderData] = js.native


  /**
   * Adds an update to the store without committing it. The returned
   * RelayMutationTransaction can be committed or rolled back at a later time.
   */
  def applyUpdate(mutation: RelayMutation, callbacks: js.UndefOr[RelayMutationTransactionCommitCallbacks] = js.undefined): RelayMutationTransaction = js.native


  /**
   * Adds an update to the store and commits it immediately. Returns
   * the RelayMutationTransaction.
   */
  def commitUpdate(mutation: RelayMutation, callbacks: js.UndefOr[RelayMutationTransactionCommitCallbacks] = js.undefined): RelayMutationTransaction = js.native
}
