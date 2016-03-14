package sri.universal.navigation

import sri.core.{ReactClass, ReactComponent, ReactComponentConstructor}
import sri.universal.ReactUniversal

import scala.scalajs.js

@js.native
trait NavigationContainer extends js.Object {

  def create[C <: ReactComponent[_, _]](Component: ReactComponentConstructor[C]): ReactComponentConstructor[C] = js.native

  val RootContainer : ReactClass = js.native
}
