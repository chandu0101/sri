package sri.web.examples.relay.starwars.queries

import scala.scalajs.js.Dynamic.{literal => json}

//object StarWarsAppHomeQuery {
//
//  def apply(factionNames: js.Array[String]) = new RelayQueryConfig {
//    override val queries: Dictionary[Any] = Dictionary("factions" -> (() => js.eval(RelayQL( """query { factions(names: $factionNames)}"""))))
//    override val name: String = "StarWarsAppHomeQuery"
//    override val params: UndefOr[Object] = json(factionNames = factionNames)
//  }
//}
//
