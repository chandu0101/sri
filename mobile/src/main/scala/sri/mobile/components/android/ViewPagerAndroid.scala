package sri.mobile.components.android

import chandu0101.macros.tojs.JSMacro
import sri.core.{ReactNode, React}
import sri.mobile.{ViewPagerAndroidEvent, ReactNative}
import sri.universal.ReactEvent

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class ViewPagerAndroid(key: U[String] = undefined,
                            style: U[js.Any] = undefined,
                            ref: U[ViewPagerAndroidM => _] = undefined,
                            initialPage: U[Int] = undefined,
                            onPageScroll: U[ReactEvent[ViewPagerAndroidEvent] => _] = undefined,
                            onPageSelected: U[ReactEvent[ViewPagerAndroidEvent] => _] = undefined,
                            onPageScrollStateChanged: U[String => _] = undefined,
                            keyboardDismissMode: U[KeyboardDismissModeViewPager] = undefined
                             ) {

  def apply(children : ReactNode*) = {
    val props = JSMacro[ViewPagerAndroid](this)
    React.createElement(ReactNative.ViewPagerAndroid, props,children :_ *)
  }

}

@js.native
trait ViewPagerAndroidM extends js.Object {

  def setPage(selectedPage: Int): Unit = js.native

  def setPageWithoutAnimation(selectedPage: Int): Unit = js.native
}

class KeyboardDismissModeViewPager private(val value: String) extends AnyVal

object KeyboardDismissModeViewPager {

  val NONE = new KeyboardDismissModeViewPager("none")
  val ON_DRAG = new KeyboardDismissModeViewPager("on-drag")

}