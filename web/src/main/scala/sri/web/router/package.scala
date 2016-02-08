package sri.web

import sri.core.{React, ReactElement}

import scala.scalajs.js

package object router {
  val routerContextTypes = js.Dictionary("routerctrl" -> React.PropTypes.`object`.isRequired)
  type NavBarElementFunction = () => ReactElement

  val FORWARD_SLASH = "/"
}
