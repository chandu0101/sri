package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr, undefined}

/**
 * Created by chandrasekharkode on 4/1/15.
 *
 *
key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
itemWrapperStyle: PropTypes.js.Any,
    tintColor: PropTypes.string,
    barTintColor: PropTypes.string,
    titleTextColor: PropTypes.string,
    navigationBarHidden: PropTypes.bool,
    translucent: PropTypes.bool,
    shadowHidden: PropTypes.bool,
initialRoute:PropTypes.NavigatorIOSRoute.isRequired

 */


object NavigatorIOS {

  def apply(barTintColor: js.UndefOr[String] = js.undefined,
            navigationBarHidden: js.UndefOr[Boolean] = js.undefined,
            style: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            titleTextColor: js.UndefOr[String] = js.undefined,
            tintColor: js.UndefOr[String] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            itemWrapperStyle: js.UndefOr[js.Any] = js.undefined,
            translucent: js.UndefOr[Boolean] = js.undefined,
            shadowHidden: js.UndefOr[Boolean] = js.undefined,
            initialRoute: NavigatorIOSRoute) = {

    val p = js.Dynamic.literal()
    barTintColor.foreach(v => p.updateDynamic("barTintColor")(v))
    navigationBarHidden.foreach(v => p.updateDynamic("navigationBarHidden")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    titleTextColor.foreach(v => p.updateDynamic("titleTextColor")(v))
    tintColor.foreach(v => p.updateDynamic("tintColor")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    itemWrapperStyle.foreach(v => p.updateDynamic("itemWrapperStyle")(v))
    translucent.foreach(v => p.updateDynamic("translucent")(v))
    shadowHidden.foreach(v => p.updateDynamic("shadowHidden")(v))
    p.updateDynamic("initialRoute")(initialRoute.toJson)

    val f = ReactNative.createFactory(ReactNative.NavigatorIOS)
    f(p).asInstanceOf[ReactElement]
  }

}


trait NavigatorIOSM extends js.Object {

  def push(route: NavigatorIOSRoute): Unit = js.native

}


case class NavigatorIOSRoute(onRightButtonPress: UndefOr[js.Function] = undefined,
                             passProps: UndefOr[js.Any] = undefined,
                             rightButtonTitle: UndefOr[String] = undefined,
                             wrapperStyle: UndefOr[js.Any] = undefined,
                             backButtonTitle: UndefOr[String] = undefined,
                             leftButtonTitle: UndefOr[String] = undefined,
                             backButtonIcon: UndefOr[ImageSource] = undefined,
                             leftButtonIcon: UndefOr[ImageSource] = undefined,
                             rightButtonIcon: UndefOr[ImageSource] = undefined,
                             onLeftButtonPress: UndefOr[js.Function] = undefined,
                             title: String,
                             component: js.Object) {
  def toJson = {
    val p = json("component" -> component)
    leftButtonIcon.foreach(v => p.updateDynamic("leftButtonIcon")(v.toJson))
    backButtonIcon.foreach(v => p.updateDynamic("backButtonIcon")(v.toJson))
    backButtonTitle.foreach(v => p.updateDynamic("backButtonTitle")(v))
    rightButtonTitle.foreach(v => p.updateDynamic("rightButtonTitle")(v))
    wrapperStyle.foreach(v => p.updateDynamic("wrapperStyle")(v))
    p.updateDynamic("title")(title)
    onLeftButtonPress.foreach(v => p.updateDynamic("onLeftButtonPress")(v))
    passProps.foreach(v => p.updateDynamic("passProps")(v))
    onRightButtonPress.foreach(v => p.updateDynamic("onRightButtonPress")(v))
    rightButtonIcon.foreach(v => p.updateDynamic("rightButtonIcon")(v.toJson))
    leftButtonTitle.foreach(v => p.updateDynamic("leftButtonTitle")(v))
    p
  }
}

object NavigatorIOSRoute {
  def fromJson(obj: js.Dynamic) = NavigatorIOSRoute(leftButtonIcon = if (js.isUndefined(obj.leftButtonIcon)) js.undefined else obj.leftButtonIcon.asInstanceOf[ImageSource], backButtonIcon = if (js.isUndefined(obj.backButtonIcon)) js.undefined else obj.backButtonIcon.asInstanceOf[ImageSource], backButtonTitle = if (js.isUndefined(obj.backButtonTitle)) js.undefined else obj.backButtonTitle.asInstanceOf[String], rightButtonTitle = if (js.isUndefined(obj.rightButtonTitle)) js.undefined else obj.rightButtonTitle.asInstanceOf[String], component = obj.component.asInstanceOf[js.Object], wrapperStyle = if (js.isUndefined(obj.wrapperStyle)) js.undefined else obj.wrapperStyle.asInstanceOf[js.Any], title = obj.title.toString, onLeftButtonPress = if (js.isUndefined(obj.onLeftButtonPress)) js.undefined else obj.onLeftButtonPress.asInstanceOf[js.Function], passProps = if (js.isUndefined(obj.passProps)) js.undefined else obj.passProps.asInstanceOf[js.Any], onRightButtonPress = if (js.isUndefined(obj.onRightButtonPress)) js.undefined else obj.onRightButtonPress.asInstanceOf[js.Function], rightButtonIcon = if (js.isUndefined(obj.rightButtonIcon)) js.undefined else obj.rightButtonIcon.asInstanceOf[ImageSource], leftButtonTitle = if (js.isUndefined(obj.leftButtonTitle)) js.undefined else obj.leftButtonTitle.asInstanceOf[String])
}
