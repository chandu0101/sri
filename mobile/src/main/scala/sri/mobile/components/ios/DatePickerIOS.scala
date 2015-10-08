package sri.mobile.components.ios

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.mobile.ReactNative

import scala.scalajs.js

case class DatePickerIOS(ref: js.UndefOr[DatePickerIOSM => _] = js.undefined,
                         timeZoneOffsetInMinutes: js.UndefOr[Int] = js.undefined,
                         key: js.UndefOr[String] = js.undefined,
                         date: js.Date,
                         minuteInterval: js.UndefOr[MinuteInterval] = js.undefined,
                         mode: js.UndefOr[DatePickerIOSMode] = js.undefined,
                         minimumDate: js.UndefOr[js.Date] = js.undefined,
                         maximumDate: js.UndefOr[js.Date] = js.undefined,
                         onDateChange: js.Date => Unit) {

  def apply() = {
    val props = JSMacro[DatePickerIOS](this)
    React.createElement(ReactNative.DatePickerIOS,props)
  }

}


class DatePickerIOSMode private(val value: String) extends AnyVal

object DatePickerIOSMode {

  val DATE = new DatePickerIOSMode(("date"))
  val TIME = new DatePickerIOSMode(("time"))
  val DATE_TIME = new DatePickerIOSMode(("datetime"))

  def newMode(mode: String) = new DatePickerIOSMode(mode)
}

class MinuteInterval private(val value: Int) extends AnyVal

object MinuteInterval {

  val _1 = new MinuteInterval(1)
  val _2 = new MinuteInterval(2)
  val _3 = new MinuteInterval(3)
  val _4 = new MinuteInterval(4)
  val _5 = new MinuteInterval(5)
  val _6 = new MinuteInterval(6)
  val _10 = new MinuteInterval(10)
  val _12 = new MinuteInterval(12)
  val _15 = new MinuteInterval(15)
  val _20 = new MinuteInterval(20)
  val _30 = new MinuteInterval(30)

  def newInterval(interval: Int) = new MinuteInterval(interval)
}

@js.native
trait DatePickerIOSM extends js.Object