package sri.web.examples.uiexplorer

import sri.core.ElementFactory._
import sri.web.components.nativeweb.{Text, Touchable, View}
import sri.web.examples.uiexplorer.UIExplorerApp.UIExplorerDetails
import sri.web.examples.uiexplorer.components.{TextInputExample, ViewExample}
import sri.web.router.WebRouterComponent
import sri.web.styles.WebStyleSheet
import sri.web.{NEvent, router}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


object UIExplorerListScreen {


  val COMPONENTS: List[UIExample] = List(
    ViewExample,
    TextInputExample
    //    NavigatorExample
  )


  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {


    def render() = View(style = styles.listContainer)(

      COMPONENTS.map(renderRow _)
    )


    def onPressRow(example: UIExample): Unit = {
      navigateToDynamic(UIExplorerDetails, example.component, example.title)
    }


    def renderRow(example: UIExample) = {
      View(key = example.title)(
        Touchable(onPress = (e: NEvent) => onPressRow(example))(
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

    def renderSectionHeader(data: String, sectionID: String) = {
      View(style = styles.sectionHeader)(
        Text(style = styles.sectionHeaderTitle)(
          sectionID.toString.toUpperCase
        )
      )
    }

  }

  object styles extends WebStyleSheet {
    val listContainer = styleM(
      flex := 1
    )
    val list = styleM(
      backgroundColor := "#eeeeee"
    )
    val sectionHeader = styleM(
      padding := 5
    )
    val group = styleM(
      backgroundColor := "white"
    )
    val sectionHeaderTitle = styleM(
      fontWeight.bold,
      fontSize := 11
    )
    val row = styleM(
      backgroundColor := "white",
      justifyContent.center
    )
    val separator = styleM(
      height := 1.0 / 345,
      backgroundColor := "#bbbbbb",
      marginLeft := 15
    )
    val rowTitleText = styleM(
      fontSize := 17,
      fontWeight.bold
    )
    val rowDetailText = styleM(
      fontSize := 15,
      color := "#888888",
      lineHeight := 20
    )
    val searchRow = styleM(
      backgroundColor := "#eeeeee",
      padding := 10
    )
    val searchTextInput = styleM(
      backgroundColor := "white",
      borderColor := "#cccccc",
      borderRadius := 3,
      borderWidth := 1,
      height := 40,
      paddingLeft := 8
    )
  }


  js.constructorOf[Component].contextTypes = router.routerContextTypes

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(factory)
}
