package sri.relay

import sri.core.{ReactClass, ReactComponentConstructor}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{UndefOr => U}

@js.native
trait Relay extends js.Object {

  type Scheduler = js.Function => Unit

  val RootContainer: ReactClass = js.native

  def createContainer[P, S](component: ReactComponentConstructor[P, S], config: RelayContainerConfig): RelayContainer[P, S] = js.native

  def injectNetworkLayer(layer: js.Any): Unit = js.native

  def injectTaskScheduler(scheduler: Scheduler): Unit = js.native

  def isContainer(component: js.Object): Boolean = js.native
}


@js.native
object Relay extends Relay


@js.native
@JSName("Relay.DefaultNetworkLayer")
class DefaultNetworkLayer(val url: String) extends js.Object {

}

