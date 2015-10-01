package sri.relay.webexamples.todo.mutations

import sri.relay.mutation.RelayMutation
import sri.relay.query.RelayQL
import sri.relay.tools.RelayTypes.{Variables, MutationFragment}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object RemoveCompletedTodosMutation {
  val ctor = js.constructorOf[RemoveCompletedTodosMutation]
  ctor.getFragment = js.Dynamic.global.Relay.Mutation.getFragment
  ctor.fragments = js.Dynamic.literal(
    "todos" -> (() => js.eval(RelayQL(
      """
         fragment on TodoConnection {
                edges {
                  node {
                    complete,
                    id,
                  },
                },
              }
      """))),
    "viewer" -> (() => js.eval(RelayQL(
      """
         fragment on User {
                completedCount,
                id,
                totalCount,
              }
      """)))
  )
}

@ScalaJSDefined
abstract class RemoveCompletedTodosMutation extends RelayMutation {

  override def getMutation(): MutationFragment = js.eval(RelayQL("mutation{removeCompletedTodos}"))

  override def getFatQuery(): js.Any = js.eval(RelayQL(
    """
       fragment on RemoveCompletedTodosPayload {
              deletedTodoIds,
              viewer {
                completedCount,
                totalCount,
              },
            }
    """))

  override def getVariables(): Variables = js.Dictionary()

  override def getConfigs(): js.Array[js.Dictionary[js.Any]] = js.Array(js.Dictionary(
    "type" -> "NODE_DELETE",
    "parentName" -> "viewer",
    "parentID" -> props.viewer.id,
    "connectionName" -> "todos",
    "deletedIDFieldName" -> "deletedTodoIds"
  ))

  override def getOptimisticResponse(): js.UndefOr[js.Dictionary[js.Any]] = {
    val deletedTodoIds = if (props.todos != null && props.todos.edges != null) {
      Some(props.todos.edges.asInstanceOf[js.Array[js.Dynamic]]
      .filter(_.node.complete.asInstanceOf[Boolean])
      .map(_.node.id))
    } else None

    val newTotalCount = if (props.viewer.completedCount != null && props.viewer.totalCount != null) {
      Some(props.viewer.totalCount.asInstanceOf[Int] - props.viewer.completedCount.asInstanceOf[Int])
    } else None

    val viewer = js.Dynamic.literal(
      "completedCount" -> 0,
      "id" -> props.viewer.id
    )
    newTotalCount.foreach(v => viewer.updateDynamic("totalCount")(v))
    val result = js.Dynamic.literal(
      "viewer" -> viewer
    )
    deletedTodoIds.foreach(v => result.updateDynamic("deletedTodoIds")(v))
    result.asInstanceOf[js.Dictionary[js.Any]]
  }

}
