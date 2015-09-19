package chandu0101.scalajs.sri.relay

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait RelayQueryConfig extends js.Object {
  val name: String
  val queries: js.Dictionary[js.Any]
  val params: U[js.Object]
}



@js.native
@JSName("Relay.Route")
abstract class AbstractRelayQueryConfig(var inputParams: js.Any) extends js.Object {

}