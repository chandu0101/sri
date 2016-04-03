package sri.relay.network

import sri.relay.tools.RelayTypes.Variables

import scala.scalajs.js

@js.native
trait RelayRequest extends js.Object {
  /**
   * @public
   *
   * Gets a string representation of the GraphQL mutation.
   */
  def getQueryString(): String = js.native

  /**
   * @public
   *
   * Gets a string name used to refer to this request for printing debug output.
   */
  def getDebugName(): String = js.native

  /**
   * @public
   *
   * Gets the variables used by the query. These variables should be serialized
   * and send in the GraphQL request.
   */
  def getVariables(): Variables = js.native
}
