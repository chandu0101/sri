package sri.relay.webexamples.todo.components

import org.scalajs.{dom => jsdom}
import sri.core.{ElementFactory, ReactComponent}
import sri.relay.RelayComponent
import sri.web.ReactDOM

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined
import sri.relay.RelayElementFactory._
object TodoTextInput {

  val ENTER_KEY_CODE = 13
  val ESC_KEY_CODE = 27

  case class State(text: String, isEditing: Boolean)

  case class Props(className: String = "",
                   commitOnBlur: Boolean = false,
                   initialValue: String = "",
                   onCancel: () => Unit = () => Unit,
                   onDelete: () => Unit = () => Unit,
                   onSave: (String) => Unit = (String) => Unit,
                   placeholder: String = "")

  @ScalaJSDefined
  class Component extends RelayComponent[Props, State] {

    initialState(State("", false))

    override  def componentDidMount() = {
      ReactDOM.findDOMNode(this.asInstanceOf[ReactComponent[Any, Any]]).asInstanceOf[js.Dynamic].focus()
    }

    def commitChanges() = {
      val newText = state.text.trim
      if (newText == "") {
        props.onDelete()
      } else if (newText == props.initialValue) {
        props.onCancel()
      } else if (newText != "") {
        props.onSave(newText)
        setState(state.copy(""))
      }
    }

    def handleBlur() = {
      if (props.commitOnBlur) {
        commitChanges()
      }
    }

    def handleChange(e: jsdom.Event) = {
      setState(state.copy(text = e.target.asInstanceOf[js.Dynamic].value.asInstanceOf[String]))
    }

    def handleKeyDown(e: jsdom.Event) = {
      if (e.asInstanceOf[js.Dynamic].keyCode.asInstanceOf[Int] == ESC_KEY_CODE) {
        props.onCancel()
      } else if (e.asInstanceOf[js.Dynamic].keyCode.asInstanceOf[Int] == ENTER_KEY_CODE) {
        commitChanges()
      }
    }

    def render() = {
        input(json(
        "className" -> props.className,
        "onBlur" -> (() => handleBlur()),
        "onChange" -> ((e: jsdom.Event) => handleChange(e)),
        "onKeyDown" -> ((e: jsdom.Event) => handleKeyDown(e)),
        "placeholder" -> props.placeholder,
        "value" -> state.text))
    }
  }

  val factory = ElementFactory.getComponentFactory(js.constructorOf[Component],classOf[Component])

  def apply(props: Props, key: UndefOr[String] = js.undefined, ref: js.Function = null) = ElementFactory.createElement(factory, props)

}
