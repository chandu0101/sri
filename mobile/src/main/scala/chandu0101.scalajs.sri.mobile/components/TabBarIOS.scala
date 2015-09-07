package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.{ReactClass, ReactElement}
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav


case class TabBarIOS(barTintColor: js.UndefOr[String] = js.undefined,
                     style: js.UndefOr[js.Any] = js.undefined,
                     ref: js.UndefOr[String] = js.undefined,
                     tintColor: js.UndefOr[String] = js.undefined,
                     key: js.UndefOr[String] = js.undefined,
                     translucent: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactElement*) = {
    val props = JSMacro[TabBarIOS](this)
    val f = ReactNative.createFactory(ReactNative.TabBarIOS)
    f(props, children.toJSArray).asInstanceOf[ReactElement]
  }
}


case class TabBarItemIOS(systemIcon: js.UndefOr[SystemIcon] = js.undefined,
                         selectedIcon: js.UndefOr[ImageSource] = js.undefined,
                         onPress: () => Unit,
                         style: js.UndefOr[js.Any] = js.undefined,
                         icon: ImageSource,
                         ref: js.UndefOr[String] = js.undefined,
                         selected: Boolean,
                         key: js.UndefOr[String] = js.undefined,
                         badge: js.UndefOr[String] = js.undefined,
                         title: js.UndefOr[String] = js.undefined) {

  def apply(children: ReactElement) = {
    val props = JSMacro[TabBarItemIOS](this)
    val f = ReactNative.createFactory(ReactNative.TabBarIOS.asInstanceOf[js.Dynamic].Item.asInstanceOf[ReactClass])
    f(props, children).asInstanceOf[ReactElement]
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