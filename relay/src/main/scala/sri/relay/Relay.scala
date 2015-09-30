package sri.relay

import sri.core.{ReactComponent, ReactClass, ReactComponentConstructor}
import sri.relay.container.{RelayContainer, RelayContainerSpec, RelayPropTypes}
import sri.relay.mutation.RelayMutation
import sri.relay.network.NetworkLayer
import sri.relay.route.RelayQueryConfig
import sri.relay.store.RelayStore
import sri.relay.tools.RelayInternalTypes.RelayQuerySet
import sri.relay.tools.RelayTaskScheduler.TaskExecutor

import scala.scalajs.js

@js.native
object Relay extends js.Object {
  val RootContainer: ReactClass = js.native

  /**
   * Create a component given a specification. A component implements a render method which returns one single child.
   * That child may have an arbitrarily deep child structure. One thing that makes components different than standard
   * prototypal classes is that you don't need to call new on them. They are convenience wrappers that construct
   * backing instances (via new) for you.
   */

  val Mutation: RelayMutation = js.native
  val PropTypes: RelayPropTypes = js.native
  val Route: RelayQueryConfig = js.native
  val Store: RelayStore = js.native

  def createContainer[C <: RelayComponent[_,_]](component: ReactComponentConstructor[C], spec: RelayContainerSpec): RelayContainer[C] = js.native

  def getQueries[C <: RelayComponent[_,_]](component: RelayContainer[C], route: RelayQueryConfig): RelayQuerySet = js.native

  def injectNetworkLayer(layer: NetworkLayer): Unit = js.native

  def injectTaskScheduler(scheduler: TaskExecutor): Unit = js.native

  def isContainer(component: js.Object): Boolean = js.native
}
