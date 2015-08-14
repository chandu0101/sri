package chandu0101.scalajs.sri.mobile.examples.router

import chandu0101.scalajs.sri.core.{ElementFactory_DONTUSE$, ReactComponent, ReactElement}
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.examples.router.RouterExample.{Home, Second}
import chandu0101.scalajs.sri.mobile.router.MobileRouter

import scala.scalajs.js.annotation.ScalaJSDefined
import chandu0101.scalajs.sri.core.{RefType, ReactComponent}
import chandu0101.scalajs.sri.mobile.components._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import chandu0101.scalajs.sri.core.ElementFactory._

object SecondScreen {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    override def render(): ReactElement = View(style = styles.container)(
      Text(onPress = onTextClick _)("Second screen ")
    )

    val displayName = "SecondScreen"

  }


  def onTextClick() = {
    MobileRouter.routerCtrl.navigateToHome()
  }

  val factory = getComponentFactory(new Component)

  def apply() = createElementNoProps(factory)
}

