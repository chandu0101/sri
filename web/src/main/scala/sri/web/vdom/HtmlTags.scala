
package sri.web.vdom

import chandu0101.macros.tojs.{exclude, FunctionMacro}
import org.scalajs.dom
import sri.core._
import sri.web.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.{UndefOr => U, undefined => undefined}
import scala.scalajs.js.Dynamic.{literal => json}

import scala.scalajs.LinkingInfo.developmentMode


trait HtmlTags extends HtmlTags1 {


  def dt(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          contextMenu: U[String] = undefined,
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
          extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("dt", props, children: _*)
    else inlineReactElement("dt", props, children: _*)
  }


  def blockquote(
                  tabIndex: U[Int] = undefined,
                  is: U[String] = undefined,
                  classID: U[String] = undefined,
                  contentEditable: U[String] = undefined,
                  role: U[String] = undefined,
                  style: U[js.Any] = undefined,
                  hidden: U[Boolean] = undefined,
                  ref: U[(_ <: dom.html.Element) => _] = undefined,
                  key: U[String | Int] = undefined,
                  dir: U[String] = undefined,
                  id: U[String] = undefined,
                  cite: U[String] = undefined,
                  draggable: U[Boolean] = undefined,
                  accessKey: U[String] = undefined,
                  className: U[String] = undefined,
                  spellCheck: U[Boolean] = undefined,
                  title: U[String] = undefined,
                  lang: U[String] = undefined,
                  contextMenu: U[String] = undefined,
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
                  extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    cite.foreach(v => props.updateDynamic("cite")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("blockquote", props, children: _*)
    else inlineReactElement("blockquote", props, children: _*)
  }


  def audio(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             loop: U[Boolean] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             crossOrigin: U[String] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             src: U[String] = undefined,
             mediaGroup: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             preload: U[String] = undefined,
             autoPlay: U[Boolean] = undefined,
             muted: U[Boolean] = undefined,
             contextMenu: U[String] = undefined,
             controls: U[Boolean] = undefined,
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
             extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    controls.foreach(v => props.updateDynamic("controls")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    loop.foreach(v => props.updateDynamic("loop")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    autoPlay.foreach(v => props.updateDynamic("autoPlay")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    preload.foreach(v => props.updateDynamic("preload")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    src.foreach(v => props.updateDynamic("src")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    mediaGroup.foreach(v => props.updateDynamic("mediaGroup")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    muted.foreach(v => props.updateDynamic("muted")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("audio", props, children: _*)
    else inlineReactElement("audio", props, children: _*)
  }


  def figcaption(
                  tabIndex: U[Int] = undefined,
                  is: U[String] = undefined,
                  classID: U[String] = undefined,
                  contentEditable: U[String] = undefined,
                  role: U[String] = undefined,
                  style: U[js.Any] = undefined,
                  hidden: U[Boolean] = undefined,
                  ref: U[(_ <: dom.html.Element) => _] = undefined,
                  key: U[String | Int] = undefined,
                  dir: U[String] = undefined,
                  id: U[String] = undefined,
                  draggable: U[Boolean] = undefined,
                  accessKey: U[String] = undefined,
                  className: U[String] = undefined,
                  spellCheck: U[Boolean] = undefined,
                  title: U[String] = undefined,
                  lang: U[String] = undefined,
                  contextMenu: U[String] = undefined,
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
                  extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("figcaption", props, children: _*)
    else inlineReactElement("figcaption", props, children: _*)
  }


  def samp(
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            contextMenu: U[String] = undefined,
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
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("samp", props, children: _*)
    else inlineReactElement("samp", props, children: _*)
  }


  def menuitem(
                tabIndex: U[Int] = undefined,
                is: U[String] = undefined,
                classID: U[String] = undefined,
                contentEditable: U[String] = undefined,
                role: U[String] = undefined,
                style: U[js.Any] = undefined,
                hidden: U[Boolean] = undefined,
                ref: U[(_ <: dom.html.Element) => _] = undefined,
                key: U[String | Int] = undefined,
                dir: U[String] = undefined,
                id: U[String] = undefined,
                draggable: U[Boolean] = undefined,
                accessKey: U[String] = undefined,
                className: U[String] = undefined,
                spellCheck: U[Boolean] = undefined,
                title: U[String] = undefined,
                lang: U[String] = undefined,
                contextMenu: U[String] = undefined,
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
                extraAttributes: U[js.Object] = undefined) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("menuitem", props)
    else inlineReactElement("menuitem", props)
  }


  def menu(
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            contextMenu: U[String] = undefined,
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
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("menu", props, children: _*)
    else inlineReactElement("menu", props, children: _*)
  }


  def code(
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            contextMenu: U[String] = undefined,
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
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("code", props, children: _*)
    else inlineReactElement("code", props, children: _*)
  }


  def big(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
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
           extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("big", props, children: _*)
    else inlineReactElement("big", props, children: _*)
  }


  def a(
         tabIndex: U[Int] = undefined,
         is: U[String] = undefined,
         classID: U[String] = undefined,
         contentEditable: U[String] = undefined,
         role: U[String] = undefined,
         style: U[js.Any] = undefined,
         hrefLang: U[String] = undefined,
         hidden: U[Boolean] = undefined,
         rel: U[String] = undefined,
         ref: U[(_ <: dom.html.Element) => _] = undefined,
         key: U[String | Int] = undefined,
         dir: U[String] = undefined,
         id: U[String] = undefined,
         draggable: U[Boolean] = undefined,
         accessKey: U[String] = undefined,
         className: U[String] = undefined,
         target: U[String] = undefined,
         spellCheck: U[Boolean] = undefined,
         title: U[String] = undefined,
         lang: U[String] = undefined,
         `type`: U[String] = undefined,
         href: U[String] = undefined,
         download: U[String] = undefined,
         contextMenu: U[String] = undefined,
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
         extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onAbort.foreach(v => props.updateDynamic("onAbort")(v))
    onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
    onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onError.foreach(v => props.updateDynamic("onError")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onPlay.foreach(v => props.updateDynamic("onPlay")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    download.foreach(v => props.updateDynamic("download")(v))
    href.foreach(v => props.updateDynamic("href")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    hrefLang.foreach(v => props.updateDynamic("hrefLang")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    onEnded.foreach(v => props.updateDynamic("onEnded")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    onStalled.foreach(v => props.updateDynamic("onStalled")(v))
    onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onPause.foreach(v => props.updateDynamic("onPause")(v))
    onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
    onProgress.foreach(v => props.updateDynamic("onProgress")(v))
    onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
    target.foreach(v => props.updateDynamic("target")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    rel.foreach(v => props.updateDynamic("rel")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("a", props, children: _*)
    else inlineReactElement("a", props, children: _*)
  }


  def section(
               tabIndex: U[Int] = undefined,
               is: U[String] = undefined,
               classID: U[String] = undefined,
               contentEditable: U[String] = undefined,
               role: U[String] = undefined,
               style: U[js.Any] = undefined,
               hidden: U[Boolean] = undefined,
               ref: U[(_ <: dom.html.Element) => _] = undefined,
               key: U[String | Int] = undefined,
               dir: U[String] = undefined,
               id: U[String] = undefined,
               draggable: U[Boolean] = undefined,
               accessKey: U[String] = undefined,
               className: U[String] = undefined,
               spellCheck: U[Boolean] = undefined,
               title: U[String] = undefined,
               lang: U[String] = undefined,
               contextMenu: U[String] = undefined,
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
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("section", props, children: _*)
    else inlineReactElement("section", props, children: _*)
  }


  def sub(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
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
           extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("sub", props, children: _*)
    else inlineReactElement("sub", props, children: _*)
  }


  def param(
             name: U[String] = undefined,
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             value: U[InputValue] = undefined,
             contextMenu: U[String] = undefined,
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
             extraAttributes: U[js.Object] = undefined) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    value.foreach(v => props.updateDynamic("value")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    name.foreach(v => props.updateDynamic("name")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("param", props)
    else inlineReactElement("param", props)
  }


  def cite(
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            contextMenu: U[String] = undefined,
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
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("cite", props, children: _*)
    else inlineReactElement("cite", props, children: _*)
  }


  def iframe(
              name: U[String] = undefined,
              tabIndex: U[Int] = undefined,
              is: U[String] = undefined,
              classID: U[String] = undefined,
              contentEditable: U[String] = undefined,
              role: U[String] = undefined,
              style: U[js.Any] = undefined,
              hidden: U[Boolean] = undefined,
              height: U[Int] = undefined,
              ref: U[(_ <: dom.html.Element) => _] = undefined,
              srcDoc: U[String] = undefined,
              key: U[String | Int] = undefined,
              seamless: U[String] = undefined,
              dir: U[String] = undefined,
              id: U[String] = undefined,
              allowFullScreen: U[Boolean] = undefined,
              draggable: U[Boolean] = undefined,
              accessKey: U[String] = undefined,
              className: U[String] = undefined,
              sandbox: U[String] = undefined,
              src: U[String] = undefined,
              spellCheck: U[Boolean] = undefined,
              title: U[String] = undefined,
              allowTransparency: U[Boolean] = undefined,
              lang: U[String] = undefined,
              width: U[Int] = undefined,
              contextMenu: U[String] = undefined,
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
              extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    allowFullScreen.foreach(v => props.updateDynamic("allowFullScreen")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    sandbox.foreach(v => props.updateDynamic("sandbox")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    name.foreach(v => props.updateDynamic("name")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    src.foreach(v => props.updateDynamic("src")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    seamless.foreach(v => props.updateDynamic("seamless")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    srcDoc.foreach(v => props.updateDynamic("srcDoc")(v))
    allowTransparency.foreach(v => props.updateDynamic("allowTransparency")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("iframe", props, children: _*)
    else inlineReactElement("iframe", props, children: _*)
  }


  def optgroup(
                tabIndex: U[Int] = undefined,
                is: U[String] = undefined,
                classID: U[String] = undefined,
                contentEditable: U[String] = undefined,
                role: U[String] = undefined,
                style: U[js.Any] = undefined,
                label: U[String] = undefined,
                hidden: U[Boolean] = undefined,
                ref: U[(_ <: dom.html.Element) => _] = undefined,
                key: U[String | Int] = undefined,
                dir: U[String] = undefined,
                id: U[String] = undefined,
                draggable: U[Boolean] = undefined,
                accessKey: U[String] = undefined,
                className: U[String] = undefined,
                disabled: U[Boolean] = undefined,
                spellCheck: U[Boolean] = undefined,
                title: U[String] = undefined,
                lang: U[String] = undefined,
                contextMenu: U[String] = undefined,
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
                extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    label.foreach(v => props.updateDynamic("label")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    disabled.foreach(v => props.updateDynamic("disabled")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("optgroup", props, children: _*)
    else inlineReactElement("optgroup", props, children: _*)
  }


  def body(
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            contextMenu: U[String] = undefined,
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
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("body", props, children: _*)
    else inlineReactElement("body", props, children: _*)
  }


  def u(
         tabIndex: U[Int] = undefined,
         is: U[String] = undefined,
         classID: U[String] = undefined,
         contentEditable: U[String] = undefined,
         role: U[String] = undefined,
         style: U[js.Any] = undefined,
         hidden: U[Boolean] = undefined,
         ref: U[(_ <: dom.html.Element) => _] = undefined,
         key: U[String | Int] = undefined,
         dir: U[String] = undefined,
         id: U[String] = undefined,
         draggable: U[Boolean] = undefined,
         accessKey: U[String] = undefined,
         className: U[String] = undefined,
         spellCheck: U[Boolean] = undefined,
         title: U[String] = undefined,
         lang: U[String] = undefined,
         contextMenu: U[String] = undefined,
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
         extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onAbort.foreach(v => props.updateDynamic("onAbort")(v))
    onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
    onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onError.foreach(v => props.updateDynamic("onError")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onPlay.foreach(v => props.updateDynamic("onPlay")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    onEnded.foreach(v => props.updateDynamic("onEnded")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    onStalled.foreach(v => props.updateDynamic("onStalled")(v))
    onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onPause.foreach(v => props.updateDynamic("onPause")(v))
    onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
    onProgress.foreach(v => props.updateDynamic("onProgress")(v))
    onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("u", props, children: _*)
    else inlineReactElement("u", props, children: _*)
  }


  def track(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             label: U[String] = undefined,
             hidden: U[Boolean] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             default: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             srcLang: U[String] = undefined,
             src: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             kind: U[String] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             contextMenu: U[String] = undefined,
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
             extraAttributes: U[js.Object] = undefined) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    srcLang.foreach(v => props.updateDynamic("srcLang")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    kind.foreach(v => props.updateDynamic("kind")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    default.foreach(v => props.updateDynamic("default")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    src.foreach(v => props.updateDynamic("src")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    label.foreach(v => props.updateDynamic("label")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("track", props)
    else inlineReactElement("track", props)
  }


  def data(
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            value: U[InputValue] = undefined,
            contextMenu: U[String] = undefined,
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
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    value.foreach(v => props.updateDynamic("value")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("data", props, children: _*)
    else inlineReactElement("data", props, children: _*)
  }


  def small(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             contextMenu: U[String] = undefined,
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
             extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("small", props, children: _*)
    else inlineReactElement("small", props, children: _*)
  }


  def thead(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             contextMenu: U[String] = undefined,
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
             extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("thead", props, children: _*)
    else inlineReactElement("thead", props, children: _*)
  }


  def strong(
              tabIndex: U[Int] = undefined,
              is: U[String] = undefined,
              classID: U[String] = undefined,
              contentEditable: U[String] = undefined,
              role: U[String] = undefined,
              style: U[js.Any] = undefined,
              hidden: U[Boolean] = undefined,
              ref: U[(_ <: dom.html.Element) => _] = undefined,
              key: U[String | Int] = undefined,
              dir: U[String] = undefined,
              id: U[String] = undefined,
              draggable: U[Boolean] = undefined,
              accessKey: U[String] = undefined,
              className: U[String] = undefined,
              spellCheck: U[Boolean] = undefined,
              title: U[String] = undefined,
              lang: U[String] = undefined,
              contextMenu: U[String] = undefined,
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
              extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("strong", props, children: _*)
    else inlineReactElement("strong", props, children: _*)
  }


  def video(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             loop: U[Boolean] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             height: U[Int] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             crossOrigin: U[String] = undefined,
             key: U[String | Int] = undefined,
             poster: U[String] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             src: U[String] = undefined,
             mediaGroup: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             preload: U[String] = undefined,
             width: U[Int] = undefined,
             autoPlay: U[Boolean] = undefined,
             muted: U[Boolean] = undefined,
             contextMenu: U[String] = undefined,
             controls: U[Boolean] = undefined,
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
             extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onAbort.foreach(v => props.updateDynamic("onAbort")(v))
    onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
    controls.foreach(v => props.updateDynamic("controls")(v))
    onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onError.foreach(v => props.updateDynamic("onError")(v))
    loop.foreach(v => props.updateDynamic("loop")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onPlay.foreach(v => props.updateDynamic("onPlay")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    autoPlay.foreach(v => props.updateDynamic("autoPlay")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    preload.foreach(v => props.updateDynamic("preload")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    onEnded.foreach(v => props.updateDynamic("onEnded")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    src.foreach(v => props.updateDynamic("src")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    mediaGroup.foreach(v => props.updateDynamic("mediaGroup")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    onStalled.foreach(v => props.updateDynamic("onStalled")(v))
    onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onPause.foreach(v => props.updateDynamic("onPause")(v))
    onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
    onProgress.foreach(v => props.updateDynamic("onProgress")(v))
    onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    muted.foreach(v => props.updateDynamic("muted")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    poster.foreach(v => props.updateDynamic("poster")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("video", props, children: _*)
    else inlineReactElement("video", props, children: _*)
  }


  def div(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
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
           extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("div", props, children: _*)
    else inlineReactElement("div", props, children: _*)
  }


  def rp(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          contextMenu: U[String] = undefined,
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
          extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("rp", props, children: _*)
    else inlineReactElement("rp", props, children: _*)
  }


  def keygen(
              keyType: U[String] = undefined,
              challenge: U[String] = undefined,
              name: U[String] = undefined,
              tabIndex: U[Int] = undefined,
              is: U[String] = undefined,
              classID: U[String] = undefined,
              contentEditable: U[String] = undefined,
              role: U[String] = undefined,
              style: U[js.Any] = undefined,
              hidden: U[Boolean] = undefined,
              ref: U[(_ <: dom.html.Element) => _] = undefined,
              autoFocus: U[Boolean] = undefined,
              key: U[String | Int] = undefined,
              dir: U[String] = undefined,
              id: U[String] = undefined,
              draggable: U[Boolean] = undefined,
              accessKey: U[String] = undefined,
              className: U[String] = undefined,
              disabled: U[Boolean] = undefined,
              spellCheck: U[Boolean] = undefined,
              title: U[String] = undefined,
              lang: U[String] = undefined,
              form: U[String] = undefined,
              contextMenu: U[String] = undefined,
              keyParams: U[String] = undefined,
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
              extraAttributes: U[js.Object] = undefined) = {
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
    autoFocus.foreach(v => props.updateDynamic("autoFocus")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    keyType.foreach(v => props.updateDynamic("keyType")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    name.foreach(v => props.updateDynamic("name")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    challenge.foreach(v => props.updateDynamic("challenge")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    keyParams.foreach(v => props.updateDynamic("keyParams")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    form.foreach(v => props.updateDynamic("form")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    disabled.foreach(v => props.updateDynamic("disabled")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("keygen", props)
    else inlineReactElement("keygen", props)
  }


  def h2(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          contextMenu: U[String] = undefined,
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
          extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("h2", props, children: _*)
    else inlineReactElement("h2", props, children: _*)
  }


  def noscript(
                tabIndex: U[Int] = undefined,
                is: U[String] = undefined,
                classID: U[String] = undefined,
                contentEditable: U[String] = undefined,
                role: U[String] = undefined,
                style: U[js.Any] = undefined,
                hidden: U[Boolean] = undefined,
                ref: U[(_ <: dom.html.Element) => _] = undefined,
                key: U[String | Int] = undefined,
                dir: U[String] = undefined,
                id: U[String] = undefined,
                draggable: U[Boolean] = undefined,
                accessKey: U[String] = undefined,
                className: U[String] = undefined,
                spellCheck: U[Boolean] = undefined,
                title: U[String] = undefined,
                lang: U[String] = undefined,
                contextMenu: U[String] = undefined,
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
                extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("noscript", props, children: _*)
    else inlineReactElement("noscript", props, children: _*)
  }


  def rt(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          contextMenu: U[String] = undefined,
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
          extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("rt", props, children: _*)
    else inlineReactElement("rt", props, children: _*)
  }


  def em(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          contextMenu: U[String] = undefined,
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
          extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onAbort.foreach(v => props.updateDynamic("onAbort")(v))
    onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
    onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onError.foreach(v => props.updateDynamic("onError")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onPlay.foreach(v => props.updateDynamic("onPlay")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    onEnded.foreach(v => props.updateDynamic("onEnded")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    onStalled.foreach(v => props.updateDynamic("onStalled")(v))
    onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onPause.foreach(v => props.updateDynamic("onPause")(v))
    onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
    onProgress.foreach(v => props.updateDynamic("onProgress")(v))
    onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("em", props, children: _*)
    else inlineReactElement("em", props, children: _*)
  }


  def bdo(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
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
           extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("bdo", props, children: _*)
    else inlineReactElement("bdo", props, children: _*)
  }


  def abbr(
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            contextMenu: U[String] = undefined,
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
            extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("abbr", props, children: _*)
    else inlineReactElement("abbr", props, children: _*)
  }


  def ol(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          `type`: U[String] = undefined,
          start: U[Int] = undefined,
          reversed: U[Boolean] = undefined,
          contextMenu: U[String] = undefined,
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
          extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    start.foreach(v => props.updateDynamic("start")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    reversed.foreach(v => props.updateDynamic("reversed")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("ol", props, children: _*)
    else inlineReactElement("ol", props, children: _*)
  }


  def article(
               tabIndex: U[Int] = undefined,
               is: U[String] = undefined,
               classID: U[String] = undefined,
               contentEditable: U[String] = undefined,
               role: U[String] = undefined,
               style: U[js.Any] = undefined,
               hidden: U[Boolean] = undefined,
               ref: U[(_ <: dom.html.Element) => _] = undefined,
               key: U[String | Int] = undefined,
               dir: U[String] = undefined,
               id: U[String] = undefined,
               draggable: U[Boolean] = undefined,
               accessKey: U[String] = undefined,
               className: U[String] = undefined,
               spellCheck: U[Boolean] = undefined,
               title: U[String] = undefined,
               lang: U[String] = undefined,
               contextMenu: U[String] = undefined,
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
               extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("article", props, children: _*)
    else inlineReactElement("article", props, children: _*)
  }


  def ul(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          contextMenu: U[String] = undefined,
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
          extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("ul", props, children: _*)
    else inlineReactElement("ul", props, children: _*)
  }


  def q(
         tabIndex: U[Int] = undefined,
         is: U[String] = undefined,
         classID: U[String] = undefined,
         contentEditable: U[String] = undefined,
         role: U[String] = undefined,
         style: U[js.Any] = undefined,
         hidden: U[Boolean] = undefined,
         ref: U[(_ <: dom.html.Element) => _] = undefined,
         key: U[String | Int] = undefined,
         dir: U[String] = undefined,
         id: U[String] = undefined,
         cite: U[String] = undefined,
         draggable: U[Boolean] = undefined,
         accessKey: U[String] = undefined,
         className: U[String] = undefined,
         spellCheck: U[Boolean] = undefined,
         title: U[String] = undefined,
         lang: U[String] = undefined,
         contextMenu: U[String] = undefined,
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
         extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    cite.foreach(v => props.updateDynamic("cite")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("q", props, children: _*)
    else inlineReactElement("q", props, children: _*)
  }


  def textarea(
                name: U[String] = undefined,
                tabIndex: U[Int] = undefined,
                is: U[String] = undefined,
                classID: U[String] = undefined,
                readOnly: U[Boolean] = undefined,
                contentEditable: U[String] = undefined,
                role: U[String] = undefined,
                style: U[js.Any] = undefined,
                hidden: U[Boolean] = undefined,
                ref: U[(_ <: dom.html.Element) => _] = undefined,
                placeholder: U[String] = undefined,
                autoFocus: U[Boolean] = undefined,
                key: U[String | Int] = undefined,
                dir: U[String] = undefined,
                id: U[String] = undefined,
                wrap: U[String] = undefined,
                autoComplete: U[String] = undefined,
                draggable: U[Boolean] = undefined,
                accessKey: U[String] = undefined,
                className: U[String] = undefined,
                disabled: U[Boolean] = undefined,
                minLength: U[Int] = undefined,
                spellCheck: U[Boolean] = undefined,
                title: U[String] = undefined,
                lang: U[String] = undefined,
                form: U[String] = undefined,
                required: U[Boolean] = undefined,
                rows: U[Int] = undefined,
                maxLength: U[Int] = undefined,
                contextMenu: U[String] = undefined,
                cols: U[Int] = undefined,
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
                extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    minLength.foreach(v => props.updateDynamic("minLength")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    autoFocus.foreach(v => props.updateDynamic("autoFocus")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    autoComplete.foreach(v => props.updateDynamic("autoComplete")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    cols.foreach(v => props.updateDynamic("cols")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    maxLength.foreach(v => props.updateDynamic("maxLength")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    name.foreach(v => props.updateDynamic("name")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    readOnly.foreach(v => props.updateDynamic("readOnly")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    placeholder.foreach(v => props.updateDynamic("placeholder")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    wrap.foreach(v => props.updateDynamic("wrap")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    required.foreach(v => props.updateDynamic("required")(v))
    form.foreach(v => props.updateDynamic("form")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    disabled.foreach(v => props.updateDynamic("disabled")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    rows.foreach(v => props.updateDynamic("rows")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("textarea", props, children: _*)
    else inlineReactElement("textarea", props, children: _*)
  }


  def tfoot(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             contextMenu: U[String] = undefined,
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
             extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("tfoot", props, children: _*)
    else inlineReactElement("tfoot", props, children: _*)
  }


  def h3(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          contextMenu: U[String] = undefined,
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
          extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("h3", props, children: _*)
    else inlineReactElement("h3", props, children: _*)
  }


  def meta(
            name: U[String] = undefined,
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            charSet: U[String] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            httpEquiv: U[String] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            content: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            contextMenu: U[String] = undefined,
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
            extraAttributes: U[js.Object] = undefined) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    name.foreach(v => props.updateDynamic("name")(v))
    httpEquiv.foreach(v => props.updateDynamic("httpEquiv")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    charSet.foreach(v => props.updateDynamic("charSet")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    content.foreach(v => props.updateDynamic("content")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("meta", props)
    else inlineReactElement("meta", props)
  }


  def pre(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
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
           extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("pre", props, children: _*)
    else inlineReactElement("pre", props, children: _*)
  }


  def source(
              tabIndex: U[Int] = undefined,
              is: U[String] = undefined,
              classID: U[String] = undefined,
              contentEditable: U[String] = undefined,
              role: U[String] = undefined,
              style: U[js.Any] = undefined,
              hidden: U[Boolean] = undefined,
              ref: U[(_ <: dom.html.Element) => _] = undefined,
              key: U[String | Int] = undefined,
              dir: U[String] = undefined,
              id: U[String] = undefined,
              draggable: U[Boolean] = undefined,
              accessKey: U[String] = undefined,
              className: U[String] = undefined,
              src: U[String] = undefined,
              media: U[String] = undefined,
              spellCheck: U[Boolean] = undefined,
              title: U[String] = undefined,
              lang: U[String] = undefined,
              `type`: U[String] = undefined,
              contextMenu: U[String] = undefined,
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
              extraAttributes: U[js.Object] = undefined) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    src.foreach(v => props.updateDynamic("src")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    media.foreach(v => props.updateDynamic("media")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("source", props)
    else inlineReactElement("source", props)
  }


  def del(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           dateTime: U[String] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           cite: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
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
           extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    dateTime.foreach(v => props.updateDynamic("dateTime")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    cite.foreach(v => props.updateDynamic("cite")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("del", props, children: _*)
    else inlineReactElement("del", props, children: _*)
  }


  def ins(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           dateTime: U[String] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           cite: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
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
           extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    dateTime.foreach(v => props.updateDynamic("dateTime")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    cite.foreach(v => props.updateDynamic("cite")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("ins", props, children: _*)
    else inlineReactElement("ins", props, children: _*)
  }


  def figure(
              tabIndex: U[Int] = undefined,
              is: U[String] = undefined,
              classID: U[String] = undefined,
              contentEditable: U[String] = undefined,
              role: U[String] = undefined,
              style: U[js.Any] = undefined,
              hidden: U[Boolean] = undefined,
              ref: U[(_ <: dom.html.Element) => _] = undefined,
              key: U[String | Int] = undefined,
              dir: U[String] = undefined,
              id: U[String] = undefined,
              draggable: U[Boolean] = undefined,
              accessKey: U[String] = undefined,
              className: U[String] = undefined,
              spellCheck: U[Boolean] = undefined,
              title: U[String] = undefined,
              lang: U[String] = undefined,
              contextMenu: U[String] = undefined,
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
              extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("figure", props, children: _*)
    else inlineReactElement("figure", props, children: _*)
  }


  def s(
         tabIndex: U[Int] = undefined,
         is: U[String] = undefined,
         classID: U[String] = undefined,
         contentEditable: U[String] = undefined,
         role: U[String] = undefined,
         style: U[js.Any] = undefined,
         hidden: U[Boolean] = undefined,
         ref: U[(_ <: dom.html.Element) => _] = undefined,
         key: U[String | Int] = undefined,
         dir: U[String] = undefined,
         id: U[String] = undefined,
         draggable: U[Boolean] = undefined,
         accessKey: U[String] = undefined,
         className: U[String] = undefined,
         spellCheck: U[Boolean] = undefined,
         title: U[String] = undefined,
         lang: U[String] = undefined,
         contextMenu: U[String] = undefined,
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
         extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("s", props, children: _*)
    else inlineReactElement("s", props, children: _*)
  }


  def base(
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            target: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            href: U[String] = undefined,
            contextMenu: U[String] = undefined,
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
            extraAttributes: U[js.Object] = undefined) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    href.foreach(v => props.updateDynamic("href")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    target.foreach(v => props.updateDynamic("target")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("base", props)
    else inlineReactElement("base", props)
  }


  def hr(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          contextMenu: U[String] = undefined,
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
          extraAttributes: U[js.Object] = undefined) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("hr", props)
    else inlineReactElement("hr", props)
  }


  def wbr(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
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
           extraAttributes: U[js.Object] = undefined) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("wbr", props)
    else inlineReactElement("wbr", props)
  }


  def output(
              name: U[String] = undefined,
              tabIndex: U[Int] = undefined,
              is: U[String] = undefined,
              classID: U[String] = undefined,
              contentEditable: U[String] = undefined,
              role: U[String] = undefined,
              style: U[js.Any] = undefined,
              hidden: U[Boolean] = undefined,
              ref: U[(_ <: dom.html.Element) => _] = undefined,
              key: U[String | Int] = undefined,
              dir: U[String] = undefined,
              id: U[String] = undefined,
              draggable: U[Boolean] = undefined,
              accessKey: U[String] = undefined,
              className: U[String] = undefined,
              spellCheck: U[Boolean] = undefined,
              title: U[String] = undefined,
              lang: U[String] = undefined,
              form: U[String] = undefined,
              contextMenu: U[String] = undefined,
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
              extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    name.foreach(v => props.updateDynamic("name")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    form.foreach(v => props.updateDynamic("form")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("output", props, children: _*)
    else inlineReactElement("output", props, children: _*)
  }


  def col(
           span: U[Int] = undefined,
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
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
           extraAttributes: U[js.Object] = undefined) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    span.foreach(v => props.updateDynamic("span")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("col", props)
    else inlineReactElement("col", props)
  }


  def embed(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             height: U[Int] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             src: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             `type`: U[String] = undefined,
             width: U[Int] = undefined,
             contextMenu: U[String] = undefined,
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
             extraAttributes: U[js.Object] = undefined) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onAbort.foreach(v => props.updateDynamic("onAbort")(v))
    onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
    onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onError.foreach(v => props.updateDynamic("onError")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onPlay.foreach(v => props.updateDynamic("onPlay")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    onEnded.foreach(v => props.updateDynamic("onEnded")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    src.foreach(v => props.updateDynamic("src")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    onStalled.foreach(v => props.updateDynamic("onStalled")(v))
    onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onPause.foreach(v => props.updateDynamic("onPause")(v))
    onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
    onProgress.foreach(v => props.updateDynamic("onProgress")(v))
    onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("embed", props)
    else inlineReactElement("embed", props)
  }


  def b(
         tabIndex: U[Int] = undefined,
         is: U[String] = undefined,
         classID: U[String] = undefined,
         contentEditable: U[String] = undefined,
         role: U[String] = undefined,
         style: U[js.Any] = undefined,
         hidden: U[Boolean] = undefined,
         ref: U[(_ <: dom.html.Element) => _] = undefined,
         key: U[String | Int] = undefined,
         dir: U[String] = undefined,
         id: U[String] = undefined,
         draggable: U[Boolean] = undefined,
         accessKey: U[String] = undefined,
         className: U[String] = undefined,
         spellCheck: U[Boolean] = undefined,
         title: U[String] = undefined,
         lang: U[String] = undefined,
         contextMenu: U[String] = undefined,
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
         extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onAbort.foreach(v => props.updateDynamic("onAbort")(v))
    onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
    onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onError.foreach(v => props.updateDynamic("onError")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onPlay.foreach(v => props.updateDynamic("onPlay")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    onEnded.foreach(v => props.updateDynamic("onEnded")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    onStalled.foreach(v => props.updateDynamic("onStalled")(v))
    onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onPause.foreach(v => props.updateDynamic("onPause")(v))
    onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
    onProgress.foreach(v => props.updateDynamic("onProgress")(v))
    onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("b", props, children: _*)
    else inlineReactElement("b", props, children: _*)
  }


  def title(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             contextMenu: U[String] = undefined,
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
             extraAttributes: U[js.Object] = undefined)(children: ReactNode*) = {
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
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("title", props, children: _*)
    else inlineReactElement("title", props, children: _*)
  }


  def input(
             name: U[String] = undefined,
             formNoValidate: U[Boolean] = undefined,
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             accept: U[String] = undefined,
             step: U[String] = undefined,
             classID: U[String] = undefined,
             size: U[Int] = undefined,
             readOnly: U[Boolean] = undefined,
             pattern: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             checked: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             height: U[Int] = undefined,
             min: U[Double] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             placeholder: U[String] = undefined,
             inputMode: U[String] = undefined,
             autoFocus: U[Boolean] = undefined,
             key: U[String | Int] = undefined,
             formTarget: U[String] = undefined,
             htmlFor: U[String] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             autoComplete: U[String] = undefined,
             max: U[Double] = undefined,
             draggable: U[Boolean] = undefined,
             alt: U[String] = undefined,
             formMethod: U[String] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             src: U[String] = undefined,
             disabled: U[Boolean] = undefined,
             minLength: U[Int] = undefined,
             spellCheck: U[Boolean] = undefined,
             formEncType: U[String] = undefined,
             multiple: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             `type`: U[String] = undefined,
             form: U[String] = undefined,
             required: U[Boolean] = undefined,
             capture: U[Boolean] = undefined,
             width: U[Int] = undefined,
             value: U[InputValue] = undefined,
             maxLength: U[Int] = undefined,
             contextMenu: U[String] = undefined,
             formAction: U[String] = undefined,
             list: U[String] = undefined,
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
             extraAttributes: U[js.Object] = undefined) = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    formMethod.foreach(v => props.updateDynamic("formMethod")(v))
    min.foreach(v => props.updateDynamic("min")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    formAction.foreach(v => props.updateDynamic("formAction")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    inputMode.foreach(v => props.updateDynamic("inputMode")(v))
    minLength.foreach(v => props.updateDynamic("minLength")(v))
    max.foreach(v => props.updateDynamic("max")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    autoFocus.foreach(v => props.updateDynamic("autoFocus")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    autoComplete.foreach(v => props.updateDynamic("autoComplete")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    list.foreach(v => props.updateDynamic("list")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    maxLength.foreach(v => props.updateDynamic("maxLength")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    value.foreach(v => props.updateDynamic("value")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    size.foreach(v => props.updateDynamic("size")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    checked.foreach(v => props.updateDynamic("checked")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    alt.foreach(v => props.updateDynamic("alt")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    step.foreach(v => props.updateDynamic("step")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    formEncType.foreach(v => props.updateDynamic("formEncType")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    name.foreach(v => props.updateDynamic("name")(v))
    pattern.foreach(v => props.updateDynamic("pattern")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    readOnly.foreach(v => props.updateDynamic("readOnly")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    src.foreach(v => props.updateDynamic("src")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    formNoValidate.foreach(v => props.updateDynamic("formNoValidate")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    key.foreach(v => props.updateDynamic("key")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    multiple.foreach(v => props.updateDynamic("multiple")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    placeholder.foreach(v => props.updateDynamic("placeholder")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    ref.foreach(v => props.updateDynamic("ref")(v))
    htmlFor.foreach(v => props.updateDynamic("htmlFor")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    height.foreach(v => props.updateDynamic("height")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    required.foreach(v => props.updateDynamic("required")(v))
    form.foreach(v => props.updateDynamic("form")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    disabled.foreach(v => props.updateDynamic("disabled")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    capture.foreach(v => props.updateDynamic("capture")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    formTarget.foreach(v => props.updateDynamic("formTarget")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    accept.foreach(v => props.updateDynamic("accept")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("input", props)
    else inlineReactElement("input", props)
  }


}

     