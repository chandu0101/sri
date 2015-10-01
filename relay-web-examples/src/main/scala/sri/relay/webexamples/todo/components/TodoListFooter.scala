package sri.relay.webexamples.todo.components

import sri.core.{ReactComponentFactory, React, ElementFactory}
import sri.relay.container.{RelayContainer, RelayContainerSpec, Fragments}
import sri.relay.container.RelayContainer.Fragment
import sri.relay.query.RelayQL
import sri.relay.webexamples.todo.mutations.RemoveCompletedTodosMutation
import sri.relay.{RelayElementFactory, Relay, RelayComponent}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object TodoListFooter {

  @ScalaJSDefined
  class Component extends RelayComponent[Props, Unit] {

    def handleRemoveCompletedTodosClick(): Unit = {
      val mp = propsDynamic
        Relay.Store.update(
          new RemoveCompletedTodosMutation {
            override val props = json(
              "todos" -> mp.viewer.todos,
              "viewer" -> mp.viewer
            )
          }
        )
    }

    def render() = {
      val numTodos = propsDynamic.viewer.totalCount.asInstanceOf[Int]
      val numCompletedTodos = propsDynamic.viewer.completedCount.asInstanceOf[Int]

        footer(json("className" -> "footer"),
          span(json("className" -> "todo-count"),
            strong(null, numTodos), "item", {if (numTodos.asInstanceOf[Int] == 1) "" else "s"}, " left"
          ),
//          ul(json("className" -> "filters"), Seq(
//            li(null, "IndexLink to="/" activeClassName="selected">All</IndexLink"),
//            li(null, "<Link to="/active" activeClassName="selected">Active</Link>"),
//            li(null, "<Link to=\"/completed\" activeClassName=\"selected\">Completed</Link>")
//          )),
      {
        if(numCompletedTodos > 0)
          button(json("className" -> "clear-completed", "onClick" -> (() => handleRemoveCompletedTodosClick())), "Clear completed")
        else
          div(null, "")
      }
      )
    }
  }

  val frag: Fragment = () => js.eval(RelayQL(
    """
 fragment on User {
  completedCount,
  todos(status: "completed", first: $limit) {
    ${RemoveCompletedTodosMutation.getFragment('todos')},
  },
  totalCount,
  ${RemoveCompletedTodosMutation.getFragment('viewer')},
}
    """))

  val f : js.Function = () => {
    json(
      "limit" -> 100
    )
  }
  val container = Relay.createContainer(RelayElementFactory.getTypedConstructor(js.constructorOf[Component],classOf[Component]), new RelayContainerSpec {
    override val fragments = Fragments("viewer" -> frag)
    override val prepareVariables: js.UndefOr[js.Function] = f
  })

  case class Props(todos: js.Dynamic, viewer: js.Dynamic)

  val ctor = js.constructorOf[Component]

  val factory = ElementFactory.getComponentFactory(ctor,classOf[Component])

  def apply(props: Props, key: UndefOr[String] = js.undefined, ref: js.Function = null) = React.createElement(container,json(todos = props.todos,viewer = props.viewer))

}
