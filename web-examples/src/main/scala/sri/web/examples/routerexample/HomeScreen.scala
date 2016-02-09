package sri.web.examples.routerexample

import sri.universal.components._
import sri.web.all._
import sri.web.styles.WebStyleSheet

object HomeScreen {

  val Component = () => {
    View(style = styles.container)(
      Text(style = styles.text)("Home Screen")
    )
  }

  object styles extends WebStyleSheet {

    val container = style(flex := 1,
      alignItems.center,
      justifyContent.center)

    val text = style(fontWeight.bold,
      fontSize := "1.5em")

  }

  def apply() = createStatelessFunctionElementNoProps(Component)

}
