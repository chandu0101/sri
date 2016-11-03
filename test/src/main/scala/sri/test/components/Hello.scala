package sri.test.components

import sri.core.ElementFactory._
import sri.core.ReactComponent
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object Hello {


  @ScalaJSDefined
  class Component extends ReactComponent[String, Unit] {
    def render() = null
  }

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component]("hi", key = "hkey", ref = ref)
}
