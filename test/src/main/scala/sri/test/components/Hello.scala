package sri.test.components

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.universal.components.View
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object Hello {


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = View()()
  }

  val factory = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(factory, key = key, ref = ref)
}
