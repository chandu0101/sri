package sri.universal

import chandu0101.macros.tojs.FunctionMacro

import scala.annotation.StaticAnnotation
import scala.scalajs.js
import scala.scalajs.js.{undefined, UndefOr => U}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.|



@ScalaJSDefined
trait XYValue extends js.Object {
  var x: Double
  var y: Double
}

object XYValue {
  def apply(x:Double,y:Double):XYValue = {
    val p = FunctionMacro()
    p.asInstanceOf[XYValue]
  }
}

