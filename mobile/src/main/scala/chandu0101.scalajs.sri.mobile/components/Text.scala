package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.{ReactNode, ReactElement}
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

/**
 * Created by chandrasekharkode on 3/31/15.
 *
 * key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
numberOfLines: PropTypes.number,
    onLayout:PropTypes.func
    onPress: PropTypes.() => Unit,
    suppressHighlighting: PropTypes.bool,
    testID: PropTypes.string,

 */


case class Text(suppressHighlighting : js.UndefOr[Boolean]=js.undefined,
                onPress : js.UndefOr[() => Unit] = js.undefined,
                style : js.UndefOr[js.Any] = js.undefined,
                onLayout : js.UndefOr[js.Function] = js.undefined ,
                numberOfLines : js.UndefOr[Int] = js.undefined,
                ref : js.UndefOr[String] = js.undefined,
                key : js.UndefOr[String] = js.undefined,
                testID : js.UndefOr[String] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    suppressHighlighting.foreach(v => p.updateDynamic("suppressHighlighting")(v))
    onPress.foreach(v => p.updateDynamic("onPress")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    onLayout.foreach(v => p.updateDynamic("onLayout")(v))
    numberOfLines.foreach(v => p.updateDynamic("numberOfLines")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    testID.foreach(v => p.updateDynamic("testID")(v))
    p
  }

  def apply(children : ReactNode*) = {
    val f = ReactNative.createFactory(ReactNative.Text)
    f(toJS,children.toJSArray).asInstanceOf[ReactElement]
  }
}

