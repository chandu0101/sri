package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro


case class PointProp(x: Double, y: Double) {
  val toJS = JSMacro[PointProp](this)
}
