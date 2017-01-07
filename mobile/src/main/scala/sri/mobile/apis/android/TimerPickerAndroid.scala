package sri.mobile.apis.android

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
trait TimerPickerAndroidOptions extends js.Object {
  var hour: js.UndefOr[Int] = js.undefined
  var minute: js.UndefOr[Int] = js.undefined
  var is24Hour: js.UndefOr[Boolean] = js.undefined
}

@js.native
trait TimerPickerAndroidResponse extends js.Object {
  val action: String
  val hour: Int
  val minute: Int
}