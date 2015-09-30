package sri.relay.network

import org.scalajs.dom.raw.Promise

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait NetworkLayer extends js.Object {
  def sendMutation(mutationRequest: RelayMutationRequest): js.UndefOr[Promise[js.Any]]

  def sendQueries(queryRequests: Seq[RelayQueryRequest]): js.UndefOr[Promise[js.Any]]

  def supports(options: Seq[String]): Boolean
}

@js.native
class DefaultNetworkLayerConfig(val fetchTimeout: js.UndefOr[Int] = js.undefined,
                                val headers: js.UndefOr[js.Dictionary[String]] = js.undefined,
                                val method: js.UndefOr[String] = js.undefined,
                                val retryDelays: js.UndefOr[js.Array[Int]] = js.undefined) extends js.Object

@js.native
@JSName("Relay.DefaultNetworkLayer")
class DefaultNetworkLayer(val url: js.UndefOr[String] = js.undefined, config: js.UndefOr[DefaultNetworkLayerConfig] = js.undefined) extends NetworkLayer {
  override def sendMutation(mutationRequest: RelayMutationRequest): UndefOr[Promise[js.Any]] = js.native

  override def sendQueries(queryRequests: Seq[RelayQueryRequest]): UndefOr[Promise[js.Any]] = js.native

  override def supports(options: Seq[String]): Boolean = js.native
}
