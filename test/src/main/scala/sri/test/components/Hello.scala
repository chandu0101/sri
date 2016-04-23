package sri.test.components

import sri.core.ElementFactory._
import sri.core.{React, ReactComponent}
import sri.universal.ReactUniversal
import scalajs.js.Dynamic.{literal => json}
import sri.universal.components.View
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object Hello {


  @ScalaJSDefined
  class Component extends ReactComponent[String, Unit] {
    def render() = null
  }

  val factory = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(factory,"hi", key = "hkey", ref = ref)
}
