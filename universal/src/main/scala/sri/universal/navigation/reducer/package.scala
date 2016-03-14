package sri.universal.navigation

import scala.scalajs.js

package object reducer {

  type ReducerFunc = js.Function1[NavigationState,NavigationState]

  def defaultReducerFunc(defaultValue : NavigationState): ReducerFunc = {
    (state: NavigationState) => if(state != null) state else defaultValue
  }
}
