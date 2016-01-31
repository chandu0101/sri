package sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait Dimensions extends js.Object{

  def get(in : String) : js.Dynamic = js.native
}


@ScalaJSDefined
trait WindowDimensions extends js.Object {

  val width : Double

  val height : Double

}
