package sri.relay.webexamples.todo.mutations

import sri.relay.mutation.RelayMutation
import sri.relay.query.RelayQL
import sri.relay.tools.RelayTypes.{Variables, MutationFragment}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object MarkAllTodosMutation {
  val ctor = js.constructorOf[MarkAllTodosMutation]
  ctor.getFragment = js.Dynamic.global.Relay.Mutation.getFragment
  ctor.fragments = js.Dynamic.literal(
    "todos" -> (() => js.eval(RelayQL(
      """
         fragment on TodoConnection {
                edges {
                  node {
                    complete,
                   id
                  }
                }
              }
      """))),
    "viewer" -> (() => js.eval(RelayQL(
      """
         fragment on User {
                id,
                totalCount
              }
      """)))
  )
}

@ScalaJSDefined
abstract class MarkAllTodosMutation extends RelayMutation {

  override def getMutation(): MutationFragment = js.eval(RelayQL("mutation{markAllTodos}"))

  override def getFatQuery(): js.Any = js.eval(RelayQL(
    """
       fragment on MarkAllTodosPayload {
              viewer {
                completedCount,
                todos
              }
            }
    """))

  override def getVariables(): Variables = js.Dictionary(
    "complete" -> props.complete
  )

  override def getConfigs(): js.Array[js.Dictionary[js.Any]] = js.Array(js.Dictionary(
    "type" -> "FIELDS_CHANGE",
    "fieldIDs" -> js.Dynamic.literal(
      "viewer" -> props.viewer.id
    )
  ))

  override def getOptimisticResponse(): js.UndefOr[js.Dictionary[js.Any]] = {
    val viewerPayload = js.Dynamic.literal(
      "id" -> props.viewer.id
    )
    if(props.todos != null && props.todos.edges != null) {
      viewerPayload.updateDynamic("todos")(js.Dynamic.literal(
        "edges" -> props.todos.edges.asInstanceOf[js.Array[js.Dynamic]]
          .filter(_.complete != props.complete)
          .map(e => js.Dynamic.literal(
            "node" -> js.Dynamic.literal(
              "complete" -> props.complete,
              "id" -> e.node.id
            )
          ))
      ))
    }
    if(props.viewer.totalCount != null) {
      val completedCount = if(props.complete.asInstanceOf[Boolean])
        props.viewer.totalCount.asInstanceOf[Int]
      else 0
      viewerPayload.updateDynamic("completedCount")(completedCount)
    }
    viewerPayload.asInstanceOf[js.Dictionary[js.Any]]
  }

}
