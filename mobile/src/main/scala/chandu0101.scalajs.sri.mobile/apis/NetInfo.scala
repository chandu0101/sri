package chandu0101.scalajs.sri.mobile.apis

import scala.scalajs.js

@js.native
trait NetInfo extends js.Object {

  val isConnected: NetInfoIsConnected = js.native
  val reachabilityIOS: NetInfoReachabilityIOS = js.native


}

@js.native
trait NetInfoIsConnected extends js.Object {

  def addEventListener(eventName: String, handler: (Boolean) => _): Unit = js.native

  def removeEventListener(eventName: String, handler: (Boolean) => _): Unit = js.native

  def fetch(): js.Dynamic = js.native
}

@js.native
trait NetInfoReachabilityIOS extends js.Object {

  def addEventListener(eventName: String, handler: (String) => _): Unit = js.native

  def removeEventListener(eventName: String, handler: (String) => _): Unit = js.native

  def fetch(): js.Dynamic = js.native
}