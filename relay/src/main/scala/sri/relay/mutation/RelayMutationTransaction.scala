package sri.relay.mutation

import sri.relay.tools.RelayInternalTypes.ClientMutationID
import sri.relay.tools.RelayMutationTransactionCommitCallbacks

import scala.scalajs.js

@js.native
trait MutationVariables extends js.Object {
  val input: js.Dictionary[js.Any] = js.native
}

@js.native
object RelayMutationTransaction extends js.Object {

  def get(id: ClientMutationID): RelayMutationTransaction = js.native

  //probably private

  //  def advanceCollisionQueue(collisionKey: js.UndefOr[String]): Unit = js.native
  //
  //  def failCollisionQueue(collisionKey: js.UndefOr[String]): Unit = js.native
  //
  //  def refreshQueuedData(): Unit = js.native
  //
  //  def willBatchRefreshQueuedData: js.UndefOr[Boolean] = js.native
  //
  //  def batchRefreshQueuedData(): Unit = js.native
}

@js.native
class RelayMutationTransaction(mutation: RelayMutation) extends js.Object {

  def commit(callbacks: js.UndefOr[RelayMutationTransactionCommitCallbacks]): Unit = js.native

  def getError: js.UndefOr[js.Error] = js.native

  //def getStatus(): $Enum<typeof RelayMutationTransactionStatus>

  def recommit(): Unit = js.native

  def rollback(): Unit = js.native

  //probably private

  //  def getCallName: String = js.native
  //
  //  def getConfigs: Seq[js.Dictionary[js.Any]] = js.native
  //
  //  def getCollisionKey: js.UndefOr[String]
  //
  //  def getFatQuery: RelayQueryFragment = js.native
  //
  //  def getMutationNode: GraphQLMutation = js.native
  //
  //  def getQuery: RelayQueryMutation = js.native
  //
  //  def getVariables: MutationVariables = js.native
  //
  //  def getFiles: js.UndefOr[FileMap] = js.native
  //
  //  def getOptimisticConfigs: js.UndefOr[Seq[js.Dictionary[js.Any]]] = js.native
  //
  //  def getOptimisticQuery: js.UndefOr[RelayQueryMutation] = js.native
  //
  //  def getOptimisticResponse: js.UndefOr[js.Object] = js.native
  //
  //  def queueForCommit(): Unit = js.native
  //
  //  def markAsNotPending(): Unit = js.native
  //
  //  def handleOptimisticUpdate(): Unit = js.native
  //
  //  def handleCommit(): Unit = js.native
  //
  //  def handleCommitFailure(isServerError: Boolean): Unit = js.native
  //
  //  def handleRollback(): Unit = js.native
  //
  //  def handleCommitSuccess(response: Object): Unit = js.native

}