package sri.mobile.examples.router

import sri.core.ElementFactory._
import sri.core.ReactElement
import sri.mobile.components._
import sri.mobile.router
import sri.mobile.router.MobileRouterComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object SecondScreen {

  @ScalaJSDefined
  class Component extends MobileRouterComponent[Unit, Unit] {
    override def render(): ReactElement = View(style = styles.container)(
      Text(onPress = onTextClick _)("Second screen ")
    )
    def onTextClick() = {
      navigateToHome()
    }
  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  def apply() = createElementNoProps(factory)
}

