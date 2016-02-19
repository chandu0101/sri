package sri.mobile.components.android

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.mobile.ReactNative
import sri.universal.ReactEvent

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class ViewPagerAndroid(key: U[String] = undefined,
                            style: U[js.Any] = undefined,
                            ref: U[ViewPagerAndroidM => _] = undefined,
                            initialPage: U[Int] = undefined,
                            onPageScroll: U[ReactEvent => _] = undefined,
                            onPageSelected: U[ReactEvent => _] = undefined,
                            onPageScrollStateChanged: U[ReactEvent => _] = undefined,
                            keyboardDismissMode: U[KeyboardDismissModeViewPager] = undefined
                             ) {

  def apply() = {
    val props = JSMacro[ViewPagerAndroid](this)
    React.createElement(ReactNative.ViewPagerAndroid, props)
  }

}

@js.native
trait ViewPagerAndroidM extends js.Object {

  def setPage(selectedPage: Int): Unit = js.native
}

class KeyboardDismissModeViewPager private(val value: String) extends AnyVal

object KeyboardDismissModeViewPager {

  val NONE = new KeyboardDismissModeViewPager("none")
  val ON_DRAG = new KeyboardDismissModeViewPager("on-drag")

}