package sri.web.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core.{ReactComponent, _}
import sri.universal.components.View
import sri.web.styles.WebStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object UIExplorerPage {

  object styles extends WebStyleSheet {

    val wrapper = style(
      flex := 1)
  }

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() =
      View(style = styles.wrapper)(
          children
        )

    val displayName = "UIExplorerPage"
  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  def apply(children: ReactNode*) = createElementNoPropsWithChildren(factory)(children: _*)

}
