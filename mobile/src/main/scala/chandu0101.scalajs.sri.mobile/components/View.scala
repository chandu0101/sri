package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.{ReactNode, ReactElement}
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav


case class View(onResponderReject: js.UndefOr[js.Function] = js.undefined,
                renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
                onStartShouldSetResponder: js.UndefOr[js.Function] = js.undefined,
                onResponderRelease: js.UndefOr[js.Function] = js.undefined,
                onMagicTap: js.UndefOr[js.Function] = js.undefined,
                onResponderMove: js.UndefOr[js.Function] = js.undefined,
                style: js.UndefOr[js.Any] = js.undefined,
                onLayout: js.UndefOr[js.Function] = js.undefined,
                accessibilityLabel: js.UndefOr[String] = js.undefined,
                onMoveShouldSetResponder: js.UndefOr[js.Function] = js.undefined,
                removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
                ref: js.UndefOr[ViewM => _] = js.undefined,
                accessibilityTraits: js.UndefOr[Seq[AccessibilityTraits]] = js.undefined,
                onAcccessibilityTap: js.UndefOr[js.Function] = js.undefined,
                collapsible: js.UndefOr[Boolean] = js.undefined,
                key: js.UndefOr[String] = js.undefined,
                onResponderTerminationRequest: js.UndefOr[js.Function] = js.undefined,
                testID: js.UndefOr[String] = js.undefined,
                pointerEvents: js.UndefOr[PointerEvents] = js.undefined,
                onResponderTerminate: js.UndefOr[js.Function] = js.undefined,
                onStartShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined,
                onResponderGrant: js.UndefOr[js.Function] = js.undefined,
                accessible: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[View](this)
    val f = ReactNative.createFactory(ReactNative.View)
    f(props, children: _*)
  }
}


class AccessibilityTraits private(val value: String) extends AnyVal

object AccessibilityTraits {

  val NONE = new AccessibilityTraits("none")
  val BUTTON = new AccessibilityTraits("button")
  val LINK = new AccessibilityTraits("link")
  val HEADER = new AccessibilityTraits("header")
  val SEARCH = new AccessibilityTraits("search")
  val IMAGE = new AccessibilityTraits("image")
  val SELECTED = new AccessibilityTraits("selected")
  val PLAYS = new AccessibilityTraits("plays")
  val KEY = new AccessibilityTraits("key")
  val TEXT = new AccessibilityTraits("text")
  val SUMMARY = new AccessibilityTraits("summary")
  val DISABLED = new AccessibilityTraits("disabled")
  val FREQUENT_UPDATES = new AccessibilityTraits("frequentUpdates")
  val STARTS_MEDIA = new AccessibilityTraits("startsMedia")
  val ADJUSTABLE = new AccessibilityTraits("adjustable")
  val ALLOWS_DIRECT_INTERACTION = new AccessibilityTraits("allowsDirectInteraction")
  val PAGE_TURN = new AccessibilityTraits("pageTurn")

}


class PointerEvents private(val value: String) extends AnyVal


object PointerEvents {

  val BOX_NONE = new PointerEvents("box-none")
  val BOX_ONLY = new PointerEvents("box-only")
  val NONE = new PointerEvents("none")
  val AUTO = new PointerEvents("auto")
}

@js.native
trait ViewM extends js.Object