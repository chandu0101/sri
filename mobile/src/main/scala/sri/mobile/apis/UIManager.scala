package sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait UIManager extends js.Object {

  def takeSnapshot(view: js.Any = ???, options: SnapShotOptions = ???): Promise[js.Any] = js.native
}

@ScalaJSDefined
abstract class SnapShotOptions extends js.Object {

  val width: js.UndefOr[Double] = js.undefined

  val height: js.UndefOr[Double] = js.undefined

  val format: js.UndefOr[String] = js.undefined

  val quality: js.UndefOr[Double] = js.undefined

}