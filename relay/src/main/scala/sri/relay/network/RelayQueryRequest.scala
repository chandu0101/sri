package sri.relay.network

import sri.relay.external.Deferred
import sri.relay.query.RelayQueryRoot
import sri.relay.tools.QueryResult

import scala.scalajs.js

@js.native
trait RelayQueryRequest extends Deferred[QueryResult, js.Error] with RelayRequest {

  /**
   *
   * Gets a unique identifier for this query. These identifiers are useful for
   * assigning response payloads to their corresponding queries when sent in a
   * single GraphQL request.
   */
  def getID: String = js.native

  /**
   * unstable
   */
  def getQuery: RelayQueryRoot = js.native
}
