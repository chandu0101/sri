package sri.universal.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("nativeImageSource",JSImport.Default)
object NativeImageSource extends js.Object{

  def apply(spec: NativeSourceSpec): js.Object = js.native
}

@ScalaJSDefined
trait NativeSourceSpec extends js.Object {
  var ios : js.UndefOr[String] = js.undefined
  var android : js.UndefOr[String] = js.undefined
  var width : js.UndefOr[Double] = js.undefined
  var height : js.UndefOr[Double] = js.undefined
}