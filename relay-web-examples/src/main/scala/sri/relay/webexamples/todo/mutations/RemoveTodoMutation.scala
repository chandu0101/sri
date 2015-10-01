package sri.relay.webexamples.todo.mutations

import sri.relay.mutation.RelayMutation
import sri.relay.query.RelayQL
import sri.relay.tools.RelayTypes.{Variables, MutationFragment}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object RemoveTodoMutation {
  val ctor = js.constructorOf[RemoveTodoMutation]
  ctor.getFragment = js.Dynamic.global.Relay.Mutation.getFragment
  ctor.fragments = js.Dynamic.literal(
    "todo" -> (() => js.eval(RelayQL(
      """
         fragment on Todo {
                complete,
                id,
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
abstract class RemoveTodoMutation extends RelayMutation {

  override def getMutation(): MutationFragment = js.eval(RelayQL("mutation{removeTodo}"))

  override def getFatQuery(): js.Any = js.eval(RelayQL(
    """
       fragment on RemoveTodoPayload {
              deletedTodoId,
              viewer {
                completedCount,
                totalCount
              },
            }
    """))

  override def getVariables(): Variables = js.Dictionary(
    "id" -> props.todo.id
  )

  override def getConfigs(): js.Array[js.Dictionary[js.Any]] = js.Array(js.Dictionary(
    "type" -> "NODE_DELETE",
    "parentName" -> "viewer",
    "parentID" -> props.viewer.id,
    "connectionName" -> "todos",
    "deletedIDFieldName" -> "deletedTodoId"
  ))

  override def getOptimisticResponse(): js.UndefOr[js.Dictionary[js.Any]] = {
    val viewerPayload = js.Dynamic.literal(
      "id" -> props.viewer.id
    )
    if(props.viewer.completedCount != null) {
      val completedCount = if(props.todo.complete.asInstanceOf[Boolean])
        props.viewer.completedCount.asInstanceOf[Int] - 1
      else
        props.viewer.completedCount.asInstanceOf[Int]

      viewerPayload.updateDynamic("completedCount")(completedCount)
    }
    if(props.viewer.totalCount != null) {
      viewerPayload.updateDynamic("totalCount")(props.viewer.totalCount.asInstanceOf[Int] - 1)
    }

    js.Dynamic.literal(
      "deletedTodoId" -> props.todo.id,
      "viewer" -> viewerPayload
    ).asInstanceOf[js.Dictionary[js.Any]]
  }

}
