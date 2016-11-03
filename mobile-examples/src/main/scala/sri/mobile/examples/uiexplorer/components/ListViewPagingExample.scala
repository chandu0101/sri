package sri.mobile.examples.uiexplorer.components

import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.examples.uiexplorer.UIExample
import sri.universal.{ReactEvent, SyntheticEvent}
import sri.universal.apis.LayoutConfig
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object ListViewPagingExample extends UIExample {


  val PAGE_SIZE = 4
  val THUMB_URLS = js.Array("https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-ash3/t39.1997/p128x128/851549_767334479959628_274486868_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851561_767334496626293_1958532586_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-ash3/t39.1997/p128x128/851579_767334503292959_179092627_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851589_767334513292958_1747022277_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851563_767334559959620_1193692107_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851593_767334566626286_1953955109_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851591_767334523292957_797560749_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851567_767334529959623_843148472_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851548_767334489959627_794462220_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851575_767334539959622_441598241_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-ash3/t39.1997/p128x128/851573_767334549959621_534583464_n.png", "https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-prn1/t39.1997/p128x128/851583_767334573292952_1519550680_n.png")
  val NUM_SECTIONS = 10
  val NUM_ROWS_PER_SECTION = 10

  def getThumbIdx = {
    Math.floor(Math.random() * THUMB_URLS.length).toInt
  }


  object THUMB {

    case class State(thumbIndex: Int = getThumbIdx, dir: String = "row")

    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {
      initialState(State())

      def render() = TouchableOpacity(onPress = () => onPressThumb)(
        View(style = styles.buttonCOntentsDir(state.dir))(
          Image(style = styles.img, source = ImageSource(uri = THUMB_URLS(state.thumbIndex)))(),
          Image(style = styles.img, source = ImageSource(uri = THUMB_URLS(state.thumbIndex)))(),
          Image(style = styles.img, source = ImageSource(uri = THUMB_URLS(state.thumbIndex)))(),
          if (state.dir == "column") Text()(
            "Oooo, look at this new text!  So awesome it may just be crazy.Let me keep typing here so it wraps at least one line."
          )
          else Text()()
        )
      )


      def onPressThumb = {
        val config = layoutAnimationConfigs(state.thumbIndex % layoutAnimationConfigs.length)
        LayoutAnimation.configureNext(config.asInstanceOf[LayoutConfig])
        setState(state.copy(thumbIndex = getThumbIdx, dir = if (state.dir == "row") "column" else "row"))
      }
    }

    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component]
  }


  def getDataSource = {
    val getSectionData = (dataBlob: js.Dictionary[String], sectionID: String | Int) => dataBlob(sectionID.toString)

    val getRowData = (dataBlob: js.Dictionary[String], sectionID: String | Int, rowID: String | Int) => dataBlob(rowID.toString)

    val dataSource = createListViewDataSource[String, String](rowHasChanged = (r1: String, r2: String) => r1 != r2,
      getSectionHeaderData = getSectionData,
      getRowData = getRowData,
      sectionHeaderHasChanged = (s1: String, s2: String) => s1 != s2)

    val dataBlob = js.Dictionary[String]()
    val sectionIDs = js.Array[String]()
    val rowIDs = js.Array[js.Array[String]]()

    (0 to NUM_SECTIONS - 1).foreach(i => {
      val sectionName = s"Section $i"
      sectionIDs += sectionName
      dataBlob += sectionName -> sectionName
      val eachRowIDs = js.Array[String]()
      (0 to NUM_ROWS_PER_SECTION - 1).foreach(j => {
        val rowName = s"S$i, T$j"
        eachRowIDs += rowName
        dataBlob += rowName -> rowName
      })
      rowIDs += eachRowIDs
    })
    dataSource.cloneWithRowsAndSections(dataBlob, sectionIDs, rowIDs)
  }

  case class State(datasource: ListViewDataSource[String, String] = getDataSource, headerPressCount: Int = 0)


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = ListView[String, String](
      style = styles.listView,
      dataSource = state.datasource,
      pageSize = PAGE_SIZE,
      renderRow = renderRow _,
      renderFooter = renderFooter _,
      renderSectionHeader = renderSectionHeader _,
      initialListSize = 10,
      scrollRenderAheadDistance = 2000
    )()

    def renderRow(rowData: String, sectionID: String | Int, rowID: String | Int, highlightRow: js.Function2[String | Int, String | Int, _]) = {
      THUMB()
    }

    def renderSectionHeader(sectionData: String, sectionID: String) = {
      View(style = styles.section)(
        Text(style = styles.text)(
          sectionData
        )
      )
    }

    def onPressHeader = {
      val config = layoutAnimationConfigs(Math.floor(state.headerPressCount / 2).toInt % layoutAnimationConfigs.length)
      LayoutAnimation.configureNext(config.asInstanceOf[LayoutConfig])
      setState(state.copy(headerPressCount = state.headerPressCount))
    }


    def renderHeader = {
      TouchableOpacity(onPress = () => onPressHeader)(
        View(style = styles.header)(
          if (state.headerPressCount % 2 == 0) View()(Text(style = styles.text)("1 Like")) else View()(),
          View()(
            Text(style = styles.text)("Table Header (click me)")
          )
        )
      )
    }

    def renderFooter = {
      View(style = styles.header)(
        Text(style = styles.text, onPress = (e: ReactEvent[SyntheticEvent]) => println("Footer"))(
          "Table Footer"
        )
      )
    }

  }


  val component = () => makeElement[Component]

  object styles extends UniversalStyleSheet {

    val listView = style(backgroundColor := "#B0C4DE")

    val header = style(height := 40,
      justifyContent.center,
      alignItems.center,
      backgroundColor := "#3B5998",
      flexDirection.row)

    val text = style(color := "white",
      paddingHorizontal := 8)

    val rowText = style(color := "#888888")

    val thumbText = style(fontSize := 20,
      color := "#888888")

    val buttonContents = style(
      flexDirection.row,
      justifyContent.center,
      alignItems.center,
      marginHorizontal := 5,
      marginVertical := 5,
      backgroundColor := "#EAEAEA",
      borderRadius := 3,
      paddingVertical := 10
    )

    def buttonCOntentsDir(dir: String) = styleE(buttonContents)(
      if (dir == "row") flexDirection.row else flexDirection.column
    )

    val img = style(width := 64,
      height := 64,
      marginHorizontal := 10)

    val section = style(flexDirection.column,
      justifyContent.center,
      alignItems.flexStart,
      backgroundColor := "#5890ff",
      padding := 6)

  }

  val LayoutAnimation = ReactNative.LayoutAnimation

  val animations = json(
    layout = json(
      spring = json(
        duration = 750,
        create = json(
          duration = 300,
          `type` = LayoutAnimation.Types.easeInEaseOut,
          property = LayoutAnimation.Properties.opacity
        ),
        update = json(
          `type` = LayoutAnimation.Types.spring,
          springDamping = 0.4
        )
      ),
      easeInEaseOut = json(
        duration = 300,
        create = json(
          `type` = LayoutAnimation.Types.easeInEaseOut,
          property = LayoutAnimation.Properties.scaleXY
        ),
        update = json(
          delay = 100,
          `type` = LayoutAnimation.Types.easeInEaseOut
        )
      )
    )
  )

  val layoutAnimationConfigs = js.Array(animations.layout.spring,
    animations.layout.easeInEaseOut)

  override def title: String = "ListView - paging"

  override def description: String = "Floating headers & layout animations."
}
