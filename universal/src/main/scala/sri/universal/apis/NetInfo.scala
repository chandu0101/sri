package sri.universal.apis

import scala.scalajs.js

@js.native
trait NetInfo extends NetInfoMethods {

  def isConnected: NetInfoMethods = js.native

  def isConnectionExpensive(callback: js.Function2[js.UndefOr[Boolean], js.UndefOr[String], _]): Unit = js.native

}


@js.native
trait NetInfoMethods extends js.Object {

  def addEventListener(eventName: String, handler: js.Function1[Boolean, _]): Unit = js.native

  def removeEventListener(eventName: String, handler: js.Function1[Boolean, _]): Unit = js.native

  def fetch(): js.Dynamic = js.native

}

