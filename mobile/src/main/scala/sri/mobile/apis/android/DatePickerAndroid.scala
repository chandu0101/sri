package sri.mobile.apis.android

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
trait DatePickerAndroidOptions extends js.Object {
  var date: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var mode: js.UndefOr[DatePickerAndroidMode] = js.undefined
}

@js.native
trait DatePickerAndroidMode extends js.Object

object DatePickerAndroidMode {
  val CALENDER = "calender".asInstanceOf[DatePickerAndroidMode]
  val SPINNER = "spinner".asInstanceOf[DatePickerAndroidMode]
  val DEFAULT = "default".asInstanceOf[DatePickerAndroidMode]
}

@ScalaJSDefined
trait DatePickerAndroidResult extends js.Object {
  val action: String
  val year: Int
  val month: Int
  val day: Int
}