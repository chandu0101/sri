package chandu0101.scalajs.sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.UndefOr


trait PushNotificationIOS extends js.Object {

  def presentLocalNotification(details : js.Object) : Unit = js.native

  def scheduleLocalNotification(details : js.Object) : Unit = js.native

  def setApplicationIconBadgeNumber(number: Int): Unit = js.native

  def getApplicationIconBadgeNumber(callback: js.Function): Unit = js.native

  def addEventListener(tpe: String, handler: js.Function): Unit = js.native

  def removeEventListener(tpe: String, handler: js.Function): Unit = js.native

  def requestPermissions(): Unit = js.native

  def popInitialNotification(): js.Dynamic = js.native

  def checkPermissions(callback: js.Function): Unit = js.native

  def getSound(): UndefOr[String] = js.native

  def getAlert(): UndefOr[js.Dynamic] = js.native

  def getData(): UndefOr[js.Dynamic] = js.native

  def getBadgeCount(): UndefOr[Int] = js.native


}
