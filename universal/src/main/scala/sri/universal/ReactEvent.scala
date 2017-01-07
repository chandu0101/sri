package sri.universal

import scala.scalajs.js

@js.native
trait ReactEvent[T <: js.Object] extends js.Object {

  val nativeEvent: T = js.native
}

@js.native
trait TextInputEvent extends js.Object {

  val text: String = js.native

  val contentSize: TextInputContentSize = js.native

  val contentOffset: TextContentOffset = js.native
}

@js.native
trait TextInputContentSize extends js.Object {

  val width: Double = js.native

  val height: Double = js.native
}

@js.native
trait TextContentOffset extends js.Object {

  val x: Double = js.native

  val y: Double = js.native
}

@js.native
trait ImageEvent extends js.Object {

}

@js.native
trait WebViewEvent extends js.Object {
  val data: String = js.native
}


@js.native
trait SyntheticEvent extends js.Object {

}

