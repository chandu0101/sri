package sri.universal.components

import chandu0101.macros.tojs.JSMacro

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr, undefined}


case class EdgeInsets(top: UndefOr[Double] = undefined,
                      left: UndefOr[Double] = undefined,
                      bottom: UndefOr[Double] = undefined,
                      right: UndefOr[Double] = undefined) {

  val toJS = JSMacro[EdgeInsets](this)

}
