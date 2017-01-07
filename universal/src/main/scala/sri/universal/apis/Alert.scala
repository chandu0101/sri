package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait Alert extends js.Object {
  def alert(title: String = ???, message: String = ???, buttons: js.Array[AlertButton] = ???, options: AlertOptions = ???, `type`: String = "default"): Unit = js.native
}

@ScalaJSDefined
trait AlertButton extends js.Object {
  var text: js.UndefOr[String] = js.undefined
  var onPress: js.UndefOr[js.Function] = js.undefined
  var style: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait AlertOptions extends js.Object {
  var cancelable: js.UndefOr[Boolean] = js.undefined
}

object AlertTypes {
  val DEFAULT = "default"
  val PLAIN_TEXT = "plain-text"
  val SECURE_TEXT = "secure-text"
  val LOGIN_PASSWORD = "login-password"
}

object AlertButtonStyles {

  val DEFAULT = "default"

  val CANCEL = "cancel"

  val DESTRUCTIVE = "destructive"

}

