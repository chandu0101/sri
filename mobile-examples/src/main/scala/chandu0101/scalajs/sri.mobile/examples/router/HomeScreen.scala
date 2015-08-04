package chandu0101.scalajs.sri.mobile.examples.router

import chandu0101.scalajs.sri.core.{ReactElement, ElementFactory, ReactComponent}
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.router.MobileRouter
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet

import scala.scalajs.js.annotation.ScalaJSDefined

object HomeScreen {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit,Unit] {
    override def render(): ReactElement = View(style = styles.container)(
       Text(onPress = onTextClick _)("Home Screen ... ")
    )
  }


  def onTextClick() = {
    MobileRouter.routerCtrl.navigateTo(Second)
  }

  def apply() = ElementFactory(new Component).buildNoProps
}

object styles extends NativeStyleSheet {

  val container = style(flexOne,alignItems.center,justifyContent.center)


}