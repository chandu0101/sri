package chandu0101.scalajs.sri.mobile.components

import scala.scalajs.js.Dynamic.{literal => json}

/**
 * Created by chandrasekharkode on 4/1/15.
 */
case class PointProp(x : Double,y : Double) {
  def toJson = json( "y" -> y , "x" -> x )
}
