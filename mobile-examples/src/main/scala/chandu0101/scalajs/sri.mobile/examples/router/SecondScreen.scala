package chandu0101.scalajs.sri.mobile.examples.router

import chandu0101.scalajs.sri.core.{ElementFactory, ReactComponent, ReactElement}
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.router.MobileRouter

import scala.scalajs.js.annotation.ScalaJSDefined

object SecondScreen {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    override def render(): ReactElement = View(style = styles.container)(
      Text(onPress = onTextClick _)("Second screen ")
    )
  }


  def onTextClick() = {
    MobileRouter.routerCtrl.navigateTo(Second)
  }

  def apply() = ElementFactory(new Component).buildNoProps
}

