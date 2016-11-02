package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait Alert extends js.Object {
  def alert(title: String = ???, message: String = ???, buttons: js.Array[AlertButton] = ???, options: AlertOptions = ???, `type`: String = "default"): Unit = js.native
}

@ScalaJSDefined
class AlertButton(val text: js.UndefOr[String] = js.undefined, val onPress: js.UndefOr[js.Function] = js.undefined, val style: js.UndefOr[String] = js.undefined) extends js.Object

@ScalaJSDefined
class AlertOptions extends js.Object {
  val cancelable: js.UndefOr[Boolean] = js.undefined
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

