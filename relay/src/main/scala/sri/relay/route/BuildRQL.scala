package sri.relay.route

import sri.relay.query.RelayQL.RelayConcreteNode
import sri.relay.tools.RelayTypes.Variables

import scala.scalajs.js

object BuildRQL {
  type FragmentBuilder = js.Function1[Variables, RelayConcreteNode]
  type QueryBuilder = js.Function0[RelayConcreteNode]
  type VariableNames = Seq[String]
}
