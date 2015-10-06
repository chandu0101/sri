package sri.universal.components

import chandu0101.macros.tojs.JSMacro


case class PointProp(x: Double, y: Double) {
  val toJS = JSMacro[PointProp](this)
}
