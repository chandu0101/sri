package sri.relay.webexamples.todo.mutations

import sri.relay.mutation.RelayMutation
import sri.relay.query.RelayQL
import sri.relay.tools.RelayTypes.{Variables, MutationFragment}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object AddTodoMutation {
  val ctor = js.constructorOf[AddTodoMutation]
  ctor.getFragment = js.Dynamic.global.Relay.Mutation.getFragment
  ctor.fragments = js.Dynamic.literal(
  "viewer" -> (() => js.eval(RelayQL("""
    fragment on User {
    id,
    totalCount
  }
  """)))
  )
}

@ScalaJSDefined
abstract class AddTodoMutation extends RelayMutation {

  override def getMutation(): MutationFragment = js.eval(RelayQL("mutation{addTodo}"))

  override def getFatQuery(): js.Any = js.eval(RelayQL("""
fragment on AddTodoPayload {
  todoEdge,
  viewer {
    todos,
    totalCount
  }
}
     """))

  override def getVariables(): Variables = js.Dictionary(
    "text" -> props.text
  )

  override def getConfigs(): js.Array[js.Dictionary[js.Any]] = js.Array(js.Dictionary(
    "type" -> "RANGE_ADD",
    "parentID" -> props.viewer.id,
    "connectionName" -> "todos",
    "edgeName" -> "todoEdge",
    "rangeBehaviors" -> js.Dynamic.literal(
      "" -> "append",
      "status(any)" -> "append",
      "status(active)" -> "append",
      "status(complete)" -> null
    )
  ))

  override def getOptimisticResponse(): js.UndefOr[js.Dictionary[js.Any]] = js.Dictionary(
    "todoEdge" -> js.Dynamic.literal(
      "node" -> js.Dynamic.literal(
        "complete" -> false,
        "text" -> props.text
      )
    ),
    "viewer" -> js.Dynamic.literal(
      "id" -> props.viewer.id,
      "totalCount" -> (props.viewer.totalCount.asInstanceOf[Int] + 1)
    )
  ).asInstanceOf[js.Dictionary[js.Any]]

}
