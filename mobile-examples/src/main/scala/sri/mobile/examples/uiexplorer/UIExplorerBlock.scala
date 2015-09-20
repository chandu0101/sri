package sri.mobile.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core.{ReactComponent, ReactNode}
import sri.mobile.components._
import sri.mobile.styles.MobileStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


object UIExplorerBlock {

  object styles extends MobileStyleSheet {

    val container = style(
      borderRadius := 3,
      borderWidth := 0.5,
      borderColor := "#d6d7da",
      backgroundColor := "#ffffff",
      margin := 10,
      marginVertical := 5,
      overflow.hidden
    )

    val titleContainer = style(
      borderWidth := 0.5,
      borderColor := "#d6d7da",
      backgroundColor := "#f6f7f8",
      paddingHorizontal := 10,
      paddingVertical := 5
    )

    val titleText = style(fontSize := 14, fontWeight._500)

    val children = style(padding := 10)
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

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  def apply(title: String)(children: ReactNode*) = createElementWithChildren(factory, title)(children :_*)

}
