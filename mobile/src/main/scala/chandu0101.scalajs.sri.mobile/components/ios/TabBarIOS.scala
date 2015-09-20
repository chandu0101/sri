package chandu0101.scalajs.sri.mobile.components.ios

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.{ReactElement, ReactNode}
import chandu0101.scalajs.sri.mobile._
import chandu0101.scalajs.sri.mobile.components.ImageSource

import scala.scalajs.js


case class TabBarIOS(barTintColor: js.UndefOr[String] = js.undefined,
                     style: js.UndefOr[js.Any] = js.undefined,
                     ref: js.UndefOr[TabBarIOSM => _] = js.undefined,
                     tintColor: js.UndefOr[String] = js.undefined,
                     key: js.UndefOr[String] = js.undefined,
                     translucent: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[TabBarIOS](this)
    ReactNative.createElement(ReactNative.TabBarIOS, props, children: _*)
  }
}

@js.native
trait TabBarIOSM extends js.Object

case class TabBarItemIOS(systemIcon: js.UndefOr[SystemIcon] = js.undefined,
                         selectedIcon: js.UndefOr[ImageSource] = js.undefined,
                         onPress: () => Unit,
                         style: js.UndefOr[js.Any] = js.undefined,
                         icon: ImageSource,
                         ref: js.UndefOr[TabBarItemIOSM => _] = js.undefined,
                         selected: Boolean,
                         key: js.UndefOr[String] = js.undefined,
                         badge: js.UndefOr[String] = js.undefined,
                         title: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactElement) = {
    val props = JSMacro[TabBarItemIOS](this)
    ReactNative.createElement(ReactNative.TabBarIOS.asInstanceOf[js.Dynamic].Item, props,children)
  }
}


class SystemIcon private(val value: String) extends AnyVal

object SystemIcon {

  val BOOKMARKS = new SystemIcon("bookmarks")
  val CONTACTS = new SystemIcon("contacts")
  val DOWNLOADS = new SystemIcon("downloads")
  val FAVORITES = new SystemIcon("favorites")
  val FEATURED = new SystemIcon("featured")
  val HISTORY = new SystemIcon("history")
  val MORE = new SystemIcon("more")
  val MOST_RECENT = new SystemIcon("most-recent")
  val MOST_VIEWED = new SystemIcon("most-viewed")
  val RECENTS = new SystemIcon("recents")
  val SEARCH = new SystemIcon("search")
  val TOP_RATED = new SystemIcon("top-rated")

  def newIcon(name: String) = new SystemIcon(name)
}

@js.native
trait TabBarItemIOSM extends js.Object