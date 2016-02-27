package sri.relay.network


import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@js.native
trait GraphQLError extends js.Object {
  val message: String  = js.native
  val locations: js.UndefOr[js.Array[GraphQLErrorLocation]] = js.native
}

@js.native
trait GraphQLErrorLocation extends js.Object {
  val column: Int = js.native
  val line: Int = js.native
}

@ScalaJSDefined
trait NetworkLayer extends js.Object {
  def sendMutation(mutationRequest: RelayMutationRequest): Promise[Unit]
  def sendQueries(queryRequests: js.Array[RelayQueryRequest]): Promise[Unit]
  def supports(options: js.Array[String]): Boolean
}

@js.native
class DefaultNetworkLayerConfig(val fetchTimeout: js.UndefOr[Int] = js.undefined,
                                val headers: js.UndefOr[js.Dictionary[String]] = js.undefined,
                                val method: js.UndefOr[String] = js.undefined,
                                val retryDelays: js.UndefOr[js.Array[Int]] = js.undefined) extends js.Object

@js.native
@JSName("Relay.DefaultNetworkLayer")
class DefaultNetworkLayer(val url: js.UndefOr[String] = js.undefined, config: js.UndefOr[DefaultNetworkLayerConfig] = js.undefined) extends NetworkLayer {
  override def sendMutation(mutationRequest: RelayMutationRequest): Promise[Unit] = js.native

  override def sendQueries(queryRequests: js.Array[RelayQueryRequest]): Promise[Unit] = js.native

  override def supports(options: js.Array[String]): Boolean = js.native
}