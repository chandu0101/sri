package sri.universal.router

import sri.core.ReactElement
import sri.universal.components.NavigatorSceneConfig

import scala.scalajs.js

private[router]trait RouteDefinitions {

  /**
   * use this method define static routes in app
   * @param page a StaticPage
   * @param title title/name for the route
   * @param component static component that should be rendered when navigated to this route
   * @param sceneConfig  page transition style/animation
   */
  def staticRoute(page: StaticPage, title: String, component: => ReactElement, sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined,leftButton : js.UndefOr[NavBarElementFunction] = js.undefined,rightButton : js.UndefOr[NavBarElementFunction] = js.undefined)

  /**
   * use this method to define dynamic routes in app
   * @param page s DynamicePage[T]
   * @param component dynamic component that should be rendered when navigated to this route
   * @param sceneConfig page transition style/animation
   * @tparam T
   */
  def dynamicRoute[T](page: DynamicPage[T], component: js.Function1[T, ReactElement], sceneConfig: js.UndefOr[NavigatorSceneConfig] = js.undefined,leftButton : js.UndefOr[NavBarElementFunction] = js.undefined,rightButton : js.UndefOr[NavBarElementFunction] = js.undefined)
}
