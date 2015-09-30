package sri.relay.network

import sri.relay.external.Deferred
import sri.relay.query.RelayQueryMutation
import sri.relay.tools.MutationResult
import sri.relay.tools.RelayTypes.FileMap

import scala.scalajs.js

/**
 *
 * Instances of these are made available via `RelayNetworkLayer.sendMutation`.
 */
@js.native
trait RelayMutationRequest extends Deferred[MutationResult, js.Error] with RelayRequest {
  /**
   *
   * Gets an optional map from name to File objects.
   */
  def getFiles: js.UndefOr[FileMap] = js.native

  /**
   * unstable
   */
  def getMutation: RelayQueryMutation = js.native
}
