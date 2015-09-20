package sri.mobile.examples.router

import sri.core.ElementFactory._
import sri.core.ReactElement
import sri.mobile.components._
import RouterExampleApp.Second
import sri.mobile.router
import sri.mobile.router.MobileRouterComponent
import sri.mobile.styles.MobileStyleSheet
import sri.mobile.examples.router.RouterExampleApp.Second

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object HomeScreen {

  @ScalaJSDefined
  class Component extends MobileRouterComponent[Unit, Unit] {
    override def render(): ReactElement = View(style = styles.container)(
      Text(onPress = onTextClick _)("Home Screen ... ")
    )

    def onTextClick() = {
      navigateToStatic(Second)
    }
  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply() = createElementNoProps(factory)
}

object styles extends MobileStyleSheet {

  val container = style(flexOne, alignItems.center, justifyContent.center)


}