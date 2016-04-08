package sri.mobile.examples.uiexplorer.components.ios

import org.scalajs.dom
import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.components.ios.{ActivityIndicatorIOS, ActivityIndicatorIOSSize}
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.Dynamic.{literal => json}

object BoxShadowExample extends UIExample {


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = UIExplorerPage(
      UIExplorerBlock("Basic Shadow")(
        View(style = styles.basicShadow)()
      ),
      UIExplorerBlock("Colored Shadow")(
        View(style = styles.coloredShadow)()
      ),
      UIExplorerBlock("Shaped Shadow")(
        View(style = styles.shapedShadow)()
      )
    )

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(ctor)


  object styles extends UniversalStyleSheet {

    val box = style(width := 100,
      height := 100,
      borderWidth := 2)

    val shadow1 = style(shadowOpacity := 0.5,
      shadowRadius := 3,
      shadowOffset := json(width = 3, height = 2))

    val shadow2 = style(shadowOpacity := 1.0,
      shadowColor := "red",
      shadowRadius := 0,
      shadowOffset := json(width = 3, height = 2))

    val basicShadow = styleE(box, shadow1)()

    val coloredShadow = styleE(box, shadow2)()

    val shapedShadow = styleE(basicShadow)(borderRadius := 50)

  }

  override def title: String = "Box Shadow"

  override def description: String = "Demonstrates some of the shadow styles available to Views."
}
