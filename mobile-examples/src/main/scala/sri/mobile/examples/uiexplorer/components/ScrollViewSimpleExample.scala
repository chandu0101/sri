package sri.mobile.examples.uiexplorer.components

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenTraversableOnce
import scala.scalajs.js.annotation.ScalaJSDefined

object ScrollViewSimpleExample extends UIExample {

  val NUM_ITEMS = 20

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      val items = makeItems(NUM_ITEMS, styles.itemWrapper)

      UIExplorerPage(
        ScrollView(style = styles.verticalScrollView)(items)
      )
    }

    def makeItems(nItems: Int, style: js.Dictionary[Any]) = {
      (1 to nItems).toList.map(i => TouchableOpacity(key = i.toString, style = style)(Text()(s"Item $i"))).toJSArray
    }
  }

  val component = () => makeElement[Component]

  object styles extends UniversalStyleSheet {

    val verticalScrollView = style(margin := 10)

    val itemWrapper = style(backgroundColor := "#dddddd",
      alignItems.center,
      borderRadius := 5,
      borderWidth := 5,
      borderColor := "#a52a2a",
      padding := 30,
      margin := 5)

    val horizontalItemWrapper = style(padding := 50)

    val horizontalScrollView = styleE(itemWrapper, horizontalItemWrapper)()
  }

  override def title: String = "ScrollView"

  override def description: String = "Component that enables scrolling through child components"
}
