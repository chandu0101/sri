package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenTraversableOnce


/**
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
enabled:PropTypes.bool,
momentary:PropTypes.bool,
onChange:  PropTypes.js.Dynamic => Unit,
onValueChange : PropTypes.string => Unit,
selectedIndex: PropTypes.Int,
  tintColor: PropTypes.string,
  values: PropTypes.Seq[String]

 */

object SegmentedControlIOS {

  def apply(momentary: js.UndefOr[Boolean] = js.undefined,
            style: js.UndefOr[js.Any] = js.undefined,
            onChange: js.UndefOr[js.Dynamic => Unit] = js.undefined,
            enabled: js.UndefOr[Boolean] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            tintColor: js.UndefOr[String] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            onValueChange: js.UndefOr[String => Unit] = js.undefined,
            values: js.UndefOr[Seq[String]] = js.undefined,
            selectedIndex: js.UndefOr[Int] = js.undefined) = {

    val p = js.Dynamic.literal()
    momentary.foreach(v => p.updateDynamic("momentary")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    onChange.foreach(v => p.updateDynamic("onChange")(v))
    enabled.foreach(v => p.updateDynamic("enabled")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    tintColor.foreach(v => p.updateDynamic("tintColor")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    onValueChange.foreach(v => p.updateDynamic("onValueChange")(v))
    values.foreach(v => p.updateDynamic("values")(v.toJSArray))
    selectedIndex.foreach(v => p.updateDynamic("selectedIndex")(v))

    val f = ReactNative.createFactory(ReactNative.SegmentedControlIOS)
    f(p).asInstanceOf[ReactElement]
  }

}

