package chandu0101.scalajs.sri.mobile.components

import scala.scalajs.js

/**
 * Created by chandrasekharkode on 4/3/15.
 */

@js.native
class DocumentSelectionState extends js.Object {

  def this(anchor: Int, focus: Int) = this()

  def update(anchor: Int, focus: Int): Unit = js.native

  def constrainLength(maxLength: Int): Unit = js.native

  def focus(): Unit = js.native

  def blur(): Unit = js.native

  def hasFocus(): Boolean = js.native

  def isCollapsed(): Boolean = js.native

  def isBackward(): Boolean = js.native

  def getAnchorOffset(): js.UndefOr[Double] = js.native

  def getFocusOffset(): js.UndefOr[Double] = js.native

  def getStartOffset(): js.UndefOr[Double] = js.native

  def getEndOffset(): js.UndefOr[Double] = js.native

  def overlaps(start: Double, end: Double): Boolean = js.native
}
