package sri.universal

import sri.core.{ReactElement, React}

import scala.scalajs.js

package object router {
  val routerContextTypes = js.Dictionary("routerctrl" -> React.PropTypes.`object`.isRequired)
  type NavBarElementFunction = (UniversalRouterCtrl, NavigatorRoute) => ReactElement

}
