package sri.relay.network

import sri.relay.external.Deferred
import sri.relay.query.RelayQueryRoot
import sri.relay.tools.QueryResult
import sri.relay.tools.RelayTypes.Variables

import scala.scalajs.js

@js.native
class RelayQueryRequest(query: RelayQueryRoot) extends Deferred[QueryResult, js.Error] {

  def getDebugName: String = js.native

  /**
   *
   * Gets a unique identifier for this query. These identifiers are useful for
   * assigning response payloads to their corresponding queries when sent in a
   * single GraphQL request.
   */
  def getID: String = js.native

  /**
   * Gets the variables used by the query. These variables should be serialized
   * and send in the GraphQL request.
   */
  def getVariables: Variables = js.native

  /**
   * Gets a string representation of the GraphQL query.
   */
  def getQueryString: String = js.native

  /**
   * unstable
   */
  def getQuery: RelayQueryRoot = js.native
}
