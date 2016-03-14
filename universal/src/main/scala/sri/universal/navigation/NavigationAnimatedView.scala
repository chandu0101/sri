package sri.universal.navigation

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.ReactUniversal
import sri.universal.apis.Layout
import sri.universal.components._
import sri.universal.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


case class NavigationAnimatedView(key: U[String] = undefined,
                                  style: U[js.Any] = undefined,
                                  ref: U[NavigationAnimatedViewM => _] = undefined,
                                  navigationState: NavigationParentState,
                                  onNavigate: (js.Object) => _,
                                  renderScene: NavigationStateRendererProps => ReactElement,
                                  renderOverlay : U[NavigationStateRendererProps => ReactElement] = undefined,
                                  setTiming : U[(js.Dynamic,NavigationParentState,NavigationParentState) => _] = undefined
                                   ) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[NavigationAnimatedView](this)
    React.createElement(ReactUniversal.NavigationExperimental.AnimatedView, props, children: _*)
  }

}

@js.native
trait NavigationAnimatedViewM extends js.Object

@ScalaJSDefined
trait NavigationStateRendererProps extends js.Object {
  val navigationState: NavigationState
  // The index of the child view.
  val index: Int
  // The "progressive index" of the containing navigation state.
  val position: js.Dynamic
  // The layout of the the containing navigation view.
  val layout: Layout
  // The state of the the containing navigation view.
  val navigationParentState: NavigationParentState

  val onNavigate: js.Object => _
}