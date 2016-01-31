package sri.web.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core._
import sri.universal.components.{ScrollView, View}
import sri.universal.styles.UniversalStyleSheet

object UIExplorerPage {

  val Component = (children: ReactElement) => {
    ScrollView(style = UniversalStyleSheet.wholeContainer)(
      children
    )
  }

  def apply(children: ReactNode*) = createStatelessFunctionElementNoPropsWithChildren(Component)(children: _*)

}
