package chandu0101.scalajs.sri.mobile.components.android

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.ReactNode
import chandu0101.scalajs.sri.mobile.ReactNative
import chandu0101.scalajs.sri.mobile.components._

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class ToolbarAndroid(key: U[String] = undefined,
                          style: U[js.Any] = undefined,
                          ref: U[ToolbarAndroidM => _] = undefined,
                          actions: U[Seq[ToolbarAndroidAction]] = undefined,
                          logo: U[ImageSource] = undefined,
                          navIcon: U[ImageSource] = undefined,
                          onActionSelected: U[Int => _] = undefined,
                          onIconClicked: U[() => _] = undefined,
                          subtitle: U[String] = undefined,
                          subtitleColor: U[String] = undefined,
                          title: U[String] = undefined,
                          titleColor: U[String] = undefined,
                          testID: U[String] = undefined
                           ) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[ToolbarAndroid](this)
    val f = ReactNative.createFactory(ReactNative.ToolbarAndroid)
    f(props, children: _*)
  }

}

@js.native
trait ToolbarAndroidM extends js.Object

case class ToolbarAndroidAction(title: String, icon: U[ImageSource] = undefined, show: U[ToolbarAndroidActionShow] = undefined, showWithText: U[Boolean] = undefined) {
  val toJS = JSMacro[ToolbarAndroidAction](this)
}

class ToolbarAndroidActionShow private(val value: String) extends AnyVal

object ToolbarAndroidActionShow {

  val ALWAYS = new ToolbarAndroidActionShow("always")
  val IF_ROOM = new ToolbarAndroidActionShow("ifRoom")
  val NEVER = new ToolbarAndroidActionShow("never")
}