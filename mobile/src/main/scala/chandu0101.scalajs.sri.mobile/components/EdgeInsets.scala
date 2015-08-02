package chandu0101.scalajs.sri.mobile.components

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr, undefined}

/**
 * Created by chandrasekharkode on 4/1/15.
 */
case class EdgeInsets(top : UndefOr[Double] = undefined,
                      left : UndefOr[Double] = undefined,
                      bottom : UndefOr[Double] = undefined,
                      right : UndefOr[Double] = undefined) {

  def toJson = {
    val p = json()
    top.foreach(v => p.updateDynamic("top")(v))
    left.foreach(v => p.updateDynamic("left")(v))
    bottom.foreach(v => p.updateDynamic("bottom")(v))
    right.foreach(v => p.updateDynamic("right")(v))
    p
  }
}
