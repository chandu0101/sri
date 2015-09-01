package chandu0101.scalajs.sri.relay

import chandu0101.scalajs.sri.core.{React, ReactClass, ReactElement}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.JSName

@js.native
trait Relay extends js.Object {

  val RootContainer: ReactClass = js.native

  def createContainer(component : js.Any,config : RelayContainer) : RelayContainer = js.native

}

object Relay extends Relay


@js.native @JSName("Relay.DefaultNetworkLayer")
class DefaultNetworkLayer(val url: String) extends js.Object {

}

@js.native
trait RelayContainer extends js.Object {

  val fragments: js.Dictionary[Any] = js.native

  val initialVariables: js.Dictionary[Any] = js.native

  val prepareVariables: js.Function1[js.Dictionary[Any], js.Dictionary[Any]] = js.native

  @JSName("route") val query: js.Dynamic = js.native

  val variables: js.Dictionary[Any] = js.native


}

object RelayContainer {


  def apply(fragments: js.Dictionary[Any],
            initialVariables: js.UndefOr[js.Dictionary[Any]] = js.undefined,
            prepareVariables: js.UndefOr[js.Function1[js.Dictionary[Any], js.Dictionary[Any]]] = js.undefined) = {

    val x = json(fragments = fragments)
    initialVariables.foreach(v => x.updateDynamic("initialVariables")(v))
    prepareVariables.foreach(v => x.updateDynamic("prepareVariables")(v))

    x.asInstanceOf[RelayContainer]
  }

}


@js.native @JSName("Relay.Route")
class RelayQueryConfig extends js.Object {

  def paramDefinitions: js.Dictionary[Any] = js.native

  def queries: js.Dictionary[Any] = js.native

  def routeName: String = js.native
}


object RelayRootContainer {

  def apply(component: RelayContainer, route: RelayQueryConfig) = {

    val js = json(component = component, route = route)

    val f = React.createFactory(Relay.RootContainer)
    f(js).asInstanceOf[ReactElement]
  }
}