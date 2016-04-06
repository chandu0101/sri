package sri.universal.navigation

import chandu0101.macros.tojs.JSMacro
import sri.core._
import sri.universal.ReactUniversal
import sri.universal.components._
import sri.universal.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


case class NavigationHeader(key: U[String] = undefined,
                            style: U[js.Any] = undefined,
                            navigationProps: U[NavigationSceneRendererProps] = undefined,
                            renderTitleComponent: U[(NavigationSceneRendererProps,NavigationScene) => ReactElement] = undefined,
                            renderLeftComponent: U[(NavigationSceneRendererProps,NavigationScene) => ReactElement] = undefined,
                            renderRightComponent: U[(NavigationSceneRendererProps,NavigationScene) => ReactElement] = undefined,
                            ref: U[NavigationHeaderM => _] = undefined) {

  def apply() = {
    val props = JSMacro[NavigationHeader](this)
    React.createElement(ReactUniversal.NavigationExperimental.Header, props)
  }

}

object NavigationHeader {
  lazy val APPBAR_HEIGHT : Double = ReactUniversal.NavigationExperimental.Header.asInstanceOf[js.Dynamic].APPBAR_HEIGHT.asInstanceOf[Double]
  lazy val STATUSBAR_HEIGHT : Double = ReactUniversal.NavigationExperimental.Header.asInstanceOf[js.Dynamic].STATUSBAR_HEIGHT.asInstanceOf[Double]
}

@js.native
trait NavigationHeaderM extends js.Object
