package chandu0101.scalajs.sri.mobile.apis

import scala.scalajs.js


trait AppStateIOS extends js.Object {

  def addEventListener(tpe :String,handler : js.Function1[String,_]):Unit = js.native
  def removeEventListener(tpe :String,handler : js.Function1[String,_]):Unit = js.native
  def currentState : js.UndefOr[String] = js.native
}
