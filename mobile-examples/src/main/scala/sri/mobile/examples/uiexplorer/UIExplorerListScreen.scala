package sri.mobile.examples.uiexplorer

import org.scalajs.dom
import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.examples.uiexplorer.UIExplorerApp.UIExplorerDetails
import sri.mobile.examples.uiexplorer.apis.android.ToastAndroidExample
import sri.mobile.examples.uiexplorer.apis._
import sri.mobile.examples.uiexplorer.components._
import sri.mobile.examples.uiexplorer.components.android.{ViewPagerAndroidExample, ToolbarAndroidExample}
import sri.mobile.examples.uiexplorer.components.ios._
import sri.universal.components._
import sri.universal.router
import sri.universal.router.UniversalRouterComponent
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.ScalaJSDefined


object UIExplorerListScreen {


  val COMPONENTS: List[UIExample] = List(
    ViewExample,
    KeyboardAvoidingViewExample,
    TouchableExample,
    TextInputExample,
    ButtonExample,
    AnimatedExample,
    SliderExample,
    SwitchExample,
    RefreshControlExample,
    ListViewPagingExample,
    LayoutEventsExample,
    ListViewGridLayoutExample,
    ActivityIndicatorExample
    //    NavigatorExample
  )

  val IOS_COMPONENTS: List[UIExample] = List(
    BoxShadowExample,
    TabBarIOSExample,
    SegmentedControlExample,
    ScrollViewExample,
    PickerIOSExample,
    ModalExample,
    DatePickerIOSExample,
    WebViewExample
  )

  val ANDROID_COMPONENTS: List[UIExample] = List(ToolbarAndroidExample,
    ViewPagerAndroidExample,
    ScrollViewSimpleExample
  )


  val APIS: List[UIExample] = List(
    AlertExample,
    GeolocationExample,
    LinkingExample
    //    NetInfoExample
  )

  val IOS_APIS: List[UIExample] = List(
    AlertIOSExample,
    AsyncStorageExample,
    AppStateExample
  )

  val ANDROID_APIS: List[UIExample] = List(
    ToastAndroidExample)


  def getComponents() = {
    if (isIOSPlatform) {
      COMPONENTS.++(IOS_COMPONENTS).toJSArray
    } else COMPONENTS.++(ANDROID_COMPONENTS).toJSArray
  }

  def getAPIs() = {
    if (isIOSPlatform) {
      APIS.++(IOS_APIS).toJSArray
    } else APIS.++(ANDROID_APIS).toJSArray
  }

  val finalComponentsList = getComponents()

  val finalAPIList = getAPIs()

  val ds = createListViewDataSource(rowHasChanged = (r1: UIExample, r2: UIExample) => r1 != r2, sectionHeaderHasChanged = (h1: String, h2: String) => h1 != h2)

  case class State(datasource: ListViewDataSource[UIExample, String] = ds.cloneWithRowsAndSections(json(componenets = finalComponentsList, apis = finalAPIList)))


  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Unit, State] {
    initialState(State())
    dom.window.console.log(s"hello", json(componenets = finalComponentsList, apis = finalAPIList))

    def render() = {
      println(s"rendering rows : ")
      View(style = styles.listContainer)(
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
          automaticallyAdjustContentInsets = false)()
      )
    }


    def onPressRow(example: UIExample): Unit = {
      navigateTo(UIExplorerDetails, example.component, example.title)

    }

    def handleSearchTextChange(text: String): Unit = {
      val filter = (e: UIExample) => e.title.toLowerCase.contains(text.toLowerCase.trim)
      val filteredComponents = finalComponentsList.filter(filter)
      val filteredAPIS = finalAPIList.filter(filter)
      setState(state.copy(datasource = ds.cloneWithRowsAndSections(json(componenets = filteredComponents, apis = filteredAPIS))))
    }

    def renderRow(example: UIExample, sectionID: String | Int, rowId: String | Int, highlightRow: js.Function2[String | Int, String | Int, _]) = {
      println(s"rendering row $example")
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

    def renderSectionHeader(data: Any, sectionID: String) = {
      println(s"rendering section header : $sectionID data $data")
      View(style = styles.sectionHeader)(
        Text(style = styles.sectionHeaderTitle)(
          sectionID.toString.toUpperCase
        )
      )
    }

  }

  object styles extends UniversalStyleSheet {
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
      padding := 10
    )
    val searchTextInput = style(
      backgroundColor := "white",
      borderColor := "#cccccc",
      borderRadius := 3,
      borderWidth := 1,
      height := 40,
      paddingLeft := 8
    )
  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component]
}
