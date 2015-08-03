package chandu0101.scalajs.sri.mobile.examples

import chandu0101.scalajs.sri.core
import chandu0101.scalajs.sri.core.ReactComponent
import chandu0101.scalajs.sri.mobile._
import chandu0101.scalajs.sri.mobile.components._

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.ScalaJSDefined


case class State(count: Int = 0)

@ScalaJSDefined
class SriMobile extends ReactComponent[Any, State] {

  def render() = {
    View()(Text()("dude sad sad asd sad sadsadsa"))
  }
}

object MobileApp extends JSApp {

  val huh = ReactNative.createClass(json(render = () => {
    core.createElement(instance = new SriMobile, props = ())
  }))

  def main() = {
    println(s"dude 2")
    val rootComponent = core.createElement(instance = new SriMobile, props = ())
    ReactNative.AppRegistry.registerComponent("SriMobile", () => createMobileRoot(rootComponent))
  }
}
