package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.universal.ReactUniversal

import scala.scalajs.js


case class ActivityIndicator(size: js.UndefOr[ActivityIndicatorSize] = js.undefined,
                                hidesWhenStopped: js.UndefOr[Boolean] = js.undefined,
                                style: js.UndefOr[js.Any] = js.undefined,
                                onLayout: js.UndefOr[js.Function] = js.undefined,
                                ref: js.UndefOr[ActivityIndicatorM => _] = js.undefined,
                                color: js.UndefOr[String] = js.undefined,
                                key: js.UndefOr[String] = js.undefined,
                                animating: js.UndefOr[Boolean] = js.undefined) {

  def apply() = {
    val props = JSMacro[ActivityIndicator](this)
    React.createElement(ReactUniversal.ActivityIndicator,props)
  }

}


class ActivityIndicatorSize private(val value: String) extends AnyVal

object ActivityIndicatorSize {

  val SMALL = new ActivityIndicatorSize("small")
  val LARGE = new ActivityIndicatorSize("large")

  def newSize(size: String) = new ActivityIndicatorSize(size)
}

@js.native
trait ActivityIndicatorM extends js.Object