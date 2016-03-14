package sri.universal.navigation

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.ReactUniversal
import sri.universal.components._
import sri.universal.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U,undefined => undefined}


case class NavigationCard(key : U[String] = undefined,
                                style: U[js.Any] = undefined,
                                navigationState: NavigationParentState,
                                index : Double,
                                position : Double,
                                onNavigate : js.Object => _,
                                ref :U[NavigationCardM => _] = undefined) {

         def apply(children : ReactNode*) = {
           val props = JSMacro[NavigationCard](this)
           React.createElement(ReactUniversal.NavigationExperimental.Card,props,children: _*)
         }

}
@js.native
trait NavigationCardM extends js.Object
