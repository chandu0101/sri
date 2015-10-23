package sri.relay.route

import sri.relay.container.RelayContainer.RootQueries
import sri.relay.route.RelayQueryConfig.Params

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@js.native
trait ParamDefinition extends js.Object {
  @JSName("type")
  def tpe: String = js.native

  def required: Boolean = js.native
}

object Params {
  def apply(params: (String, js.Any)*): Params = params.toMap.toJSDictionary
}

object RelayQueryConfig {
  type Params = js.Dictionary[js.Any]
}

@ScalaJSDefined
trait RelayQueryConfig extends js.Object {
  val name: String
  val params: js.Object
  val queries: RootQueries
}

@js.native
@JSName("Relay.Route")
abstract class AbstractRelayQueryConfig(initialParams: js.UndefOr[Params] = js.undefined) extends js.Object
