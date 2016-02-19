package sri.relay.tools

import sri.relay.query.RelayQueryRoot
import sri.relay.tools.RelayInternalTypes.CallValue

import scala.scalajs.js

@js.native
trait Call extends js.Object {
  val name: String = js.native
  val value: CallValue = js.native
  val `type`: js.UndefOr[String] = js.native
}

object RelayInternalTypes {
  type CallValue = js.Any
  type ClientMutationID = String
  type DataID = String
  type FieldValue = js.Any
  type RelayQuerySet = js.Dictionary[js.UndefOr[RelayQueryRoot]]
  //type RangeBehaviors = js.Dictionary[Enumeration[GraphQLMutatorConstants.RANGE_OPERATIONS]]
}

@js.native
trait UpdateOptions extends js.Object {
  val configs: Seq[js.Dictionary[js.Any]] = js.native
  val isOptimisticUpdate: Boolean = js.native
}

