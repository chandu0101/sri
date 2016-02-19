package sri.relay.mutation

import sri.relay.tools.RelayTypes.{RelayMutationConfig, FileMap, MutationFragment}

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}


/**
 * public
 *
 * RelayMutation is the base class for modeling mutations of data.
 */
@js.native
@JSName("Relay.Mutation")
abstract class RelayMutationJS(var props: js.Dynamic) extends js.Object {


  val fragments: js.Any = js.native

  /**
   * These will be sent along with the mutation query to the server.
   */
  def getFiles(): js.UndefOr[FileMap] = js.native

  /**
   * When a request is sent to the server, mutations can optionally construct an
   * optimistic response that has the same shape as the server response payload.
   * This optimistic response is used to pre-emptively update the client cache
   * to simulate an instantaneous response.
   *
   * The optimistic response may be a subset or superset of the actual response
   * payload. It can be a subset if certain fields are impossible to create on
   * the client (and if views are expected to handle the data inconsistency). It
   * can be a superset of the actual response payload if certain fields that are
   * affected have not been queried by the client, yet.
   */
  def getOptimisticResponse(): js.UndefOr[js.Object] = js.native

  /**
   * Optional. Similar to `getConfig`, this is used to create the query
   * corresponding to the `optimisticResponse`. If not provided, the query
   * will be inferred from the optimistic response. Most subclasses shouldn't
   * need to extend this method.
   */
  def getOptimisticConfigs(): js.UndefOr[Seq[js.Dictionary[js.Any]]] = js.native

  /**
   * An optional collision key allows a mutation to identify itself with other
   * mutations that affect the same fields. Mutations with the same collision
   * are sent to the server serially and in-order to avoid unpredictable and
   * potentially incorrect behavior.
   */
  def getCollisionKey(): js.UndefOr[String] = js.native

}

@ScalaJSDefined
abstract class RelayMutation(initialProps: js.Dynamic) extends RelayMutationJS(initialProps) {
  /**
   * Each mutation has a server name which is used by clients to communicate the
   * type of mutation that should be executed on the server.
   */
  def getMutation(): MutationFragment

  /**
   * "Fat queries" represent a predetermined set of fields that may change as a
   * result of a mutation, and which should therefore be queried in order to get
   * a consistent view of the data after performing a mutation. In practice, we
   * query for a subset of those fields because we intersect the fat query with
   * the tracked query we have for a given node (ie. the pieces of data we've
   * previously queried for and have therefore written to the store).
   *
   * Fat queries can be written like normal graphql queries with one main
   * exception: fat queries use childless non-scalar fields to indicate that
   * anything under that field may change. For example, the fat query for
   * feedback_like contains the field `like_sentence` with no child fields.
   * This means that any field below `like_sentence` may change as a result of
   * feedback_like.
   *
   * When adding a fat query, consider *all* of the data that might change as a
   * result of the mutation - not just data that we currently use in Relay. We
   * don't need to worry about overfetching here (this query is never executed
   * on its own; the infrastructure always intersects it with what is actually
   * needed), and if we omit fields here we might get odd consistency behavior
   * in the future when we add new views or modify existing ones.
   */
  def getFatQuery(): js.Any

  /**
   * These configurations are used to generate the query for the mutation to be
   * sent to the server and to correctly write the server's response into the
   * client store.
   *
   * Possible configuration types:
   *
   * -  FIELDS_CHANGE provides configuration for mutation fields.
   * {
   * type: RelayMutationType.FIELDS_CHANGE;
   * fieldIDs: {[fieldName: string]: DataID | Array<DataID>};
   * }
   * where fieldIDs map `fieldName`s from the fatQuery to a DataID or
   * array of DataIDs to be updated in the store.
   *
   * -  RANGE_ADD provides configuration for adding a new edge to a range.
   * {
   * type: RelayMutationType.RANGE_ADD;
   * parentName: string;
   * parentID: string;
   * connectionName: string;
   * edgeName: string;
   * rangeBehaviors:
   * {[call: string]: GraphQLMutatorConstants.RANGE_OPERATIONS};
   * }
   * where `parentName` is the field in the fatQuery that contains the range,
   * `parentID` is the DataID of `parentName` in the store, `connectionName`
   * is the name of the range, `edgeName` is the name of the key in server
   * response that contains the newly created edge, `rangeBehaviors` maps
   * stringified representation of calls on the connection to
   * GraphQLMutatorConstants.RANGE_OPERATIONS.
   *
   * -  NODE_DELETE provides configuration for deleting a node and the
   * corresponding edge from a range.
   * {
   * type: RelayMutationType.NODE_DELETE;
   * parentName: string;
   * parentID: string;
   * connectionName: string;
   * deletedIDFieldName: string;
   * }
   * where `parentName`, `parentID` and `connectionName` refer to the same
   * things as in RANGE_ADD, `deletedIDFieldName` is the name of the key in
   * the server response that contains the DataID of the deleted node.
   *
   * -  RANGE_DELETE provides configuration for deleting an edge from a range
   * but doesn't delete the node.
   * {
   * type: RelayMutationType.RANGE_DELETE;
   * parentName: string;
   * parentID: string;
   * connectionName: string;
   * deletedIDFieldName: string;
   * pathToConnection: Array<string>;
   * }
   * where `parentName`, `parentID`, `connectionName` and
   * `deletedIDFieldName` refer to the same things as in NODE_DELETE,
   * `pathToConnection` provides a path from `parentName` to
   * `connectionName`.
   *
   * -  REQUIRED_CHILDREN is used to append additional children (fragments or
   * fields) to the mutation query. Any data fetched as a result of these
   * children is not written to the client store. Please avoid using this.
   * {
   * type: RelayMutationType.REQUIRED_CHILDREN;
   * children: Array<RelayQuery.Node>;
   * }
   */
  def getConfigs(): RelayMutationConfig

  /**
   * These variables form the "input" to the mutation query sent to the server.
   */
  def getVariables(): js.Object


}

