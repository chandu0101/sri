package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js

/**
 * Created by chandrasekharkode on 4/1/15.
 *
 * key: PropTypes.string,
   ref: PropTypes.string,
   date: PropTypes.Date.isRequired,
    onDateChange: PropTypes.js.Date => Unit.isRequired,
    maximumDate: PropTypes.Date,
    minimumDate: PropTypes.Date,
    mode: PropTypes.DatePickerIOSMode,
    minuteInterval: PropTypes.MinuteInterval,
    timeZoneOffsetInMinutes: PropTypes.number,
 */



object DatePickerIOS {

  def apply(ref : js.UndefOr[String] = js.undefined,
            timeZoneOffsetInMinutes : js.UndefOr[Int] = js.undefined,
            key : js.UndefOr[String] = js.undefined,
            date : js.Date,
            minuteInterval : js.UndefOr[MinuteInterval] = js.undefined,
            mode : js.UndefOr[DatePickerIOSMode] = js.undefined,
            minimumDate : js.UndefOr[js.Date] = js.undefined ,
            maximumDate : js.UndefOr[js.Date] = js.undefined ,
            onDateChange : js.Date => Unit) = {

    val p = js.Dynamic.literal()
    ref.foreach(v => p.updateDynamic("ref")(v))
    timeZoneOffsetInMinutes.foreach(v => p.updateDynamic("timeZoneOffsetInMinutes")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    p.updateDynamic("date")(date)
    minuteInterval.foreach(v => p.updateDynamic("minuteInterval")(v.interval))
    mode.foreach(v => p.updateDynamic("mode")(v.mode))
    minimumDate.foreach(v => p.updateDynamic("minimumDate")(v))
    maximumDate.foreach(v => p.updateDynamic("maximumDate")(v))
    p.updateDynamic("onDateChange")(onDateChange)

    val f = ReactNative.createFactory(ReactNative.DatePickerIOS)
    f(p).asInstanceOf[ReactElement]
  }

}


class DatePickerIOSMode private(val mode : String) extends AnyVal

object DatePickerIOSMode {

  val DATE = new DatePickerIOSMode(("date"))
  val TIME = new DatePickerIOSMode(("time"))
  val DATE_TIME = new DatePickerIOSMode(("datetime"))

  def newMode(mode : String) = new DatePickerIOSMode(mode)
}

class MinuteInterval private(val interval : Int) extends AnyVal


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

  def newInterval(interval : Int) = new MinuteInterval(interval)
}