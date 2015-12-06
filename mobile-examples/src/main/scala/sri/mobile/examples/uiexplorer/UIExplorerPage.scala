package sri.mobile.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core.{ReactComponent, _}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object UIExplorerPage {

  val Component = (children: ReactElement) => {
    ScrollView(style = UniversalStyleSheet.wholeContainer, keyboardShouldPersistTaps = true,
      keyboardDismissMode = keyboardDismissMode.INTERACTIVE)(
        children
      )
  }

  def apply(children: ReactNode*) = createStatelessFunctionElementNoPropsWithChildren(Component)(children: _*)

}
