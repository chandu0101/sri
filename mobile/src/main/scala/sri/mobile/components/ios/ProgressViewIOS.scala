package sri.mobile.components.ios

import chandu0101.macros.tojs.{JSMacro, rename}
import sri.core._
import sri.mobile.ReactNative
import sri.universal.components._
import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class ProgressViewIOS(key: U[String] = undefined,
                           style: U[js.Any] = undefined,
                           progress: U[Double] = undefined,
                           progressImage: U[ImageSource] = undefined,
                           @rename("progressImage") progressImageDynamic: U[js.Dynamic] = undefined,
                           trackImage: U[ImageSource] = undefined,
                           @rename("trackImage") trackImageDynamic: U[js.Dynamic] = undefined,
                           progressTintColor: U[String] = undefined,
                           trackTintColor: U[String] = undefined,
                           progressViewStyle: U[ProgressViewStyle] = undefined,
                           ref: U[ProgressViewIOSM => _] = undefined) {

  val props = JSMacro[ProgressViewIOS](this)

  def apply() = React.createElement(ReactNative.ProgressViewIOS, props)
}

@js.native
trait ProgressViewIOSM extends js.Object

class ProgressViewStyle private(val value: String) extends AnyVal

object ProgressViewStyle {
  val BAR = new ProgressViewStyle("bar")

  val DEFAULT = new ProgressViewStyle("default")
}