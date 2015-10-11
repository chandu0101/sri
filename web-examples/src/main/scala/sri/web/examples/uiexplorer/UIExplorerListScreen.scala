package sri.web.examples.uiexplorer

import sri.core.ElementFactory._
import sri.universal.components.{Text, TouchableOpacity, View}
import sri.universal.router
import sri.universal.router.UniversalRouterComponent
import sri.web.examples.uiexplorer.UIExplorerApp.UIExplorerDetails
import sri.web.examples.uiexplorer.components.{ScrollViewExample, TextInputExample, TouchableExample, ViewExample}
import sri.web.styles.WebStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


object UIExplorerListScreen {


  val COMPONENTS: List[UIExample] = List(
    ViewExample,
    TextInputExample,
    TouchableExample,
    ScrollViewExample
    //    NavigatorExample
  )


  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Unit, Unit] {


    def render() = View()(

      COMPONENTS.map(renderRow _)
    )


    def onPressRow(example: UIExample): Unit = {
      navigateToDynamic(UIExplorerDetails, example.component, example.title)
    }


    def renderRow(example: UIExample) = {
      View(key = example.title)(
        TouchableOpacity(onPress = () => onPressRow(example), style = styles.rowButton, activeOpacity = 0.8)(
          View(style = styles.row)(
            Text(style = styles.rowTitleText)(
              example.title
            ),
            Text(style = styles.rowDetailText)(
              example.description
            )
          )
        ),
        View(style = styles.separator)()
      )
    }


  }

  object styles extends WebStyleSheet {
    val content = style(
      flex := 1,
      margin := "90px 45px",
      minHeight := "600px",
      boxShadow := "0 2px 4px grey"
    )

    val row = style(
      justifyContent.center,
      alignItems.center)
    val separator = style(
      height := "1px",
      backgroundColor := "#bbbbbb",
      marginLeft := "15px",
      marginBottom := "15px"

    )
    val rowTitleText = style(
      fontSize := "17px",
      fontWeight.bold,
      paddingBottom := "5px"
    )
    val rowDetailText = style(
      fontSize := "15px",
      color := "#888888",
      lineHeight := "20px"
    )

    val rowButton = style(
      marginBottom := "20px"
    )

  }


  js.constructorOf[Component].contextTypes = router.routerContextTypes

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor)
}
