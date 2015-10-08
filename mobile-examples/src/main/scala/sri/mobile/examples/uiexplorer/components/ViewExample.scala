package sri.mobile.examples.uiexplorer.components

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components.{View, _}
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


object ViewExample extends UIExample {


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = UIExplorerPage(View(style = styles.container)(
      UIExplorerBlock("Background Color")(
        View(style = styles.bgColorView)(
          Text(style = styles.text)("Blue background")
        )),
      UIExplorerBlock("Border")(
        View(style = styles.borderView)(
          Text(style = styles.text)("5px blue border")
        )),
      UIExplorerBlock("Border Radius")(
        View(style = styles.borderRadiusView)(
          Text(style = styles.text)("Too much use of `borderRadius` (especially large radii) on\n            anything which is scrolling may result in dropped frames.\n            Use sparingly.")
        )),
      UIExplorerBlock("Circle with Border Radius")(
        View(style = styles.borderRadiusCircle)())
    )
    )

  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(factory)

  object styles extends SriStyleSheet {
    val container = style(flex := 1,
      backgroundColor := "#F5FCFF")

    val text = style(fontSize := 11)

    val bgColorView = style(backgroundColor := "#527FE4",
      padding := 5)

    val borderView = style(borderColor := "#527FE4",
      padding := 10,
      borderWidth := 5)

    val borderRadiusView = style(borderRadius := 5,
      padding := 5,
      borderWidth := 0.5)

    val borderRadiusCircle = style(borderRadius := 10,
      borderWidth := 1,
      width := 20,
      height := 20)
  }


  override def title: String = "View"

  override def description: String = "Basic building block of all UI."
}
