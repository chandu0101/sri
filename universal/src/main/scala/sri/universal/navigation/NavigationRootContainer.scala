package sri.universal.navigation

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.ReactUniversal
import sri.universal.components._
import sri.universal.all._
import sri.universal.navigation.reducer.NavigationReducer
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


case class NavigationRootContainer(key: U[String] = undefined,
                                   style: U[js.Any] = undefined,
                                   ref: U[NavigationRootContainerM => _] = undefined,
                                   renderNavigation: (NavigationState, js.Function) => ReactElement,
                                   reducer: NavigationReducer,
                                   persistenceKey: U[String] = undefined,
                                   initialAction: NavigationAction,
                                   linkingActionMap: U[String => NavigationAction] = undefined
                                    ) {

  def apply() = {
    val props = JSMacro[NavigationRootContainer](this)
    React.createElement(ReactUniversal.NavigationExperimental.RootContainer, props)
  }

}

object NavigationRootContainer {
  def getBackAction() : NavigationAction = ReactUniversal.NavigationExperimental.RootContainer.asInstanceOf[js.Dynamic].getBackAction().asInstanceOf[NavigationAction]
}

@js.native
trait NavigationRootContainerM extends js.Object
