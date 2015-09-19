package chandu0101.scalajs.sri.relay

import chandu0101.scalajs.sri.core.ReactJSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.{Dictionary, UndefOr => U}


@ScalaJSDefined
trait AbstractRelayContainerConfig extends js.Object {

  var fragments: js.Dictionary[js.Function]

  var initialVariables: U[js.Dictionary[Any]]

  var prepareVariables: U[js.Function1[js.Dictionary[Any], js.Dictionary[Any]]]

  @JSName("route") var query: U[js.Dynamic]

  var variables: U[js.Dictionary[Any]]

}

@ScalaJSDefined
abstract class RelayContainerConfig extends AbstractRelayContainerConfig {
  override var initialVariables: U[Dictionary[Any]] = js.undefined
  override var variables: U[Dictionary[Any]] = js.undefined
  @JSName("route") override var query: U[js.Dynamic] = js.undefined
  override var prepareVariables: U[js.Function1[Dictionary[Any], Dictionary[Any]]] = js.undefined
}


@js.native
trait RelayContainer[P,S] extends ReactJSComponent[P,S] {

  var route : RelayQueryConfig = js.native

  var variables : js.Dictionary[Any] = js.native

  def setVariables(partialVariables : js.Object,onReadyStateChange : js.Function = ???): Unit = js.native

  def forceFetch(partialVariables : js.Object,onReadyStateChange : js.Function = ???): Unit = js.native

  def hasOptimisticUpdate(record : js.Object): Boolean = js.native

  def getPendingTransactions(record : js.Object): U[js.Array[RelayMutationTransaction]] = js.native
}