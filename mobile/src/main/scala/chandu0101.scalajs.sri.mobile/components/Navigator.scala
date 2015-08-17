package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.{ReactClass, ReactElement}
import chandu0101.scalajs.sri.mobile.ReactNative
import chandu0101.scalajs.sri.mobile.components.NavigatorNavigationBar.RouteMapperType

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

/**
 *
 *
 *
key: PropTypes.string,
     style: PropTypes.js.Any,
     ref: PropTypes.string,
    configureScene: PropTypes.js.Dynamic => NavigatorSceneConfig,
    renderScene: PropTypes.(js.Dynamic,NavigatorM) => ReactElement.isRequired,
    initialRoute: PropTypes.js.Dynamic,
    initialRouteStack: PropTypes.js.Array[js.Dynamic],
    onItemRef: PropTypes.(String,Int,js.Dynamic) => Unit,
    navigationBar: PropTypes.node,
    navigator: PropTypes.object,
    sceneStyle: PropTypes.js.Any,
 */


object Navigator {

  def apply(navigator: js.UndefOr[js.Object] = js.undefined,
            onItemRef: js.UndefOr[(String, Int, js.Dynamic) => Unit] = js.undefined,
            ref: js.UndefOr[js.Function] = js.undefined,
            navigationBar: js.UndefOr[ReactElement] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            renderScene: (js.Dynamic, NavigatorM) => ReactElement,
            initialRouteStack: js.UndefOr[js.Array[js.Dynamic]] = js.undefined,
            sceneStyle: js.UndefOr[js.Any] = js.undefined,
            style: js.UndefOr[js.Any] = js.undefined,
            configureScene: js.UndefOr[js.Dynamic => NavigatorSceneConfig] = js.undefined,
            initialRoute: js.UndefOr[js.Dynamic] = js.undefined) = {

    val p = js.Dynamic.literal()
    navigator.foreach(v => p.updateDynamic("navigator")(v))
    onItemRef.foreach(v => p.updateDynamic("onItemRef")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    navigationBar.foreach(v => p.updateDynamic("navigationBar")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    p.updateDynamic("renderScene")(renderScene)
    initialRouteStack.foreach(v => p.updateDynamic("initialRouteStack")(v))
    sceneStyle.foreach(v => p.updateDynamic("sceneStyle")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    configureScene.foreach(v => p.updateDynamic("configureScene")(v))
    initialRoute.foreach(v => p.updateDynamic("initialRoute")(v))

    val f = ReactNative.createFactory(ReactNative.Navigator)
    f(p).asInstanceOf[ReactElement]

  }


  /**
   *  react statistics
   */
  val SceneConfigs: NavigatorSceneConfigs = ReactNative.Navigator.asInstanceOf[js.Dynamic].SceneConfigs.asInstanceOf[NavigatorSceneConfigs]

  val NavigationBar: ReactClass = ReactNative.Navigator.asInstanceOf[js.Dynamic].NavigationBar.asInstanceOf[ReactClass]

  val BreadcrumbNavigationBar: ReactClass = ReactNative.Navigator.asInstanceOf[js.Dynamic].BreadcrumbNavigationBar.asInstanceOf[ReactClass]

}


trait NavigatorM extends js.Object {

  def getCurrentRoutes(): js.Array[js.Dynamic] = js.native

  def jumpBack(): Unit = js.native

  def jumpForward(): Unit = js.native

  def jumpTo(route: js.Dynamic): Unit = js.native

  def push(route: js.Dynamic): Unit = js.native

  def pop(): Unit = js.native

  def replace(route: js.Dynamic): Unit = js.native

  def replaceAtIndex(route: js.Dynamic, index: Int): Unit = js.native

  def replacePrevious(route: js.Dynamic): Unit = js.native

  def immediatelyResetRouteStack(routeStack: js.Array[js.Dynamic]): Unit = js.native

  def popToRoute(route: js.Dynamic): Unit = js.native

  def popToTop(): Unit = js.native

}


trait NavigatorSceneConfigs extends js.Object {

  val FloatFromBottom: NavigatorSceneConfig = js.native

  val FloatFromBottomAndroid: NavigatorSceneConfig = js.native

  val PushFromRight: NavigatorSceneConfig = js.native

  val HorizontalSwipeJump: NavigatorSceneConfig = js.native

  val FadeAndroid: NavigatorSceneConfig = js.native

  val FloatFromLeft: NavigatorSceneConfig = js.native

  val FloatFromRight: NavigatorSceneConfig = js.native

  val VerticalUpSwipeJump: NavigatorSceneConfig = js.native

  val VerticalDownSwipeJump: NavigatorSceneConfig = js.native

}

trait NavigatorSceneConfig extends js.Object

case class NavigationBarNavState(routeStack: Seq[js.Dynamic],presentedIndex: Int) {
  def toJson = {
    val p = json(
      "routeStack" -> routeStack.toJSArray)
    p.updateDynamic("presentedIndex")(presentedIndex)
    p
  }
}

object NavigationBarNavState {
  def fromJson(obj: js.Dynamic) = NavigationBarNavState(
    routeStack = obj.routeStack.asInstanceOf[js.Array[js.Dynamic]].toSeq,
    presentedIndex = obj.presentedIndex.asInstanceOf[Int])
}



case class NavigationBarRouteMapper(Title: RouteMapperType,
                                    LeftButton: RouteMapperType,
                                    RightButton: RouteMapperType) {

  def toJson = {
    val p = json(
      Title = Title,
      LeftButton = LeftButton,
      RightButton = RightButton
    )
    p
  }


}


/**
 *
key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
navigator: React.PropTypes.NavigatorM,
    routeMapper: React.PropTypes.NavigationBarRouteMapper,
    navState: React.PropTypes.NavigationBatNavState,

 */
object NavigatorNavigationBar {

  def apply(navigator: js.UndefOr[NavigatorM] = js.undefined,
            style: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            routeMapper: js.UndefOr[NavigationBarRouteMapper] = js.undefined,
            navState: js.UndefOr[NavigationBarNavState] = js.undefined) = {

    val p = js.Dynamic.literal()
    navigator.foreach(v => p.updateDynamic("navigator")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    routeMapper.foreach(v => p.updateDynamic("routeMapper")(v.toJson))
    navState.foreach(v => p.updateDynamic("navState")(v.toJson))

    val f = ReactNative.createFactory(Navigator.NavigationBar)
    f(p).asInstanceOf[ReactElement]
  }

  type RouteMapperType = (js.Dynamic, NavigatorM, Int, js.Dynamic) => ReactElement

}


/**
 *
key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
routeMapper:PropTypes.BreadcrumbNavigationBarRouteMapper,
navState:routeMapper:PropTypes.NavigationBarNavState,
navigator: PropTypes.NavigatorM
 */
object NavigatorBreadcrumbNavigationBar {

  def apply(navigator: js.UndefOr[NavigatorM] = js.undefined,
            style: js.UndefOr[js.Any] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            routeMapper: js.UndefOr[BreadcrumbNavigationBarRouteMapper] = js.undefined,
            navState: js.UndefOr[NavigationBarNavState] = js.undefined) = {

    val p = js.Dynamic.literal()
    navigator.foreach(v => p.updateDynamic("navigator")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    routeMapper.foreach(v => p.updateDynamic("routeMapper")(v.toJson))
    navState.foreach(v => p.updateDynamic("navState")(v.toJson))

    val f = ReactNative.createFactory(Navigator.BreadcrumbNavigationBar)
    f(p).asInstanceOf[ReactElement]
  }

}


case class BreadcrumbNavigationBarRouteMapper(rightContentForRoute: (js.Dynamic, NavigatorM) => ReactElement,
                                              titleContentForRoute: (js.Dynamic, NavigatorM) => ReactElement,
                                              iconForRoute: (js.Dynamic, NavigatorM) => ReactElement,
                                              separatorForRoute: (js.Dynamic, NavigatorM) => ReactElement) {
  def toJson: js.Dynamic = {
    val p = json(
      titleContentForRoute = titleContentForRoute,
      rightContentForRoute = rightContentForRoute,
      iconForRoute = iconForRoute,
      separatorForRoute = separatorForRoute)
    p
  }
}
