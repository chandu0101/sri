package sri.universal
package components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js


case class TextInput(onBlur: js.UndefOr[(ReactEvent) => Unit] = js.undefined,
                     placeholderTextColor: js.UndefOr[String] = js.undefined,
                     multiline: js.UndefOr[Boolean] = js.undefined,
                     maxLength: js.UndefOr[Int] = js.undefined,
                     style: js.UndefOr[js.Any] = js.undefined,
                     onChange: js.UndefOr[(ReactEvent) => Unit] = js.undefined,
                     onSelectionChange: js.UndefOr[(ReactEvent) => Unit] = js.undefined,
                     underlineColorAndroid: js.UndefOr[String] = js.undefined,
                     keyboardType: js.UndefOr[KeyboardType] = js.undefined,
                     onLayout: js.UndefOr[js.Function] = js.undefined,
                     selectionState: js.UndefOr[DocumentSelectionState] = js.undefined,
                     enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
                     clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
                     ref: js.UndefOr[TextInputM => _] = js.undefined,
                     textAlignVertical: js.UndefOr[TextAlignVertical] = js.undefined,
                     onSubmitEditing: js.UndefOr[ReactEvent => Unit] = js.undefined,
                     placeholder: js.UndefOr[String] = js.undefined,
                     textAlign: js.UndefOr[TextAlign] = js.undefined,
                     onChangeText: js.UndefOr[(String) => Unit] = js.undefined,
                     autoFocus: js.UndefOr[Boolean] = js.undefined,
                     autoCorrect: js.UndefOr[Boolean] = js.undefined,
                     autoCapitalize: js.UndefOr[AutoCapitalize] = js.undefined,
                     key: js.UndefOr[String] = js.undefined,
                     bufferDelay: js.UndefOr[Int] = js.undefined,
                     onEndEditing: js.UndefOr[ReactEvent => Unit] = js.undefined,
                     testID: js.UndefOr[String] = js.undefined,
                     returnKeyType: js.UndefOr[ReturnKeyType] = js.undefined,
                     onFocus: js.UndefOr[(ReactEvent) => Unit] = js.undefined,
                     clearButtonMode: js.UndefOr[String] = js.undefined,
                     value: js.UndefOr[String] = js.undefined,
                     defaultValue: js.UndefOr[String] = js.undefined,
                     selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
                     editable: js.UndefOr[Boolean] = js.undefined,
                     blurOnSubmit: js.UndefOr[Boolean] = js.undefined,
                     password: js.UndefOr[Boolean] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[TextInput](this)
    React.createElement(ReactUniversal.TextInput,props,children :_*)
  }
}


/**
 * mounted TextInput component methods
 */
@js.native
trait TextInputM extends js.Object {

  def blur(): Unit = js.native

  def focus(): Unit = js.native

}


class AutoCapitalize private(val value: String) extends AnyVal

object AutoCapitalize {

  val NONE = new AutoCapitalize("none")

  val SENTENCES = new AutoCapitalize("sentences")

  val WORDS = new AutoCapitalize("words")

  val CHARACTERS = new AutoCapitalize("characters")

  def newType(name: String) = new AutoCapitalize(name)

}

class KeyboardType private(val value: String) extends AnyVal

object KeyboardType {

  val DEFAULT = new KeyboardType("default")
  val NUMERIC = new KeyboardType("numeric")
  val EMAIL_ADDRESS = new KeyboardType("email-address")
  val ASCII_CAPABLE = new KeyboardType("ascii-capable")
  val NUMBERS_AND_PUNCTUATION = new KeyboardType("numbers-and-punctuation")
  val URL = new KeyboardType("url")
  val NUMBER_PAD = new KeyboardType("number-pad")
  val PHONE_PAD = new KeyboardType("phone-pad")
  val NUMBER_HONE_PAD = new KeyboardType("name-phone-pad")
  val DECIMAL_PAD = new KeyboardType("decimal-pad")
  val TWITTER = new KeyboardType("twitter")
  val WEB_SEARCH = new KeyboardType("web-search")

}

class ReturnKeyType private(val value: String) extends AnyVal

object ReturnKeyType {

  val DEFAULT = new ReturnKeyType("default")
  val GO = new ReturnKeyType("go")
  val GOOGLE = new ReturnKeyType("google")
  val JOIN = new ReturnKeyType("join")
  val NEXT = new ReturnKeyType("next")
  val ROUTE = new ReturnKeyType("route")
  val SEARCH = new ReturnKeyType("search")
  val SEND = new ReturnKeyType("send")
  val YAHOO = new ReturnKeyType("yahoo")
  val DONE = new ReturnKeyType("done")
  val EMERGENCY_CALL = new ReturnKeyType("emergency-call")
}

class TextAlign private(val value: String) extends AnyVal

object TextAlign {

  val START = new TextAlign("start")
  val CENTER = new TextAlign("center")
  val END = new TextAlign("end")
}

class TextAlignVertical private(val value: String) extends AnyVal

object TextAlignVertical {

  val TOP = new TextAlignVertical("top")
  val CENTER = new TextAlignVertical("center")
  val BOTTOM = new TextAlignVertical("bottom")
}