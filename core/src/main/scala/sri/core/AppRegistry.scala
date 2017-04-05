package sri.core

import scala.scalajs.js

@js.native
trait AppRegistry extends js.Object {

  def registerConfig(config: js.Array[AppConfig]): Unit = js.native

  def registerComponent(appKey: String, getComponentFunc: js.Function0[ReactClass]): Unit = js.native

  def registerRunnable(appKey: String, getComponentFunc: js.Function): Unit = js.native

  def runApplication(appKey: String, appParameters: js.Any): Unit = js.native
}
