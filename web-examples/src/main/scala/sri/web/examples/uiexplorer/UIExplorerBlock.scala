package sri.web.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core.{ReactComponent, ReactNode}
import sri.universal.components.{Text, View}
import sri.web.styles.WebStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


object UIExplorerBlock {

  object styles extends WebStyleSheet {

    val container = styleM(
      borderRadius := 3,
      borderWidth := 0.5,
      borderColor := "#d6d7da",
      backgroundColor := "#ffffff",
      margin := 10,
      overflow.hidden
    )

    val titleContainer = styleM(
      borderWidth := 0.5,
      borderColor := "#d6d7da",
      backgroundColor := "#f6f7f8"
    )

    val titleText = styleM(fontSize := 14, fontWeight.bold)

    val children = styleM(padding := 10)
  }


  @ScalaJSDefined
  class Component extends ReactComponent[String, Unit] {
    def render() = {
      View(style = styles.container)(
        View(style = styles.titleContainer)(
          Text(style = styles.titleText)(props)
        ),
        View(style = styles.children)(
          children
        )
      )
    }

    val displayName = "UIExplorerBlock"
  }

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply(title: String)(children: ReactNode*) = createElementWithChildren(factory, title)(children: _*)

}
