package sri.web

import sri.core.React

import scala.scalajs.js

package object router {
  val routerContextTypes = js.Dictionary("routerctrl" -> React.PropTypes.`object`.isRequired)
}
