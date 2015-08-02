package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js

/**
 * Created by chandrasekharkode on 4/1/15.
 *
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
     accessibilityLabel: PropTypes.string,
    accessible: PropTypes.bool,
    capInsets: EdgeInsets,
defaultSource: PropTypes.ImageSource,
onLayout: PropTypes.func,
onLoadAbort: PropTypes.func,
onLoadError: PropTypes.js.Dynamic => Unit,
onLoadProgress: PropTypes.js.Dynamic => Unit,
onLoadStart: PropTypes.js.Dynamic => Unit,
onLoaded: PropTypes.bool,
resizeMode:PropTypes.ImageResizeMode
source: PropTypes.ImageSource,
    testID: PropTypes.string,

 */


object Image {

  def apply(onLoaded: js.UndefOr[Boolean] = js.undefined,
            source: js.UndefOr[ImageSource] = js.undefined,
            style: js.UndefOr[js.Any] = js.undefined,
            onLayout: js.UndefOr[js.Function] = js.undefined,
            accessibilityLabel: js.UndefOr[String] = js.undefined,
            onLoadError: js.UndefOr[js.Dynamic => Unit] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            onLoadAbort: js.UndefOr[js.Function] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            resizeMode: js.UndefOr[ImageResizeMode] = js.undefined,
            testID: js.UndefOr[String] = js.undefined,
            onLoadStart: js.UndefOr[js.Dynamic => Unit] = js.undefined,
            defaultSource: js.UndefOr[ImageSource] = js.undefined,
            onLoadProgress: js.UndefOr[js.Dynamic => Unit] = js.undefined,
            accessible: js.UndefOr[Boolean] = js.undefined) = {

    val p = js.Dynamic.literal()
    onLoaded.foreach(v => p.updateDynamic("onLoaded")(v))
    source.foreach(v => p.updateDynamic("source")(v.toJson))
    style.foreach(v => p.updateDynamic("style")(v))
    onLayout.foreach(v => p.updateDynamic("onLayout")(v))
    accessibilityLabel.foreach(v => p.updateDynamic("accessibilityLabel")(v))
    onLoadError.foreach(v => p.updateDynamic("onLoadError")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    onLoadAbort.foreach(v => p.updateDynamic("onLoadAbort")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    resizeMode.foreach(v => p.updateDynamic("resizeMode")(v.mode))
    testID.foreach(v => p.updateDynamic("testID")(v))
    onLoadStart.foreach(v => p.updateDynamic("onLoadStart")(v))
    defaultSource.foreach(v => p.updateDynamic("defaultSource")(v.toJson))
    onLoadProgress.foreach(v => p.updateDynamic("onLoadProgress")(v))
    accessible.foreach(v => p.updateDynamic("accessible")(v))

    val f = ReactNative.createFactory(ReactNative.Image)
    f(p).asInstanceOf[ReactElement]
  }

}


class ImageResizeMode private(val mode: String) extends AnyVal


object ImageResizeMode {

  val COVER = new ImageResizeMode("cover")
  val CONTAIN = new ImageResizeMode("contain")
  val STRETCH = new ImageResizeMode("stretch")

  def newMode(mode: String) = new ImageResizeMode(mode)

}