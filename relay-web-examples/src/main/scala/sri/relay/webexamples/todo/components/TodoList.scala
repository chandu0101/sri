package sri.relay.webexamples.todo.components

import org.scalajs.dom
import sri.core.React
import sri.relay.container.RelayContainer.Fragment
import sri.relay.container.{Fragments, RelayContainerSpec}
import sri.relay.query.RelayQL
import sri.relay.tools.RelayTypes.Variables
import sri.relay.webexamples.todo.mutations.MarkAllTodosMutation
import sri.relay.{Relay, RelayComponent, RelayElementFactory}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, UndefOr}

object TodoList {

  case class State(isEditing: Boolean = false)

  @ScalaJSDefined
  class Component extends RelayComponent[Props, State] {

    def handleMarkAllChange(e: js.Dynamic) = {
      val complete = e.target.asInstanceOf[js.Dynamic].checked.asInstanceOf[Boolean]
      val mp = propsDynamic
      Relay.Store.update(
        new MarkAllTodosMutation {
          override val props = json(
            "complete" -> complete,
            "todos" -> mp.viewer.todos,
            "viewer" -> mp.viewer
          )
        }
      )
    }

    def renderTodos() = {
      println("viewer: " + JSON.stringify(propsDynamic.viewer))
      propsDynamic.viewer.todos.edges.asInstanceOf[js.Array[js.Dynamic]].map { edge =>
        Todo(Todo.Props(todo = edge.node, viewer = props.viewer), edge.node.id.asInstanceOf[String])
      }
    }

    def render() = {
      dom.window.console.log(propsDynamic.viewer)
      val numTodos = propsDynamic.viewer.totalCount.asInstanceOf[Int]
      val numCompletedTodos = propsDynamic.viewer.completedCount.asInstanceOf[Int]
      section(json("className" -> "main"),
        input(json(
          "checked" -> {
            numTodos == numCompletedTodos
          },
          "className" -> "toggle-all",
          "onChange" -> ((e: js.Dynamic) => handleMarkAllChange(e)),
          "type" -> "checkbox"
        )),
        label(json("htmlFor" -> "toggle-all"), "Mark all as complete"),
        ul(json("className" -> "todo-list"), renderTodos().toSeq)
      )
    }
  }

  val frag: Fragment = () => js.eval(RelayQL(
    """
 fragment on User {
  completedCount,
  todos(status: $status, first: $limit) {
    edges {
      node {
        id,
        ${Todo.getFragment('todo')},
      },
    },
    ${MarkAllTodosMutation.getFragment('todos')},
  },
  totalCount,
  ${MarkAllTodosMutation.getFragment('viewer')},
  ${Todo.getFragment('viewer')},
}
    """))

  val f : js.Function = (variables: Variables) => {
    val x = variables.asInstanceOf[js.Dynamic]
    val status = x.status.asInstanceOf[String]
    val nextStatus = if (status == "active" || status == "completed")
      status
    else
      "any"
    json(
      "status" -> nextStatus,
      "limit" -> 100
    )
  }
  val container = Relay.createContainer(RelayElementFactory.getTypedConstructor(js.constructorOf[Component], classOf[Component]), new RelayContainerSpec {
    override val initialVariables : js.UndefOr[js.Object] = json(
      "status" -> null
    )
    override val fragments = Fragments("viewer" -> frag)
    override val prepareVariables : js.UndefOr[js.Function] = f
    }
  )


  case class Props(todos: js.Dynamic, viewer: js.Dynamic)

  val ctor = js.constructorOf[Component]


  def apply(props: Props, key: UndefOr[String] = js.undefined, ref: js.Function = null) = {
//    println(s"creating elements ${JSON.stringify(props.viewer)}")
    React.createElement(container, json(todos = props.todos, viewer = props.viewer))
  }

}
