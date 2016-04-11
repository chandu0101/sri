package sri.mobile.apis.ios

import scala.scalajs.js

@js.native
trait AlertIOS extends js.Object {

  def alert(title: String = ???, message: String = ???, buttons: js.Array[js.Object] = ???): Unit = js.native

  def prompt(title: String, value: String = ???, buttons: js.Array[js.Object] = ???, callback: js.Function = ???): Unit = js.native
}
