package sri.relay.query

import sri.relay.query.RelayQuery.{ConcreteQueryObject, FragmentNames, NextChildren}
import sri.relay.route.RelayMetaRoute
import sri.relay.tools.Call
import sri.relay.tools.RelayTypes.Variables

import scala.scalajs.js

@js.native
trait BatchCall extends js.Object {
  val refParamName: String = js.native
  val sourceQueryID: String = js.native
  val sourceQueryPath: String = js.native
}

@js.native
trait FragmentMetadata extends js.Object {
  val isDeferred: Boolean = js.native
  val isReferenceFragment: Boolean = js.native
  val isTypeConditional: Boolean = js.native
}

//trait DEFAULT_FRAGMENT_METADATA extends js.Object {
//isDeferred: false,
//isReferenceFragment: false,
//isTypeConditional: false,
//};

@js.native
object RelayQuery extends js.Object {
  type NextChildren = Seq[js.Any]
  type FragmentNames = js.Dictionary[String]
  type RootCallValue = js.Any
  //type RootCallValue = string | GraphQL.BatchCallVariable;
  type ConcreteQueryObject = js.Any

  def create(concreteNode: ConcreteQueryObject,
             route: RelayMetaRoute,
             variables: Variables): RelayQueryNode = js.native

  def buildRoot(rootCall: String,
                rootCallValue: js.UndefOr[Seq[js.Any]],
                //rootCallValue: js.UndefOr[Seq[< RootCallValue > | ? RootCallValue]],
                children: js.UndefOr[Seq[RelayQueryNode]],
                metadata: js.UndefOr[js.Dictionary[js.Any]],
                name: js.UndefOr[String]): RelayQueryRoot = js.native

  def buildFragment(name: String,
                    tpe: String,
                    children: js.UndefOr[Seq[RelayQueryNode]],
                    metadata: js.UndefOr[js.Dictionary[js.Any]]): RelayQueryFragment = js.native

  def buildField(fieldName: String,
                 calls: js.UndefOr[Seq[Call]],
                 children: js.UndefOr[NextChildren],
                 metadata: js.UndefOr[js.Dictionary[js.Any]],
                 alias: js.UndefOr[String]): RelayQueryField = js.native

  def buildMutation(mutationName: String,
                    responseType: String,
                    callName: String,
                    children: js.UndefOr[Seq[RelayQueryNode]],
                    metadata: js.UndefOr[js.Dictionary[js.Any]]): RelayQueryMutation = js.native

  def createFragment(concreteNode: ConcreteQueryObject,
                     route: RelayMetaRoute,
                     variables: Variables,
                     metadata: js.UndefOr[FragmentMetadata]): RelayQueryFragment = js.native

  def createQuery(concreteNode: ConcreteQueryObject,
                  route: RelayMetaRoute,
                  variables: Variables): RelayQueryRoot = js.native
}

/**
 * internal
 *
 * Queries in Relay are represented as trees. Possible nodes include the root,
 * fields, and fragments. Fields can have children, or they can be leaf nodes.
 * Root and fragment nodes must always have children.
 *
 * `RelayQueryNode` provides access to information such as the field name,
 * generated alias, sub-fields, and call values.
 *
 * Nodes are immutable; query modification is supported via `clone`:
 *
 * ```
 * var next = prev.clone(prev.getChildren().filter(f => ...));
 * ```
 *
 * Note: Mediating access to actual query nodes is necessary so that we can
 * replace the current mutable GraphQL nodes with an immutable query
 * representation. This class *must not* mutate the underlying `concreteNode`.
 * Instead, use an instance variable (see `clone()`).
 *
 * TODO (#6937314): RelayQueryNode support for toJSON/fromJSON
 */
@js.native
trait RelayQueryNode extends js.Object {

  def isGenerated: Boolean = js.native

  def isRefQueryDependency: Boolean = js.native

  def isScalar: Boolean = js.native

  def clone(children: NextChildren): js.UndefOr[RelayQueryNode] = js.native

  def getChildren: Seq[RelayQueryNode] = js.native

  def getField(field: RelayQueryField): js.UndefOr[RelayQueryField] = js.native

  def getFieldByStorageKey(storageKey: String): js.UndefOr[RelayQueryField] = js.native

  def getRoute: RelayMetaRoute = js.native

  def getVariables: Variables = js.native

  def hasDeferredDescendant: Boolean = js.native

  def isRequisite: Boolean = js.native

  /**
   * Determine if `this` and `that` are deeply equal.
   */
  def equals(that: RelayQueryNode): Boolean = js.native

  /**
   * Performs a fast comparison of whether `this` and `that` represent identical
   * query nodes. Returns true only if the concrete nodes, routes, and variables
   * are all the same.
   *
   * Note that it is possible that this method can return false in cases where
   * `equals` would return true. This can happen when the concrete nodes are
   * different but structurally identical, or when the route/variables are
   * different but do not have an effect on the structure of the query.
   */
  def isEquivalent(that: RelayQueryNode): Boolean = js.native

  def createNode(concreteNode: ConcreteQueryObject): RelayQueryNode = js.native

  def getConcreteQueryNode(onCacheMiss: () => ConcreteQueryObject): ConcreteQueryObject = js.native
}

@js.native
class RelayQueryRoot(concreteNode: ConcreteQueryObject, route: RelayMetaRoute, variables: Variables) extends RelayQueryNode {

  def getName: String = js.native

  def getID: String = js.native

  def getBatchCall: js.UndefOr[BatchCall] = js.native

  def getRootCall: Call = js.native

  def getCallType: js.UndefOr[String] = js.native

  def getRootCallArgument: js.UndefOr[String] = js.native

  def isDeferred: Boolean = js.native

  def getDeferredFragmentNames: FragmentNames = js.native

}

@js.native
class RelayQueryOperation(concreteNode: ConcreteQueryObject, route: RelayMetaRoute, variables: Variables) extends RelayQueryNode {

  def getName: String = js.native

  def getResponseType: String = js.native

  def getInputType: String = js.native

  def getCall: Call = js.native

  def getCallVariableName: String = js.native
}

/**
 * internal
 *
 * Represents a GraphQL mutation.
 */
@js.native
trait RelayQueryMutation extends RelayQueryOperation

/**
 * internal
 *
 * Represents a GraphQL subscription.
 */
@js.native
trait RelayQuerySubscription extends RelayQueryOperation {
  def getPublishedPayloadType: String = js.native
}

/**
 * internal
 *
 * Wraps access to query fragments.
 *
 * Note: place proxy methods for `GraphQL.QueryFragment` here.
 */
@js.native
class RelayQueryFragment(concreteNode: ConcreteQueryObject,
                         route: RelayMetaRoute,
                         variables: Variables,
                         metadata: FragmentMetadata = ???) extends RelayQueryNode {
  def getDebugName: String = js.native

  /**
   * Returns the weak ID for the concrete fragment. Unlike `getFragmentID`,
   * this value is identical for any `RelayQueryFragment` with the same concrete
   * fragment, regardless of params/route.
   */
  def getConcreteFragmentID: String = js.native

  /**
   * Returns an identifier for a fragment that is unique for any combination of
   * concrete fragment, route name, and variables.
   */
  def getFragmentID: String = js.native

  def getType: String = js.native

  def isDeferred: Boolean = js.native

  def isPlural: Boolean = js.native

  def isReferenceFragment: Boolean = js.native

  def isTypeConditional: Boolean = js.native
}

/**
 * internal
 *
 * Wraps access to query fields.
 *
 * Note: place proxy methods for `GraphQL.Field` here.
 */
@js.native
class RelayQueryField(concreteNode: ConcreteQueryObject, route: RelayMetaRoute, variables: Variables) extends RelayQueryNode {

  def isFindable: Boolean = js.native

  def isConnection: Boolean = js.native

  def isPlural: Boolean = js.native

  def isUnionOrInterface: Boolean = js.native

  def getParentType: String = js.native

  /**
   * The canonical name for the referenced field in the schema.
   */
  def getSchemaName: String = js.native

  /**
   * The name for the field when serializing the query or interpreting query
   * responses from the server. The serialization key is derived from
   * all calls/values and hashed for compactness.
   *
   * Given the graphql
   * `news_feed.first(10).orderby(TOP_STORIES)`
   *
   * the serialization key is
   * `generateRQLFieldAlias('news_feed.first(10).orderby(TOP_STORIES')`
   */
  def getSerializationKey: String = js.native

  /**
   * The name which Relay internals can use to reference this field, without
   * collisions. The storage key is derived from arguments with the following
   * exclusions:
   *
   * - Range calls such as `first` or `find` on connections.
   * - Conditionals when the field is present.
   *
   * Given the graphql
   * `news_feed.first(10).orderby(TOP_STORIES).if(true)`
   *
   * the storage key is
   * `'news_feed.orderby(TOP_STORIES)'`
   */
  def getStorageKey: String = js.native

  /**
   * The name by which this field's results should be made available to the
   * application.
   */
  def getApplicationName: String = js.native

  def getInferredRootCallName: js.UndefOr[String] = js.native

  def getInferredPrimaryKey: js.UndefOr[String] = js.native

  def getCallsWithValues: Seq[Call] = js.native

  def getCallType(callName: String): js.UndefOr[String] = js.native

  def cloneAsRefQueryDependency(): RelayQueryField = js.native

  def cloneFieldWithCalls(children: NextChildren, calls: Seq[Call]): js.UndefOr[RelayQueryField] = js.native

}