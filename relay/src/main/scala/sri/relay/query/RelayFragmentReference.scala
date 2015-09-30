package sri.relay.query

import sri.relay.query.RelayFragmentReference.{FragmentGetter, PrepareVariablesCallback, VariableMapping}
import sri.relay.route.RelayMetaRoute
import sri.relay.tools.RelayTypes.Variables

import scala.scalajs.js

object RelayFragmentReference {
  type Condition = (Variables) => Boolean
  type FragmentGetter = () => GraphQLQueryFragment
  type PrepareVariablesCallback = (Variables, RelayMetaRoute) => Variables
  type VariableMapping = js.Dictionary[js.Any]
}


/**
 * internal
 *
 * RelayFragmentReference is the return type of fragment composition:
 *
 * fragment on Foo {
 * ${Child.getFragment('bar', {baz: variables.qux})}
 * }
 *
 * Whereas a fragment defines a sub-query's structure, a fragment reference is
 * a particular instantiation of the fragment as it is composed within a query
 * or another fragment. It encodes the source fragment, initial variables, and
 * a mapping from variables in the composing query's (or fragment's) scope to
 * variables in the fragment's scope.
 *
 * The variable mapping is represented by `variableMapping`, a dictionary that
 * maps from names of variables in the parent scope to variables that exist in
 * the fragment. Example:
 *
 * ```
 * // Fragment:
 * var Container = Relay.createContainer(..., {
 * initialVariables: {
 * private: 'foo',
 * public: 'bar',
 * variable: null,
 * },
 * fragments: {
 * foo: ...
 * }
 * });
 *
 * // Reference:
 * ${Container.getQuery(
 * 'foo',
 * // Variable Mapping:
 * {
 * public: 'BAR',
 * variable: variables.source,
 * }
 * )}
 * ```
 *
 * When evaluating the referenced fragment, `$public` will be overridden with
 * `'Bar'`. The value of `$variable` will become the value of `$source` in the
 * outer scope. This is analagous to:
 *
 * ```
 * function inner(private = 'foo', public = 'bar', variable) {}
 * function outer(source) {
 * inner(public = 'BAR', variable = source);
 * }
 * ```
 *
 * Where the value of the inner `variable` depends on how `outer` is called.
 *
 * The `prepareVariables` function allows for variables to be modified based on
 * the runtime environment or route name.
 */
@js.native
class RelayFragmentReference(fragmentGetter: FragmentGetter,
                             initialVariables: Variables = ???,
                             variableMapping: VariableMapping = ???,
                             prepareVariables: PrepareVariablesCallback = ???) extends js.Object {

  /**
   * Mark this usage of the fragment as deferred.
   */
  def defer: RelayFragmentReference = js.native

  /**
   * Mark this usage of the fragment as conditional on its type.
   */
  def conditionOnType: RelayFragmentReference = js.native

  /**
   * Mark this fragment for inclusion only if the given variable is falsy.
   */
  def unless(callVariable: js.Any): RelayFragmentReference = js.native

  /**
   * Get the referenced fragment if all conditions are met.
   */
  def getFragment(variables: Variables): js.UndefOr[GraphQLQueryFragment] = js.native

  /**
   * Get the variables to pass to the referenced fragment, accounting for
   * initial values, overrides, and route-specific variables.
   */
  def getVariables(route: RelayMetaRoute, variables: Variables): Variables = js.native

  def getFragmentName: String = js.native

  def isTypeConditional: Boolean = js.native

  def isDeferred: Boolean = js.native
}