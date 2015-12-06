package sri.mobile.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core.{ReactElement, ReactNode}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet


object UIExplorerBlock {

  val Component = (props: String, children: ReactElement) => {
    View(style = styles.container)(
      View(style = styles.titleContainer)(
        Text(style = styles.titleText)(props)
      ),
      View(style = styles.children)(
        children
      )
    )
  }

  object styles extends UniversalStyleSheet {

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

  def apply(title: String)(children: ReactNode*) = createStatelessFunctionElementWithChildren(Component, title)(children: _*)

}
