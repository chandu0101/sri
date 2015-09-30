package sri.relay.network

import sri.relay.external.Deferred
import sri.relay.mutation.MutationVariables
import sri.relay.query.RelayQueryMutation
import sri.relay.tools.MutationResult
import sri.relay.tools.RelayTypes.FileMap

import scala.scalajs.js

/**
 *
 * Instances of these are made available via `RelayNetworkLayer.sendMutation`.
 */
@js.native
class RelayMutationRequest(mutation: RelayQueryMutation,
                           variables: MutationVariables,
                           files: js.UndefOr[FileMap] = ???) extends Deferred[MutationResult, js.Error] {

  /**
   *
   * Gets a string name used to refer to this request for printing debug output.
   */
  def getDebugName: String = js.native

  /**
   *
   * Gets an optional map from name to File objects.
   */
  def getFiles: js.UndefOr[FileMap] = js.native

  /**
   *
   * Gets the variables used by the mutation. These variables should be
   * serialized and send in the GraphQL request.
   */
  def getVariables: MutationVariables = js.native

  /**
   *
   * Gets a string representation of the GraphQL mutation.
   */
  def getQueryString: String = js.native

  /**
   * unstable
   */
  def getMutation: RelayQueryMutation = js.native
}
