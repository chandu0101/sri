package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js

/**
 * Created by chandrasekharkode on 4/2/15.
 *
 *  key: PropTypes.string,
    ref: PropTypes.string,
    style: PropTypes.js.Any,
 accessible:PropTypes.bool,
   delayLongPress: PropTypes.number,
   delayPressIn: PropTypes.number,
   delayPressOut: PropTypes.number,
    onLongPress: PropTypes.() => Unit,
   onPress: PropTypes.() => Unit,
   onPressIn: PropTypes.() => Unit,
   onPressOut: PropTypes.() => Unit,
    activeOpacity:PropTypes.number,
 */



case class TouchableOpacity(onPressIn : js.UndefOr[() => Unit] = js.undefined,
                            onPress : js.UndefOr[() => Unit] = js.undefined,
                            style : js.UndefOr[js.Any] = js.undefined,
                            delayPressIn : js.UndefOr[Int] = js.undefined,
                            ref : js.UndefOr[String] = js.undefined,
                            onPressOut : js.UndefOr[() => Unit] = js.undefined,
                            key : js.UndefOr[String] = js.undefined,
                            onLongPress : js.UndefOr[() => Unit] = js.undefined,
                            delayPressOut : js.UndefOr[Int] = js.undefined,
                            delayLongPress : js.UndefOr[Int] = js.undefined,
                            activeOpacity : js.UndefOr[Int] = js.undefined,
                            accessible : js.UndefOr[Boolean]=js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    onPressIn.foreach(v => p.updateDynamic("onPressIn")(v))
    onPress.foreach(v => p.updateDynamic("onPress")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    delayPressIn.foreach(v => p.updateDynamic("delayPressIn")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    onPressOut.foreach(v => p.updateDynamic("onPressOut")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    onLongPress.foreach(v => p.updateDynamic("onLongPress")(v))
    delayPressOut.foreach(v => p.updateDynamic("delayPressOut")(v))
    delayLongPress.foreach(v => p.updateDynamic("delayLongPress")(v))
    activeOpacity.foreach(v => p.updateDynamic("activeOpacity")(v))
    accessible.foreach(v => p.updateDynamic("accessible")(v))
    p
  }

  def apply(children : ReactElement) = {
    val f = ReactNative.createFactory(ReactNative.TouchableOpacity)
    f(toJS,children).asInstanceOf[ReactElement]
  }
}
