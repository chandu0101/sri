package sri.mobile.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core.{ReactElement, ReactNode}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js


object UIExplorerButton {

  val Component = (props: () => _, children: ReactElement) => {
    TouchableHighlight(onPress = props,
      style = styles.button,
      underlayColor = "grey")(
      Text()(children)
    )
  }

  object styles extends UniversalStyleSheet {

    val button = style(borderColor := "#696969",
      borderRadius := 8,
      borderWidth := 1,
      padding := 10,
      margin := 5,
      alignItems.center,
      justifyContent.center,
      backgroundColor := "#d3d3d3")
  }

  def apply(onPress: () => _)(children: ReactNode*) = createStatelessFunctionElementWithChildren(Component, onPress)(children: _*)

}
