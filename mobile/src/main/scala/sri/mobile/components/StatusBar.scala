package sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class StatusBar(key: U[String] = undefined,
                     backgroundColor: U[String] = undefined,
                     translucent: U[Boolean] = undefined,
                     animated: U[Boolean] = undefined,
                     barStyle: U[StatusBarStyle] = undefined,
                     networkActivityIndicatorVisible: U[Boolean] = undefined,
                     showHideTransition: U[StatusBarShowHideTransition] = undefined,
                     hidden: U[Boolean] = undefined,
                     ref: U[StatusBarM => _] = undefined) {

  def apply() = {
    val props = JSMacro[StatusBar](this)
    React.createElement(ReactNative.StatusBar, props)
  }
}

class StatusBarStyle private(val value: String) extends AnyVal

object StatusBarStyle {

  val DEFAULT = new StatusBarStyle("default")
  val LIGHT_CONTENT = new StatusBarStyle("light-content")
}

class StatusBarShowHideTransition private(val value: String) extends AnyVal

object StatusBarShowHideTransition {

  val FADE = new StatusBarShowHideTransition("fade")

  val SLIDE = new StatusBarShowHideTransition("slide")

}

@js.native
trait StatusBarM extends js.Object
