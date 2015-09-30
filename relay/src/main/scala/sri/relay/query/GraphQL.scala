package sri.relay.query

import scala.scalajs.js

/**
 * Represents a GraphQL node.
 *
 * A node may contain zero or more fields and/or query fragments.
 *
 * Note that we don't actually export this class (rather, we export subclasses
 * corresponding to fields, fragments, queries and mutations); we do, however,
 * use `GraphQLNode` as a type throughout Dlite.
 */
@js.native
trait GraphQLNode extends js.Object

@js.native
object GraphQLCallvNode extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLCallvNode = js.native
}

/**
 * Represents a GraphQL call such as `size(50, 50)` or `(size: 32)`.
 */
@js.native
class GraphQLCallvNode(name: String, value: js.Any, metadata: js.Object) extends js.Object {
  def toJSON: js.Object = js.native
}

@js.native
object GraphQLCallValue extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLCallValue = js.native
}

/**
 * Represents a value passed to a GraphQL call (for example, the value 5 passed
 * in a call like `first(5)`).
 */
@js.native
class GraphQLCallValue(value: js.Any) extends js.Object {
  def toJSON: js.Object = js.native
}

@js.native
object GraphQLBatchCallVariable extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLBatchCallVariable = js.native
}

/**
 * Represents a GraphQL call variable for use with the GraphQL Batch API.
 *
 * For example, given a source query identified by "q0", we would make a batch
 * call variable "<ref_q0>" as follows:
 *
 * new GraphQL.BatchCallVariable('q0', '$.*.actor.id');
 *
 * The batch API allows streaming responses to the client, re-using information
 * from previous queries via ref_params; the query identifier ("q0" in the
 * example above) combined with a JSONPath to the node to be extended
 * ("$.*.actor.id") allow us to define a supplementary query that retrieves
 * additional information (example: https://fburl.com/65122329) for that node.
 *
 * @see https://our.intern.facebook.com/intern/dex/graphql-batch-api
 */
@js.native
class GraphQLBatchCallVariable(sourceQueryID: String, jsonPath: String) extends js.Object {
  def toJSON: js.Object = js.native
}

@js.native
object GraphQLCallVariable extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLCallVariable = js.native
}

/**
 * Represents a variable used in a GraphQL call.
 *
 * For example:
 *
 * new GraphQL.CallVariable('foo') // variable: <foo>
 */
@js.native
class GraphQLCallVariable(variableName: String) extends js.Object {
  def toJSON: js.Object = js.native
}

@js.native
object GraphQLFieldNode extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLFieldNode = js.native
}

/**
 * Represents a field in a GraphQL query.
 *
 * A field may be simple or arbitrarily complex, including calls, and containing
 * subfields, nested fragments.
 */

//* @param {?array<GraphQLQueryFragment|RelayRouteFragment|RelayFragmentReference>} fragments
@js.native
class GraphQLFieldNode(fieldName: String, fields: Seq[GraphQLFieldNode] = ???, fragments: Seq[js.Any] = ???, calls: Seq[GraphQLCallvNode], alias: String = ???, condition: String = ???, metadata: js.Object = ???) extends GraphQLNode {
  def toJSON: js.Object = js.native
}

@js.native
object GraphQLQueryFragment extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLQueryFragment = js.native
}

/**
 * Represents a query fragment in a GraphQL query.
 *
 * A fragment may contain zero or more fields and/or additional fragments.
 */

//* @param {?array<GraphQLQueryFragment|RelayRouteFragment|RelayFragmentReference>} fragments
@js.native
class GraphQLQueryFragment(name: String, tpe: String, fields: Seq[GraphQLFieldNode] = ???, fragments: Seq[js.Any], metadata: js.Object = ???) extends GraphQLNode {
  def toJSON: js.Object = js.native
}

@js.native
object GraphQLQuery extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLQuery = js.native
}

/**
 * Represents a root GraphQL query such as `viewer() { ... }` or `me() { ... }`.
 *
 * Queries may contain zero or more fields, and/or subfragments.
 */

//* @param {?array<GraphQLQueryFragment|RelayRouteFragment|RelayFragmentReference>} fragments

@js.native
class GraphQLQuery(rootCall: String, value: js.Any, fields: Seq[GraphQLFieldNode] = ???, fragments: Seq[js.Any] = ???, metadata: js.Object = ???, queryName: String = ???) extends GraphQLNode {
  def toJSON: js.Object = js.native
}

/**
 * Comprises a GraphQL query (see `GraphQLQuery`) and a set of values.
 *
 * In practice, we're don't currently make use of the values anywhere in Dlite,
 * but we use `GraphQLQueryWithValues` widely within Dlite as a type.
 */
@js.native
class GraphQLQueryWithValues(query: GraphQLQuery, values: js.Any) extends js.Object {

  def getQuery: GraphQLQuery = js.native

  def toJSON: js.Object = js.native
}

@js.native
object GraphQLOperation extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLOperation = js.native
}

/**
 * Base class from which GraphQLMutation and GraphQLSubscription extend.
 */

//* @param {?array<GraphQLQueryFragment|RelayRouteFragment|RelayFragmentReference>} fragments

@js.native
class GraphQLOperation(name: String, responseType: String, call: GraphQLCallvNode, fields: Seq[GraphQLFieldNode] = ???, fragments: Seq[js.Any] = ???, metadata: js.Object = ???) extends GraphQLNode {
  def toJSON: js.Object = js.native
}

@js.native
object GraphQLMutation extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLMutation = js.native
}

/**
 * Represents a GraphQL mutation.
 */
@js.native
class GraphQLMutation(name: String, responseType: String, call: GraphQLCallvNode, fields: Seq[GraphQLFieldNode] = ???, fragments: Seq[js.Any] = ???, metadata: js.Object = ???) extends GraphQLOperation(name, responseType, call, fields, fragments, metadata) {
  /**
   * @return {number}
   */
  def getJSONType: Double = js.native
}

@js.native
object GraphQLSubscription extends js.Object {
  def fromJSON(descriptor: js.Object): GraphQLSubscription = js.native
}

/**
 * Represents a GraphQL subscription.
 */
@js.native
class GraphQLSubscription(name: String, responseType: String, call: GraphQLCallvNode, fields: Seq[GraphQLFieldNode] = ???, fragments: Seq[js.Any] = ???, metadata: js.Object = ???) extends GraphQLOperation(name, responseType, call, fields, fragments, metadata) {
  /**
   * @return {number}
   */
  def getJSONType: Double = js.native
}