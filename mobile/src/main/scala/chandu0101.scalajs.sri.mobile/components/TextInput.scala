package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

/**
 * Created by chandrasekharkode on 3/31/15.
 *
 * key: PropTypes.string,
    ref: PropTypes.string,
    style: PropTypes.js.Any,
    autoCapitalize: PropTypes.AutoCapitalize,
    autoCorrect: PropTypes.bool,
    autoFocus: PropTypes.bool,
     bufferDelay: PropTypes.number,
    clearButtonMode: PropTypes.string,
    clearTextOnFocus: PropTypes.bool,
    controlled: PropTypes.bool,
    editable: PropTypes.bool,
    enablesReturnKeyAutomatically: PropTypes.bool,
    keyboardType: PropTypes.KeyboardType,
    multiline: PropTypes.bool,
    onBlur: PropTypes.(NEvent) => Unit,
    onChange: PropTypes.(NEvent) => Unit,
    onChangeText: PropTypes.(String) => Unit,
    onEndEditing: PropTypes.NEvent => Unit,
    onFocus: PropTypes.(NEvent) => Unit,
    onLayout: PropTypes.func,
    onSubmitEditing: PropTypes.NEvent => Unit,
    password: PropTypes.bool,
    placeholder: PropTypes.string,
    placeholderTextColor: PropTypes.string,
    returnKeyType: PropTypes.ReturnKeyType,
    selectTextOnFocus: PropTypes.bool,
    selectionState: PropTypes.DocumentSelectionState,
    testID: PropTypes.string,
    textAlign: PropTypes.TextAlign,
    textAlignVertical: PropTypes.TextAlignVertical,
    underlineColorAndroid: PropTypes.string,
    value: PropTypes.string,

 */


case class TextInput(onBlur: js.UndefOr[(NEvent) => Unit] = js.undefined,
                placeholderTextColor: js.UndefOr[String] = js.undefined,
                multiline: js.UndefOr[Boolean] = js.undefined,
                style: js.UndefOr[js.Any] = js.undefined,
                onChange: js.UndefOr[(NEvent) => Unit] = js.undefined,
                underlineColorAndroid: js.UndefOr[String] = js.undefined,
                keyboardType: js.UndefOr[KeyboardType] = js.undefined,
                onLayout: js.UndefOr[js.Function] = js.undefined,
                selectionState: js.UndefOr[DocumentSelectionState] = js.undefined,
                enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
                clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
                ref: js.UndefOr[String] = js.undefined,
                textAlignVertical: js.UndefOr[TextAlignVertical] = js.undefined,
                onSubmitEditing: js.UndefOr[NEvent => Unit] = js.undefined,
                placeholder: js.UndefOr[String] = js.undefined,
                textAlign: js.UndefOr[TextAlign] = js.undefined,
                onChangeText: js.UndefOr[(String) => Unit] = js.undefined,
                autoFocus: js.UndefOr[Boolean] = js.undefined,
                autoCorrect: js.UndefOr[Boolean] = js.undefined,
                autoCapitalize: js.UndefOr[AutoCapitalize] = js.undefined,
                key: js.UndefOr[String] = js.undefined,
                bufferDelay: js.UndefOr[Int] = js.undefined,
                onEndEditing: js.UndefOr[NEvent => Unit] = js.undefined,
                testID: js.UndefOr[String] = js.undefined,
                returnKeyType: js.UndefOr[ReturnKeyType] = js.undefined,
                controlled: js.UndefOr[Boolean] = js.undefined,
                onFocus: js.UndefOr[(NEvent) => Unit] = js.undefined,
                clearButtonMode: js.UndefOr[String] = js.undefined,
                value: js.UndefOr[String] = js.undefined,
                selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
                editable: js.UndefOr[Boolean] = js.undefined,
                password: js.UndefOr[Boolean] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    onBlur.foreach(v => p.updateDynamic("onBlur")(v))
    placeholderTextColor.foreach(v => p.updateDynamic("placeholderTextColor")(v))
    multiline.foreach(v => p.updateDynamic("multiline")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    onChange.foreach(v => p.updateDynamic("onChange")(v))
    underlineColorAndroid.foreach(v => p.updateDynamic("underlineColorAndroid")(v))
    keyboardType.foreach(v => p.updateDynamic("keyboardType")(v.tpe))
    onLayout.foreach(v => p.updateDynamic("onLayout")(v))
    selectionState.foreach(v => p.updateDynamic("selectionState")(v))
    enablesReturnKeyAutomatically.foreach(v => p.updateDynamic("enablesReturnKeyAutomatically")(v))
    clearTextOnFocus.foreach(v => p.updateDynamic("clearTextOnFocus")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    textAlignVertical.foreach(v => p.updateDynamic("textAlignVertical")(v.dir))
    onSubmitEditing.foreach(v => p.updateDynamic("onSubmitEditing")(v))
    placeholder.foreach(v => p.updateDynamic("placeholder")(v))
    textAlign.foreach(v => p.updateDynamic("textAlign")(v.dir))
    onChangeText.foreach(v => p.updateDynamic("onChangeText")(v))
    autoFocus.foreach(v => p.updateDynamic("autoFocus")(v))
    autoCorrect.foreach(v => p.updateDynamic("autoCorrect")(v))
    autoCapitalize.foreach(v => p.updateDynamic("autoCapitalize")(v.name))
    key.foreach(v => p.updateDynamic("key")(v))
    bufferDelay.foreach(v => p.updateDynamic("bufferDelay")(v))
    onEndEditing.foreach(v => p.updateDynamic("onEndEditing")(v))
    testID.foreach(v => p.updateDynamic("testID")(v))
    returnKeyType.foreach(v => p.updateDynamic("returnKeyType")(v.tpe))
    controlled.foreach(v => p.updateDynamic("controlled")(v))
    onFocus.foreach(v => p.updateDynamic("onFocus")(v))
    clearButtonMode.foreach(v => p.updateDynamic("clearButtonMode")(v))
    value.foreach(v => p.updateDynamic("value")(v))
    selectTextOnFocus.foreach(v => p.updateDynamic("selectTextOnFocus")(v))
    editable.foreach(v => p.updateDynamic("editable")(v))
    password.foreach(v => p.updateDynamic("password")(v))
    p
  }

  def apply(children: ReactElement*) = {
    val f = ReactNative.createFactory(ReactNative.TextInput)
    if (children.isEmpty) f(toJS).asInstanceOf[ReactElement]
    else f(toJS, children.toJSArray).asInstanceOf[ReactElement]
  }
}


/**
 * mounted TextInput component methods
 */
trait TextInputM extends js.Object {

  def blur(): Unit = js.native

}


class AutoCapitalize private(val name: String) extends AnyVal

object AutoCapitalize {

  val NONE = new AutoCapitalize("none")

  val SENTENCES = new AutoCapitalize("sentences")

  val WORDS = new AutoCapitalize("words")

  val CHARACTERS = new AutoCapitalize("characters")

  def newType(name: String) = new AutoCapitalize(name)

}

class KeyboardType private(val tpe: String) extends AnyVal

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

class ReturnKeyType private(val tpe: String) extends AnyVal

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

class TextAlign private(val dir: String) extends AnyVal

object TextAlign {

  val START = new TextAlign("start")
  val CENTER = new TextAlign("center")
  val END = new TextAlign("end")
}

class TextAlignVertical private(val dir: String) extends AnyVal

object TextAlignVertical {

  val TOP = new TextAlignVertical("top")
  val CENTER = new TextAlignVertical("center")
  val BOTTOM = new TextAlignVertical("bottom")
}