package chandu0101.scalajs.sri.mobile.examples.uiexplorer

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.{ReactComponent, _}
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.styles.MobileStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object UIExplorerPage {

  object styles extends MobileStyleSheet {

    val wrapper = style(
      flex := 1)
  }

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() =
      ScrollView(style = styles.wrapper, keyboardShouldPersistTaps = true,
        keyboardDismissMode = keyboardDismissMode.INTERACTIVE)(
          children
        )

    val displayName = "UIExplorerPage"
  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  def apply(children: ReactNode*) = createElementNoPropsWithChildren(factory)(children: _*)

}
