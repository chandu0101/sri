package sri.universal.navigation

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.ReactUniversal
import sri.universal.components._
import sri.universal.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


case class NavigationHeaderBackButton(onNavigate: js.Object => _) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[NavigationHeaderBackButton](this)
    React.createElement(ReactUniversal.NavigationExperimental.HeaderBackButton, props, children: _*)
  }

}
