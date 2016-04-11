package sri.mobile.apis.ios

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}

case class AlertIOSButton(text: String, onPress: js.Function) {
  def toJson = json(text = text, onPress = onPress)
}
