package sri.addons.perf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
 * wrapper for react-addons-perf
 */

@js.native
trait ReactPerf extends js.Object {

  def start(): Unit = js.native

  def stop(): Unit = js.native

  def printInclusive(): Unit = js.native

  def printWasted(): Unit = js.native

  def printDOM(): Unit = js.native

  def getLastMeasurements(): js.Dynamic = js.native

}

@JSImport("react-addons-perf", JSImport.Namespace)
@js.native
object ReactPerf extends ReactPerf