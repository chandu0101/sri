package sri.mobile.components.android

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait DatePickerAndroid extends js.Object {

  val dismissedAction: String = js.native

  val dateSetAction: String = js.native

  def open(options: DatePickerAndroidOptions): Promise[DatePickerAndroidResult] = js.native
}

@ScalaJSDefined
class DatePickerAndroidOptions(val date: js.Date, val minDate: js.UndefOr[js.Date] = js.undefined, val maxDate: js.UndefOr[js.Date] = js.undefined) extends js.Object

@ScalaJSDefined
trait DatePickerAndroidResult extends js.Object {
  val action: String
  val year: Int
  val month: Int
  val day: Int
}