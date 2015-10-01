package sri.relay.webexamples.todo.components

import org.scalajs.{dom => jsdom}
import sri.core.React
import sri.relay.RelayElementFactory._
import sri.relay.container.RelayContainer.Fragment
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.relay.query.RelayQL
import sri.relay.webexamples.todo.mutations.{ChangeTodoStatusMutation, RemoveTodoMutation, RenameTodoMutation}
import sri.relay.{Relay, RelayComponent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object Todo {

  case class State(isEditing: Boolean = false)

  @ScalaJSDefined
  class Component extends RelayComponent[Props, State] {

    initialState(State(false))

    def handleCompleteChange(e: js.Dynamic) = {
      val complete = e.target.asInstanceOf[js.Dynamic].checked.asInstanceOf[Boolean]
      val mp = props
      Relay.Store.update(new ChangeTodoStatusMutation {
        override val props = json(
          "complete" -> complete,
          "todo" -> mp.todo,
          "viewer" -> mp.viewer
        )
      })
    }

    def handleDestroyClick() = {
      removeTodo()
    }

    def handleLabelDoubleClick() = {
      setEditMode(true)
    }

    def handleTextInputCancel() = {
      setEditMode(false)
    }

    def handleTextInputDelete() = {
      setEditMode(false)
      removeTodo()
    }

    def handleTextInputSave(text: String) = {
      setEditMode(false)
      val mp = props
      Relay.Store.update(new RenameTodoMutation {
        override val props = json(
          "todo" -> mp.todo,
          "text" -> text
        )
      })
    }

    def removeTodo() = {
      val mp = props
      Relay.Store.update(new RemoveTodoMutation {
        override val props = json(
          "todo" -> mp.todo,
          "viewer" -> mp.viewer
        )
      })
    }

    def setEditMode(shouldEdit: Boolean) = {
      setState(State(shouldEdit))
    }

    def renderTextInput() = {
      TodoTextInput(TodoTextInput.Props(className = "edit",
        commitOnBlur = true,
        initialValue = propsDynamic.todo.text.asInstanceOf[String],
        onCancel = () => handleTextInputCancel(),
        onDelete = () => handleTextInputDelete(),
        onSave = (text: String) => handleTextInputSave(text)
      ))
    }

    def render() = {
      var className = Seq.empty[String]
      if (propsDynamic.todo.complete.asInstanceOf[Boolean])
        className = className :+ "completed"
      if (state.isEditing)
        className = className :+ "editing"
      li(json(
        "className" -> className.mkString(" ")
      ),
        div(json("className" -> "view"),
          input(json(
            "checked" -> propsDynamic.todo.complete,
            "className" -> "toggle",
            "onChange" -> ((e: js.Dynamic) => handleCompleteChange(e)),
            "type" -> "checkbox")),
          label(json(
            "onDoubleClick" -> (() => handleLabelDoubleClick())),
            propsDynamic.todo.text.asInstanceOf[String]),
          button(json(
            "className" -> "destroy",
            "onClick" -> (() => handleDestroyClick())
          ))
          //           {
          //            if (state.isEditing) {
          //              renderTextInput()
          //            } else {
          //              div(null, "")
          //            }
          //          }
        )
      )
    }
  }

  val todoFrag: Fragment = () => js.eval(RelayQL(
    """
  fragment on Todo {
    complete,
    id,
    text,
    ${ChangeTodoStatusMutation.getFragment('todo')},
    ${RemoveTodoMutation.getFragment('todo')},
    ${RenameTodoMutation.getFragment('todo')},
  }
    """))


  val viewerFrag: Fragment = () => js.eval(RelayQL(
    """
  fragment on User {
    ${ChangeTodoStatusMutation.getFragment('viewer')},
    ${RemoveTodoMutation.getFragment('viewer')},
  }
    """))

  val ctor = js.constructorOf[Component]

  val f : js.Function = () => {
    json(
      "limit" -> 100
    )
  }
  val container = Relay.createContainer(getTypedConstructor(ctor, classOf[Component]), new RelayContainerSpec {
    override val fragments = Fragments("todo" -> todoFrag, "viewer" -> viewerFrag)
    override val prepareVariables : js.UndefOr[js.Function] = f
  })

  case class Props(todo: js.Dynamic, viewer: js.Dynamic)

  def apply(props: Props, key: UndefOr[String] = js.undefined, ref: js.Function = null) = React.createElement(container, json(todo = props.todo, viewer = props.viewer))

}
