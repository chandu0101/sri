package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.{ReactClass, ReactElement}
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

/**
 * Created by chandrasekharkode on 4/1/15.
 *
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
  barTintColor: PropTypes.string,
    tintColor: PropTypes.string,
    translucent: PropTypes.bool,

 */



case class TabBarIOS(barTintColor : js.UndefOr[String] = js.undefined,
                     style : js.UndefOr[js.Any] = js.undefined,
                     ref : js.UndefOr[String] = js.undefined,
                     tintColor : js.UndefOr[String] = js.undefined,
                     key : js.UndefOr[String] = js.undefined,
                     translucent : js.UndefOr[Boolean]=js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    barTintColor.foreach(v => p.updateDynamic("barTintColor")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    tintColor.foreach(v => p.updateDynamic("tintColor")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    translucent.foreach(v => p.updateDynamic("translucent")(v))
    p
  }

  def apply(children : ReactElement*) = {
    val f = ReactNative.createFactory(ReactNative.TabBarIOS)
    f(toJS,children.toJSArray).asInstanceOf[ReactElement]
  }
}


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
badge: PropTypes.string,
    icon: PropTypes.ImageSource.isRequired,
    onPress: PropTypes. => Unit.isRequired,
    selected: PropTypes.bool.isRequired,
    selectedIcon: PropTypes.ImageSource,
    systemIcon: PropTypes.SystemIcon,
    title: PropTypes.string,
 */

case class TabBarItemIOS(systemIcon : js.UndefOr[SystemIcon] = js.undefined,
                         selectedIcon : js.UndefOr[ImageSource] = js.undefined,
                         onPress : () => Unit,
                         style : js.UndefOr[js.Any] = js.undefined,
                         icon : ImageSource,
                         ref : js.UndefOr[String] = js.undefined,
                         selected : Boolean,
                         key : js.UndefOr[String] = js.undefined,
                         badge : js.UndefOr[String] = js.undefined,
                         title : js.UndefOr[String] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    systemIcon.foreach(v => p.updateDynamic("systemIcon")(v.name))
    selectedIcon.foreach(v => p.updateDynamic("selectedIcon")(v.toJson))
    p.updateDynamic("onPress")(onPress)
    style.foreach(v => p.updateDynamic("style")(v))
    p.updateDynamic("icon")(icon.toJson)
    ref.foreach(v => p.updateDynamic("ref")(v))
    p.updateDynamic("selected")(selected)
    key.foreach(v => p.updateDynamic("key")(v))
    badge.foreach(v => p.updateDynamic("badge")(v))
    title.foreach(v => p.updateDynamic("title")(v))
    p
  }

  def apply(children : ReactElement) = {
    val f = ReactNative.createFactory(ReactNative.TabBarIOS.asInstanceOf[js.Dynamic].Item.asInstanceOf[ReactClass])
    f(toJS,children).asInstanceOf[ReactElement]
  }
}



class SystemIcon private(val name : String) extends AnyVal

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

  def newIcon(name : String) = new SystemIcon(name)
}