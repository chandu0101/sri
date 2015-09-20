package sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{ReactClass, ReactElement}
import sri.mobile.ReactNative
import sri.mobile.components.NavigatorNavigationBarS.RouteMapperType

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}


case class Navigator(navigator: js.UndefOr[js.Object] = js.undefined,
                     onItemRef: js.UndefOr[(String, Int, js.Dynamic) => Unit] = js.undefined,
                     ref: js.UndefOr[NavigatorM => _] = js.undefined,
                     navigationBar: js.UndefOr[ReactElement] = js.undefined,
                     key: js.UndefOr[String] = js.undefined,
                     renderScene: (js.Dynamic, NavigatorM) => ReactElement,
                     initialRouteStack: js.UndefOr[js.Array[js.Dynamic]] = js.undefined,
                     sceneStyle: js.UndefOr[js.Any] = js.undefined,
                     style: js.UndefOr[js.Any] = js.undefined,
                     configureScene: js.UndefOr[js.Dynamic => NavigatorSceneConfig] = js.undefined,
                     initialRoute: js.UndefOr[js.Dynamic] = js.undefined) {

  def apply() = {
    val props = JSMacro[Navigator](this)
    ReactNative.createElement(ReactNative.Navigator,props)
  }

}

object NavigatorS {

  /**
   * react statistics
   */
  val SceneConfigs: NavigatorSceneConfigs = ReactNative.Navigator.asInstanceOf[js.Dynamic].SceneConfigs.asInstanceOf[NavigatorSceneConfigs]

  val NavigationBar: ReactClass = ReactNative.Navigator.asInstanceOf[js.Dynamic].NavigationBar.asInstanceOf[ReactClass]

  val BreadcrumbNavigationBar: ReactClass = ReactNative.Navigator.asInstanceOf[js.Dynamic].BreadcrumbNavigationBar.asInstanceOf[ReactClass]

}

@js.native
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

@js.native
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

@js.native
trait NavigatorSceneConfig extends js.Object

case class NavigationBarNavState(routeStack: Seq[js.Dynamic], presentedIndex: Int) {
  val toJS = JSMacro[NavigationBarNavState](this)
}

object NavigationBarNavState {
  def fromJson(obj: js.Dynamic) = NavigationBarNavState(
    routeStack = obj.routeStack.asInstanceOf[js.Array[js.Dynamic]].toSeq,
    presentedIndex = obj.presentedIndex.asInstanceOf[Int])
}


case class NavigationBarRouteMapper(Title: RouteMapperType,
                                    LeftButton: RouteMapperType,
                                    RightButton: RouteMapperType) {

  val toJS = JSMacro[NavigationBarRouteMapper](this)

}


case class NavigatorNavigationBar(navigator: js.UndefOr[NavigatorM] = js.undefined,
                                  style: js.UndefOr[js.Any] = js.undefined,
                                  ref: js.UndefOr[String] = js.undefined,
                                  key: js.UndefOr[String] = js.undefined,
                                  routeMapper: js.UndefOr[NavigationBarRouteMapper] = js.undefined,
                                  navState: js.UndefOr[NavigationBarNavState] = js.undefined) {
  def apply() = {
    val props = JSMacro[NavigatorNavigationBar](this)
    val f = ReactNative.createFactory(NavigatorS.NavigationBar)
    f(props).asInstanceOf[ReactElement]
  }


}

object NavigatorNavigationBarS {
  type RouteMapperType = (js.Dynamic, NavigatorM, Int, js.Dynamic) => ReactElement

}


case class NavigatorBreadcrumbNavigationBar(navigator: js.UndefOr[NavigatorM] = js.undefined,
                                            style: js.UndefOr[js.Any] = js.undefined,
                                            ref: js.UndefOr[NavigatorBreadcrumbNavigationBar => _] = js.undefined,
                                            key: js.UndefOr[String] = js.undefined,
                                            routeMapper: js.UndefOr[BreadcrumbNavigationBarRouteMapper] = js.undefined,
                                            navState: js.UndefOr[NavigationBarNavState] = js.undefined) {

  def apply() = {
    val props = JSMacro[NavigatorBreadcrumbNavigationBar](this)
    val f = ReactNative.createFactory(NavigatorS.BreadcrumbNavigationBar)
    f(props).asInstanceOf[ReactElement]
  }

}

@js.native
trait NavigatorBreadcrumbNavigationBarM extends js.Object

case class BreadcrumbNavigationBarRouteMapper(rightContentForRoute: (js.Dynamic, NavigatorM) => ReactElement,
                                              titleContentForRoute: (js.Dynamic, NavigatorM) => ReactElement,
                                              iconForRoute: (js.Dynamic, NavigatorM) => ReactElement,
                                              separatorForRoute: (js.Dynamic, NavigatorM) => ReactElement) {
  val toJS = JSMacro[BreadcrumbNavigationBarRouteMapper](this)
}
