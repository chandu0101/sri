package sri.relay.container

import sri.core.ReactElement
import sri.relay.{RelayComponentProps, RelayComponent}
import sri.relay.container.RelayContainer.{Fragment, Fragments, RootQueries}
import sri.relay.mutation.RelayMutationTransaction
import sri.relay.query.{RelayFragmentReference, RelayQueryFragment}
import sri.relay.route.BuildRQL.QueryBuilder
import sri.relay.route.RelayQueryConfig
import sri.relay.tools.RelayTypes.{ComponentReadyStateChangeCallback, Variables}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.JSRichGenMap
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}

object RootQueries {
  def apply(queries: (String, QueryBuilder)*): RootQueries = queries.toMap.toJSDictionary
}

object Fragments {
  def apply(fragments: (String, Fragment)*): Fragments = fragments.toMap.toJSDictionary
}

object RelayContainer {
  type Fragments = js.Dictionary[Fragment]
  type Fragment = js.Function0[js.Any]
  type RootQueries = js.Dictionary[QueryBuilder]
}


@ScalaJSDefined
trait AbstractRelayContainerSpec extends js.Object {

  val fragments: Fragments

  val initialVariables: js.UndefOr[js.Object]

  val prepareVariables: js.UndefOr[js.Function]

}

@ScalaJSDefined
abstract class RelayContainerSpec extends AbstractRelayContainerSpec {
  override val initialVariables: js.UndefOr[js.Object] = js.undefined
  override val prepareVariables: js.UndefOr[js.Function] = js.undefined
}

/**
 *
 * RelayContainer is a higher order component that provides the ability to:
 *
 * - Encode data dependencies using query fragments that are parameterized by
 * routes and variables.
 * - Manipulate variables via methods on `this.props.relay`.
 * - Automatically subscribe to data changes.
 * - Avoid unnecessary updates if data is unchanged.
 * - Propagate the `route` via context (available on `this.props.relay`).
 *
 */

@js.native
trait RelayContainer[P <: RelayComponentProps,S] extends js.Object {

  var route: RelayQueryConfig = js.native

  var variables: Variables = js.native

  /**
   * Requests an update to variables. This primes the cache for the new
   * variables and notifies the caller of changes via the callback. As data
   * becomes ready, the component will be updated.
   */
  def setVariables(partialVariables: js.UndefOr[Variables] = js.undefined, callback: js.UndefOr[ComponentReadyStateChangeCallback] = js.undefined): Unit = js.native

  /**
   * Requests an update to variables. Unlike `setVariables`, this forces data
   * to be fetched and written for the supplied variables. Any data that
   * previously satisfied the queries will be overwritten.
   */
  def forceFetch(partialVariables: js.UndefOr[Variables] = js.undefined, callback: js.UndefOr[ComponentReadyStateChangeCallback] = js.undefined): Unit = js.native

  /**
   * Determine if the supplied record reflects an optimistic update.
   */
  def hasOptimisticUpdate(record: js.Object): Boolean = js.native

  /**
   * Returns the pending mutation transactions affecting the given record.
   */
  def getPendingTransactions(record: js.Object): js.UndefOr[js.Array[RelayMutationTransaction]] = js.native

  /**
   * Returns any error related to fetching data for a deferred fragment.
   */
  def getFragmentError(fragmentReference: RelayFragmentReference, record: js.Object): js.UndefOr[js.Error] = js.native

  /**
   * Checks if data for a deferred fragment is ready. This method should
   * *always* be called before rendering a child component whose fragment was
   * deferred (unless that child can handle null or missing data).
   */
  def hasFragmentData(fragmentReference: RelayFragmentReference, record: js.Object): Boolean = js.native

  def componentWillReceiveProps(nextProps: js.Object, nextContext: js.Object = ???): Unit = js.native

  def shouldComponentUpdate(nextProps: js.Object, nextState: js.Any, nextContext: js.Any): Boolean = js.native

  def render(): ReactElement = js.native

  def getFragment(fragmentName: String, route: RelayQueryConfig = ???, variables: Variables = ???): RelayQueryFragment = js.native

  def getFragmentNames(): js.Array[String] = js.native
}
