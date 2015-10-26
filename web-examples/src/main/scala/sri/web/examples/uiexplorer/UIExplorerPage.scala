package sri.web.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core._
import sri.universal.components.View
import sri.universal.styles.UniversalStyleSheet

object UIExplorerPage {

  val Component = (children: ReactElement) => {
    View(style = UniversalStyleSheet.wholeContainer)(
      children
    )
  }

  def apply(children: ReactNode*) = createStatelessFunctionElementNoPropsWithChildren(Component)(children: _*)

}
