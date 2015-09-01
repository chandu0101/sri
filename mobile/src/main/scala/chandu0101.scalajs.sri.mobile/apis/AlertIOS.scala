package chandu0101.scalajs.sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}

@js.native
trait AlertIOS extends js.Object {

  def alert(title: String = ???, message: String = ???, buttons: js.Array[js.Object] = ???): Unit = js.native

  def prompt(title: String, value: String = ???, buttons: js.Array[js.Object] = ???, callback: js.Function = ???): Unit = js.native
}


case class AlertButton(text: String, onPress: js.Function) {
  def toJson = json(text = text, onPress = onPress)
}