package sri.relay.store

import sri.relay.tools.RelayInternalTypes._

import scala.scalajs.js

@js.native
class RelayStoreData extends js.Object{

  def clearCacheManager(): Unit = js.native

  def hasCacheManager() : Boolean = js.native

  def hasOptimisticUpdate(dataID : DataID): Boolean = js.native
}
