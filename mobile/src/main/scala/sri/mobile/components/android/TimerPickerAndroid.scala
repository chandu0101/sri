package sri.mobile.components.android

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait TimerPickerAndroid extends js.Object {

  val dismissedAction: String = js.native

  val timeSetAction: String = js.native

  def open(options: TimerPickerAndroidOptions): Promise[TimerPickerAndroidResponse] = js.native
}

@ScalaJSDefined
class TimerPickerAndroidOptions(val hour: js.UndefOr[Int] = js.undefined, val minute: js.UndefOr[Int] = js.undefined, val is24Hour: js.UndefOr[Boolean] = js.undefined) extends js.Object

@ScalaJSDefined
trait TimerPickerAndroidResponse extends js.Object {
  val action: String
  val hour: Int
  val minute: Int
}