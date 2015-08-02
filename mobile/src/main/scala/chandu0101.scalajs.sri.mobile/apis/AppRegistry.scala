package chandu0101.scalajs.sri.mobile.apis

import scala.scalajs.js


trait AppRegistry extends js.Object {

  def registerConfig(config: js.Array[js.Object]): Unit = js.native

  def registerComponent(appKey: String, getComponentFunc: js.Function): Unit = js.native

  def registerRunnable(appKey: String, getComponentFunc: js.Function): Unit = js.native

  def runApplication(appKey: String, appParameters: js.Any): Unit = js.native
}
