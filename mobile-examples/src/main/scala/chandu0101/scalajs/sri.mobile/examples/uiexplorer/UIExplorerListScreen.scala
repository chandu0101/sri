package chandu0101.scalajs.sri.mobile.examples.uiexplorer

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.{ReactComponent, RefType}
import chandu0101.scalajs.sri.mobile
import chandu0101.scalajs.sri.mobile.ReactNative
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.UIExplorerRouter.UIExplorerDetails
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.apis.{AsyncStorageExample, AppStateIOSExample, AlertIOSExample}
import chandu0101.scalajs.sri.mobile.examples.uiexplorer.components._
import chandu0101.scalajs.sri.mobile.router.MobileRouter
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


object UIExplorerListScreen {


  val COMPONENTS: js.Array[UIExample] = js.Array(
    ViewExample,
    TouchableExample,
    TabBarIOSExample,
    SegmentedControlExample,
    SwitchIOSExample,
    SliderIOSExample,
    ScrollViewExample,
    ActivityIndicatorIOSExample,
    PickerIOSExample,
    DatePickerIOSExample,
    MapViewExample,
    TextInputExample,
    ListViewPagingExample,
    WebViewExample

    //    NavigatorExample
  )

  val APIS: js.Array[UIExample] = js.Array(
        AlertIOSExample,
    //    GeoLocationExample,
        AppStateIOSExample,
        AsyncStorageExample
    //    NetInfoExample
  )

  val ds = mobile.createListViewDataSource(rowHasChanged = (r1: UIExample, r2: UIExample) => r1 != r2, sectionHeaderHasChanged = (h1: String, h2: String) => h1 != h2)

  case class State(datasource: ListViewDataSource[UIExample, String] = ds.cloneWithRowsAndSections(json(componenets = COMPONENTS, apis = APIS)))


  object styles extends NativeStyleSheet {
    val listContainer = style(
      flex := 1
    )
    val list = style(
      backgroundColor := "#eeeeee"
    )
    val sectionHeader = style(
      padding := 5
    )
    val group = style(
      backgroundColor := "white"
    )
    val sectionHeaderTitle = style(
      fontWeight._500,
      fontSize := 11
    )
    val row = style(
      backgroundColor := "white",
      justifyContent.center,
      paddingHorizontal := 15,
      paddingVertical := 8
    )
    val separator = style(
      height := 1.0 / ReactNative.PixelRatio.get(),
      backgroundColor := "#bbbbbb",
      marginLeft := 15
    )
    val rowTitleText = style(
      fontSize := 17,
      fontWeight._500
    )
    val rowDetailText = style(
      fontSize := 15,
      color := "#888888",
      lineHeight := 20
    )
    val searchRow = style(
      backgroundColor := "#eeeeee",
      padding := 10,
      paddingTop := 30
    )
    val searchTextInput = style(
      backgroundColor := "white",
      borderColor := "#cccccc",
      borderRadius := 3,
      borderWidth := 1,
      height := 30,
      paddingLeft := 8
    )
  }


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = View(style = styles.listContainer)(
      View(style = styles.searchRow)(
        TextInput(autoCapitalize = AutoCapitalize.NONE,
          autoCorrect = false,
          clearButtonMode = "always",
          onChangeText = handleSearchTextChange _,
          placeholder = "Search ..",
          style = styles.searchTextInput)()
      ),
      ListView(style = styles.list,
        dataSource = state.datasource,
        renderRow = renderRow,
        renderSectionHeader = renderSectionHeader _,
        automaticallyAdjustContentInsets = false)
    )

    def onPressRow(example: UIExample): Unit = {
      MobileRouter.routerCtrl.navigateToDynamic(UIExplorerDetails, example.component, example.title)
    }

    def handleSearchTextChange(text: String): Unit = {
      val filter = (e: UIExample) => e.title.toLowerCase.contains(text.toLowerCase.trim)
      val filteredComponents = COMPONENTS.filter(filter)
      val filteredAPIS = APIS.filter(filter)
      setState(state.copy(datasource = ds.cloneWithRowsAndSections(json(componenets = filteredComponents, apis = filteredAPIS))))
    }

    def renderRow(example: UIExample, sectionID: String, rowId: String) = {
      View(key = example.title)(
        TouchableHighlight(onPress = () => onPressRow(example))(
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

    val displayName = "UIExplorerListScreen"
  }

  val factory = getComponentFactory(new Component)

  def apply(key: js.UndefOr[String] = js.undefined, ref: RefType = null) = createElementNoProps(factory)
}
