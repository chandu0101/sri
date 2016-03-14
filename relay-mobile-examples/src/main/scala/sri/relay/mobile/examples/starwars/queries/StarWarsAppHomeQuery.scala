package sri.relay.mobile.examples.starwars.queries

import sri.relay.container.RootQueries
import sri.relay.query.RelayQL
import sri.relay.route.{Params, RelayQueryConfig}

import scala.scalajs.js
import scalajs.js.Dynamic.{literal => json}

object StarWarsAppHomeQuery {

  def apply(factionNames: js.Array[String]) = new RelayQueryConfig {
    override val queries = RootQueries("factions" -> (() => js.eval(RelayQL( """query { factions(names: $factionNames)}"""))))
    override val name: String = "StarWarsAppHomeQuery"
    override val params = json("factionNames" -> factionNames)
  }


}

