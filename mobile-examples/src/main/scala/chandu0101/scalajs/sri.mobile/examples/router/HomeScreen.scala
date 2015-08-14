package chandu0101.scalajs.sri.mobile.examples.router

import chandu0101.scalajs.sri.core.{ReactElement, ElementFactory_DONTUSE$, ReactComponent}
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.examples.router.RouterExample.Second
import chandu0101.scalajs.sri.mobile.router.MobileRouter
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet

import scala.scalajs.js.annotation.ScalaJSDefined
import chandu0101.scalajs.sri.core.{RefType, ReactComponent}
import chandu0101.scalajs.sri.mobile.components._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import chandu0101.scalajs.sri.core.ElementFactory._

object HomeScreen {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit,Unit] {
    override def render(): ReactElement = View(style = styles.container)(
       Text(onPress = onTextClick _)("Home Screen ... ")
    )
    val displayName = "HomeScreen"

  }


  def onTextClick() = {
    MobileRouter.routerCtrl.navigateTo(Second)
  }

  val factory = getComponentFactory(new Component)

  def apply() = createElementNoProps(factory)
}

object styles extends NativeStyleSheet {

  val container = style(flexOne,alignItems.center,justifyContent.center)


}