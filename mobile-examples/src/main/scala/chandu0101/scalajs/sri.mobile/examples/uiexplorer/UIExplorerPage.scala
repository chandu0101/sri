package chandu0101.scalajs.sri.mobile.examples.uiexplorer

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.{ReactComponent, ReactElement}
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet

import scala.scalajs.js.annotation.ScalaJSDefined

object UIExplorerPage {

  object styles extends NativeStyleSheet {

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

  val factory = getComponentFactory(new Component)

  def apply(children: ReactElement*) = createElementNoPropsWithChildren(factory)(children: _*)

}
