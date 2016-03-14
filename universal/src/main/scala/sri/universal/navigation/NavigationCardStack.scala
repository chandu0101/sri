package sri.universal.navigation

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.ReactUniversal
import sri.universal.components._
import sri.universal.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


case class NavigationCardStack(key: U[String] = undefined,
                               style: U[js.Any] = undefined,
                               direction: String,
                               navigationState: NavigationParentState,
                               renderOverlay: U[NavigationStateRendererProps => ReactElement] = undefined,
                               renderScene: NavigationStateRendererProps => ReactElement,
                               ref: U[NavigationCardStackM => _] = undefined) {

  def apply() = {
    val props = JSMacro[NavigationCardStack](this)
    React.createElement(ReactUniversal.NavigationExperimental.CardStack, props)
  }

}

@js.native
trait NavigationCardStackM extends js.Object