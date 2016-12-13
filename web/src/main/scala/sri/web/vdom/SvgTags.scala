package sri.web.vdom

import org.scalajs.dom
import sri.core._
import sri.web.SyntheticEvent

import scala.scalajs.LinkingInfo.developmentMode
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{`|`, undefined, UndefOr => U}

trait SvgTags extends SvgTags1 {

  
  def feImage(
               colorInterpolation: U[String] = undefined,
               floodColor: U[String] = undefined,
               x: U[String | Double] = undefined,
               xlinkRole: U[String] = undefined,
               textRendering: U[String] = undefined,
               shapeRendering: U[String] = undefined,
               mask: U[String] = undefined,
               overflow: U[String] = undefined,
               xlinkShow: U[String] = undefined,
               strokeDasharray: U[String] = undefined,
               textAnchor: U[String] = undefined,
               xlinkActuate: U[String] = undefined,
               style: U[js.Any] = undefined,
               y: U[String | Double] = undefined,
               strokeOpacity: U[String | Double] = undefined,
               textDecoration: U[String] = undefined,
               externalResourcesRequired: U[Double] = undefined,
               g2: U[String] = undefined,
               stroke: U[String] = undefined,
               clipPath: U[String] = undefined,
               result: U[String] = undefined,
               fillOpacity: U[String | Double] = undefined,
               fontSizeAdjust: U[String | Double] = undefined,
               clipRule: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               stopOpacity: U[String | Double] = undefined,
               colorInterpolationFilters: U[String] = undefined,
               height: U[Double] = undefined,
               fontStyle: U[String] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               direction: U[String] = undefined,
               enableBackground: U[String] = undefined,
               colorRendering: U[String] = undefined,
               g1: U[String] = undefined,
               cursor: U[String] = undefined,
               xmlBase: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               filter: U[String] = undefined,
               xlinkHref: U[String] = undefined,
               fontFamily: U[String] = undefined,
               kerning: U[String] = undefined,
               id: U[String] = undefined,
               strokeDashoffset: U[String] = undefined,
               glyphOrientationHorizontal: U[String] = undefined,
               letterSpacing: U[String] = undefined,
               preserveAspectRatio: U[Boolean] = undefined,
               strokeLinecap: U[String] = undefined,
               wordSpacing: U[String | Double] = undefined,
               xmlLang: U[String] = undefined,
               fill: U[String] = undefined,
               pointerEvents: U[String] = undefined,
               floodOpacity: U[String | Double] = undefined,
               writingMode: U[String | Double] = undefined,
               xlinkType: U[String] = undefined,
               className: U[String] = undefined,
               xlinkArcrole: U[String] = undefined,
               fontVariant: U[String] = undefined,
               baselineShift: U[String] = undefined,
               fontSize: U[String | Double] = undefined,
               strokeMiterlimit: U[String] = undefined,
               glyphOrientationVertical: U[String] = undefined,
               opacity: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               clip: U[String] = undefined,
               fontStretch: U[String] = undefined,
               imageRendering: U[String] = undefined,
               xlinkTitle: U[String] = undefined,
               colorProfile: U[String] = undefined,
               stopColor: U[String] = undefined,
               strokeLinejoin: U[String] = undefined,
               lightingColor: U[String] = undefined,
               width: U[Double] = undefined,
               fontWeight: U[String] = undefined,
               visibility: U[String] = undefined,
               unicodeBidi: U[String] = undefined,
               strokeWidth: U[String | Double] = undefined,
               dominantBaseline: U[String] = undefined,
               display: U[String] = undefined,
               fillRule: U[String] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    xlinkRole.foreach(v => props.updateDynamic("xlinkRole")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    xlinkArcrole.foreach(v => props.updateDynamic("xlinkArcrole")(v))
    xlinkTitle.foreach(v => props.updateDynamic("xlinkTitle")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    xlinkShow.foreach(v => props.updateDynamic("xlinkShow")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xlinkHref.foreach(v => props.updateDynamic("xlinkHref")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    preserveAspectRatio.foreach(v => props.updateDynamic("preserveAspectRatio")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feImage",props,children :_*)
    else inlineReactElement("feImage",props,children :_*)
  }

  @inline
  def feDropShadow(
                    style: U[js.Any] = undefined,
                    g2: U[String] = undefined,
                    local: U[String] = undefined,
                    paintOrder: U[String] = undefined,
                    ref: U[(_ <: dom.svg.Element) => _] = undefined,
                    g1: U[String] = undefined,
                    xmlBase: U[String] = undefined,
                    key: U[String | Int] = undefined,
                    xmlSpace: U[String] = undefined,
                    id: U[String] = undefined,
                    xmlLang: U[String] = undefined,
                    className: U[String] = undefined,
                    allowReorder: U[Boolean] = undefined,
                    onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feDropShadow",props,children :_*)
    else inlineReactElement("feDropShadow",props,children :_*)
  }

  @inline
  def circle(
              colorInterpolation: U[String] = undefined,
              floodColor: U[String] = undefined,
              textRendering: U[String] = undefined,
              shapeRendering: U[String] = undefined,
              mask: U[String] = undefined,
              overflow: U[String] = undefined,
              strokeDasharray: U[String] = undefined,
              textAnchor: U[String] = undefined,
              style: U[js.Any] = undefined,
              strokeOpacity: U[String | Double] = undefined,
              cx: U[String | Double] = undefined,
              textDecoration: U[String] = undefined,
              externalResourcesRequired: U[Double] = undefined,
              g2: U[String] = undefined,
              stroke: U[String] = undefined,
              clipPath: U[String] = undefined,
              fillOpacity: U[String | Double] = undefined,
              fontSizeAdjust: U[String | Double] = undefined,
              clipRule: U[String] = undefined,
              local: U[String] = undefined,
              paintOrder: U[String] = undefined,
              stopOpacity: U[String | Double] = undefined,
              colorInterpolationFilters: U[String] = undefined,
              fontStyle: U[String] = undefined,
              ref: U[(_ <: dom.svg.Element) => _] = undefined,
              direction: U[String] = undefined,
              enableBackground: U[String] = undefined,
              colorRendering: U[String] = undefined,
              g1: U[String] = undefined,
              cursor: U[String] = undefined,
              cy: U[String | Double] = undefined,
              xmlBase: U[String] = undefined,
              key: U[String | Int] = undefined,
              xmlSpace: U[String] = undefined,
              filter: U[String] = undefined,
              fontFamily: U[String] = undefined,
              kerning: U[String] = undefined,
              id: U[String] = undefined,
              strokeDashoffset: U[String] = undefined,
              glyphOrientationHorizontal: U[String] = undefined,
              letterSpacing: U[String] = undefined,
              strokeLinecap: U[String] = undefined,
              wordSpacing: U[String | Double] = undefined,
              xmlLang: U[String] = undefined,
              fill: U[String] = undefined,
              systemLanguage: U[Boolean] = undefined,
              pointerEvents: U[String] = undefined,
              floodOpacity: U[String | Double] = undefined,
              writingMode: U[String | Double] = undefined,
              className: U[String] = undefined,
              fontVariant: U[String] = undefined,
              requiredExtensions: U[String] = undefined,
              baselineShift: U[String] = undefined,
              requiredFeatures: U[String] = undefined,
              fontSize: U[String | Double] = undefined,
              strokeMiterlimit: U[String] = undefined,
              glyphOrientationVertical: U[String] = undefined,
              opacity: U[String] = undefined,
              allowReorder: U[Boolean] = undefined,
              r: U[String | Double] = undefined,
              clip: U[String] = undefined,
              fontStretch: U[String] = undefined,
              imageRendering: U[String] = undefined,
              colorProfile: U[String] = undefined,
              stopColor: U[String] = undefined,
              strokeLinejoin: U[String] = undefined,
              lightingColor: U[String] = undefined,
              transform: U[String] = undefined,
              fontWeight: U[String] = undefined,
              visibility: U[String] = undefined,
              unicodeBidi: U[String] = undefined,
              strokeWidth: U[String | Double] = undefined,
              dominantBaseline: U[String] = undefined,
              display: U[String] = undefined,
              fillRule: U[String] = undefined,
              onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    cy.foreach(v => props.updateDynamic("cy")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    cx.foreach(v => props.updateDynamic("cx")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    r.foreach(v => props.updateDynamic("r")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("circle",props,children :_*)
    else inlineReactElement("circle",props,children :_*)
  }

  @inline
  def feMerge(
               colorInterpolation: U[String] = undefined,
               floodColor: U[String] = undefined,
               x: U[String | Double] = undefined,
               textRendering: U[String] = undefined,
               shapeRendering: U[String] = undefined,
               mask: U[String] = undefined,
               overflow: U[String] = undefined,
               strokeDasharray: U[String] = undefined,
               textAnchor: U[String] = undefined,
               style: U[js.Any] = undefined,
               y: U[String | Double] = undefined,
               strokeOpacity: U[String | Double] = undefined,
               textDecoration: U[String] = undefined,
               g2: U[String] = undefined,
               stroke: U[String] = undefined,
               clipPath: U[String] = undefined,
               result: U[String] = undefined,
               fillOpacity: U[String | Double] = undefined,
               fontSizeAdjust: U[String | Double] = undefined,
               clipRule: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               stopOpacity: U[String | Double] = undefined,
               colorInterpolationFilters: U[String] = undefined,
               height: U[Double] = undefined,
               fontStyle: U[String] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               direction: U[String] = undefined,
               enableBackground: U[String] = undefined,
               colorRendering: U[String] = undefined,
               g1: U[String] = undefined,
               cursor: U[String] = undefined,
               xmlBase: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               filter: U[String] = undefined,
               fontFamily: U[String] = undefined,
               kerning: U[String] = undefined,
               id: U[String] = undefined,
               strokeDashoffset: U[String] = undefined,
               glyphOrientationHorizontal: U[String] = undefined,
               letterSpacing: U[String] = undefined,
               strokeLinecap: U[String] = undefined,
               wordSpacing: U[String | Double] = undefined,
               xmlLang: U[String] = undefined,
               fill: U[String] = undefined,
               pointerEvents: U[String] = undefined,
               floodOpacity: U[String | Double] = undefined,
               writingMode: U[String | Double] = undefined,
               className: U[String] = undefined,
               fontVariant: U[String] = undefined,
               baselineShift: U[String] = undefined,
               fontSize: U[String | Double] = undefined,
               strokeMiterlimit: U[String] = undefined,
               glyphOrientationVertical: U[String] = undefined,
               opacity: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               clip: U[String] = undefined,
               fontStretch: U[String] = undefined,
               imageRendering: U[String] = undefined,
               colorProfile: U[String] = undefined,
               stopColor: U[String] = undefined,
               strokeLinejoin: U[String] = undefined,
               lightingColor: U[String] = undefined,
               width: U[Double] = undefined,
               fontWeight: U[String] = undefined,
               visibility: U[String] = undefined,
               unicodeBidi: U[String] = undefined,
               strokeWidth: U[String | Double] = undefined,
               dominantBaseline: U[String] = undefined,
               display: U[String] = undefined,
               fillRule: U[String] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feMerge",props,children :_*)
    else inlineReactElement("feMerge",props,children :_*)
  }

  @inline
  def feComponentTransfer(
                           colorInterpolation: U[String] = undefined,
                           floodColor: U[String] = undefined,
                           x: U[String | Double] = undefined,
                           in: U[String] = undefined,
                           textRendering: U[String] = undefined,
                           shapeRendering: U[String] = undefined,
                           mask: U[String] = undefined,
                           overflow: U[String] = undefined,
                           strokeDasharray: U[String] = undefined,
                           textAnchor: U[String] = undefined,
                           style: U[js.Any] = undefined,
                           y: U[String | Double] = undefined,
                           strokeOpacity: U[String | Double] = undefined,
                           textDecoration: U[String] = undefined,
                           g2: U[String] = undefined,
                           stroke: U[String] = undefined,
                           clipPath: U[String] = undefined,
                           result: U[String] = undefined,
                           fillOpacity: U[String | Double] = undefined,
                           fontSizeAdjust: U[String | Double] = undefined,
                           clipRule: U[String] = undefined,
                           local: U[String] = undefined,
                           paintOrder: U[String] = undefined,
                           stopOpacity: U[String | Double] = undefined,
                           colorInterpolationFilters: U[String] = undefined,
                           height: U[Double] = undefined,
                           fontStyle: U[String] = undefined,
                           ref: U[(_ <: dom.svg.Element) => _] = undefined,
                           direction: U[String] = undefined,
                           enableBackground: U[String] = undefined,
                           colorRendering: U[String] = undefined,
                           g1: U[String] = undefined,
                           cursor: U[String] = undefined,
                           xmlBase: U[String] = undefined,
                           key: U[String | Int] = undefined,
                           xmlSpace: U[String] = undefined,
                           filter: U[String] = undefined,
                           fontFamily: U[String] = undefined,
                           kerning: U[String] = undefined,
                           id: U[String] = undefined,
                           strokeDashoffset: U[String] = undefined,
                           glyphOrientationHorizontal: U[String] = undefined,
                           letterSpacing: U[String] = undefined,
                           strokeLinecap: U[String] = undefined,
                           wordSpacing: U[String | Double] = undefined,
                           xmlLang: U[String] = undefined,
                           fill: U[String] = undefined,
                           pointerEvents: U[String] = undefined,
                           floodOpacity: U[String | Double] = undefined,
                           writingMode: U[String | Double] = undefined,
                           className: U[String] = undefined,
                           fontVariant: U[String] = undefined,
                           baselineShift: U[String] = undefined,
                           fontSize: U[String | Double] = undefined,
                           strokeMiterlimit: U[String] = undefined,
                           glyphOrientationVertical: U[String] = undefined,
                           opacity: U[String] = undefined,
                           allowReorder: U[Boolean] = undefined,
                           clip: U[String] = undefined,
                           fontStretch: U[String] = undefined,
                           imageRendering: U[String] = undefined,
                           colorProfile: U[String] = undefined,
                           stopColor: U[String] = undefined,
                           strokeLinejoin: U[String] = undefined,
                           lightingColor: U[String] = undefined,
                           width: U[Double] = undefined,
                           fontWeight: U[String] = undefined,
                           visibility: U[String] = undefined,
                           unicodeBidi: U[String] = undefined,
                           strokeWidth: U[String | Double] = undefined,
                           dominantBaseline: U[String] = undefined,
                           display: U[String] = undefined,
                           fillRule: U[String] = undefined,
                           onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                           extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    in.foreach(v => props.updateDynamic("in")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feComponentTransfer",props,children :_*)
    else inlineReactElement("feComponentTransfer",props,children :_*)
  }

  @inline
  def line(
            colorInterpolation: U[String] = undefined,
            floodColor: U[String] = undefined,
            textRendering: U[String] = undefined,
            shapeRendering: U[String] = undefined,
            mask: U[String] = undefined,
            overflow: U[String] = undefined,
            strokeDasharray: U[String] = undefined,
            textAnchor: U[String] = undefined,
            style: U[js.Any] = undefined,
            strokeOpacity: U[String | Double] = undefined,
            textDecoration: U[String] = undefined,
            externalResourcesRequired: U[Double] = undefined,
            g2: U[String] = undefined,
            stroke: U[String] = undefined,
            clipPath: U[String] = undefined,
            fillOpacity: U[String | Double] = undefined,
            fontSizeAdjust: U[String | Double] = undefined,
            clipRule: U[String] = undefined,
            local: U[String] = undefined,
            paintOrder: U[String] = undefined,
            stopOpacity: U[String | Double] = undefined,
            colorInterpolationFilters: U[String] = undefined,
            fontStyle: U[String] = undefined,
            ref: U[(_ <: dom.svg.Element) => _] = undefined,
            direction: U[String] = undefined,
            enableBackground: U[String] = undefined,
            colorRendering: U[String] = undefined,
            g1: U[String] = undefined,
            x2: U[String | Double] = undefined,
            cursor: U[String] = undefined,
            xmlBase: U[String] = undefined,
            key: U[String | Int] = undefined,
            xmlSpace: U[String] = undefined,
            filter: U[String] = undefined,
            fontFamily: U[String] = undefined,
            kerning: U[String] = undefined,
            id: U[String] = undefined,
            strokeDashoffset: U[String] = undefined,
            glyphOrientationHorizontal: U[String] = undefined,
            letterSpacing: U[String] = undefined,
            strokeLinecap: U[String] = undefined,
            y1: U[String | Double] = undefined,
            wordSpacing: U[String | Double] = undefined,
            xmlLang: U[String] = undefined,
            fill: U[String] = undefined,
            systemLanguage: U[Boolean] = undefined,
            pointerEvents: U[String] = undefined,
            floodOpacity: U[String | Double] = undefined,
            writingMode: U[String | Double] = undefined,
            className: U[String] = undefined,
            fontVariant: U[String] = undefined,
            requiredExtensions: U[String] = undefined,
            baselineShift: U[String] = undefined,
            requiredFeatures: U[String] = undefined,
            fontSize: U[String | Double] = undefined,
            y2: U[String | Double] = undefined,
            markerMid: U[String] = undefined,
            strokeMiterlimit: U[String] = undefined,
            x1: U[String | Double] = undefined,
            glyphOrientationVertical: U[String] = undefined,
            opacity: U[String] = undefined,
            markerStart: U[String] = undefined,
            allowReorder: U[Boolean] = undefined,
            clip: U[String] = undefined,
            fontStretch: U[String] = undefined,
            imageRendering: U[String] = undefined,
            colorProfile: U[String] = undefined,
            stopColor: U[String] = undefined,
            strokeLinejoin: U[String] = undefined,
            lightingColor: U[String] = undefined,
            transform: U[String] = undefined,
            fontWeight: U[String] = undefined,
            visibility: U[String] = undefined,
            unicodeBidi: U[String] = undefined,
            strokeWidth: U[String | Double] = undefined,
            dominantBaseline: U[String] = undefined,
            markerEnd: U[String] = undefined,
            display: U[String] = undefined,
            fillRule: U[String] = undefined,
            onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    y1.foreach(v => props.updateDynamic("y1")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    markerEnd.foreach(v => props.updateDynamic("markerEnd")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    markerMid.foreach(v => props.updateDynamic("markerMid")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    x2.foreach(v => props.updateDynamic("x2")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    x1.foreach(v => props.updateDynamic("x1")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    y2.foreach(v => props.updateDynamic("y2")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    markerStart.foreach(v => props.updateDynamic("markerStart")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("line",props,children :_*)
    else inlineReactElement("line",props,children :_*)
  }

  @inline
  def meshpatch(
                 style: U[js.Any] = undefined,
                 g2: U[String] = undefined,
                 local: U[String] = undefined,
                 paintOrder: U[String] = undefined,
                 ref: U[(_ <: dom.svg.Element) => _] = undefined,
                 g1: U[String] = undefined,
                 xmlBase: U[String] = undefined,
                 key: U[String | Int] = undefined,
                 xmlSpace: U[String] = undefined,
                 id: U[String] = undefined,
                 xmlLang: U[String] = undefined,
                 className: U[String] = undefined,
                 allowReorder: U[Boolean] = undefined,
                 onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                 extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("meshpatch",props,children :_*)
    else inlineReactElement("meshpatch",props,children :_*)
  }

  @inline
  def discard(
               style: U[js.Any] = undefined,
               g2: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               g1: U[String] = undefined,
               xmlBase: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               id: U[String] = undefined,
               xmlLang: U[String] = undefined,
               className: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("discard",props,children :_*)
    else inlineReactElement("discard",props,children :_*)
  }

  @inline
  def g(
         colorInterpolation: U[String] = undefined,
         floodColor: U[String] = undefined,
         textRendering: U[String] = undefined,
         shapeRendering: U[String] = undefined,
         mask: U[String] = undefined,
         overflow: U[String] = undefined,
         strokeDasharray: U[String] = undefined,
         textAnchor: U[String] = undefined,
         style: U[js.Any] = undefined,
         strokeOpacity: U[String | Double] = undefined,
         textDecoration: U[String] = undefined,
         externalResourcesRequired: U[Double] = undefined,
         g2: U[String] = undefined,
         stroke: U[String] = undefined,
         clipPath: U[String] = undefined,
         fillOpacity: U[String | Double] = undefined,
         fontSizeAdjust: U[String | Double] = undefined,
         clipRule: U[String] = undefined,
         local: U[String] = undefined,
         paintOrder: U[String] = undefined,
         stopOpacity: U[String | Double] = undefined,
         colorInterpolationFilters: U[String] = undefined,
         fontStyle: U[String] = undefined,
         ref: U[(_ <: dom.svg.Element) => _] = undefined,
         direction: U[String] = undefined,
         enableBackground: U[String] = undefined,
         colorRendering: U[String] = undefined,
         g1: U[String] = undefined,
         cursor: U[String] = undefined,
         xmlBase: U[String] = undefined,
         key: U[String | Int] = undefined,
         xmlSpace: U[String] = undefined,
         filter: U[String] = undefined,
         fontFamily: U[String] = undefined,
         kerning: U[String] = undefined,
         id: U[String] = undefined,
         strokeDashoffset: U[String] = undefined,
         glyphOrientationHorizontal: U[String] = undefined,
         letterSpacing: U[String] = undefined,
         strokeLinecap: U[String] = undefined,
         wordSpacing: U[String | Double] = undefined,
         xmlLang: U[String] = undefined,
         fill: U[String] = undefined,
         systemLanguage: U[Boolean] = undefined,
         pointerEvents: U[String] = undefined,
         floodOpacity: U[String | Double] = undefined,
         writingMode: U[String | Double] = undefined,
         className: U[String] = undefined,
         fontVariant: U[String] = undefined,
         requiredExtensions: U[String] = undefined,
         baselineShift: U[String] = undefined,
         requiredFeatures: U[String] = undefined,
         fontSize: U[String | Double] = undefined,
         strokeMiterlimit: U[String] = undefined,
         glyphOrientationVertical: U[String] = undefined,
         opacity: U[String] = undefined,
         allowReorder: U[Boolean] = undefined,
         clip: U[String] = undefined,
         fontStretch: U[String] = undefined,
         imageRendering: U[String] = undefined,
         colorProfile: U[String] = undefined,
         stopColor: U[String] = undefined,
         strokeLinejoin: U[String] = undefined,
         lightingColor: U[String] = undefined,
         transform: U[String] = undefined,
         fontWeight: U[String] = undefined,
         visibility: U[String] = undefined,
         unicodeBidi: U[String] = undefined,
         strokeWidth: U[String | Double] = undefined,
         dominantBaseline: U[String] = undefined,
         display: U[String] = undefined,
         fillRule: U[String] = undefined,
         onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
         extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("g",props,children :_*)
    else inlineReactElement("g",props,children :_*)
  }

  @inline
  def text(
            colorInterpolation: U[String] = undefined,
            floodColor: U[String] = undefined,
            x: U[String | Double] = undefined,
            textRendering: U[String] = undefined,
            shapeRendering: U[String] = undefined,
            dy: U[Double] = undefined,
            mask: U[String] = undefined,
            overflow: U[String] = undefined,
            strokeDasharray: U[String] = undefined,
            textAnchor: U[String] = undefined,
            style: U[js.Any] = undefined,
            y: U[String | Double] = undefined,
            strokeOpacity: U[String | Double] = undefined,
            textDecoration: U[String] = undefined,
            externalResourcesRequired: U[Double] = undefined,
            g2: U[String] = undefined,
            stroke: U[String] = undefined,
            clipPath: U[String] = undefined,
            fillOpacity: U[String | Double] = undefined,
            fontSizeAdjust: U[String | Double] = undefined,
            clipRule: U[String] = undefined,
            local: U[String] = undefined,
            paintOrder: U[String] = undefined,
            stopOpacity: U[String | Double] = undefined,
            colorInterpolationFilters: U[String] = undefined,
            fontStyle: U[String] = undefined,
            ref: U[(_ <: dom.svg.Element) => _] = undefined,
            direction: U[String] = undefined,
            enableBackground: U[String] = undefined,
            colorRendering: U[String] = undefined,
            g1: U[String] = undefined,
            cursor: U[String] = undefined,
            xmlBase: U[String] = undefined,
            key: U[String | Int] = undefined,
            xmlSpace: U[String] = undefined,
            filter: U[String] = undefined,
            rotate: U[String | Double] = undefined,
            lengthAdjust: U[String] = undefined,
            fontFamily: U[String] = undefined,
            kerning: U[String] = undefined,
            id: U[String] = undefined,
            strokeDashoffset: U[String] = undefined,
            glyphOrientationHorizontal: U[String] = undefined,
            letterSpacing: U[String] = undefined,
            strokeLinecap: U[String] = undefined,
            wordSpacing: U[String | Double] = undefined,
            xmlLang: U[String] = undefined,
            fill: U[String] = undefined,
            systemLanguage: U[Boolean] = undefined,
            pointerEvents: U[String] = undefined,
            floodOpacity: U[String | Double] = undefined,
            writingMode: U[String | Double] = undefined,
            className: U[String] = undefined,
            fontVariant: U[String] = undefined,
            requiredExtensions: U[String] = undefined,
            baselineShift: U[String] = undefined,
            requiredFeatures: U[String] = undefined,
            fontSize: U[String | Double] = undefined,
            strokeMiterlimit: U[String] = undefined,
            glyphOrientationVertical: U[String] = undefined,
            opacity: U[String] = undefined,
            dx: U[Double] = undefined,
            allowReorder: U[Boolean] = undefined,
            clip: U[String] = undefined,
            fontStretch: U[String] = undefined,
            imageRendering: U[String] = undefined,
            colorProfile: U[String] = undefined,
            stopColor: U[String] = undefined,
            strokeLinejoin: U[String] = undefined,
            lightingColor: U[String] = undefined,
            transform: U[String] = undefined,
            fontWeight: U[String] = undefined,
            visibility: U[String] = undefined,
            unicodeBidi: U[String] = undefined,
            strokeWidth: U[String | Double] = undefined,
            dominantBaseline: U[String] = undefined,
            textLength: U[String | Double] = undefined,
            display: U[String] = undefined,
            fillRule: U[String] = undefined,
            onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    rotate.foreach(v => props.updateDynamic("rotate")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    textLength.foreach(v => props.updateDynamic("textLength")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    dy.foreach(v => props.updateDynamic("dy")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    dx.foreach(v => props.updateDynamic("dx")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    lengthAdjust.foreach(v => props.updateDynamic("lengthAdjust")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("text",props,children :_*)
    else inlineReactElement("text",props,children :_*)
  }

  @inline
  def metadata(
                style: U[js.Any] = undefined,
                g2: U[String] = undefined,
                local: U[String] = undefined,
                paintOrder: U[String] = undefined,
                ref: U[(_ <: dom.svg.Element) => _] = undefined,
                g1: U[String] = undefined,
                xmlBase: U[String] = undefined,
                key: U[String | Int] = undefined,
                xmlSpace: U[String] = undefined,
                id: U[String] = undefined,
                xmlLang: U[String] = undefined,
                className: U[String] = undefined,
                allowReorder: U[Boolean] = undefined,
                onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("metadata",props,children :_*)
    else inlineReactElement("metadata",props,children :_*)
  }

  @inline
  def feDisplacementMap(
                         colorInterpolation: U[String] = undefined,
                         floodColor: U[String] = undefined,
                         x: U[String | Double] = undefined,
                         in: U[String] = undefined,
                         textRendering: U[String] = undefined,
                         shapeRendering: U[String] = undefined,
                         mask: U[String] = undefined,
                         overflow: U[String] = undefined,
                         strokeDasharray: U[String] = undefined,
                         textAnchor: U[String] = undefined,
                         style: U[js.Any] = undefined,
                         y: U[String | Double] = undefined,
                         strokeOpacity: U[String | Double] = undefined,
                         textDecoration: U[String] = undefined,
                         scale: U[Double] = undefined,
                         g2: U[String] = undefined,
                         stroke: U[String] = undefined,
                         clipPath: U[String] = undefined,
                         result: U[String] = undefined,
                         fillOpacity: U[String | Double] = undefined,
                         fontSizeAdjust: U[String | Double] = undefined,
                         clipRule: U[String] = undefined,
                         local: U[String] = undefined,
                         paintOrder: U[String] = undefined,
                         stopOpacity: U[String | Double] = undefined,
                         colorInterpolationFilters: U[String] = undefined,
                         height: U[Double] = undefined,
                         fontStyle: U[String] = undefined,
                         in2: U[String] = undefined,
                         ref: U[(_ <: dom.svg.Element) => _] = undefined,
                         direction: U[String] = undefined,
                         enableBackground: U[String] = undefined,
                         colorRendering: U[String] = undefined,
                         g1: U[String] = undefined,
                         cursor: U[String] = undefined,
                         yChannelSelector: U[String] = undefined,
                         xmlBase: U[String] = undefined,
                         key: U[String | Int] = undefined,
                         xmlSpace: U[String] = undefined,
                         filter: U[String] = undefined,
                         fontFamily: U[String] = undefined,
                         kerning: U[String] = undefined,
                         id: U[String] = undefined,
                         strokeDashoffset: U[String] = undefined,
                         glyphOrientationHorizontal: U[String] = undefined,
                         letterSpacing: U[String] = undefined,
                         strokeLinecap: U[String] = undefined,
                         wordSpacing: U[String | Double] = undefined,
                         xmlLang: U[String] = undefined,
                         xChannelSelector: U[String] = undefined,
                         fill: U[String] = undefined,
                         pointerEvents: U[String] = undefined,
                         floodOpacity: U[String | Double] = undefined,
                         writingMode: U[String | Double] = undefined,
                         className: U[String] = undefined,
                         fontVariant: U[String] = undefined,
                         baselineShift: U[String] = undefined,
                         fontSize: U[String | Double] = undefined,
                         strokeMiterlimit: U[String] = undefined,
                         glyphOrientationVertical: U[String] = undefined,
                         opacity: U[String] = undefined,
                         allowReorder: U[Boolean] = undefined,
                         clip: U[String] = undefined,
                         fontStretch: U[String] = undefined,
                         imageRendering: U[String] = undefined,
                         colorProfile: U[String] = undefined,
                         stopColor: U[String] = undefined,
                         strokeLinejoin: U[String] = undefined,
                         lightingColor: U[String] = undefined,
                         width: U[Double] = undefined,
                         fontWeight: U[String] = undefined,
                         visibility: U[String] = undefined,
                         unicodeBidi: U[String] = undefined,
                         strokeWidth: U[String | Double] = undefined,
                         dominantBaseline: U[String] = undefined,
                         display: U[String] = undefined,
                         fillRule: U[String] = undefined,
                         onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    yChannelSelector.foreach(v => props.updateDynamic("yChannelSelector")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    in2.foreach(v => props.updateDynamic("in2")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    scale.foreach(v => props.updateDynamic("scale")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    in.foreach(v => props.updateDynamic("in")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    xChannelSelector.foreach(v => props.updateDynamic("xChannelSelector")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feDisplacementMap",props,children :_*)
    else inlineReactElement("feDisplacementMap",props,children :_*)
  }

  @inline
  def feComposite(
                   colorInterpolation: U[String] = undefined,
                   floodColor: U[String] = undefined,
                   x: U[String | Double] = undefined,
                   k2: U[Double] = undefined,
                   in: U[String] = undefined,
                   textRendering: U[String] = undefined,
                   shapeRendering: U[String] = undefined,
                   mask: U[String] = undefined,
                   overflow: U[String] = undefined,
                   strokeDasharray: U[String] = undefined,
                   textAnchor: U[String] = undefined,
                   style: U[js.Any] = undefined,
                   y: U[String | Double] = undefined,
                   strokeOpacity: U[String | Double] = undefined,
                   textDecoration: U[String] = undefined,
                   g2: U[String] = undefined,
                   stroke: U[String] = undefined,
                   clipPath: U[String] = undefined,
                   result: U[String] = undefined,
                   fillOpacity: U[String | Double] = undefined,
                   fontSizeAdjust: U[String | Double] = undefined,
                   clipRule: U[String] = undefined,
                   local: U[String] = undefined,
                   paintOrder: U[String] = undefined,
                   stopOpacity: U[String | Double] = undefined,
                   colorInterpolationFilters: U[String] = undefined,
                   height: U[Double] = undefined,
                   fontStyle: U[String] = undefined,
                   in2: U[String] = undefined,
                   ref: U[(_ <: dom.svg.Element) => _] = undefined,
                   direction: U[String] = undefined,
                   enableBackground: U[String] = undefined,
                   colorRendering: U[String] = undefined,
                   g1: U[String] = undefined,
                   cursor: U[String] = undefined,
                   xmlBase: U[String] = undefined,
                   key: U[String | Int] = undefined,
                   xmlSpace: U[String] = undefined,
                   filter: U[String] = undefined,
                   fontFamily: U[String] = undefined,
                   kerning: U[String] = undefined,
                   id: U[String] = undefined,
                   strokeDashoffset: U[String] = undefined,
                   glyphOrientationHorizontal: U[String] = undefined,
                   letterSpacing: U[String] = undefined,
                   strokeLinecap: U[String] = undefined,
                   wordSpacing: U[String | Double] = undefined,
                   xmlLang: U[String] = undefined,
                   fill: U[String] = undefined,
                   operator: U[String] = undefined,
                   pointerEvents: U[String] = undefined,
                   floodOpacity: U[String | Double] = undefined,
                   writingMode: U[String | Double] = undefined,
                   className: U[String] = undefined,
                   fontVariant: U[String] = undefined,
                   baselineShift: U[String] = undefined,
                   fontSize: U[String | Double] = undefined,
                   strokeMiterlimit: U[String] = undefined,
                   k1: U[Double] = undefined,
                   glyphOrientationVertical: U[String] = undefined,
                   opacity: U[String] = undefined,
                   k4: U[Double] = undefined,
                   allowReorder: U[Boolean] = undefined,
                   clip: U[String] = undefined,
                   k3: U[Double] = undefined,
                   fontStretch: U[String] = undefined,
                   imageRendering: U[String] = undefined,
                   colorProfile: U[String] = undefined,
                   stopColor: U[String] = undefined,
                   strokeLinejoin: U[String] = undefined,
                   lightingColor: U[String] = undefined,
                   width: U[Double] = undefined,
                   fontWeight: U[String] = undefined,
                   visibility: U[String] = undefined,
                   unicodeBidi: U[String] = undefined,
                   strokeWidth: U[String | Double] = undefined,
                   dominantBaseline: U[String] = undefined,
                   display: U[String] = undefined,
                   fillRule: U[String] = undefined,
                   onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    k4.foreach(v => props.updateDynamic("k4")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    k2.foreach(v => props.updateDynamic("k2")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    in2.foreach(v => props.updateDynamic("in2")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    k3.foreach(v => props.updateDynamic("k3")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    operator.foreach(v => props.updateDynamic("operator")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    in.foreach(v => props.updateDynamic("in")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    k1.foreach(v => props.updateDynamic("k1")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feComposite",props,children :_*)
    else inlineReactElement("feComposite",props,children :_*)
  }

  @inline
  def rect(
            colorInterpolation: U[String] = undefined,
            floodColor: U[String] = undefined,
            x: U[String | Double] = undefined,
            textRendering: U[String] = undefined,
            shapeRendering: U[String] = undefined,
            mask: U[String] = undefined,
            overflow: U[String] = undefined,
            strokeDasharray: U[String] = undefined,
            textAnchor: U[String] = undefined,
            style: U[js.Any] = undefined,
            y: U[String | Double] = undefined,
            strokeOpacity: U[String | Double] = undefined,
            textDecoration: U[String] = undefined,
            externalResourcesRequired: U[Double] = undefined,
            g2: U[String] = undefined,
            stroke: U[String] = undefined,
            clipPath: U[String] = undefined,
            fillOpacity: U[String | Double] = undefined,
            fontSizeAdjust: U[String | Double] = undefined,
            clipRule: U[String] = undefined,
            local: U[String] = undefined,
            paintOrder: U[String] = undefined,
            stopOpacity: U[String | Double] = undefined,
            colorInterpolationFilters: U[String] = undefined,
            height: U[Double] = undefined,
            fontStyle: U[String] = undefined,
            ref: U[(_ <: dom.svg.Element) => _] = undefined,
            direction: U[String] = undefined,
            enableBackground: U[String] = undefined,
            colorRendering: U[String] = undefined,
            g1: U[String] = undefined,
            rx: U[String | Double] = undefined,
            cursor: U[String] = undefined,
            xmlBase: U[String] = undefined,
            key: U[String | Int] = undefined,
            xmlSpace: U[String] = undefined,
            filter: U[String] = undefined,
            fontFamily: U[String] = undefined,
            kerning: U[String] = undefined,
            id: U[String] = undefined,
            strokeDashoffset: U[String] = undefined,
            glyphOrientationHorizontal: U[String] = undefined,
            letterSpacing: U[String] = undefined,
            strokeLinecap: U[String] = undefined,
            wordSpacing: U[String | Double] = undefined,
            xmlLang: U[String] = undefined,
            fill: U[String] = undefined,
            systemLanguage: U[Boolean] = undefined,
            pointerEvents: U[String] = undefined,
            floodOpacity: U[String | Double] = undefined,
            writingMode: U[String | Double] = undefined,
            className: U[String] = undefined,
            fontVariant: U[String] = undefined,
            requiredExtensions: U[String] = undefined,
            baselineShift: U[String] = undefined,
            requiredFeatures: U[String] = undefined,
            fontSize: U[String | Double] = undefined,
            ry: U[String | Double] = undefined,
            strokeMiterlimit: U[String] = undefined,
            glyphOrientationVertical: U[String] = undefined,
            opacity: U[String] = undefined,
            allowReorder: U[Boolean] = undefined,
            clip: U[String] = undefined,
            fontStretch: U[String] = undefined,
            imageRendering: U[String] = undefined,
            colorProfile: U[String] = undefined,
            stopColor: U[String] = undefined,
            strokeLinejoin: U[String] = undefined,
            lightingColor: U[String] = undefined,
            transform: U[String] = undefined,
            width: U[Double] = undefined,
            fontWeight: U[String] = undefined,
            visibility: U[String] = undefined,
            unicodeBidi: U[String] = undefined,
            strokeWidth: U[String | Double] = undefined,
            dominantBaseline: U[String] = undefined,
            display: U[String] = undefined,
            fillRule: U[String] = undefined,
            onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    rx.foreach(v => props.updateDynamic("rx")(v))
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    ry.foreach(v => props.updateDynamic("ry")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("rect",props,children :_*)
    else inlineReactElement("rect",props,children :_*)
  }

  @inline
  def symbol(
              colorInterpolation: U[String] = undefined,
              floodColor: U[String] = undefined,
              textRendering: U[String] = undefined,
              shapeRendering: U[String] = undefined,
              mask: U[String] = undefined,
              overflow: U[String] = undefined,
              strokeDasharray: U[String] = undefined,
              textAnchor: U[String] = undefined,
              style: U[js.Any] = undefined,
              strokeOpacity: U[String | Double] = undefined,
              viewBox: U[String] = undefined,
              textDecoration: U[String] = undefined,
              externalResourcesRequired: U[Double] = undefined,
              g2: U[String] = undefined,
              stroke: U[String] = undefined,
              clipPath: U[String] = undefined,
              fillOpacity: U[String | Double] = undefined,
              fontSizeAdjust: U[String | Double] = undefined,
              clipRule: U[String] = undefined,
              local: U[String] = undefined,
              paintOrder: U[String] = undefined,
              stopOpacity: U[String | Double] = undefined,
              colorInterpolationFilters: U[String] = undefined,
              fontStyle: U[String] = undefined,
              ref: U[(_ <: dom.svg.Element) => _] = undefined,
              direction: U[String] = undefined,
              enableBackground: U[String] = undefined,
              colorRendering: U[String] = undefined,
              g1: U[String] = undefined,
              cursor: U[String] = undefined,
              xmlBase: U[String] = undefined,
              key: U[String | Int] = undefined,
              xmlSpace: U[String] = undefined,
              filter: U[String] = undefined,
              fontFamily: U[String] = undefined,
              kerning: U[String] = undefined,
              id: U[String] = undefined,
              strokeDashoffset: U[String] = undefined,
              glyphOrientationHorizontal: U[String] = undefined,
              letterSpacing: U[String] = undefined,
              preserveAspectRatio: U[Boolean] = undefined,
              strokeLinecap: U[String] = undefined,
              wordSpacing: U[String | Double] = undefined,
              xmlLang: U[String] = undefined,
              fill: U[String] = undefined,
              pointerEvents: U[String] = undefined,
              floodOpacity: U[String | Double] = undefined,
              writingMode: U[String | Double] = undefined,
              className: U[String] = undefined,
              fontVariant: U[String] = undefined,
              baselineShift: U[String] = undefined,
              fontSize: U[String | Double] = undefined,
              strokeMiterlimit: U[String] = undefined,
              glyphOrientationVertical: U[String] = undefined,
              opacity: U[String] = undefined,
              allowReorder: U[Boolean] = undefined,
              clip: U[String] = undefined,
              fontStretch: U[String] = undefined,
              imageRendering: U[String] = undefined,
              colorProfile: U[String] = undefined,
              stopColor: U[String] = undefined,
              strokeLinejoin: U[String] = undefined,
              lightingColor: U[String] = undefined,
              fontWeight: U[String] = undefined,
              visibility: U[String] = undefined,
              unicodeBidi: U[String] = undefined,
              strokeWidth: U[String | Double] = undefined,
              dominantBaseline: U[String] = undefined,
              display: U[String] = undefined,
              fillRule: U[String] = undefined,
              onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    viewBox.foreach(v => props.updateDynamic("viewBox")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    preserveAspectRatio.foreach(v => props.updateDynamic("preserveAspectRatio")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("symbol",props,children :_*)
    else inlineReactElement("symbol",props,children :_*)
  }

  @inline
  def meshrow(
               style: U[js.Any] = undefined,
               g2: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               g1: U[String] = undefined,
               xmlBase: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               id: U[String] = undefined,
               xmlLang: U[String] = undefined,
               className: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("meshrow",props,children :_*)
    else inlineReactElement("meshrow",props,children :_*)
  }

  @inline
  def feFuncR(
               amplitude: U[Double] = undefined,
               intercept: U[String] = undefined,
               tableValues: U[String] = undefined,
               style: U[js.Any] = undefined,
               g2: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               g1: U[String] = undefined,
               exponent: U[Double] = undefined,
               xmlBase: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               id: U[String] = undefined,
               offset: U[String | Double] = undefined,
               xmlLang: U[String] = undefined,
               className: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               `type`: U[String] = undefined,
               slope: U[String | Double] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    slope.foreach(v => props.updateDynamic("slope")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    intercept.foreach(v => props.updateDynamic("intercept")(v))
    amplitude.foreach(v => props.updateDynamic("amplitude")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    exponent.foreach(v => props.updateDynamic("exponent")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    tableValues.foreach(v => props.updateDynamic("tableValues")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    offset.foreach(v => props.updateDynamic("offset")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feFuncR",props,children :_*)
    else inlineReactElement("feFuncR",props,children :_*)
  }

  @inline
  def polygon(
               colorInterpolation: U[String] = undefined,
               floodColor: U[String] = undefined,
               textRendering: U[String] = undefined,
               shapeRendering: U[String] = undefined,
               mask: U[String] = undefined,
               overflow: U[String] = undefined,
               strokeDasharray: U[String] = undefined,
               textAnchor: U[String] = undefined,
               style: U[js.Any] = undefined,
               strokeOpacity: U[String | Double] = undefined,
               textDecoration: U[String] = undefined,
               externalResourcesRequired: U[Double] = undefined,
               g2: U[String] = undefined,
               stroke: U[String] = undefined,
               clipPath: U[String] = undefined,
               fillOpacity: U[String | Double] = undefined,
               fontSizeAdjust: U[String | Double] = undefined,
               clipRule: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               stopOpacity: U[String | Double] = undefined,
               colorInterpolationFilters: U[String] = undefined,
               fontStyle: U[String] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               direction: U[String] = undefined,
               enableBackground: U[String] = undefined,
               colorRendering: U[String] = undefined,
               g1: U[String] = undefined,
               cursor: U[String] = undefined,
               xmlBase: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               filter: U[String] = undefined,
               fontFamily: U[String] = undefined,
               points: U[String] = undefined,
               kerning: U[String] = undefined,
               id: U[String] = undefined,
               strokeDashoffset: U[String] = undefined,
               glyphOrientationHorizontal: U[String] = undefined,
               letterSpacing: U[String] = undefined,
               strokeLinecap: U[String] = undefined,
               wordSpacing: U[String | Double] = undefined,
               xmlLang: U[String] = undefined,
               fill: U[String] = undefined,
               systemLanguage: U[Boolean] = undefined,
               pointerEvents: U[String] = undefined,
               floodOpacity: U[String | Double] = undefined,
               writingMode: U[String | Double] = undefined,
               className: U[String] = undefined,
               fontVariant: U[String] = undefined,
               requiredExtensions: U[String] = undefined,
               baselineShift: U[String] = undefined,
               requiredFeatures: U[String] = undefined,
               fontSize: U[String | Double] = undefined,
               markerMid: U[String] = undefined,
               strokeMiterlimit: U[String] = undefined,
               glyphOrientationVertical: U[String] = undefined,
               opacity: U[String] = undefined,
               markerStart: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               clip: U[String] = undefined,
               fontStretch: U[String] = undefined,
               imageRendering: U[String] = undefined,
               colorProfile: U[String] = undefined,
               stopColor: U[String] = undefined,
               strokeLinejoin: U[String] = undefined,
               lightingColor: U[String] = undefined,
               transform: U[String] = undefined,
               fontWeight: U[String] = undefined,
               visibility: U[String] = undefined,
               unicodeBidi: U[String] = undefined,
               strokeWidth: U[String | Double] = undefined,
               dominantBaseline: U[String] = undefined,
               markerEnd: U[String] = undefined,
               display: U[String] = undefined,
               fillRule: U[String] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    markerEnd.foreach(v => props.updateDynamic("markerEnd")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    markerMid.foreach(v => props.updateDynamic("markerMid")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    points.foreach(v => props.updateDynamic("points")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    markerStart.foreach(v => props.updateDynamic("markerStart")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("polygon",props,children :_*)
    else inlineReactElement("polygon",props,children :_*)
  }

  @inline
  def feSpecularLighting(
                          colorInterpolation: U[String] = undefined,
                          kernelUnitLength: U[Double] = undefined,
                          floodColor: U[String] = undefined,
                          x: U[String | Double] = undefined,
                          in: U[String] = undefined,
                          textRendering: U[String] = undefined,
                          shapeRendering: U[String] = undefined,
                          mask: U[String] = undefined,
                          overflow: U[String] = undefined,
                          strokeDasharray: U[String] = undefined,
                          textAnchor: U[String] = undefined,
                          style: U[js.Any] = undefined,
                          y: U[String | Double] = undefined,
                          strokeOpacity: U[String | Double] = undefined,
                          textDecoration: U[String] = undefined,
                          g2: U[String] = undefined,
                          stroke: U[String] = undefined,
                          clipPath: U[String] = undefined,
                          result: U[String] = undefined,
                          specularExponent: U[Double] = undefined,
                          fillOpacity: U[String | Double] = undefined,
                          fontSizeAdjust: U[String | Double] = undefined,
                          clipRule: U[String] = undefined,
                          local: U[String] = undefined,
                          paintOrder: U[String] = undefined,
                          stopOpacity: U[String | Double] = undefined,
                          colorInterpolationFilters: U[String] = undefined,
                          height: U[Double] = undefined,
                          fontStyle: U[String] = undefined,
                          ref: U[(_ <: dom.svg.Element) => _] = undefined,
                          direction: U[String] = undefined,
                          enableBackground: U[String] = undefined,
                          colorRendering: U[String] = undefined,
                          g1: U[String] = undefined,
                          specularConstant: U[Int] = undefined,
                          cursor: U[String] = undefined,
                          xmlBase: U[String] = undefined,
                          key: U[String | Int] = undefined,
                          xmlSpace: U[String] = undefined,
                          filter: U[String] = undefined,
                          fontFamily: U[String] = undefined,
                          kerning: U[String] = undefined,
                          id: U[String] = undefined,
                          strokeDashoffset: U[String] = undefined,
                          glyphOrientationHorizontal: U[String] = undefined,
                          letterSpacing: U[String] = undefined,
                          strokeLinecap: U[String] = undefined,
                          wordSpacing: U[String | Double] = undefined,
                          xmlLang: U[String] = undefined,
                          fill: U[String] = undefined,
                          pointerEvents: U[String] = undefined,
                          floodOpacity: U[String | Double] = undefined,
                          writingMode: U[String | Double] = undefined,
                          className: U[String] = undefined,
                          fontVariant: U[String] = undefined,
                          baselineShift: U[String] = undefined,
                          fontSize: U[String | Double] = undefined,
                          strokeMiterlimit: U[String] = undefined,
                          glyphOrientationVertical: U[String] = undefined,
                          opacity: U[String] = undefined,
                          surfaceScale: U[Double] = undefined,
                          allowReorder: U[Boolean] = undefined,
                          clip: U[String] = undefined,
                          fontStretch: U[String] = undefined,
                          imageRendering: U[String] = undefined,
                          colorProfile: U[String] = undefined,
                          stopColor: U[String] = undefined,
                          strokeLinejoin: U[String] = undefined,
                          lightingColor: U[String] = undefined,
                          width: U[Double] = undefined,
                          fontWeight: U[String] = undefined,
                          visibility: U[String] = undefined,
                          unicodeBidi: U[String] = undefined,
                          strokeWidth: U[String | Double] = undefined,
                          dominantBaseline: U[String] = undefined,
                          display: U[String] = undefined,
                          fillRule: U[String] = undefined,
                          onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                          extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    specularExponent.foreach(v => props.updateDynamic("specularExponent")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    surfaceScale.foreach(v => props.updateDynamic("surfaceScale")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    specularConstant.foreach(v => props.updateDynamic("specularConstant")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    kernelUnitLength.foreach(v => props.updateDynamic("kernelUnitLength")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    in.foreach(v => props.updateDynamic("in")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feSpecularLighting",props,children :_*)
    else inlineReactElement("feSpecularLighting",props,children :_*)
  }

  @inline
  def view(
            style: U[js.Any] = undefined,
            viewBox: U[String] = undefined,
            externalResourcesRequired: U[Double] = undefined,
            g2: U[String] = undefined,
            local: U[String] = undefined,
            paintOrder: U[String] = undefined,
            ref: U[(_ <: dom.svg.Element) => _] = undefined,
            g1: U[String] = undefined,
            viewTarget: U[String] = undefined,
            xmlBase: U[String] = undefined,
            key: U[String | Int] = undefined,
            xmlSpace: U[String] = undefined,
            id: U[String] = undefined,
            preserveAspectRatio: U[Boolean] = undefined,
            xmlLang: U[String] = undefined,
            className: U[String] = undefined,
            allowReorder: U[Boolean] = undefined,
            zoomAndPan: U[String] = undefined,
            onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    viewBox.foreach(v => props.updateDynamic("viewBox")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    viewTarget.foreach(v => props.updateDynamic("viewTarget")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    preserveAspectRatio.foreach(v => props.updateDynamic("preserveAspectRatio")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    zoomAndPan.foreach(v => props.updateDynamic("zoomAndPan")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("view",props,children :_*)
    else inlineReactElement("view",props,children :_*)
  }

  @inline
  def svg(
           colorInterpolation: U[String] = undefined,
           floodColor: U[String] = undefined,
           x: U[String | Double] = undefined,
           contentStyleType: U[String] = undefined,
           contentScriptType: U[String] = undefined,
           textRendering: U[String] = undefined,
           shapeRendering: U[String] = undefined,
           mask: U[String] = undefined,
           overflow: U[String] = undefined,
           strokeDasharray: U[String] = undefined,
           textAnchor: U[String] = undefined,
           style: U[js.Any] = undefined,
           y: U[String | Double] = undefined,
           strokeOpacity: U[String | Double] = undefined,
           viewBox: U[String] = undefined,
           textDecoration: U[String] = undefined,
           externalResourcesRequired: U[Double] = undefined,
           g2: U[String] = undefined,
           stroke: U[String] = undefined,
           clipPath: U[String] = undefined,
           fillOpacity: U[String | Double] = undefined,
           fontSizeAdjust: U[String | Double] = undefined,
           clipRule: U[String] = undefined,
           local: U[String] = undefined,
           paintOrder: U[String] = undefined,
           stopOpacity: U[String | Double] = undefined,
           colorInterpolationFilters: U[String] = undefined,
           height: U[Double] = undefined,
           fontStyle: U[String] = undefined,
           ref: U[(_ <: dom.svg.Element) => _] = undefined,
           direction: U[String] = undefined,
           enableBackground: U[String] = undefined,
           colorRendering: U[String] = undefined,
           g1: U[String] = undefined,
           cursor: U[String] = undefined,
           xmlBase: U[String] = undefined,
           key: U[String | Int] = undefined,
           xmlSpace: U[String] = undefined,
           filter: U[String] = undefined,
           version: U[String] = undefined,
           fontFamily: U[String] = undefined,
           kerning: U[String] = undefined,
           id: U[String] = undefined,
           strokeDashoffset: U[String] = undefined,
           glyphOrientationHorizontal: U[String] = undefined,
           letterSpacing: U[String] = undefined,
           preserveAspectRatio: U[Boolean] = undefined,
           strokeLinecap: U[String] = undefined,
           baseProfile: U[String] = undefined,
           wordSpacing: U[String | Double] = undefined,
           xmlLang: U[String] = undefined,
           fill: U[String] = undefined,
           systemLanguage: U[Boolean] = undefined,
           pointerEvents: U[String] = undefined,
           floodOpacity: U[String | Double] = undefined,
           writingMode: U[String | Double] = undefined,
           className: U[String] = undefined,
           fontVariant: U[String] = undefined,
           requiredExtensions: U[String] = undefined,
           baselineShift: U[String] = undefined,
           requiredFeatures: U[String] = undefined,
           fontSize: U[String | Double] = undefined,
           strokeMiterlimit: U[String] = undefined,
           glyphOrientationVertical: U[String] = undefined,
           opacity: U[String] = undefined,
           allowReorder: U[Boolean] = undefined,
           clip: U[String] = undefined,
           fontStretch: U[String] = undefined,
           imageRendering: U[String] = undefined,
           colorProfile: U[String] = undefined,
           stopColor: U[String] = undefined,
           strokeLinejoin: U[String] = undefined,
           lightingColor: U[String] = undefined,
           width: U[Double] = undefined,
           fontWeight: U[String] = undefined,
           visibility: U[String] = undefined,
           unicodeBidi: U[String] = undefined,
           strokeWidth: U[String | Double] = undefined,
           dominantBaseline: U[String] = undefined,
           zoomAndPan: U[String] = undefined,
           display: U[String] = undefined,
           fillRule: U[String] = undefined,
           onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    viewBox.foreach(v => props.updateDynamic("viewBox")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    version.foreach(v => props.updateDynamic("version")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    contentStyleType.foreach(v => props.updateDynamic("contentStyleType")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    preserveAspectRatio.foreach(v => props.updateDynamic("preserveAspectRatio")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    contentScriptType.foreach(v => props.updateDynamic("contentScriptType")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    zoomAndPan.foreach(v => props.updateDynamic("zoomAndPan")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    baseProfile.foreach(v => props.updateDynamic("baseProfile")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("svg",props,children :_*)
    else inlineReactElement("svg",props,children :_*)
  }

  @inline
  def mpath(
             xlinkRole: U[String] = undefined,
             xlinkShow: U[String] = undefined,
             xlinkActuate: U[String] = undefined,
             style: U[js.Any] = undefined,
             externalResourcesRequired: U[Double] = undefined,
             g2: U[String] = undefined,
             local: U[String] = undefined,
             paintOrder: U[String] = undefined,
             ref: U[(_ <: dom.svg.Element) => _] = undefined,
             g1: U[String] = undefined,
             xmlBase: U[String] = undefined,
             key: U[String | Int] = undefined,
             xmlSpace: U[String] = undefined,
             xlinkHref: U[String] = undefined,
             id: U[String] = undefined,
             xmlLang: U[String] = undefined,
             xlinkType: U[String] = undefined,
             className: U[String] = undefined,
             xlinkArcrole: U[String] = undefined,
             allowReorder: U[Boolean] = undefined,
             xlinkTitle: U[String] = undefined,
             onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    xlinkRole.foreach(v => props.updateDynamic("xlinkRole")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    xlinkArcrole.foreach(v => props.updateDynamic("xlinkArcrole")(v))
    xlinkTitle.foreach(v => props.updateDynamic("xlinkTitle")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    xlinkShow.foreach(v => props.updateDynamic("xlinkShow")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xlinkHref.foreach(v => props.updateDynamic("xlinkHref")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("mpath",props,children :_*)
    else inlineReactElement("mpath",props,children :_*)
  }

  @inline
  def desc(
            style: U[js.Any] = undefined,
            g2: U[String] = undefined,
            local: U[String] = undefined,
            paintOrder: U[String] = undefined,
            ref: U[(_ <: dom.svg.Element) => _] = undefined,
            g1: U[String] = undefined,
            xmlBase: U[String] = undefined,
            key: U[String | Int] = undefined,
            xmlSpace: U[String] = undefined,
            id: U[String] = undefined,
            xmlLang: U[String] = undefined,
            className: U[String] = undefined,
            allowReorder: U[Boolean] = undefined,
            onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("desc",props,children :_*)
    else inlineReactElement("desc",props,children :_*)
  }

  @inline
  def feBlend(
               colorInterpolation: U[String] = undefined,
               floodColor: U[String] = undefined,
               x: U[String | Double] = undefined,
               in: U[String] = undefined,
               textRendering: U[String] = undefined,
               shapeRendering: U[String] = undefined,
               mask: U[String] = undefined,
               overflow: U[String] = undefined,
               strokeDasharray: U[String] = undefined,
               textAnchor: U[String] = undefined,
               style: U[js.Any] = undefined,
               y: U[String | Double] = undefined,
               strokeOpacity: U[String | Double] = undefined,
               textDecoration: U[String] = undefined,
               g2: U[String] = undefined,
               stroke: U[String] = undefined,
               clipPath: U[String] = undefined,
               result: U[String] = undefined,
               fillOpacity: U[String | Double] = undefined,
               fontSizeAdjust: U[String | Double] = undefined,
               clipRule: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               stopOpacity: U[String | Double] = undefined,
               colorInterpolationFilters: U[String] = undefined,
               height: U[Double] = undefined,
               fontStyle: U[String] = undefined,
               in2: U[String] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               direction: U[String] = undefined,
               enableBackground: U[String] = undefined,
               colorRendering: U[String] = undefined,
               g1: U[String] = undefined,
               cursor: U[String] = undefined,
               xmlBase: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               filter: U[String] = undefined,
               fontFamily: U[String] = undefined,
               kerning: U[String] = undefined,
               id: U[String] = undefined,
               strokeDashoffset: U[String] = undefined,
               glyphOrientationHorizontal: U[String] = undefined,
               letterSpacing: U[String] = undefined,
               strokeLinecap: U[String] = undefined,
               wordSpacing: U[String | Double] = undefined,
               xmlLang: U[String] = undefined,
               fill: U[String] = undefined,
               pointerEvents: U[String] = undefined,
               floodOpacity: U[String | Double] = undefined,
               writingMode: U[String | Double] = undefined,
               className: U[String] = undefined,
               fontVariant: U[String] = undefined,
               baselineShift: U[String] = undefined,
               fontSize: U[String | Double] = undefined,
               mode: U[String] = undefined,
               strokeMiterlimit: U[String] = undefined,
               glyphOrientationVertical: U[String] = undefined,
               opacity: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               clip: U[String] = undefined,
               fontStretch: U[String] = undefined,
               imageRendering: U[String] = undefined,
               colorProfile: U[String] = undefined,
               stopColor: U[String] = undefined,
               strokeLinejoin: U[String] = undefined,
               lightingColor: U[String] = undefined,
               width: U[Double] = undefined,
               fontWeight: U[String] = undefined,
               visibility: U[String] = undefined,
               unicodeBidi: U[String] = undefined,
               strokeWidth: U[String | Double] = undefined,
               dominantBaseline: U[String] = undefined,
               display: U[String] = undefined,
               fillRule: U[String] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    in2.foreach(v => props.updateDynamic("in2")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    mode.foreach(v => props.updateDynamic("mode")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    in.foreach(v => props.updateDynamic("in")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feBlend",props,children :_*)
    else inlineReactElement("feBlend",props,children :_*)
  }

  @inline
  def feOffset(
                colorInterpolation: U[String] = undefined,
                floodColor: U[String] = undefined,
                x: U[String | Double] = undefined,
                in: U[String] = undefined,
                textRendering: U[String] = undefined,
                shapeRendering: U[String] = undefined,
                dy: U[Double] = undefined,
                mask: U[String] = undefined,
                overflow: U[String] = undefined,
                strokeDasharray: U[String] = undefined,
                textAnchor: U[String] = undefined,
                style: U[js.Any] = undefined,
                y: U[String | Double] = undefined,
                strokeOpacity: U[String | Double] = undefined,
                textDecoration: U[String] = undefined,
                g2: U[String] = undefined,
                stroke: U[String] = undefined,
                clipPath: U[String] = undefined,
                result: U[String] = undefined,
                fillOpacity: U[String | Double] = undefined,
                fontSizeAdjust: U[String | Double] = undefined,
                clipRule: U[String] = undefined,
                local: U[String] = undefined,
                paintOrder: U[String] = undefined,
                stopOpacity: U[String | Double] = undefined,
                colorInterpolationFilters: U[String] = undefined,
                height: U[Double] = undefined,
                fontStyle: U[String] = undefined,
                ref: U[(_ <: dom.svg.Element) => _] = undefined,
                direction: U[String] = undefined,
                enableBackground: U[String] = undefined,
                colorRendering: U[String] = undefined,
                g1: U[String] = undefined,
                cursor: U[String] = undefined,
                xmlBase: U[String] = undefined,
                key: U[String | Int] = undefined,
                xmlSpace: U[String] = undefined,
                filter: U[String] = undefined,
                fontFamily: U[String] = undefined,
                kerning: U[String] = undefined,
                id: U[String] = undefined,
                strokeDashoffset: U[String] = undefined,
                glyphOrientationHorizontal: U[String] = undefined,
                letterSpacing: U[String] = undefined,
                strokeLinecap: U[String] = undefined,
                wordSpacing: U[String | Double] = undefined,
                xmlLang: U[String] = undefined,
                fill: U[String] = undefined,
                pointerEvents: U[String] = undefined,
                floodOpacity: U[String | Double] = undefined,
                writingMode: U[String | Double] = undefined,
                className: U[String] = undefined,
                fontVariant: U[String] = undefined,
                baselineShift: U[String] = undefined,
                fontSize: U[String | Double] = undefined,
                strokeMiterlimit: U[String] = undefined,
                glyphOrientationVertical: U[String] = undefined,
                opacity: U[String] = undefined,
                dx: U[Double] = undefined,
                allowReorder: U[Boolean] = undefined,
                clip: U[String] = undefined,
                fontStretch: U[String] = undefined,
                imageRendering: U[String] = undefined,
                colorProfile: U[String] = undefined,
                stopColor: U[String] = undefined,
                strokeLinejoin: U[String] = undefined,
                lightingColor: U[String] = undefined,
                width: U[Double] = undefined,
                fontWeight: U[String] = undefined,
                visibility: U[String] = undefined,
                unicodeBidi: U[String] = undefined,
                strokeWidth: U[String | Double] = undefined,
                dominantBaseline: U[String] = undefined,
                display: U[String] = undefined,
                fillRule: U[String] = undefined,
                onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    dy.foreach(v => props.updateDynamic("dy")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    dx.foreach(v => props.updateDynamic("dx")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    in.foreach(v => props.updateDynamic("in")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feOffset",props,children :_*)
    else inlineReactElement("feOffset",props,children :_*)
  }

  @inline
  def animate(
               floodColor: U[String] = undefined,
               begin: U[String] = undefined,
               xlinkRole: U[String] = undefined,
               accumulate: U[String] = undefined,
               keyTimes: U[String] = undefined,
               xlinkShow: U[String] = undefined,
               xlinkActuate: U[String] = undefined,
               style: U[js.Any] = undefined,
               externalResourcesRequired: U[Double] = undefined,
               g2: U[String] = undefined,
               fillOpacity: U[String | Double] = undefined,
               additive: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               calcMode: U[String] = undefined,
               repeatDur: U[String] = undefined,
               dur: U[String | Double] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               g1: U[String] = undefined,
               xmlBase: U[String] = undefined,
               to: U[String | Double] = undefined,
               attributeName: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               filter: U[String] = undefined,
               repeatCount: U[String | Int] = undefined,
               xlinkHref: U[String] = undefined,
               id: U[String] = undefined,
               xmlLang: U[String] = undefined,
               fill: U[String] = undefined,
               systemLanguage: U[Boolean] = undefined,
               by: U[Double] = undefined,
               floodOpacity: U[String | Double] = undefined,
               xlinkType: U[String] = undefined,
               className: U[String] = undefined,
               xlinkArcrole: U[String] = undefined,
               from: U[Double] = undefined,
               requiredExtensions: U[String] = undefined,
               requiredFeatures: U[String] = undefined,
               end: U[Double] = undefined,
               values: U[String] = undefined,
               attributeType: U[String] = undefined,
               keySplines: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               restart: U[String] = undefined,
               xlinkTitle: U[String] = undefined,
               fillRule: U[String] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    from.foreach(v => props.updateDynamic("from")(v))
    values.foreach(v => props.updateDynamic("values")(v))
    begin.foreach(v => props.updateDynamic("begin")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    repeatCount.foreach(v => props.updateDynamic("repeatCount")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    xlinkRole.foreach(v => props.updateDynamic("xlinkRole")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    to.foreach(v => props.updateDynamic("to")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    xlinkArcrole.foreach(v => props.updateDynamic("xlinkArcrole")(v))
    xlinkTitle.foreach(v => props.updateDynamic("xlinkTitle")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    calcMode.foreach(v => props.updateDynamic("calcMode")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    xlinkShow.foreach(v => props.updateDynamic("xlinkShow")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    end.foreach(v => props.updateDynamic("end")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    keySplines.foreach(v => props.updateDynamic("keySplines")(v))
    xlinkHref.foreach(v => props.updateDynamic("xlinkHref")(v))
    dur.foreach(v => props.updateDynamic("dur")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    restart.foreach(v => props.updateDynamic("restart")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    by.foreach(v => props.updateDynamic("by")(v))
    attributeType.foreach(v => props.updateDynamic("attributeType")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    keyTimes.foreach(v => props.updateDynamic("keyTimes")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    repeatDur.foreach(v => props.updateDynamic("repeatDur")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    additive.foreach(v => props.updateDynamic("additive")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    accumulate.foreach(v => props.updateDynamic("accumulate")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    attributeName.foreach(v => props.updateDynamic("attributeName")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("animate",props,children :_*)
    else inlineReactElement("animate",props,children :_*)
  }

  @inline
  def radialGradient(
                      colorInterpolation: U[String] = undefined,
                      floodColor: U[String] = undefined,
                      xlinkRole: U[String] = undefined,
                      textRendering: U[String] = undefined,
                      shapeRendering: U[String] = undefined,
                      mask: U[String] = undefined,
                      overflow: U[String] = undefined,
                      xlinkShow: U[String] = undefined,
                      strokeDasharray: U[String] = undefined,
                      textAnchor: U[String] = undefined,
                      xlinkActuate: U[String] = undefined,
                      style: U[js.Any] = undefined,
                      strokeOpacity: U[String | Double] = undefined,
                      cx: U[String | Double] = undefined,
                      textDecoration: U[String] = undefined,
                      externalResourcesRequired: U[Double] = undefined,
                      g2: U[String] = undefined,
                      stroke: U[String] = undefined,
                      clipPath: U[String] = undefined,
                      fillOpacity: U[String | Double] = undefined,
                      fontSizeAdjust: U[String | Double] = undefined,
                      clipRule: U[String] = undefined,
                      fx: U[Double] = undefined,
                      local: U[String] = undefined,
                      paintOrder: U[String] = undefined,
                      stopOpacity: U[String | Double] = undefined,
                      colorInterpolationFilters: U[String] = undefined,
                      fontStyle: U[String] = undefined,
                      ref: U[(_ <: dom.svg.Element) => _] = undefined,
                      direction: U[String] = undefined,
                      enableBackground: U[String] = undefined,
                      colorRendering: U[String] = undefined,
                      g1: U[String] = undefined,
                      cursor: U[String] = undefined,
                      cy: U[String | Double] = undefined,
                      xmlBase: U[String] = undefined,
                      key: U[String | Int] = undefined,
                      xmlSpace: U[String] = undefined,
                      filter: U[String] = undefined,
                      gradientTransform: U[String] = undefined,
                      fy: U[Double] = undefined,
                      xlinkHref: U[String] = undefined,
                      fontFamily: U[String] = undefined,
                      gradientUnits: U[String] = undefined,
                      kerning: U[String] = undefined,
                      id: U[String] = undefined,
                      strokeDashoffset: U[String] = undefined,
                      glyphOrientationHorizontal: U[String] = undefined,
                      letterSpacing: U[String] = undefined,
                      strokeLinecap: U[String] = undefined,
                      wordSpacing: U[String | Double] = undefined,
                      xmlLang: U[String] = undefined,
                      fill: U[String] = undefined,
                      pointerEvents: U[String] = undefined,
                      floodOpacity: U[String | Double] = undefined,
                      writingMode: U[String | Double] = undefined,
                      xlinkType: U[String] = undefined,
                      className: U[String] = undefined,
                      xlinkArcrole: U[String] = undefined,
                      fontVariant: U[String] = undefined,
                      baselineShift: U[String] = undefined,
                      fontSize: U[String | Double] = undefined,
                      strokeMiterlimit: U[String] = undefined,
                      glyphOrientationVertical: U[String] = undefined,
                      opacity: U[String] = undefined,
                      allowReorder: U[Boolean] = undefined,
                      r: U[String | Double] = undefined,
                      clip: U[String] = undefined,
                      fontStretch: U[String] = undefined,
                      imageRendering: U[String] = undefined,
                      xlinkTitle: U[String] = undefined,
                      colorProfile: U[String] = undefined,
                      stopColor: U[String] = undefined,
                      strokeLinejoin: U[String] = undefined,
                      lightingColor: U[String] = undefined,
                      fontWeight: U[String] = undefined,
                      visibility: U[String] = undefined,
                      unicodeBidi: U[String] = undefined,
                      strokeWidth: U[String | Double] = undefined,
                      dominantBaseline: U[String] = undefined,
                      spreadMethod: U[String] = undefined,
                      display: U[String] = undefined,
                      fillRule: U[String] = undefined,
                      onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                      extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    xlinkRole.foreach(v => props.updateDynamic("xlinkRole")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    xlinkArcrole.foreach(v => props.updateDynamic("xlinkArcrole")(v))
    xlinkTitle.foreach(v => props.updateDynamic("xlinkTitle")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    cy.foreach(v => props.updateDynamic("cy")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    gradientUnits.foreach(v => props.updateDynamic("gradientUnits")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    xlinkShow.foreach(v => props.updateDynamic("xlinkShow")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    cx.foreach(v => props.updateDynamic("cx")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xlinkHref.foreach(v => props.updateDynamic("xlinkHref")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    fy.foreach(v => props.updateDynamic("fy")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    fx.foreach(v => props.updateDynamic("fx")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    r.foreach(v => props.updateDynamic("r")(v))
    spreadMethod.foreach(v => props.updateDynamic("spreadMethod")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    gradientTransform.foreach(v => props.updateDynamic("gradientTransform")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("radialGradient",props,children :_*)
    else inlineReactElement("radialGradient",props,children :_*)
  }

  @inline
  def foreignObject(
                     colorInterpolation: U[String] = undefined,
                     floodColor: U[String] = undefined,
                     x: U[String | Double] = undefined,
                     textRendering: U[String] = undefined,
                     shapeRendering: U[String] = undefined,
                     mask: U[String] = undefined,
                     overflow: U[String] = undefined,
                     strokeDasharray: U[String] = undefined,
                     textAnchor: U[String] = undefined,
                     style: U[js.Any] = undefined,
                     y: U[String | Double] = undefined,
                     strokeOpacity: U[String | Double] = undefined,
                     textDecoration: U[String] = undefined,
                     externalResourcesRequired: U[Double] = undefined,
                     g2: U[String] = undefined,
                     stroke: U[String] = undefined,
                     clipPath: U[String] = undefined,
                     fillOpacity: U[String | Double] = undefined,
                     fontSizeAdjust: U[String | Double] = undefined,
                     clipRule: U[String] = undefined,
                     local: U[String] = undefined,
                     paintOrder: U[String] = undefined,
                     stopOpacity: U[String | Double] = undefined,
                     colorInterpolationFilters: U[String] = undefined,
                     height: U[Double] = undefined,
                     fontStyle: U[String] = undefined,
                     ref: U[(_ <: dom.svg.Element) => _] = undefined,
                     direction: U[String] = undefined,
                     enableBackground: U[String] = undefined,
                     colorRendering: U[String] = undefined,
                     g1: U[String] = undefined,
                     cursor: U[String] = undefined,
                     xmlBase: U[String] = undefined,
                     key: U[String | Int] = undefined,
                     xmlSpace: U[String] = undefined,
                     filter: U[String] = undefined,
                     fontFamily: U[String] = undefined,
                     kerning: U[String] = undefined,
                     id: U[String] = undefined,
                     strokeDashoffset: U[String] = undefined,
                     glyphOrientationHorizontal: U[String] = undefined,
                     letterSpacing: U[String] = undefined,
                     strokeLinecap: U[String] = undefined,
                     wordSpacing: U[String | Double] = undefined,
                     xmlLang: U[String] = undefined,
                     fill: U[String] = undefined,
                     systemLanguage: U[Boolean] = undefined,
                     pointerEvents: U[String] = undefined,
                     floodOpacity: U[String | Double] = undefined,
                     writingMode: U[String | Double] = undefined,
                     className: U[String] = undefined,
                     fontVariant: U[String] = undefined,
                     requiredExtensions: U[String] = undefined,
                     baselineShift: U[String] = undefined,
                     requiredFeatures: U[String] = undefined,
                     fontSize: U[String | Double] = undefined,
                     strokeMiterlimit: U[String] = undefined,
                     glyphOrientationVertical: U[String] = undefined,
                     opacity: U[String] = undefined,
                     allowReorder: U[Boolean] = undefined,
                     clip: U[String] = undefined,
                     fontStretch: U[String] = undefined,
                     imageRendering: U[String] = undefined,
                     colorProfile: U[String] = undefined,
                     stopColor: U[String] = undefined,
                     strokeLinejoin: U[String] = undefined,
                     lightingColor: U[String] = undefined,
                     transform: U[String] = undefined,
                     width: U[Double] = undefined,
                     fontWeight: U[String] = undefined,
                     visibility: U[String] = undefined,
                     unicodeBidi: U[String] = undefined,
                     strokeWidth: U[String | Double] = undefined,
                     dominantBaseline: U[String] = undefined,
                     display: U[String] = undefined,
                     fillRule: U[String] = undefined,
                     onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                     extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("foreignObject",props,children :_*)
    else inlineReactElement("foreignObject",props,children :_*)
  }

  @inline
  def solidcolor(
                  style: U[js.Any] = undefined,
                  g2: U[String] = undefined,
                  local: U[String] = undefined,
                  paintOrder: U[String] = undefined,
                  ref: U[(_ <: dom.svg.Element) => _] = undefined,
                  g1: U[String] = undefined,
                  xmlBase: U[String] = undefined,
                  key: U[String | Int] = undefined,
                  xmlSpace: U[String] = undefined,
                  id: U[String] = undefined,
                  xmlLang: U[String] = undefined,
                  className: U[String] = undefined,
                  allowReorder: U[Boolean] = undefined,
                  onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                  extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("solidcolor",props,children :_*)
    else inlineReactElement("solidcolor",props,children :_*)
  }

  @inline
  def tspan(
             colorInterpolation: U[String] = undefined,
             floodColor: U[String] = undefined,
             x: U[String | Double] = undefined,
             textRendering: U[String] = undefined,
             shapeRendering: U[String] = undefined,
             dy: U[Double] = undefined,
             mask: U[String] = undefined,
             overflow: U[String] = undefined,
             strokeDasharray: U[String] = undefined,
             textAnchor: U[String] = undefined,
             style: U[js.Any] = undefined,
             y: U[String | Double] = undefined,
             strokeOpacity: U[String | Double] = undefined,
             textDecoration: U[String] = undefined,
             externalResourcesRequired: U[Double] = undefined,
             g2: U[String] = undefined,
             stroke: U[String] = undefined,
             clipPath: U[String] = undefined,
             fillOpacity: U[String | Double] = undefined,
             fontSizeAdjust: U[String | Double] = undefined,
             clipRule: U[String] = undefined,
             local: U[String] = undefined,
             paintOrder: U[String] = undefined,
             stopOpacity: U[String | Double] = undefined,
             colorInterpolationFilters: U[String] = undefined,
             fontStyle: U[String] = undefined,
             ref: U[(_ <: dom.svg.Element) => _] = undefined,
             direction: U[String] = undefined,
             enableBackground: U[String] = undefined,
             colorRendering: U[String] = undefined,
             g1: U[String] = undefined,
             cursor: U[String] = undefined,
             xmlBase: U[String] = undefined,
             key: U[String | Int] = undefined,
             xmlSpace: U[String] = undefined,
             filter: U[String] = undefined,
             rotate: U[String | Double] = undefined,
             lengthAdjust: U[String] = undefined,
             fontFamily: U[String] = undefined,
             kerning: U[String] = undefined,
             id: U[String] = undefined,
             strokeDashoffset: U[String] = undefined,
             glyphOrientationHorizontal: U[String] = undefined,
             letterSpacing: U[String] = undefined,
             strokeLinecap: U[String] = undefined,
             wordSpacing: U[String | Double] = undefined,
             xmlLang: U[String] = undefined,
             fill: U[String] = undefined,
             systemLanguage: U[Boolean] = undefined,
             pointerEvents: U[String] = undefined,
             floodOpacity: U[String | Double] = undefined,
             writingMode: U[String | Double] = undefined,
             className: U[String] = undefined,
             fontVariant: U[String] = undefined,
             requiredExtensions: U[String] = undefined,
             baselineShift: U[String] = undefined,
             requiredFeatures: U[String] = undefined,
             fontSize: U[String | Double] = undefined,
             strokeMiterlimit: U[String] = undefined,
             glyphOrientationVertical: U[String] = undefined,
             opacity: U[String] = undefined,
             alignmentBaseline: U[String] = undefined,
             dx: U[Double] = undefined,
             allowReorder: U[Boolean] = undefined,
             clip: U[String] = undefined,
             fontStretch: U[String] = undefined,
             imageRendering: U[String] = undefined,
             colorProfile: U[String] = undefined,
             stopColor: U[String] = undefined,
             strokeLinejoin: U[String] = undefined,
             lightingColor: U[String] = undefined,
             fontWeight: U[String] = undefined,
             visibility: U[String] = undefined,
             unicodeBidi: U[String] = undefined,
             strokeWidth: U[String | Double] = undefined,
             dominantBaseline: U[String] = undefined,
             textLength: U[String | Double] = undefined,
             display: U[String] = undefined,
             fillRule: U[String] = undefined,
             onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    rotate.foreach(v => props.updateDynamic("rotate")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    alignmentBaseline.foreach(v => props.updateDynamic("alignmentBaseline")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    textLength.foreach(v => props.updateDynamic("textLength")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    dy.foreach(v => props.updateDynamic("dy")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    dx.foreach(v => props.updateDynamic("dx")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    lengthAdjust.foreach(v => props.updateDynamic("lengthAdjust")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("tspan",props,children :_*)
    else inlineReactElement("tspan",props,children :_*)
  }

  @inline
  def aSvg(
            colorInterpolation: U[String] = undefined,
            floodColor: U[String] = undefined,
            xlinkRole: U[String] = undefined,
            textRendering: U[String] = undefined,
            shapeRendering: U[String] = undefined,
            mask: U[String] = undefined,
            overflow: U[String] = undefined,
            xlinkShow: U[String] = undefined,
            strokeDasharray: U[String] = undefined,
            textAnchor: U[String] = undefined,
            xlinkActuate: U[String] = undefined,
            style: U[js.Any] = undefined,
            strokeOpacity: U[String | Double] = undefined,
            textDecoration: U[String] = undefined,
            externalResourcesRequired: U[Double] = undefined,
            g2: U[String] = undefined,
            stroke: U[String] = undefined,
            clipPath: U[String] = undefined,
            fillOpacity: U[String | Double] = undefined,
            fontSizeAdjust: U[String | Double] = undefined,
            clipRule: U[String] = undefined,
            local: U[String] = undefined,
            paintOrder: U[String] = undefined,
            stopOpacity: U[String | Double] = undefined,
            colorInterpolationFilters: U[String] = undefined,
            fontStyle: U[String] = undefined,
            ref: U[(_ <: dom.svg.Element) => _] = undefined,
            direction: U[String] = undefined,
            enableBackground: U[String] = undefined,
            colorRendering: U[String] = undefined,
            g1: U[String] = undefined,
            cursor: U[String] = undefined,
            xmlBase: U[String] = undefined,
            key: U[String | Int] = undefined,
            xmlSpace: U[String] = undefined,
            filter: U[String] = undefined,
            xlinkHref: U[String] = undefined,
            fontFamily: U[String] = undefined,
            kerning: U[String] = undefined,
            id: U[String] = undefined,
            strokeDashoffset: U[String] = undefined,
            glyphOrientationHorizontal: U[String] = undefined,
            letterSpacing: U[String] = undefined,
            strokeLinecap: U[String] = undefined,
            wordSpacing: U[String | Double] = undefined,
            xmlLang: U[String] = undefined,
            fill: U[String] = undefined,
            systemLanguage: U[Boolean] = undefined,
            pointerEvents: U[String] = undefined,
            floodOpacity: U[String | Double] = undefined,
            writingMode: U[String | Double] = undefined,
            xlinkType: U[String] = undefined,
            className: U[String] = undefined,
            xlinkArcrole: U[String] = undefined,
            fontVariant: U[String] = undefined,
            requiredExtensions: U[String] = undefined,
            baselineShift: U[String] = undefined,
            requiredFeatures: U[String] = undefined,
            fontSize: U[String | Double] = undefined,
            strokeMiterlimit: U[String] = undefined,
            target: U[String] = undefined,
            glyphOrientationVertical: U[String] = undefined,
            opacity: U[String] = undefined,
            allowReorder: U[Boolean] = undefined,
            clip: U[String] = undefined,
            fontStretch: U[String] = undefined,
            imageRendering: U[String] = undefined,
            xlinkTitle: U[String] = undefined,
            colorProfile: U[String] = undefined,
            stopColor: U[String] = undefined,
            strokeLinejoin: U[String] = undefined,
            lightingColor: U[String] = undefined,
            transform: U[String] = undefined,
            fontWeight: U[String] = undefined,
            visibility: U[String] = undefined,
            unicodeBidi: U[String] = undefined,
            strokeWidth: U[String | Double] = undefined,
            dominantBaseline: U[String] = undefined,
            display: U[String] = undefined,
            fillRule: U[String] = undefined,
            onDurationChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onStalled: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSuspend: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPause: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onWaiting: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onEnded: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSeeking: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCanPlayThrough: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSeeked: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onLoadedMetadata: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onRateChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTimeUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onVolumeChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPlaying: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onLoadStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onLoadedData: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onProgress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onEncrypted: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCanPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onEmptied: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAbort: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    onAbort.foreach(v => props.updateDynamic("onAbort")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    xlinkRole.foreach(v => props.updateDynamic("xlinkRole")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    xlinkArcrole.foreach(v => props.updateDynamic("xlinkArcrole")(v))
    xlinkTitle.foreach(v => props.updateDynamic("xlinkTitle")(v))
    onError.foreach(v => props.updateDynamic("onError")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onPlay.foreach(v => props.updateDynamic("onPlay")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    xlinkShow.foreach(v => props.updateDynamic("xlinkShow")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
    onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xlinkHref.foreach(v => props.updateDynamic("xlinkHref")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    onEnded.foreach(v => props.updateDynamic("onEnded")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    onStalled.foreach(v => props.updateDynamic("onStalled")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onPause.foreach(v => props.updateDynamic("onPause")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    onProgress.foreach(v => props.updateDynamic("onProgress")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
    target.foreach(v => props.updateDynamic("target")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("a",props,children :_*)
    else inlineReactElement("a",props,children :_*)
  }

  @inline
  def feFuncA(
               amplitude: U[Double] = undefined,
               intercept: U[String] = undefined,
               tableValues: U[String] = undefined,
               style: U[js.Any] = undefined,
               g2: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               g1: U[String] = undefined,
               exponent: U[Double] = undefined,
               xmlBase: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               id: U[String] = undefined,
               offset: U[String | Double] = undefined,
               xmlLang: U[String] = undefined,
               className: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               `type`: U[String] = undefined,
               slope: U[String | Double] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    slope.foreach(v => props.updateDynamic("slope")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    intercept.foreach(v => props.updateDynamic("intercept")(v))
    amplitude.foreach(v => props.updateDynamic("amplitude")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    exponent.foreach(v => props.updateDynamic("exponent")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    tableValues.foreach(v => props.updateDynamic("tableValues")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    offset.foreach(v => props.updateDynamic("offset")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feFuncA",props,children :_*)
    else inlineReactElement("feFuncA",props,children :_*)
  }

  @inline
  def cursor(
              x: U[String | Double] = undefined,
              xlinkRole: U[String] = undefined,
              xlinkShow: U[String] = undefined,
              xlinkActuate: U[String] = undefined,
              style: U[js.Any] = undefined,
              y: U[String | Double] = undefined,
              externalResourcesRequired: U[Double] = undefined,
              g2: U[String] = undefined,
              local: U[String] = undefined,
              paintOrder: U[String] = undefined,
              ref: U[(_ <: dom.svg.Element) => _] = undefined,
              g1: U[String] = undefined,
              xmlBase: U[String] = undefined,
              key: U[String | Int] = undefined,
              xmlSpace: U[String] = undefined,
              xlinkHref: U[String] = undefined,
              id: U[String] = undefined,
              xmlLang: U[String] = undefined,
              systemLanguage: U[Boolean] = undefined,
              xlinkType: U[String] = undefined,
              className: U[String] = undefined,
              xlinkArcrole: U[String] = undefined,
              requiredExtensions: U[String] = undefined,
              requiredFeatures: U[String] = undefined,
              allowReorder: U[Boolean] = undefined,
              xlinkTitle: U[String] = undefined,
              onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
              extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    xlinkRole.foreach(v => props.updateDynamic("xlinkRole")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    xlinkArcrole.foreach(v => props.updateDynamic("xlinkArcrole")(v))
    xlinkTitle.foreach(v => props.updateDynamic("xlinkTitle")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    xlinkShow.foreach(v => props.updateDynamic("xlinkShow")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    xlinkHref.foreach(v => props.updateDynamic("xlinkHref")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("cursor",props,children :_*)
    else inlineReactElement("cursor",props,children :_*)
  }

  @inline
  def hatch(
             style: U[js.Any] = undefined,
             g2: U[String] = undefined,
             local: U[String] = undefined,
             paintOrder: U[String] = undefined,
             ref: U[(_ <: dom.svg.Element) => _] = undefined,
             g1: U[String] = undefined,
             xmlBase: U[String] = undefined,
             key: U[String | Int] = undefined,
             xmlSpace: U[String] = undefined,
             id: U[String] = undefined,
             xmlLang: U[String] = undefined,
             className: U[String] = undefined,
             allowReorder: U[Boolean] = undefined,
             onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
             extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("hatch",props,children :_*)
    else inlineReactElement("hatch",props,children :_*)
  }

  @inline
  def feDiffuseLighting(
                         colorInterpolation: U[String] = undefined,
                         kernelUnitLength: U[Double] = undefined,
                         floodColor: U[String] = undefined,
                         x: U[String | Double] = undefined,
                         in: U[String] = undefined,
                         textRendering: U[String] = undefined,
                         shapeRendering: U[String] = undefined,
                         mask: U[String] = undefined,
                         overflow: U[String] = undefined,
                         strokeDasharray: U[String] = undefined,
                         textAnchor: U[String] = undefined,
                         style: U[js.Any] = undefined,
                         y: U[String | Double] = undefined,
                         strokeOpacity: U[String | Double] = undefined,
                         textDecoration: U[String] = undefined,
                         g2: U[String] = undefined,
                         stroke: U[String] = undefined,
                         clipPath: U[String] = undefined,
                         result: U[String] = undefined,
                         fillOpacity: U[String | Double] = undefined,
                         fontSizeAdjust: U[String | Double] = undefined,
                         clipRule: U[String] = undefined,
                         local: U[String] = undefined,
                         paintOrder: U[String] = undefined,
                         stopOpacity: U[String | Double] = undefined,
                         colorInterpolationFilters: U[String] = undefined,
                         height: U[Double] = undefined,
                         fontStyle: U[String] = undefined,
                         ref: U[(_ <: dom.svg.Element) => _] = undefined,
                         direction: U[String] = undefined,
                         enableBackground: U[String] = undefined,
                         colorRendering: U[String] = undefined,
                         g1: U[String] = undefined,
                         cursor: U[String] = undefined,
                         xmlBase: U[String] = undefined,
                         key: U[String | Int] = undefined,
                         xmlSpace: U[String] = undefined,
                         filter: U[String] = undefined,
                         fontFamily: U[String] = undefined,
                         kerning: U[String] = undefined,
                         id: U[String] = undefined,
                         strokeDashoffset: U[String] = undefined,
                         glyphOrientationHorizontal: U[String] = undefined,
                         letterSpacing: U[String] = undefined,
                         strokeLinecap: U[String] = undefined,
                         wordSpacing: U[String | Double] = undefined,
                         xmlLang: U[String] = undefined,
                         fill: U[String] = undefined,
                         pointerEvents: U[String] = undefined,
                         floodOpacity: U[String | Double] = undefined,
                         writingMode: U[String | Double] = undefined,
                         className: U[String] = undefined,
                         fontVariant: U[String] = undefined,
                         baselineShift: U[String] = undefined,
                         fontSize: U[String | Double] = undefined,
                         strokeMiterlimit: U[String] = undefined,
                         glyphOrientationVertical: U[String] = undefined,
                         opacity: U[String] = undefined,
                         surfaceScale: U[Double] = undefined,
                         allowReorder: U[Boolean] = undefined,
                         clip: U[String] = undefined,
                         fontStretch: U[String] = undefined,
                         imageRendering: U[String] = undefined,
                         colorProfile: U[String] = undefined,
                         stopColor: U[String] = undefined,
                         strokeLinejoin: U[String] = undefined,
                         lightingColor: U[String] = undefined,
                         width: U[Double] = undefined,
                         fontWeight: U[String] = undefined,
                         diffuseConstant: U[Double] = undefined,
                         visibility: U[String] = undefined,
                         unicodeBidi: U[String] = undefined,
                         strokeWidth: U[String | Double] = undefined,
                         dominantBaseline: U[String] = undefined,
                         display: U[String] = undefined,
                         fillRule: U[String] = undefined,
                         onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                         extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    surfaceScale.foreach(v => props.updateDynamic("surfaceScale")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    diffuseConstant.foreach(v => props.updateDynamic("diffuseConstant")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    kernelUnitLength.foreach(v => props.updateDynamic("kernelUnitLength")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    in.foreach(v => props.updateDynamic("in")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feDiffuseLighting",props,children :_*)
    else inlineReactElement("feDiffuseLighting",props,children :_*)
  }

  @inline
  def feMorphology(
                    colorInterpolation: U[String] = undefined,
                    floodColor: U[String] = undefined,
                    x: U[String | Double] = undefined,
                    in: U[String] = undefined,
                    textRendering: U[String] = undefined,
                    shapeRendering: U[String] = undefined,
                    mask: U[String] = undefined,
                    overflow: U[String] = undefined,
                    strokeDasharray: U[String] = undefined,
                    textAnchor: U[String] = undefined,
                    style: U[js.Any] = undefined,
                    y: U[String | Double] = undefined,
                    strokeOpacity: U[String | Double] = undefined,
                    textDecoration: U[String] = undefined,
                    g2: U[String] = undefined,
                    stroke: U[String] = undefined,
                    clipPath: U[String] = undefined,
                    result: U[String] = undefined,
                    fillOpacity: U[String | Double] = undefined,
                    fontSizeAdjust: U[String | Double] = undefined,
                    clipRule: U[String] = undefined,
                    local: U[String] = undefined,
                    paintOrder: U[String] = undefined,
                    stopOpacity: U[String | Double] = undefined,
                    colorInterpolationFilters: U[String] = undefined,
                    height: U[Double] = undefined,
                    fontStyle: U[String] = undefined,
                    ref: U[(_ <: dom.svg.Element) => _] = undefined,
                    direction: U[String] = undefined,
                    enableBackground: U[String] = undefined,
                    colorRendering: U[String] = undefined,
                    g1: U[String] = undefined,
                    cursor: U[String] = undefined,
                    radius: U[String | Double] = undefined,
                    xmlBase: U[String] = undefined,
                    key: U[String | Int] = undefined,
                    xmlSpace: U[String] = undefined,
                    filter: U[String] = undefined,
                    fontFamily: U[String] = undefined,
                    kerning: U[String] = undefined,
                    id: U[String] = undefined,
                    strokeDashoffset: U[String] = undefined,
                    glyphOrientationHorizontal: U[String] = undefined,
                    letterSpacing: U[String] = undefined,
                    strokeLinecap: U[String] = undefined,
                    wordSpacing: U[String | Double] = undefined,
                    xmlLang: U[String] = undefined,
                    fill: U[String] = undefined,
                    operator: U[String] = undefined,
                    pointerEvents: U[String] = undefined,
                    floodOpacity: U[String | Double] = undefined,
                    writingMode: U[String | Double] = undefined,
                    className: U[String] = undefined,
                    fontVariant: U[String] = undefined,
                    baselineShift: U[String] = undefined,
                    fontSize: U[String | Double] = undefined,
                    strokeMiterlimit: U[String] = undefined,
                    glyphOrientationVertical: U[String] = undefined,
                    opacity: U[String] = undefined,
                    allowReorder: U[Boolean] = undefined,
                    clip: U[String] = undefined,
                    fontStretch: U[String] = undefined,
                    imageRendering: U[String] = undefined,
                    colorProfile: U[String] = undefined,
                    stopColor: U[String] = undefined,
                    strokeLinejoin: U[String] = undefined,
                    lightingColor: U[String] = undefined,
                    width: U[Double] = undefined,
                    fontWeight: U[String] = undefined,
                    visibility: U[String] = undefined,
                    unicodeBidi: U[String] = undefined,
                    strokeWidth: U[String | Double] = undefined,
                    dominantBaseline: U[String] = undefined,
                    display: U[String] = undefined,
                    fillRule: U[String] = undefined,
                    onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                    extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    operator.foreach(v => props.updateDynamic("operator")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    in.foreach(v => props.updateDynamic("in")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    result.foreach(v => props.updateDynamic("result")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    radius.foreach(v => props.updateDynamic("radius")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feMorphology",props,children :_*)
    else inlineReactElement("feMorphology",props,children :_*)
  }

  @inline
  def feMergeNode(
                   in: U[String] = undefined,
                   style: U[js.Any] = undefined,
                   g2: U[String] = undefined,
                   local: U[String] = undefined,
                   paintOrder: U[String] = undefined,
                   ref: U[(_ <: dom.svg.Element) => _] = undefined,
                   g1: U[String] = undefined,
                   xmlBase: U[String] = undefined,
                   key: U[String | Int] = undefined,
                   xmlSpace: U[String] = undefined,
                   id: U[String] = undefined,
                   xmlLang: U[String] = undefined,
                   className: U[String] = undefined,
                   allowReorder: U[Boolean] = undefined,
                   onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
                   extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    in.foreach(v => props.updateDynamic("in")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feMergeNode",props,children :_*)
    else inlineReactElement("feMergeNode",props,children :_*)
  }

  @inline
  def mask(
            colorInterpolation: U[String] = undefined,
            floodColor: U[String] = undefined,
            x: U[String | Double] = undefined,
            maskUnits: U[String] = undefined,
            textRendering: U[String] = undefined,
            shapeRendering: U[String] = undefined,
            mask: U[String] = undefined,
            overflow: U[String] = undefined,
            strokeDasharray: U[String] = undefined,
            maskContentUnits: U[String] = undefined,
            textAnchor: U[String] = undefined,
            style: U[js.Any] = undefined,
            y: U[String | Double] = undefined,
            strokeOpacity: U[String | Double] = undefined,
            textDecoration: U[String] = undefined,
            externalResourcesRequired: U[Double] = undefined,
            g2: U[String] = undefined,
            stroke: U[String] = undefined,
            clipPath: U[String] = undefined,
            fillOpacity: U[String | Double] = undefined,
            fontSizeAdjust: U[String | Double] = undefined,
            clipRule: U[String] = undefined,
            local: U[String] = undefined,
            paintOrder: U[String] = undefined,
            stopOpacity: U[String | Double] = undefined,
            colorInterpolationFilters: U[String] = undefined,
            height: U[Double] = undefined,
            fontStyle: U[String] = undefined,
            ref: U[(_ <: dom.svg.Element) => _] = undefined,
            direction: U[String] = undefined,
            enableBackground: U[String] = undefined,
            colorRendering: U[String] = undefined,
            g1: U[String] = undefined,
            cursor: U[String] = undefined,
            xmlBase: U[String] = undefined,
            key: U[String | Int] = undefined,
            xmlSpace: U[String] = undefined,
            filter: U[String] = undefined,
            fontFamily: U[String] = undefined,
            kerning: U[String] = undefined,
            id: U[String] = undefined,
            strokeDashoffset: U[String] = undefined,
            glyphOrientationHorizontal: U[String] = undefined,
            letterSpacing: U[String] = undefined,
            strokeLinecap: U[String] = undefined,
            wordSpacing: U[String | Double] = undefined,
            xmlLang: U[String] = undefined,
            fill: U[String] = undefined,
            systemLanguage: U[Boolean] = undefined,
            pointerEvents: U[String] = undefined,
            floodOpacity: U[String | Double] = undefined,
            writingMode: U[String | Double] = undefined,
            className: U[String] = undefined,
            fontVariant: U[String] = undefined,
            requiredExtensions: U[String] = undefined,
            baselineShift: U[String] = undefined,
            requiredFeatures: U[String] = undefined,
            fontSize: U[String | Double] = undefined,
            strokeMiterlimit: U[String] = undefined,
            glyphOrientationVertical: U[String] = undefined,
            opacity: U[String] = undefined,
            allowReorder: U[Boolean] = undefined,
            clip: U[String] = undefined,
            fontStretch: U[String] = undefined,
            imageRendering: U[String] = undefined,
            colorProfile: U[String] = undefined,
            stopColor: U[String] = undefined,
            strokeLinejoin: U[String] = undefined,
            lightingColor: U[String] = undefined,
            width: U[Double] = undefined,
            fontWeight: U[String] = undefined,
            visibility: U[String] = undefined,
            unicodeBidi: U[String] = undefined,
            strokeWidth: U[String | Double] = undefined,
            dominantBaseline: U[String] = undefined,
            display: U[String] = undefined,
            fillRule: U[String] = undefined,
            onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    maskUnits.foreach(v => props.updateDynamic("maskUnits")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    maskContentUnits.foreach(v => props.updateDynamic("maskContentUnits")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("mask",props,children :_*)
    else inlineReactElement("mask",props,children :_*)
  }

  @inline
  def defs(
            colorInterpolation: U[String] = undefined,
            floodColor: U[String] = undefined,
            textRendering: U[String] = undefined,
            shapeRendering: U[String] = undefined,
            mask: U[String] = undefined,
            overflow: U[String] = undefined,
            strokeDasharray: U[String] = undefined,
            textAnchor: U[String] = undefined,
            style: U[js.Any] = undefined,
            strokeOpacity: U[String | Double] = undefined,
            textDecoration: U[String] = undefined,
            externalResourcesRequired: U[Double] = undefined,
            g2: U[String] = undefined,
            stroke: U[String] = undefined,
            clipPath: U[String] = undefined,
            fillOpacity: U[String | Double] = undefined,
            fontSizeAdjust: U[String | Double] = undefined,
            clipRule: U[String] = undefined,
            local: U[String] = undefined,
            paintOrder: U[String] = undefined,
            stopOpacity: U[String | Double] = undefined,
            colorInterpolationFilters: U[String] = undefined,
            fontStyle: U[String] = undefined,
            ref: U[(_ <: dom.svg.Element) => _] = undefined,
            direction: U[String] = undefined,
            enableBackground: U[String] = undefined,
            colorRendering: U[String] = undefined,
            g1: U[String] = undefined,
            cursor: U[String] = undefined,
            xmlBase: U[String] = undefined,
            key: U[String | Int] = undefined,
            xmlSpace: U[String] = undefined,
            filter: U[String] = undefined,
            fontFamily: U[String] = undefined,
            kerning: U[String] = undefined,
            id: U[String] = undefined,
            strokeDashoffset: U[String] = undefined,
            glyphOrientationHorizontal: U[String] = undefined,
            letterSpacing: U[String] = undefined,
            strokeLinecap: U[String] = undefined,
            wordSpacing: U[String | Double] = undefined,
            xmlLang: U[String] = undefined,
            fill: U[String] = undefined,
            systemLanguage: U[Boolean] = undefined,
            pointerEvents: U[String] = undefined,
            floodOpacity: U[String | Double] = undefined,
            writingMode: U[String | Double] = undefined,
            className: U[String] = undefined,
            fontVariant: U[String] = undefined,
            requiredExtensions: U[String] = undefined,
            baselineShift: U[String] = undefined,
            requiredFeatures: U[String] = undefined,
            fontSize: U[String | Double] = undefined,
            strokeMiterlimit: U[String] = undefined,
            glyphOrientationVertical: U[String] = undefined,
            opacity: U[String] = undefined,
            allowReorder: U[Boolean] = undefined,
            clip: U[String] = undefined,
            fontStretch: U[String] = undefined,
            imageRendering: U[String] = undefined,
            colorProfile: U[String] = undefined,
            stopColor: U[String] = undefined,
            strokeLinejoin: U[String] = undefined,
            lightingColor: U[String] = undefined,
            transform: U[String] = undefined,
            fontWeight: U[String] = undefined,
            visibility: U[String] = undefined,
            unicodeBidi: U[String] = undefined,
            strokeWidth: U[String | Double] = undefined,
            dominantBaseline: U[String] = undefined,
            display: U[String] = undefined,
            fillRule: U[String] = undefined,
            onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    opacity.foreach(v => props.updateDynamic("opacity")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    baselineShift.foreach(v => props.updateDynamic("baselineShift")(v))
    overflow.foreach(v => props.updateDynamic("overflow")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    externalResourcesRequired.foreach(v => props.updateDynamic("externalResourcesRequired")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    kerning.foreach(v => props.updateDynamic("kerning")(v))
    fontStretch.foreach(v => props.updateDynamic("fontStretch")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    mask.foreach(v => props.updateDynamic("mask")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    colorRendering.foreach(v => props.updateDynamic("colorRendering")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    enableBackground.foreach(v => props.updateDynamic("enableBackground")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    wordSpacing.foreach(v => props.updateDynamic("wordSpacing")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    fontSizeAdjust.foreach(v => props.updateDynamic("fontSizeAdjust")(v))
    strokeLinecap.foreach(v => props.updateDynamic("strokeLinecap")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    lightingColor.foreach(v => props.updateDynamic("lightingColor")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    stopOpacity.foreach(v => props.updateDynamic("stopOpacity")(v))
    requiredFeatures.foreach(v => props.updateDynamic("requiredFeatures")(v))
    imageRendering.foreach(v => props.updateDynamic("imageRendering")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    display.foreach(v => props.updateDynamic("display")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    fillOpacity.foreach(v => props.updateDynamic("fillOpacity")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    fontWeight.foreach(v => props.updateDynamic("fontWeight")(v))
    stroke.foreach(v => props.updateDynamic("stroke")(v))
    requiredExtensions.foreach(v => props.updateDynamic("requiredExtensions")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    filter.foreach(v => props.updateDynamic("filter")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    shapeRendering.foreach(v => props.updateDynamic("shapeRendering")(v))
    stopColor.foreach(v => props.updateDynamic("stopColor")(v))
    fillRule.foreach(v => props.updateDynamic("fillRule")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    strokeLinejoin.foreach(v => props.updateDynamic("strokeLinejoin")(v))
    visibility.foreach(v => props.updateDynamic("visibility")(v))
    strokeOpacity.foreach(v => props.updateDynamic("strokeOpacity")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    fontStyle.foreach(v => props.updateDynamic("fontStyle")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    fontVariant.foreach(v => props.updateDynamic("fontVariant")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    pointerEvents.foreach(v => props.updateDynamic("pointerEvents")(v))
    strokeMiterlimit.foreach(v => props.updateDynamic("strokeMiterlimit")(v))
    direction.foreach(v => props.updateDynamic("direction")(v))
    strokeDasharray.foreach(v => props.updateDynamic("strokeDasharray")(v))
    clipRule.foreach(v => props.updateDynamic("clipRule")(v))
    colorProfile.foreach(v => props.updateDynamic("colorProfile")(v))
    cursor.foreach(v => props.updateDynamic("cursor")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    glyphOrientationVertical.foreach(v => props.updateDynamic("glyphOrientationVertical")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    glyphOrientationHorizontal.foreach(v => props.updateDynamic("glyphOrientationHorizontal")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("defs",props,children :_*)
    else inlineReactElement("defs",props,children :_*)
  }

  @inline
  def feFuncG(
               amplitude: U[Double] = undefined,
               intercept: U[String] = undefined,
               tableValues: U[String] = undefined,
               style: U[js.Any] = undefined,
               g2: U[String] = undefined,
               local: U[String] = undefined,
               paintOrder: U[String] = undefined,
               ref: U[(_ <: dom.svg.Element) => _] = undefined,
               g1: U[String] = undefined,
               exponent: U[Double] = undefined,
               xmlBase: U[String] = undefined,
               key: U[String | Int] = undefined,
               xmlSpace: U[String] = undefined,
               id: U[String] = undefined,
               offset: U[String | Double] = undefined,
               xmlLang: U[String] = undefined,
               className: U[String] = undefined,
               allowReorder: U[Boolean] = undefined,
               `type`: U[String] = undefined,
               slope: U[String | Double] = undefined,
               onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    slope.foreach(v => props.updateDynamic("slope")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    intercept.foreach(v => props.updateDynamic("intercept")(v))
    amplitude.foreach(v => props.updateDynamic("amplitude")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    exponent.foreach(v => props.updateDynamic("exponent")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    tableValues.foreach(v => props.updateDynamic("tableValues")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    xmlBase.foreach(v => props.updateDynamic("xmlBase")(v))
    offset.foreach(v => props.updateDynamic("offset")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    local.foreach(v => props.updateDynamic("local")(v))
    allowReorder.foreach(v => props.updateDynamic("allowReorder")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feFuncG",props,children :_*)
    else inlineReactElement("feFuncG",props,children :_*)
  }

}
