package sri.relay.webexamples.todo.mutations

import sri.relay.mutation.RelayMutation
import sri.relay.query.RelayQL
import sri.relay.tools.RelayTypes.{Variables, MutationFragment}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object ChangeTodoStatusMutation {
  val ctor = js.constructorOf[ChangeTodoStatusMutation]
  ctor.getFragment = js.Dynamic.global.Relay.Mutation.getFragment
  ctor.fragments = js.Dynamic.literal(
    "todo" -> (() => js.eval(RelayQL(
      """
         fragment on Todo {
          id
         }
      """))),
    "viewer" -> (() => js.eval(RelayQL(
      """
         fragment on User {
          id,
          completedCount
         }
      """)))
  )
}

@ScalaJSDefined
abstract class ChangeTodoStatusMutation extends RelayMutation {

  override def getMutation(): MutationFragment = js.eval(RelayQL("mutation{changeTodoStatus}"))

  override def getFatQuery(): js.Any = js.eval(RelayQL(
    """
       fragment on ChangeTodoStatusPayload {
              todo {
                complete,
              },
              viewer {
                completedCount,
                todos,
              },
            }
    """))

  override def getVariables(): Variables = js.Dictionary(
    "complete" -> props.complete,
    "id" -> props.todo.id
  )

  override def getConfigs(): js.Array[js.Dictionary[js.Any]] = js.Array(js.Dictionary(
    "type" -> "FIELDS_CHANGE",
    "fieldIDs" -> js.Dynamic.literal(
      "todo" -> props.todo.id,
      "viewer" -> props.viewer.id
    )
  ))

  override def getOptimisticResponse(): js.UndefOr[js.Dictionary[js.Any]] = {
    val viewerPayload = js.Dynamic.literal(
      "id" -> props.viewer.id
    )
    if(props.viewer.completedCount != null) {
      val completedCount = if(props.complete.asInstanceOf[Boolean])
        props.viewer.completedCount.asInstanceOf[Int] + 1
      else
        props.viewer.completedCount.asInstanceOf[Int] - 1

      viewerPayload.updateDynamic("completedCount")(completedCount)
    }

    js.Dictionary(
      "todo" -> js.Dynamic.literal(
        "complete" -> props.complete,
        "id" -> props.todo.id
      ),
      "viewer" -> viewerPayload
    ).asInstanceOf[js.Dictionary[js.Any]]
  }

}
