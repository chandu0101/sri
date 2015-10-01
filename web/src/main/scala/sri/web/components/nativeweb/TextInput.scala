package sri.web.components

package nativeweb

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.NEvent

import scala.scalajs.js


case class TextInput(onBlur: U[(NEvent) => Unit] = undefined,
                     placeholderTextColor: U[String] = undefined,
                     multiline: U[Boolean] = undefined,
                     autoComplete: U[Boolean] = undefined,
                     accessibilityLabel: U[String] = undefined,
                     maxLength: U[Int] = undefined,
                     maxNumberOfLines: U[Int] = undefined,
                     style: U[js.Any] = undefined,
                     onChange: U[(NEvent) => Unit] = undefined,
                     keyboardType: U[KeyboardType] = undefined,
                     onLayout: U[js.Function] = undefined,
                     clearTextOnFocus: U[Boolean] = undefined,
                     onSelectionChange: U[SelectionChange => _] = undefined,
                     ref: U[TextInputM => _] = undefined,
                     placeholder: U[String] = undefined,
                     onChangeText: U[(String) => Unit] = undefined,
                     autoFocus: U[Boolean] = undefined,
                     key: U[String] = undefined,
                     bufferDelay: U[Int] = undefined,
                     testID: U[String] = undefined,
                     onFocus: U[(NEvent) => Unit] = undefined,
                     value: U[String] = undefined,
                     defaultValue: U[String] = undefined,
                     selectTextOnFocus: U[Boolean] = undefined,
                     editable: U[Boolean] = undefined,
                     password: U[Boolean] = undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[TextInput](this)
    React.createElement(ReactNativeWeb.TextInput, props, children: _*)
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

class KeyboardType private(val value: String) extends AnyVal

object KeyboardType {

  val DEFAULT = new KeyboardType("default")
  val NUMERIC = new KeyboardType("numeric")
  val EMAIL_ADDRESS = new KeyboardType("email-address")
  val URL = new KeyboardType("url")
  val PHONE_PAD = new KeyboardType("phone-pad")

}

@js.native
trait SelectionChange extends js.Object {
  val selectionDirection: String = js.native
  val selectionEnd: js.Dynamic = js.native
  val selectionStart: js.Dynamic = js.native
  val nativeEvent: js.Dynamic = js.native
}