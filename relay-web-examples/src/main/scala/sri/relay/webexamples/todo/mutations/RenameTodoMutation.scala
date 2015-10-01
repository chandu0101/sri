package sri.relay.webexamples.todo.mutations

import sri.relay.mutation.RelayMutation
import sri.relay.query.RelayQL
import sri.relay.tools.RelayTypes.{Variables, MutationFragment}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object RenameTodoMutation {
  val ctor = js.constructorOf[RenameTodoMutation]
  ctor.getFragment = js.Dynamic.global.Relay.Mutation.getFragment
  ctor.fragments = js.Dynamic.literal(
    "todo" -> (() => js.eval(RelayQL(
      """
         fragment on Todo {
                id,
              }
      """)))
  )
}

@ScalaJSDefined
abstract class RenameTodoMutation extends RelayMutation {

  override def getMutation(): MutationFragment = js.eval(RelayQL("mutation{renameTodo}"))

  override def getFatQuery(): js.Any = js.eval(RelayQL(
    """
       fragment on RenameTodoPayload {
              todo {
                text,
              }
            }
    """))

  override def getVariables(): Variables = js.Dictionary(
  "id" -> props.todo.id,
  "text" -> props.text
  )

  override def getConfigs(): js.Array[js.Dictionary[js.Any]] = js.Array(js.Dictionary(
    "type" -> "FIELDS_CHANGE",
    "fieldIDs" -> js.Dynamic.literal(
      "todo" -> props.todo.id
    )
  ))

  override def getOptimisticResponse(): js.UndefOr[js.Dictionary[js.Any]] = {
    js.Dynamic.literal(
      "todo" -> js.Dynamic.literal(
        "id" -> props.todo.id,
        "text" -> props.text
      )
    ).asInstanceOf[js.Dictionary[js.Any]]
  }

}
