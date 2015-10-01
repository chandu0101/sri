package sri.web.components.nativeweb

import chandu0101.macros.tojs.JSMacro
import sri.core.{ReactElement, React}

import scala.scalajs.js


case class Navigator(navigator: js.UndefOr[js.Object] = js.undefined,
                     onItemRef: js.UndefOr[(String, Int, js.Dynamic) => Unit] = js.undefined,
                     ref: js.UndefOr[NavigatorM => _] = js.undefined,
                     navigationBar: js.UndefOr[ReactElement] = js.undefined,
                     key: js.UndefOr[String] = js.undefined,
                     renderScene: (js.Dynamic, NavigatorM) => ReactElement,
                     initialRouteStack: js.UndefOr[js.Array[js.Dynamic]] = js.undefined,
                     sceneStyle: js.UndefOr[js.Any] = js.undefined,
                     style: js.UndefOr[js.Any] = js.undefined,
//                     configureScene: js.UndefOr[js.Dynamic => NavigatorSceneConfig] = js.undefined,
                     initialRoute: js.UndefOr[js.Object] = js.undefined) {

  def apply() = {
    val props = JSMacro[Navigator](this)
    React.createElement(js.Dynamic.global.Navigator,props)
  }

}

@js.native
trait NavigatorM extends js.Object {

  def getCurrentRoutes(): js.Array[js.Dynamic] = js.native

  def jumpBack(): Unit = js.native

  def jumpForward(): Unit = js.native

  def jumpTo(route: js.Object): Unit = js.native

  def push(route: js.Object): Unit = js.native

  def pop(): Unit = js.native

  def replace(route: js.Object): Unit = js.native

  def replaceAtIndex(route: js.Object, index: Int): Unit = js.native

  def replacePrevious(route: js.Object): Unit = js.native

  def immediatelyResetRouteStack(routeStack: js.Array[js.Dynamic]): Unit = js.native

  def popToRoute(route: js.Object): Unit = js.native

  def popToTop(): Unit = js.native

}

@js.native
trait NavigatorSceneConfig extends js.Object