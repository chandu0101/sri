package chandu0101.scalajs.sri.web.router

import chandu0101.scalajs.sri.core.ReactComponent

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
abstract class WebRouterComponent[P,S] extends ReactComponent[P,S]{

  var routercontrol : String = ""

  override def componentWillMount(): Unit = {
    routercontrol = context.hello.toString
  }
}
