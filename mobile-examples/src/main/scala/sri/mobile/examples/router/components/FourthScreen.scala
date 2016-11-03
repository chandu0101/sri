package sri.mobile.examples.router.components

import sri.core.ElementFactory._
import sri.core.ReactElement
import sri.universal.components._
import sri.universal.{ReactEvent, SyntheticEvent, router}
import sri.universal.router.UniversalRouterComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object FourthScreen {

  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Person, Unit] {
    override def render(): ReactElement = View(style = styles.container)(
      Text(onPress = onTextClick _)(s"Fourth Screen : Person name is : ${props.name}")
    )

    def onTextClick(e: ReactEvent[SyntheticEvent]) = {
      navigateToHome()
    }
  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(person: Person) = makeElement[Component](person)
}

