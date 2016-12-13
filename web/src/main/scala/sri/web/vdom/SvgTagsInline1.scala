package sri.web.vdom

import org.scalajs.dom
import sri.core._
import sri.web.SyntheticEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.{undefined, UndefOr => U}
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.LinkingInfo.developmentMode
trait SvgTagsInline1 {


  @inline
  def feTile(
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
    if (developmentMode) React.createElement("feTile",props,children :_*)
    else inlineReactElement("feTile",props,children :_*)
  }

  @inline
  def fePointLight(
                    x: U[String | Double] = undefined,
                    style: U[js.Any] = undefined,
                    y: U[String | Double] = undefined,
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
                    z: U[String | Double] = undefined,
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
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
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
    z.foreach(v => props.updateDynamic("z")(v))
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
    if (developmentMode) React.createElement("fePointLight",props,children :_*)
    else inlineReactElement("fePointLight",props,children :_*)
  }

  @inline
  def ellipse(
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
               rx: U[String | Double] = undefined,
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
    if (developmentMode) React.createElement("ellipse",props,children :_*)
    else inlineReactElement("ellipse",props,children :_*)
  }

  @inline
  def feFuncB(
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
    if (developmentMode) React.createElement("feFuncB",props,children :_*)
    else inlineReactElement("feFuncB",props,children :_*)
  }

  @inline
  def filter(
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
              filterUnits: U[String] = undefined,
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
              primitiveUnits: U[String] = undefined,
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
    filterUnits.foreach(v => props.updateDynamic("filterUnits")(v))
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
    primitiveUnits.foreach(v => props.updateDynamic("primitiveUnits")(v))
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
    if (developmentMode) React.createElement("filter",props,children :_*)
    else inlineReactElement("filter",props,children :_*)
  }

  @inline
  def feDistantLight(
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
                      elevation: U[Double] = undefined,
                      xmlLang: U[String] = undefined,
                      className: U[String] = undefined,
                      allowReorder: U[Boolean] = undefined,
                      azimuth: U[Double] = undefined,
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
    elevation.foreach(v => props.updateDynamic("elevation")(v))
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
    azimuth.foreach(v => props.updateDynamic("azimuth")(v))
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
    if (developmentMode) React.createElement("feDistantLight",props,children :_*)
    else inlineReactElement("feDistantLight",props,children :_*)
  }

  @inline
  def mesh(
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
    if (developmentMode) React.createElement("mesh",props,children :_*)
    else inlineReactElement("mesh",props,children :_*)
  }

  @inline
  def marker(
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
              refY: U[Double] = undefined,
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
              refX: U[Double] = undefined,
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
              markerWidth: U[String] = undefined,
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
              markerUnits: U[String] = undefined,
              markerHeight: U[String] = undefined,
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
    refX.foreach(v => props.updateDynamic("refX")(v))
    floodOpacity.foreach(v => props.updateDynamic("floodOpacity")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    textDecoration.foreach(v => props.updateDynamic("textDecoration")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    viewBox.foreach(v => props.updateDynamic("viewBox")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    markerHeight.foreach(v => props.updateDynamic("markerHeight")(v))
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
    markerUnits.foreach(v => props.updateDynamic("markerUnits")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    textAnchor.foreach(v => props.updateDynamic("textAnchor")(v))
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    markerWidth.foreach(v => props.updateDynamic("markerWidth")(v))
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
    refY.foreach(v => props.updateDynamic("refY")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("marker",props,children :_*)
    else inlineReactElement("marker",props,children :_*)
  }

  @inline
  def feTurbulence(
                    numOctaves: U[Int] = undefined,
                    colorInterpolation: U[String] = undefined,
                    floodColor: U[String] = undefined,
                    x: U[String | Double] = undefined,
                    textRendering: U[String] = undefined,
                    shapeRendering: U[String] = undefined,
                    mask: U[String] = undefined,
                    seed: U[Int] = undefined,
                    overflow: U[String] = undefined,
                    strokeDasharray: U[String] = undefined,
                    textAnchor: U[String] = undefined,
                    style: U[js.Any] = undefined,
                    y: U[String | Double] = undefined,
                    strokeOpacity: U[String | Double] = undefined,
                    textDecoration: U[String] = undefined,
                    baseFrequency: U[Double] = undefined,
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
                    `type`: U[String] = undefined,
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
                    stitchTiles: U[String] = undefined,
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
    baseFrequency.foreach(v => props.updateDynamic("baseFrequency")(v))
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
    stitchTiles.foreach(v => props.updateDynamic("stitchTiles")(v))
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
    numOctaves.foreach(v => props.updateDynamic("numOctaves")(v))
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
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    letterSpacing.foreach(v => props.updateDynamic("letterSpacing")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    seed.foreach(v => props.updateDynamic("seed")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feTurbulence",props,children :_*)
    else inlineReactElement("feTurbulence",props,children :_*)
  }

  @inline
  def textPath(
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
                lengthAdjust: U[String] = undefined,
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
                startOffset: U[String] = undefined,
                strokeMiterlimit: U[String] = undefined,
                glyphOrientationVertical: U[String] = undefined,
                opacity: U[String] = undefined,
                alignmentBaseline: U[String] = undefined,
                allowReorder: U[Boolean] = undefined,
                clip: U[String] = undefined,
                fontStretch: U[String] = undefined,
                imageRendering: U[String] = undefined,
                xlinkTitle: U[String] = undefined,
                colorProfile: U[String] = undefined,
                spacing: U[String] = undefined,
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
    spacing.foreach(v => props.updateDynamic("spacing")(v))
    textRendering.foreach(v => props.updateDynamic("textRendering")(v))
    startOffset.foreach(v => props.updateDynamic("startOffset")(v))
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
    strokeDashoffset.foreach(v => props.updateDynamic("strokeDashoffset")(v))
    xlinkShow.foreach(v => props.updateDynamic("xlinkShow")(v))
    alignmentBaseline.foreach(v => props.updateDynamic("alignmentBaseline")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    fontSize.foreach(v => props.updateDynamic("fontSize")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    writingMode.foreach(v => props.updateDynamic("writingMode")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    textLength.foreach(v => props.updateDynamic("textLength")(v))
    unicodeBidi.foreach(v => props.updateDynamic("unicodeBidi")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
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
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("textPath",props,children :_*)
    else inlineReactElement("textPath",props,children :_*)
  }

  @inline
  def unknown(
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
    if (developmentMode) React.createElement("unknown",props,children :_*)
    else inlineReactElement("unknown",props,children :_*)
  }

  @inline
  def polyline(
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
    if (developmentMode) React.createElement("polyline",props,children :_*)
    else inlineReactElement("polyline",props,children :_*)
  }

  @inline
  def linearGradient(
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
                      x2: U[String | Double] = undefined,
                      cursor: U[String] = undefined,
                      xmlBase: U[String] = undefined,
                      key: U[String | Int] = undefined,
                      xmlSpace: U[String] = undefined,
                      filter: U[String] = undefined,
                      gradientTransform: U[String] = undefined,
                      xlinkHref: U[String] = undefined,
                      fontFamily: U[String] = undefined,
                      gradientUnits: U[String] = undefined,
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
                      pointerEvents: U[String] = undefined,
                      floodOpacity: U[String | Double] = undefined,
                      writingMode: U[String | Double] = undefined,
                      xlinkType: U[String] = undefined,
                      className: U[String] = undefined,
                      xlinkArcrole: U[String] = undefined,
                      fontVariant: U[String] = undefined,
                      baselineShift: U[String] = undefined,
                      fontSize: U[String | Double] = undefined,
                      y2: U[String | Double] = undefined,
                      strokeMiterlimit: U[String] = undefined,
                      x1: U[String | Double] = undefined,
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
    y1.foreach(v => props.updateDynamic("y1")(v))
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
    if (developmentMode) React.createElement("linearGradient",props,children :_*)
    else inlineReactElement("linearGradient",props,children :_*)
  }

  @inline
  def feConvolveMatrix(
                        colorInterpolation: U[String] = undefined,
                        divisor: U[Double] = undefined,
                        kernelUnitLength: U[Double] = undefined,
                        floodColor: U[String] = undefined,
                        x: U[String | Double] = undefined,
                        in: U[String] = undefined,
                        textRendering: U[String] = undefined,
                        kernelMatrix: U[js.Array[Double]] = undefined,
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
                        order: U[Int] = undefined,
                        fill: U[String] = undefined,
                        pointerEvents: U[String] = undefined,
                        floodOpacity: U[String | Double] = undefined,
                        writingMode: U[String | Double] = undefined,
                        className: U[String] = undefined,
                        preserveAlpha: U[Boolean] = undefined,
                        fontVariant: U[String] = undefined,
                        baselineShift: U[String] = undefined,
                        bias: U[Double] = undefined,
                        fontSize: U[String | Double] = undefined,
                        edgeMode: U[String] = undefined,
                        strokeMiterlimit: U[String] = undefined,
                        targetY: U[Double] = undefined,
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
                        targetX: U[Double] = undefined,
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
    bias.foreach(v => props.updateDynamic("bias")(v))
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
    divisor.foreach(v => props.updateDynamic("divisor")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    dominantBaseline.foreach(v => props.updateDynamic("dominantBaseline")(v))
    colorInterpolation.foreach(v => props.updateDynamic("colorInterpolation")(v))
    clip.foreach(v => props.updateDynamic("clip")(v))
    fill.foreach(v => props.updateDynamic("fill")(v))
    preserveAlpha.foreach(v => props.updateDynamic("preserveAlpha")(v))
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
    kernelUnitLength.foreach(v => props.updateDynamic("kernelUnitLength")(v))
    edgeMode.foreach(v => props.updateDynamic("edgeMode")(v))
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
    targetY.foreach(v => props.updateDynamic("targetY")(v))
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
    order.foreach(v => props.updateDynamic("order")(v))
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
    targetX.foreach(v => props.updateDynamic("targetX")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    kernelMatrix.foreach(v => props.updateDynamic("kernelMatrix")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feConvolveMatrix",props,children :_*)
    else inlineReactElement("feConvolveMatrix",props,children :_*)
  }

  @inline
  def hatchpath(
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
    if (developmentMode) React.createElement("hatchpath",props,children :_*)
    else inlineReactElement("hatchpath",props,children :_*)
  }

  @inline
  def meshgradient(
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
    if (developmentMode) React.createElement("meshgradient",props,children :_*)
    else inlineReactElement("meshgradient",props,children :_*)
  }

  @inline
  def animateTransform(
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
                        `type`: U[String] = undefined,
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
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("animateTransform",props,children :_*)
    else inlineReactElement("animateTransform",props,children :_*)
  }

  @inline
  def feGaussianBlur(
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
                      stdDeviation: U[String | Double] = undefined,
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
    stdDeviation.foreach(v => props.updateDynamic("stdDeviation")(v))
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
    if (developmentMode) React.createElement("feGaussianBlur",props,children :_*)
    else inlineReactElement("feGaussianBlur",props,children :_*)
  }

  @inline
  def feColorMatrix(
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
                     values: U[String] = undefined,
                     glyphOrientationVertical: U[String] = undefined,
                     opacity: U[String] = undefined,
                     allowReorder: U[Boolean] = undefined,
                     `type`: U[String] = undefined,
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
    values.foreach(v => props.updateDynamic("values")(v))
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
    `type`.foreach(v => props.updateDynamic("type")(v))
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
    if (developmentMode) React.createElement("feColorMatrix",props,children :_*)
    else inlineReactElement("feColorMatrix",props,children :_*)
  }

  @inline
  def pattern(
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
               viewBox: U[String] = undefined,
               patternTransform: U[String] = undefined,
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
               systemLanguage: U[Boolean] = undefined,
               pointerEvents: U[String] = undefined,
               floodOpacity: U[String | Double] = undefined,
               writingMode: U[String | Double] = undefined,
               patternContentUnits: U[String] = undefined,
               xlinkType: U[String] = undefined,
               className: U[String] = undefined,
               xlinkArcrole: U[String] = undefined,
               fontVariant: U[String] = undefined,
               requiredExtensions: U[String] = undefined,
               baselineShift: U[String] = undefined,
               requiredFeatures: U[String] = undefined,
               fontSize: U[String | Double] = undefined,
               strokeMiterlimit: U[String] = undefined,
               glyphOrientationVertical: U[String] = undefined,
               opacity: U[String] = undefined,
               patternUnits: U[String] = undefined,
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
    patternContentUnits.foreach(v => props.updateDynamic("patternContentUnits")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    viewBox.foreach(v => props.updateDynamic("viewBox")(v))
    fontFamily.foreach(v => props.updateDynamic("fontFamily")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    patternTransform.foreach(v => props.updateDynamic("patternTransform")(v))
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
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    patternUnits.foreach(v => props.updateDynamic("patternUnits")(v))
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
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("pattern",props,children :_*)
    else inlineReactElement("pattern",props,children :_*)
  }

  @inline
  def path(
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
            pathLength: U[Double] = undefined,
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
            d: U[String] = undefined,
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
    pathLength.foreach(v => props.updateDynamic("pathLength")(v))
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
    d.foreach(v => props.updateDynamic("d")(v))
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
    if (developmentMode) React.createElement("path",props,children :_*)
    else inlineReactElement("path",props,children :_*)
  }

  @inline
  def use(
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
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
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
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("use",props,children :_*)
    else inlineReactElement("use",props,children :_*)
  }

  @inline
  def clipPath(
                colorInterpolation: U[String] = undefined,
                floodColor: U[String] = undefined,
                clipPathUnits: U[String] = undefined,
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
    clipPathUnits.foreach(v => props.updateDynamic("clipPathUnits")(v))
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
    if (developmentMode) React.createElement("clipPath",props,children :_*)
    else inlineReactElement("clipPath",props,children :_*)
  }

  @inline
  def image(
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
             extraAttributes: U[js.Object] = undefined)  = {
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
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
    transform.foreach(v => props.updateDynamic("transform")(v))
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
    xlinkActuate.foreach(v => props.updateDynamic("xlinkActuate")(v))
    xlinkType.foreach(v => props.updateDynamic("xlinkType")(v))
    colorInterpolationFilters.foreach(v => props.updateDynamic("colorInterpolationFilters")(v))
    strokeWidth.foreach(v => props.updateDynamic("strokeWidth")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    clipPath.foreach(v => props.updateDynamic("clipPath")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("image",props)
    else inlineReactElement("image",props)
  }

  @inline
  def stop(
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
            offset: U[String | Double] = undefined,
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
    offset.foreach(v => props.updateDynamic("offset")(v))
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
    if (developmentMode) React.createElement("stop",props,children :_*)
    else inlineReactElement("stop",props,children :_*)
  }

  @inline
  def feFlood(
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
    if (developmentMode) React.createElement("feFlood",props,children :_*)
    else inlineReactElement("feFlood",props,children :_*)
  }

  @inline
  def switch(
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
    if (developmentMode) React.createElement("switch",props,children :_*)
    else inlineReactElement("switch",props,children :_*)
  }

  @inline
  def set(
           floodColor: U[String] = undefined,
           begin: U[String] = undefined,
           xlinkRole: U[String] = undefined,
           xlinkShow: U[String] = undefined,
           xlinkActuate: U[String] = undefined,
           style: U[js.Any] = undefined,
           externalResourcesRequired: U[Double] = undefined,
           g2: U[String] = undefined,
           fillOpacity: U[String | Double] = undefined,
           local: U[String] = undefined,
           paintOrder: U[String] = undefined,
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
           floodOpacity: U[String | Double] = undefined,
           xlinkType: U[String] = undefined,
           className: U[String] = undefined,
           xlinkArcrole: U[String] = undefined,
           requiredExtensions: U[String] = undefined,
           requiredFeatures: U[String] = undefined,
           end: U[Double] = undefined,
           attributeType: U[String] = undefined,
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
    xmlSpace.foreach(v => props.updateDynamic("xmlSpace")(v))
    xlinkShow.foreach(v => props.updateDynamic("xlinkShow")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    floodColor.foreach(v => props.updateDynamic("floodColor")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    end.foreach(v => props.updateDynamic("end")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    systemLanguage.foreach(v => props.updateDynamic("systemLanguage")(v))
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
    attributeType.foreach(v => props.updateDynamic("attributeType")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    repeatDur.foreach(v => props.updateDynamic("repeatDur")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    g1.foreach(v => props.updateDynamic("g1")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
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
    if (developmentMode) React.createElement("set",props,children :_*)
    else inlineReactElement("set",props,children :_*)
  }

  @inline
  def feSpotLight(
                   x: U[String | Double] = undefined,
                   pointsAtZ: U[Double] = undefined,
                   style: U[js.Any] = undefined,
                   y: U[String | Double] = undefined,
                   g2: U[String] = undefined,
                   specularExponent: U[Double] = undefined,
                   limitingConeAngle: U[Double] = undefined,
                   local: U[String] = undefined,
                   paintOrder: U[String] = undefined,
                   pointsAtY: U[Double] = undefined,
                   ref: U[(_ <: dom.svg.Element) => _] = undefined,
                   g1: U[String] = undefined,
                   xmlBase: U[String] = undefined,
                   key: U[String | Int] = undefined,
                   xmlSpace: U[String] = undefined,
                   pointsAtX: U[Double] = undefined,
                   id: U[String] = undefined,
                   xmlLang: U[String] = undefined,
                   className: U[String] = undefined,
                   allowReorder: U[Boolean] = undefined,
                   z: U[String | Double] = undefined,
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
    pointsAtX.foreach(v => props.updateDynamic("pointsAtX")(v))
    pointsAtZ.foreach(v => props.updateDynamic("pointsAtZ")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    specularExponent.foreach(v => props.updateDynamic("specularExponent")(v))
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
    y.foreach(v => props.updateDynamic("y")(v))
    x.foreach(v => props.updateDynamic("x")(v))
    xmlLang.foreach(v => props.updateDynamic("xmlLang")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    pointsAtY.foreach(v => props.updateDynamic("pointsAtY")(v))
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
    z.foreach(v => props.updateDynamic("z")(v))
    paintOrder.foreach(v => props.updateDynamic("paintOrder")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    g2.foreach(v => props.updateDynamic("g2")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    limitingConeAngle.foreach(v => props.updateDynamic("limitingConeAngle")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    if (developmentMode) React.createElement("feSpotLight",props,children :_*)
    else inlineReactElement("feSpotLight",props,children :_*)
  }

  @inline
  def animateMotion(
                     floodColor: U[String] = undefined,
                     begin: U[String] = undefined,
                     xlinkRole: U[String] = undefined,
                     accumulate: U[String] = undefined,
                     keyTimes: U[String] = undefined,
                     xlinkShow: U[String] = undefined,
                     xlinkActuate: U[String] = undefined,
                     style: U[js.Any] = undefined,
                     keyPoints: U[String] = undefined,
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
                     key: U[String | Int] = undefined,
                     xmlSpace: U[String] = undefined,
                     filter: U[String] = undefined,
                     rotate: U[String | Double] = undefined,
                     repeatCount: U[String | Int] = undefined,
                     xlinkHref: U[String] = undefined,
                     id: U[String] = undefined,
                     xmlLang: U[String] = undefined,
                     fill: U[String] = undefined,
                     systemLanguage: U[Boolean] = undefined,
                     by: U[Double] = undefined,
                     origin: U[String] = undefined,
                     floodOpacity: U[String | Double] = undefined,
                     xlinkType: U[String] = undefined,
                     className: U[String] = undefined,
                     xlinkArcrole: U[String] = undefined,
                     from: U[Double] = undefined,
                     requiredExtensions: U[String] = undefined,
                     requiredFeatures: U[String] = undefined,
                     end: U[Double] = undefined,
                     values: U[String] = undefined,
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
    rotate.foreach(v => props.updateDynamic("rotate")(v))
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
    keyPoints.foreach(v => props.updateDynamic("keyPoints")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    origin.foreach(v => props.updateDynamic("origin")(v))
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
    if (developmentMode) React.createElement("animateMotion",props,children :_*)
    else inlineReactElement("animateMotion",props,children :_*)
  }


}


