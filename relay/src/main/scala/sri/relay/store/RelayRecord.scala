package sri.relay.store

import scala.scalajs.js

@js.native
trait RelayRecord extends js.Object {

  def create(dataID: String): js.Object = js.native

  def getDataID(record: js.Object): js.UndefOr[String] = js.native

  def isRecord(value: js.Any): Boolean = js.native

  def isMetadataKey(key: String): Boolean = js.native

  def isClientID(dataID: String): Boolean = js.native

}
