package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js

/**
 * Created by chandrasekharkode on 3/31/15.
 *
 * key: PropTypes.string,
   ref: PropTypes.string,
  style: PropTypes.js.Any,
    animating: PropTypes.bool,
     color: PropTypes.string,
    hidesWhenStopped: PropTypes.bool,
    onLayout: PropTypes.func,
    size: PropTypes.ActivityIndicatorIOSSize,
 */




object ActivityIndicatorIOS {

  def apply(size : js.UndefOr[ActivityIndicatorIOSSize] = js.undefined,
            hidesWhenStopped : js.UndefOr[Boolean]=js.undefined,
            style : js.UndefOr[js.Any] = js.undefined,
            onLayout : js.UndefOr[js.Function] = js.undefined ,
            ref : js.UndefOr[String] = js.undefined,
            color : js.UndefOr[String] = js.undefined,
            key : js.UndefOr[String] = js.undefined,
            animating : js.UndefOr[Boolean]=js.undefined) = {

    val p = js.Dynamic.literal()
    size.foreach(v => p.updateDynamic("size")(v.size))
    hidesWhenStopped.foreach(v => p.updateDynamic("hidesWhenStopped")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    onLayout.foreach(v => p.updateDynamic("onLayout")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    color.foreach(v => p.updateDynamic("color")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    animating.foreach(v => p.updateDynamic("animating")(v))

    val f = ReactNative.createFactory(ReactNative.ActivityIndicatorIOS)
    f(p).asInstanceOf[ReactElement]
  }

}


class ActivityIndicatorIOSSize private(val size: String) extends AnyVal

object ActivityIndicatorIOSSize {

  val SMALL = new ActivityIndicatorIOSSize("small")
  val LARGE = new ActivityIndicatorIOSSize("large")

  def newSize(size: String) = new ActivityIndicatorIOSSize(size)
}
