package sri.mobile.examples.router.components

import sri.core.ElementFactory._
import sri.core.ReactElement
import sri.mobile.components._
import sri.mobile.router
import sri.mobile.router.MobileRouterComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object FourthScreen {

   @ScalaJSDefined
   class Component extends MobileRouterComponent[Person, Unit] {
     override def render(): ReactElement = View(style = styles.container)(
       Text(onPress = onTextClick _)(s"Fourth Screen : Person name is : ${props.name}")
     )
     def onTextClick() = {
       navigateToHome()
     }
   }

   js.constructorOf[Component].contextTypes = router.routerContextTypes

   val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

   def apply(person : Person) = createElement(factory,person)
 }

