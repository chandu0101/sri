package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js


case class SegmentedControlIOS(momentary: js.UndefOr[Boolean] = js.undefined,
                               style: js.UndefOr[js.Any] = js.undefined,
                               onChange: js.UndefOr[js.Dynamic => Unit] = js.undefined,
                               enabled: js.UndefOr[Boolean] = js.undefined,
                               ref: js.UndefOr[String] = js.undefined,
                               tintColor: js.UndefOr[String] = js.undefined,
                               key: js.UndefOr[String] = js.undefined,
                               onValueChange: js.UndefOr[String => Unit] = js.undefined,
                               values: js.UndefOr[Seq[String]] = js.undefined,
                               selectedIndex: js.UndefOr[Int] = js.undefined) {

  def apply() = {
    val props = JSMacro[SegmentedControlIOS](this)
    val f = ReactNative.createFactory(ReactNative.SegmentedControlIOS)
    f(props).asInstanceOf[ReactElement]
  }

}

