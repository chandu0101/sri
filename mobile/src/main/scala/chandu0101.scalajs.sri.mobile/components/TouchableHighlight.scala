package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js

/**
 * Created by chandrasekharkode on 4/2/15.
 *
 * props
 *
 * key: PropTypes.string,
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
  onHideUnderlay:PropTypes.() => Unit,
 onShowUnderlay:PropTypes.() => Unit,
   underlayColor: PropTypes.string,
 */


case class TouchableHighlight(onPressIn: js.UndefOr[() => Unit] = js.undefined,
                              onPress: js.UndefOr[() => Unit] = js.undefined,
                              style: js.UndefOr[js.Any] = js.undefined,
                              delayPressIn: js.UndefOr[Int] = js.undefined,
                              onHideUnderlay: js.UndefOr[() => Unit] = js.undefined,
                              ref: js.UndefOr[String] = js.undefined,
                              onPressOut: js.UndefOr[() => Unit] = js.undefined,
                              key: js.UndefOr[String] = js.undefined,
                              onLongPress: js.UndefOr[() => Unit] = js.undefined,
                              underlayColor: js.UndefOr[String] = js.undefined,
                              delayPressOut: js.UndefOr[Int] = js.undefined,
                              delayLongPress: js.UndefOr[Int] = js.undefined,
                              onShowUnderlay: js.UndefOr[() => Unit] = js.undefined,
                              activeOpacity: js.UndefOr[Int] = js.undefined,
                              accessible: js.UndefOr[Boolean] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    onPressIn.foreach(v => p.updateDynamic("onPressIn")(v))
    onPress.foreach(v => p.updateDynamic("onPress")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    delayPressIn.foreach(v => p.updateDynamic("delayPressIn")(v))
    onHideUnderlay.foreach(v => p.updateDynamic("onHideUnderlay")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    onPressOut.foreach(v => p.updateDynamic("onPressOut")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    onLongPress.foreach(v => p.updateDynamic("onLongPress")(v))
    underlayColor.foreach(v => p.updateDynamic("underlayColor")(v))
    delayPressOut.foreach(v => p.updateDynamic("delayPressOut")(v))
    delayLongPress.foreach(v => p.updateDynamic("delayLongPress")(v))
    onShowUnderlay.foreach(v => p.updateDynamic("onShowUnderlay")(v))
    activeOpacity.foreach(v => p.updateDynamic("activeOpacity")(v))
    accessible.foreach(v => p.updateDynamic("accessible")(v))
    p
  }

  def apply(children: ReactElement) = {
    val f = ReactNative.createFactory(ReactNative.TouchableHighlight)
    f(toJS, children).asInstanceOf[ReactElement]
  }
}
