package sri.mobile.components.android

import chandu0101.macros.tojs.{rename, JSMacro}
import sri.core.{React, ReactNode}
import sri.mobile.ReactNative
import sri.universal.components.ImageSource

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class ToolbarAndroid(key: U[String] = undefined,
                          style: U[js.Any] = undefined,
                          ref: U[ToolbarAndroidM => _] = undefined,
                          actions: U[Seq[ToolbarAndroidAction]] = undefined,
                          logo: U[ImageSource] = undefined,
                          @rename("logo") logoDynamic: U[js.Any] = undefined,
                          navIcon: U[ImageSource] = undefined,
                          @rename("navIcon")  navIconDynamic: U[js.Any] = undefined,
                          onActionSelected: U[Int => _] = undefined,
                          onIconClicked: U[() => _] = undefined,
                          subtitle: U[String] = undefined,
                          contentInsetStart: U[Double] = undefined,
                          contentInsetEnd: U[Double] = undefined,
                          subtitleColor: U[String] = undefined,
                          title: U[String] = undefined,
                          titleColor: U[String] = undefined,
                          testID: U[String] = undefined
                           ) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[ToolbarAndroid](this)
    React.createElement(ReactNative.ToolbarAndroid, props, children: _*)
  }

}

@js.native
trait ToolbarAndroidM extends js.Object

case class ToolbarAndroidAction(title: String, icon: U[js.Any] = undefined, show: U[ToolbarAndroidActionShow] = undefined, showWithText: U[Boolean] = undefined) {
  val toJS = JSMacro[ToolbarAndroidAction](this)
}

class ToolbarAndroidActionShow private(val value: String) extends AnyVal

object ToolbarAndroidActionShow {

  val ALWAYS = new ToolbarAndroidActionShow("always")
  val IF_ROOM = new ToolbarAndroidActionShow("ifRoom")
  val NEVER = new ToolbarAndroidActionShow("never")
}