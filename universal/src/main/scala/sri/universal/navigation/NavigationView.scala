package sri.universal.navigation

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.ReactUniversal
import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class NavigationView(key: U[String] = undefined,
                          style: U[js.Any] = undefined,
                          ref: U[NavigationViewM => _] = undefined,
                          navigationState: NavigationState,
                          renderScene: (js.Object, Int) => ReactElement
                           ) {
  def apply() = {
    val props = JSMacro[NavigationView](this)
    React.createElement(ReactUniversal.NavigationExperimental.View, props)
  }

}

@js.native
trait NavigationViewM extends js.Object