package sri.web.vdom

import chandu0101.macros.tojs.{exclude, FunctionMacro}
import org.scalajs.dom
import sri.core._
import sri.web.SyntheticEvent
import sri.web.all._
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.LinkingInfo.developmentMode


trait HtmlTags1 {

  def progress(
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
                max: U[Double] = undefined,
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
    max.foreach(v => props.updateDynamic("max")(v))
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
    if (developmentMode) React.createElement("progress", props, children: _*)
    else inlineReactElement("progress", props, children: _*)
  }


  def dd(
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
    if (developmentMode) React.createElement("dd", props, children: _*)
    else inlineReactElement("dd", props, children: _*)
  }


  def bdi(
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
    if (developmentMode) React.createElement("bdi", props, children: _*)
    else inlineReactElement("bdi", props, children: _*)
  }


  def kbd(
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
    if (developmentMode) React.createElement("kbd", props, children: _*)
    else inlineReactElement("kbd", props, children: _*)
  }


  def picture(
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
    if (developmentMode) React.createElement("picture", props, children: _*)
    else inlineReactElement("picture", props, children: _*)
  }


  def option(
              tabIndex: U[Int] = undefined,
              is: U[String] = undefined,
              classID: U[String] = undefined,
              contentEditable: U[String] = undefined,
              role: U[String] = undefined,
              style: U[js.Any] = undefined,
              label: U[String] = undefined,
              hidden: U[Boolean] = undefined,
              ref: U[(_ <: dom.html.Element) => _] = undefined,
              selected: U[Boolean] = undefined,
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
    label.foreach(v => props.updateDynamic("label")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    selected.foreach(v => props.updateDynamic("selected")(v))
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
    if (developmentMode) React.createElement("option", props, children: _*)
    else inlineReactElement("option", props, children: _*)
  }


  def header(
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
    if (developmentMode) React.createElement("header", props, children: _*)
    else inlineReactElement("header", props, children: _*)
  }


  def nav(
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
    if (developmentMode) React.createElement("nav", props, children: _*)
    else inlineReactElement("nav", props, children: _*)
  }


  def sup(
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
    if (developmentMode) React.createElement("sup", props, children: _*)
    else inlineReactElement("sup", props, children: _*)
  }


  def ruby(
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
    if (developmentMode) React.createElement("ruby", props, children: _*)
    else inlineReactElement("ruby", props, children: _*)
  }


  def label(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             key: U[String | Int] = undefined,
             htmlFor: U[String] = undefined,
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
    htmlFor.foreach(v => props.updateDynamic("htmlFor")(v))
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
    if (developmentMode) React.createElement("label", props, children: _*)
    else inlineReactElement("label", props, children: _*)
  }


  def button(
              name: U[String] = undefined,
              formNoValidate: U[Boolean] = undefined,
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
              formTarget: U[String] = undefined,
              dir: U[String] = undefined,
              id: U[String] = undefined,
              draggable: U[Boolean] = undefined,
              formMethod: U[String] = undefined,
              accessKey: U[String] = undefined,
              className: U[String] = undefined,
              disabled: U[Boolean] = undefined,
              spellCheck: U[Boolean] = undefined,
              formEncType: U[String] = undefined,
              title: U[String] = undefined,
              lang: U[String] = undefined,
              `type`: U[String] = undefined,
              form: U[String] = undefined,
              value: U[InputValue] = undefined,
              contextMenu: U[String] = undefined,
              formAction: U[String] = undefined,
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
    formMethod.foreach(v => props.updateDynamic("formMethod")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    formAction.foreach(v => props.updateDynamic("formAction")(v))
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
    formEncType.foreach(v => props.updateDynamic("formEncType")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    name.foreach(v => props.updateDynamic("name")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
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
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    formTarget.foreach(v => props.updateDynamic("formTarget")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("button", props, children: _*)
    else inlineReactElement("button", props, children: _*)
  }


  def meter(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             optimum: U[Double] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             min: U[Double] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             low: U[Double] = undefined,
             id: U[String] = undefined,
             max: U[Double] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             value: U[InputValue] = undefined,
             contextMenu: U[String] = undefined,
             high: U[Double] = undefined,
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
    min.foreach(v => props.updateDynamic("min")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    high.foreach(v => props.updateDynamic("high")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    max.foreach(v => props.updateDynamic("max")(v))
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
    low.foreach(v => props.updateDynamic("low")(v))
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
    optimum.foreach(v => props.updateDynamic("optimum")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("meter", props, children: _*)
    else inlineReactElement("meter", props, children: _*)
  }


  def tr(
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
    if (developmentMode) React.createElement("tr", props, children: _*)
    else inlineReactElement("tr", props, children: _*)
  }


  def h1(
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
    if (developmentMode) React.createElement("h1", props, children: _*)
    else inlineReactElement("h1", props, children: _*)
  }


  def h6(
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
    if (developmentMode) React.createElement("h6", props, children: _*)
    else inlineReactElement("h6", props, children: _*)
  }


  def area(
            coords: U[String] = undefined,
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
            alt: U[String] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            target: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            shape: U[String] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            `type`: U[String] = undefined,
            href: U[String] = undefined,
            download: U[String] = undefined,
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
    shape.foreach(v => props.updateDynamic("shape")(v))
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
    alt.foreach(v => props.updateDynamic("alt")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    coords.foreach(v => props.updateDynamic("coords")(v))
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
    rel.foreach(v => props.updateDynamic("rel")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("area", props)
    else inlineReactElement("area", props)
  }


  def select(
              name: U[String] = undefined,
              tabIndex: U[Int] = undefined,
              is: U[String] = undefined,
              classID: U[String] = undefined,
              size: U[Int] = undefined,
              contentEditable: U[String] = undefined,
              role: U[String] = undefined,
              style: U[js.Any] = undefined,
              hidden: U[Boolean] = undefined,
              ref: U[(_ <: dom.html.Element) => _] = undefined,
              autoFocus: U[Boolean] = undefined,
              key: U[String | Int] = undefined,
              dir: U[String] = undefined,
              id: U[String] = undefined,
              autoComplete: U[String] = undefined,
              draggable: U[Boolean] = undefined,
              accessKey: U[String] = undefined,
              className: U[String] = undefined,
              disabled: U[Boolean] = undefined,
              spellCheck: U[Boolean] = undefined,
              multiple: U[Boolean] = undefined,
              value: U[InputValue] = undefined,
              title: U[String] = undefined,
              lang: U[String] = undefined,
              form: U[String] = undefined,
              required: U[Boolean] = undefined,
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
    autoFocus.foreach(v => props.updateDynamic("autoFocus")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    autoComplete.foreach(v => props.updateDynamic("autoComplete")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    size.foreach(v => props.updateDynamic("size")(v))
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
    multiple.foreach(v => props.updateDynamic("multiple")(v))
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
    required.foreach(v => props.updateDynamic("required")(v))
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
    if (developmentMode) React.createElement("select", props, children: _*)
    else inlineReactElement("select", props, children: _*)
  }


  def address(
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
    if (developmentMode) React.createElement("address", props, children: _*)
    else inlineReactElement("address", props, children: _*)
  }


  def footer(
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
    if (developmentMode) React.createElement("footer", props, children: _*)
    else inlineReactElement("footer", props, children: _*)
  }


  def th(
          tabIndex: U[Int] = undefined,
          is: U[String] = undefined,
          classID: U[String] = undefined,
          contentEditable: U[String] = undefined,
          role: U[String] = undefined,
          style: U[js.Any] = undefined,
          scope: U[String] = undefined,
          hidden: U[Boolean] = undefined,
          ref: U[(_ <: dom.html.Element) => _] = undefined,
          key: U[String | Int] = undefined,
          dir: U[String] = undefined,
          id: U[String] = undefined,
          draggable: U[Boolean] = undefined,
          accessKey: U[String] = undefined,
          className: U[String] = undefined,
          colSpan: U[Int] = undefined,
          rowSpan: U[Int] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          headers: U[String] = undefined,
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
    scope.foreach(v => props.updateDynamic("scope")(v))
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
    rowSpan.foreach(v => props.updateDynamic("rowSpan")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    colSpan.foreach(v => props.updateDynamic("colSpan")(v))
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
    headers.foreach(v => props.updateDynamic("headers")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("th", props, children: _*)
    else inlineReactElement("th", props, children: _*)
  }


  def caption(
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
    if (developmentMode) React.createElement("caption", props, children: _*)
    else inlineReactElement("caption", props, children: _*)
  }


  def map(
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
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("map", props, children: _*)
    else inlineReactElement("map", props, children: _*)
  }


  def details(
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
    if (developmentMode) React.createElement("details", props, children: _*)
    else inlineReactElement("details", props, children: _*)
  }


  def hgroup(
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
    if (developmentMode) React.createElement("hgroup", props, children: _*)
    else inlineReactElement("hgroup", props, children: _*)
  }


  def datalist(
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
    if (developmentMode) React.createElement("datalist", props, children: _*)
    else inlineReactElement("datalist", props, children: _*)
  }


  def h4(
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
    if (developmentMode) React.createElement("h4", props, children: _*)
    else inlineReactElement("h4", props, children: _*)
  }


  def aside(
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
    if (developmentMode) React.createElement("aside", props, children: _*)
    else inlineReactElement("aside", props, children: _*)
  }


  def `var`(
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
    if (developmentMode) React.createElement("var", props, children: _*)
    else inlineReactElement("var", props, children: _*)
  }


  def li(
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
    if (developmentMode) React.createElement("li", props, children: _*)
    else inlineReactElement("li", props, children: _*)
  }


  def span(
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
    if (developmentMode) React.createElement("span", props, children: _*)
    else inlineReactElement("span", props, children: _*)
  }


  def dl(
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
    if (developmentMode) React.createElement("dl", props, children: _*)
    else inlineReactElement("dl", props, children: _*)
  }


  def colgroup(
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
    if (developmentMode) React.createElement("colgroup", props, children: _*)
    else inlineReactElement("colgroup", props, children: _*)
  }


  def `object`(
                name: U[String] = undefined,
                tabIndex: U[Int] = undefined,
                is: U[String] = undefined,
                classID: U[String] = undefined,
                contentEditable: U[String] = undefined,
                role: U[String] = undefined,
                style: U[js.Any] = undefined,
                data: U[String] = undefined,
                hidden: U[Boolean] = undefined,
                height: U[Int] = undefined,
                ref: U[(_ <: dom.html.Element) => _] = undefined,
                key: U[String | Int] = undefined,
                dir: U[String] = undefined,
                id: U[String] = undefined,
                draggable: U[Boolean] = undefined,
                accessKey: U[String] = undefined,
                className: U[String] = undefined,
                useMap: U[String] = undefined,
                spellCheck: U[Boolean] = undefined,
                title: U[String] = undefined,
                lang: U[String] = undefined,
                `type`: U[String] = undefined,
                form: U[String] = undefined,
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
    useMap.foreach(v => props.updateDynamic("useMap")(v))
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
    data.foreach(v => props.updateDynamic("data")(v))
    width.foreach(v => props.updateDynamic("width")(v))
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
    height.foreach(v => props.updateDynamic("height")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    form.foreach(v => props.updateDynamic("form")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("object", props, children: _*)
    else inlineReactElement("object", props, children: _*)
  }


  def p(
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
    if (developmentMode) React.createElement("p", props, children: _*)
    else inlineReactElement("p", props, children: _*)
  }


  def mark(
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
    if (developmentMode) React.createElement("mark", props, children: _*)
    else inlineReactElement("mark", props, children: _*)
  }


  def style(
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
             media: U[String] = undefined,
             scoped: U[String] = undefined,
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
    scoped.foreach(v => props.updateDynamic("scoped")(v))
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
    if (developmentMode) React.createElement("style", props, children: _*)
    else inlineReactElement("style", props, children: _*)
  }


  def table(
             tabIndex: U[Int] = undefined,
             is: U[String] = undefined,
             classID: U[String] = undefined,
             cellSpacing: U[String] = undefined,
             contentEditable: U[String] = undefined,
             role: U[String] = undefined,
             style: U[js.Any] = undefined,
             hidden: U[Boolean] = undefined,
             ref: U[(_ <: dom.html.Element) => _] = undefined,
             cellPadding: U[String] = undefined,
             key: U[String | Int] = undefined,
             dir: U[String] = undefined,
             id: U[String] = undefined,
             draggable: U[Boolean] = undefined,
             accessKey: U[String] = undefined,
             className: U[String] = undefined,
             spellCheck: U[Boolean] = undefined,
             title: U[String] = undefined,
             lang: U[String] = undefined,
             summary: U[String] = undefined,
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
    cellSpacing.foreach(v => props.updateDynamic("cellSpacing")(v))
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
    cellPadding.foreach(v => props.updateDynamic("cellPadding")(v))
    summary.foreach(v => props.updateDynamic("summary")(v))
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
    if (developmentMode) React.createElement("table", props, children: _*)
    else inlineReactElement("table", props, children: _*)
  }


  def html(
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
            manifest: U[String] = undefined,
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
    manifest.foreach(v => props.updateDynamic("manifest")(v))
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
    if (developmentMode) React.createElement("html", props, children: _*)
    else inlineReactElement("html", props, children: _*)
  }


  def canvas(
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
              spellCheck: U[Boolean] = undefined,
              title: U[String] = undefined,
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
    height.foreach(v => props.updateDynamic("height")(v))
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
    if (developmentMode) React.createElement("canvas", props, children: _*)
    else inlineReactElement("canvas", props, children: _*)
  }


  def time(
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
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("time", props, children: _*)
    else inlineReactElement("time", props, children: _*)
  }


  def head(
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
            profile: U[String] = undefined,
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
    profile.foreach(v => props.updateDynamic("profile")(v))
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
    if (developmentMode) React.createElement("head", props, children: _*)
    else inlineReactElement("head", props, children: _*)
  }


  def fieldset(
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
                disabled: U[Boolean] = undefined,
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
    disabled.foreach(v => props.updateDynamic("disabled")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("fieldset", props, children: _*)
    else inlineReactElement("fieldset", props, children: _*)
  }


  def dialog(
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
    if (developmentMode) React.createElement("dialog", props, children: _*)
    else inlineReactElement("dialog", props, children: _*)
  }


  def dfn(
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
    if (developmentMode) React.createElement("dfn", props, children: _*)
    else inlineReactElement("dfn", props, children: _*)
  }


  def form(
            method: U[String] = undefined,
            name: U[String] = undefined,
            tabIndex: U[Int] = undefined,
            is: U[String] = undefined,
            classID: U[String] = undefined,
            contentEditable: U[String] = undefined,
            role: U[String] = undefined,
            style: U[js.Any] = undefined,
            acceptCharset: U[String] = undefined,
            hidden: U[Boolean] = undefined,
            ref: U[(_ <: dom.html.Element) => _] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            autoComplete: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            encType: U[String] = undefined,
            target: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            noValidate: U[Boolean] = undefined,
            action: U[String] = undefined,
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
    action.foreach(v => props.updateDynamic("action")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    autoComplete.foreach(v => props.updateDynamic("autoComplete")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    encType.foreach(v => props.updateDynamic("encType")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    method.foreach(v => props.updateDynamic("method")(v))
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
    acceptCharset.foreach(v => props.updateDynamic("acceptCharset")(v))
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
    noValidate.foreach(v => props.updateDynamic("noValidate")(v))
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
    if (developmentMode) React.createElement("form", props, children: _*)
    else inlineReactElement("form", props, children: _*)
  }


  def tbody(
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
    if (developmentMode) React.createElement("tbody", props, children: _*)
    else inlineReactElement("tbody", props, children: _*)
  }


  def summary(
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
    if (developmentMode) React.createElement("summary", props, children: _*)
    else inlineReactElement("summary", props, children: _*)
  }


  def legend(
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
    if (developmentMode) React.createElement("legend", props, children: _*)
    else inlineReactElement("legend", props, children: _*)
  }


  def img(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           height: U[Int] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           crossOrigin: U[String] = undefined,
           key: U[String | Int] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           alt: U[String] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           src: U[String] = undefined,
           useMap: U[String] = undefined,
           srcSet: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           width: U[Int] = undefined,
           contextMenu: U[String] = undefined,
           onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onLoad: U[(_ <: SyntheticEvent[_]) => _] = undefined,
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
    useMap.foreach(v => props.updateDynamic("useMap")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onError.foreach(v => props.updateDynamic("onError")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    width.foreach(v => props.updateDynamic("width")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    alt.foreach(v => props.updateDynamic("alt")(v))
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
    onLoad.foreach(v => props.updateDynamic("onLoad")(v))
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
    srcSet.foreach(v => props.updateDynamic("srcSet")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("img", props)
    else inlineReactElement("img", props)
  }


  def link(
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
            crossOrigin: U[String] = undefined,
            key: U[String | Int] = undefined,
            dir: U[String] = undefined,
            id: U[String] = undefined,
            draggable: U[Boolean] = undefined,
            accessKey: U[String] = undefined,
            className: U[String] = undefined,
            media: U[String] = undefined,
            spellCheck: U[Boolean] = undefined,
            sizes: U[String] = undefined,
            title: U[String] = undefined,
            lang: U[String] = undefined,
            `type`: U[String] = undefined,
            href: U[String] = undefined,
            integrity: U[String] = undefined,
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
    sizes.foreach(v => props.updateDynamic("sizes")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    href.foreach(v => props.updateDynamic("href")(v))
    crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    integrity.foreach(v => props.updateDynamic("integrity")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    hrefLang.foreach(v => props.updateDynamic("hrefLang")(v))
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
    rel.foreach(v => props.updateDynamic("rel")(v))
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    media.foreach(v => props.updateDynamic("media")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("link", props)
    else inlineReactElement("link", props)
  }


  def h5(
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
    if (developmentMode) React.createElement("h5", props, children: _*)
    else inlineReactElement("h5", props, children: _*)
  }


  def script(
              defer: U[Boolean] = undefined,
              tabIndex: U[Int] = undefined,
              is: U[String] = undefined,
              classID: U[String] = undefined,
              nonce: U[String] = undefined,
              contentEditable: U[String] = undefined,
              role: U[String] = undefined,
              style: U[js.Any] = undefined,
              hidden: U[Boolean] = undefined,
              ref: U[(_ <: dom.html.Element) => _] = undefined,
              charSet: U[String] = undefined,
              crossOrigin: U[String] = undefined,
              key: U[String | Int] = undefined,
              dir: U[String] = undefined,
              id: U[String] = undefined,
              async: U[Boolean] = undefined,
              draggable: U[Boolean] = undefined,
              accessKey: U[String] = undefined,
              className: U[String] = undefined,
              src: U[String] = undefined,
              spellCheck: U[Boolean] = undefined,
              title: U[String] = undefined,
              lang: U[String] = undefined,
              `type`: U[String] = undefined,
              integrity: U[String] = undefined,
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
    defer.foreach(v => props.updateDynamic("defer")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    async.foreach(v => props.updateDynamic("async")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    integrity.foreach(v => props.updateDynamic("integrity")(v))
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
    nonce.foreach(v => props.updateDynamic("nonce")(v))
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
    `type`.foreach(v => props.updateDynamic("type")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("script", props, children: _*)
    else inlineReactElement("script", props, children: _*)
  }


  def main(
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
    if (developmentMode) React.createElement("main", props, children: _*)
    else inlineReactElement("main", props, children: _*)
  }


  def br(
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
    if (developmentMode) React.createElement("br", props)
    else inlineReactElement("br", props)
  }


  def i(
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
    if (developmentMode) React.createElement("i", props, children: _*)
    else inlineReactElement("i", props, children: _*)
  }


  def td(
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
          colSpan: U[Int] = undefined,
          rowSpan: U[Int] = undefined,
          spellCheck: U[Boolean] = undefined,
          title: U[String] = undefined,
          lang: U[String] = undefined,
          headers: U[String] = undefined,
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
    rowSpan.foreach(v => props.updateDynamic("rowSpan")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    colSpan.foreach(v => props.updateDynamic("colSpan")(v))
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
    headers.foreach(v => props.updateDynamic("headers")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if (extraAttributes.isDefined && extraAttributes != null) addJsObjects(props, extraAttributes.get)
    if (developmentMode) React.createElement("td", props, children: _*)
    else inlineReactElement("td", props, children: _*)
  }
}