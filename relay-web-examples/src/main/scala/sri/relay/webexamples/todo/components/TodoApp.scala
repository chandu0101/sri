package sri.relay.webexamples.todo.components

import sri.core.ReactElement
import sri.relay.container.{RelayContainerSpec, Fragments}
import sri.relay.container.RelayContainer.Fragment
import sri.relay.query.RelayQL
import sri.relay.webexamples.todo.mutations.AddTodoMutation
import sri.relay.{Relay, RelayComponent}
import sri.relay.RelayElementFactory._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined

object TodoApp {

  @ScalaJSDefined
  class Component extends RelayComponent[Props, Unit] {

    def handleTextInputSave(text: String): Unit = {
      Relay.Store.update(new AddTodoMutation {
        override val props = js.Dynamic.literal(
          "text" -> text,
          "viewer" -> propsDynamic.viewer
        )
      })
    }

    def render() = {
      js.Dynamic.global.console.log(propsDynamic.viewer)
//      println(s"ok rendering here : ${JSON.stringify(propsDynamic.viewer)}")
      val hasTodos = propsDynamic.viewer.totalCount.asInstanceOf[Int] > 0
      div(null,
        section(json("className" -> "todoapp"),
        Seq(
          header(json("className" -> "header"),
            h1(null, "todos")
//            TodoTextInput(TodoTextInput.Props(className = "new-todo", onSave = (text: String) => handleTextInputSave(text), placeholder = "What needs to be done?"))
          )
        ) ++
          {
            if(hasTodos) {
              Seq(
                TodoList(TodoList.Props(todos = propsDynamic.viewer.todos, viewer = propsDynamic.viewer)),
                TodoListFooter(TodoListFooter.Props(todos = propsDynamic.viewer.todos, viewer = propsDynamic.viewer))
              )
            } else
              Seq.empty[ReactElement]
          } ++
          Seq(
            footer(json("className" -> "info"),
              p(null, "Double-click to edit a todo"),
              p(null, "Created by the ", a(json("href" -> "https://facebook.github.io/relay/"), " Relay team")),
              p(null, "Part of ", a(json("href" -> "http://todomvc.com"), "TodoMVC"))
            )
          )
        )
      )
    }
  }

  val frag: Fragment = () => js.eval(RelayQL(
    """
fragment on User {
  totalCount,
  ${AddTodoMutation.getFragment('viewer')},
  ${TodoListFooter.getFragment('viewer')},
}
    """))

  val container = Relay.createContainer(getTypedConstructor(js.constructorOf[Component],classOf[Component]), new RelayContainerSpec {
    override val fragments = Fragments("viewer" -> frag)
  })

  case class Props()
}
