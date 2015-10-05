package sri.web.components.nativeweb

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait ReactNativeWeb extends js.Object {

  val View: ReactClass = js.native

  val Text: ReactClass = js.native

  val Image: ReactClass = js.native

  val TextInput: ReactClass = js.native

  val Swipeable: ReactClass = js.native

  val Touchable: ReactClass = js.native
  val TouchableOpacity: ReactClass = js.native

}

@js.native
@JSName("React")
object ReactNativeWeb extends ReactNativeWeb