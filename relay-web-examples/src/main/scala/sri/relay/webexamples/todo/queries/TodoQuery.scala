package sri.relay.webexamples.todo.queries

import sri.relay.container.RelayContainer.RootQueries
import sri.relay.container.RootQueries
import sri.relay.query.RelayQL
import sri.relay.route.RelayQueryConfig.Params
import sri.relay.route.{Params, RelayQueryConfig}

import scala.scalajs.js

object TodoQuery {
  def apply() = new RelayQueryConfig {
    override val name: String = "TodoRoute"
    override val queries: RootQueries = RootQueries("viewer" -> { () => js.eval(RelayQL(
      """
          query { viewer }
      """))
    })
    override val params: Params = Params()
  }
}
