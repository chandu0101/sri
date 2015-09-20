package sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait NetInfo extends NetInfoMethods {

  def isConnected: NetInfoMethods = js.native

  def isConnectionMetered : NetInfoMethods = js.native

  val reachabilityIOS: NetInfoMethods = js.native

}

@js.native
@JSName("React.NetInfo")
object NetInfo  extends NetInfo


@js.native
trait NetInfoMethods extends js.Object {

  def addEventListener(eventName: String, handler: (Boolean) => _): Unit = js.native

  def removeEventListener(eventName: String, handler: (Boolean) => _): Unit = js.native

  def fetch(): js.Dynamic = js.native

}

