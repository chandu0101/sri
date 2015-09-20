package sri.mobile.components.android

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class ProgressBarAndroid(key: U[String] = undefined,
                              style: U[js.Any] = undefined,
                              ref: U[ProgressBarAndroidM => _] = undefined,
                              styleAttr: U[ProgressBarAndroidStyle] = undefined,
                              testID: U[String] = undefined) {

  def apply() = {
    val props = JSMacro[ProgressBarAndroid](this)
    val f = React.createFactory(ReactNative.ProgressBarAndroid)
    f(props)
  }

}

@js.native
trait ProgressBarAndroidM extends js.Object

class ProgressBarAndroidStyle private(val value: String) extends AnyVal

object ProgressBarAndroidStyle {

  val HORIZONTAL = new ProgressBarAndroidStyle("Horizontal")
  val SMALL = new ProgressBarAndroidStyle("Small")
  val LARGE = new ProgressBarAndroidStyle("Large")
  val Inverse = new ProgressBarAndroidStyle("Inverse")
  val SmallInverse = new ProgressBarAndroidStyle("SmallInverse")
  val LargeInverse = new ProgressBarAndroidStyle("LargeInverse")

}