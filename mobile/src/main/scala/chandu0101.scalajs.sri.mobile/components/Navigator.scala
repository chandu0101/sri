package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.{ReactClass, ReactElement}
import chandu0101.scalajs.sri.mobile.ReactNative

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
    configureScene: PropTypes.NavigatorRoute => js.Dynamic,
    renderScene: PropTypes.(NavigatorRoute,NavigatorM) => ReactElement.isRequired,
    initialRoute: PropTypes.js.Dynamic,
    initialRouteStack: PropTypes.js.Array[js.Dynamic],
    onItemRef: PropTypes.(String,Int,NavigatorRoute) => Unit,
    navigationBar: PropTypes.node,
    navigator: PropTypes.object,
    sceneStyle: PropTypes.js.Any,
 */


object Navigator {

  def apply(navigator: js.UndefOr[js.Object] = js.undefined,
            onItemRef: js.UndefOr[(String, Int, NavigatorRoute) => Unit] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            navigationBar: js.UndefOr[ReactElement] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            renderScene: (js.Dynamic, NavigatorM) => ReactElement,
            initialRouteStack: js.UndefOr[js.Array[js.Dynamic]] = js.undefined,
            sceneStyle: js.UndefOr[js.Any] = js.undefined,
            style: js.UndefOr[js.Any] = js.undefined,
            configureScene: js.UndefOr[js.Dynamic => js.Dynamic] = js.undefined,
            initialRoute: js.UndefOr[js.Dynamic] = js.undefined) = {

    val p = js.Dynamic.literal()
    navigator.foreach(v => p.updateDynamic("navigator")(v))
    onItemRef.foreach(v => p.updateDynamic("onItemRef")((s: String, i: Int, r: js.Dynamic) => v(s, i, NavigatorRoute.fromJson(r))))
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

  val FloatFromBottom: js.Dynamic = js.native

  val FloatFromBottomAndroid: js.Dynamic = js.native

  val PushFromRight: js.Dynamic = js.native

  val HorizontalSwipeJump: js.Dynamic = js.native

  val FadeAndroid: js.Dynamic = js.native

  val FloatFromLeft: js.Dynamic = js.native

  val FloatFromRight: js.Dynamic = js.native

}

case class NavigatorRoute(id: js.UndefOr[String] = js.undefined,
                          sceneConfig: js.UndefOr[js.Dynamic] = js.undefined,
                          title: String,
                          component: Any,
                          getProps: js.Function1[NavigatorM, Any]) {
  def toJson: js.Dynamic = {
    val p = json("component" -> component.asInstanceOf[js.Any],
      "getProps" -> getProps
    )
    sceneConfig.foreach(v => p.updateDynamic("sceneConfig")(v))
    p.updateDynamic("title")(title)
    id.foreach(v => p.updateDynamic("id")(v))
    p
  }
}

object NavigatorRoute {
  def fromJson(obj: js.Dynamic) = NavigatorRoute(sceneConfig = if (js.isUndefined(obj.sceneConfig)) js.undefined else obj.sceneConfig,
    component = obj.component.asInstanceOf[Any],
    title = obj.title.toString,
    getProps = obj.getProps.asInstanceOf[js.Function1[NavigatorM, Any]],
    id = if (js.isUndefined(obj.id)) js.undefined else obj.id.asInstanceOf[String])
}

case class NavigationBarNavState(routeStack: Seq[NavigatorRoute], idStack: Seq[Int], presentedIndex: Int) {
  def toJson = {
    val p = json(
      "idStack" -> idStack.toJSArray,
      "routeStack" -> routeStack.map(_.toJson).toJSArray)
    p.updateDynamic("presentedIndex")(presentedIndex)
    p
  }
}

object NavigationBarNavState {
  def fromJson(obj: js.Dynamic) = NavigationBarNavState(idStack = obj.idStack.asInstanceOf[js.Array[Int]].toSeq,
    routeStack = obj.routeStack.asInstanceOf[js.Array[js.Dynamic]].map(r => NavigatorRoute.fromJson(r)).toSeq,
    presentedIndex = obj.presentedIndex.asInstanceOf[Int])
}

case class NavigationBarRouteMapper(Title: (NavigatorRoute, NavigatorM, Int, NavigationBarNavState) => ReactElement,
                                    LeftButton: (NavigatorRoute, NavigatorM, Int, NavigationBarNavState) => ReactElement,
                                    RightButton: (NavigatorRoute, NavigatorM, Int, NavigationBarNavState) => ReactElement) {

  def toJson = {
    val p = json(
      Title = (r: js.Dynamic, nav: NavigatorM, index: Int, state: js.Dynamic) => Title(NavigatorRoute.fromJson(r), nav, index, NavigationBarNavState.fromJson(state)),
      LeftButton = (r: js.Dynamic, nav: NavigatorM, index: Int, state: js.Dynamic) => LeftButton(NavigatorRoute.fromJson(r), nav, index, NavigationBarNavState.fromJson(state)),
      RightButton = (r: js.Dynamic, nav: NavigatorM, index: Int, state: js.Dynamic) => RightButton(NavigatorRoute.fromJson(r), nav, index, NavigationBarNavState.fromJson(state))
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


case class BreadcrumbNavigationBarRouteMapper(rightContentForRoute: (NavigatorRoute, NavigatorM) => ReactElement,
                                              titleContentForRoute: (NavigatorRoute, NavigatorM) => ReactElement,
                                              iconForRoute: (js.Dynamic, NavigatorM) => ReactElement,
                                              separatorForRoute: (NavigatorRoute, NavigatorM) => ReactElement) {
  def toJson: js.Dynamic = {
    val p = json(
      titleContentForRoute = (r: js.Dynamic, nav: NavigatorM) => titleContentForRoute(NavigatorRoute.fromJson(r), nav),
      rightContentForRoute = (r: js.Dynamic, nav: NavigatorM) => rightContentForRoute(NavigatorRoute.fromJson(r), nav),
      iconForRoute = iconForRoute,
      separatorForRoute = (r: js.Dynamic, nav: NavigatorM) => separatorForRoute(NavigatorRoute.fromJson(r), nav))
    p
  }
}
