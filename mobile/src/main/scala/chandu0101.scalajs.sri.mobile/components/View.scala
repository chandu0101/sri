package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.{ReactNode, ReactElement}
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

/**
 *
 * key: PropTypes.string,
    ref: PropTypes.string,
    style: PropTypes.js.Any,
accessibilityLabel: PropTypes.string,
     accessibilityTraits: PropTypes.Seq[AccessibilityTraits],
    accessible: PropTypes.bool,
    collapsible: PropTypes.bool,
    onAcccessibilityTap: PropTypes.func,
    onLayout: PropTypes.func,
    onMagicTap: PropTypes.func,
    onMoveShouldSetResponder: PropTypes.func,
    onResponderGrant: PropTypes.func,
    onResponderMove: PropTypes.func,
    onResponderReject: PropTypes.func,
    onResponderRelease: PropTypes.func,
    onResponderTerminate: PropTypes.func,
    onResponderTerminationRequest: PropTypes.func,
    onStartShouldSetResponder: PropTypes.func,
    onStartShouldSetResponderCapture: PropTypes.func,
    pointerEvents: PropTypes.PointerEvents,
    removeClippedSubviews: PropTypes.bool,
    renderToHardwareTextureAndroid: PropTypes.bool,
    testID: PropTypes.string,

 */



case class View(onResponderReject : js.UndefOr[js.Function] = js.undefined ,
                renderToHardwareTextureAndroid : js.UndefOr[Boolean]=js.undefined,
                onStartShouldSetResponder : js.UndefOr[js.Function] = js.undefined ,
                onResponderRelease : js.UndefOr[js.Function] = js.undefined ,
                onMagicTap : js.UndefOr[js.Function] = js.undefined ,
                onResponderMove : js.UndefOr[js.Function] = js.undefined ,
                style : js.UndefOr[js.Any] = js.undefined,
                onLayout : js.UndefOr[js.Function] = js.undefined ,
                accessibilityLabel : js.UndefOr[String] = js.undefined,
                onMoveShouldSetResponder : js.UndefOr[js.Function] = js.undefined ,
                removeClippedSubviews : js.UndefOr[Boolean]=js.undefined,
                ref : js.UndefOr[String] = js.undefined,
                accessibilityTraits : js.UndefOr[Seq[AccessibilityTraits]] = js.undefined,
                onAcccessibilityTap : js.UndefOr[js.Function] = js.undefined ,
                collapsible : js.UndefOr[Boolean]=js.undefined,
                key : js.UndefOr[String] = js.undefined,
                onResponderTerminationRequest : js.UndefOr[js.Function] = js.undefined ,
                testID : js.UndefOr[String] = js.undefined,
                pointerEvents : js.UndefOr[PointerEvents] = js.undefined,
                onResponderTerminate : js.UndefOr[js.Function] = js.undefined ,
                onStartShouldSetResponderCapture : js.UndefOr[js.Function] = js.undefined ,
                onResponderGrant : js.UndefOr[js.Function] = js.undefined ,
                accessible : js.UndefOr[Boolean]=js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    onResponderReject.foreach(v => p.updateDynamic("onResponderReject")(v))
    renderToHardwareTextureAndroid.foreach(v => p.updateDynamic("renderToHardwareTextureAndroid")(v))
    onStartShouldSetResponder.foreach(v => p.updateDynamic("onStartShouldSetResponder")(v))
    onResponderRelease.foreach(v => p.updateDynamic("onResponderRelease")(v))
    onMagicTap.foreach(v => p.updateDynamic("onMagicTap")(v))
    onResponderMove.foreach(v => p.updateDynamic("onResponderMove")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    onLayout.foreach(v => p.updateDynamic("onLayout")(v))
    accessibilityLabel.foreach(v => p.updateDynamic("accessibilityLabel")(v))
    onMoveShouldSetResponder.foreach(v => p.updateDynamic("onMoveShouldSetResponder")(v))
    removeClippedSubviews.foreach(v => p.updateDynamic("removeClippedSubviews")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    accessibilityTraits.foreach(v => p.updateDynamic("accessibilityTraits")(v.map(_.value).toJSArray))
    onAcccessibilityTap.foreach(v => p.updateDynamic("onAcccessibilityTap")(v))
    collapsible.foreach(v => p.updateDynamic("collapsible")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    onResponderTerminationRequest.foreach(v => p.updateDynamic("onResponderTerminationRequest")(v))
    testID.foreach(v => p.updateDynamic("testID")(v))
    pointerEvents.foreach(v => p.updateDynamic("pointerEvents")(v.event))
    onResponderTerminate.foreach(v => p.updateDynamic("onResponderTerminate")(v))
    onStartShouldSetResponderCapture.foreach(v => p.updateDynamic("onStartShouldSetResponderCapture")(v))
    onResponderGrant.foreach(v => p.updateDynamic("onResponderGrant")(v))
    accessible.foreach(v => p.updateDynamic("accessible")(v))
    p
  }

  def apply(children : ReactNode*) = {
    val f = ReactNative.createFactory(ReactNative.View)
    f(toJS,children.toJSArray).asInstanceOf[ReactElement]
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


class PointerEvents private(val event : String) extends AnyVal


object PointerEvents {

  val BOX_NONE  = new PointerEvents("box-none")
  val BOX_ONLY  = new PointerEvents("box-only")
  val NONE  = new PointerEvents("none")
  val AUTO  = new PointerEvents("auto")
}

