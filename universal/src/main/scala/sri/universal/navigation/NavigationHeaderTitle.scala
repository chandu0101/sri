package sri.universal.navigation

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.ReactUniversal
import sri.universal.components._
import sri.universal.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


case class NavigationHeaderTitle(key: U[String] = undefined,
                                 style: U[js.Any] = undefined,
                                 textStyle: U[js.Any] = undefined) {

  def apply(children: String) = {
    val props = JSMacro[NavigationHeaderTitle](this)
    React.createElement(ReactUniversal.NavigationExperimental.HeaderTitle, props, children)
  }

}