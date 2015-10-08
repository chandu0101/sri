package sri.mobile.examples.router.components

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}


object ThirdModuleHomeScreen {


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = View(style = styles.container)(
     Text()("Third Module Home Screen")
    )
  }

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElementNoProps(factory, key = key, ref = ref)
}
