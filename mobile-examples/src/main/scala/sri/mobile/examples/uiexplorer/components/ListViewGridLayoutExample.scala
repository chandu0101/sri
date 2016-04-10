package sri.mobile.examples.uiexplorer.components

import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.examples.uiexplorer.UIExample
import sri.universal.apis.LayoutConfig
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object ListViewGridLayoutExample extends UIExample {


  val PAGE_SIZE = 4
  val THUMB_URLS = js.Array(loadDynamic("./images/thumbnails/like.png"),
    loadDynamic("./images/thumbnails/dislike.png"),
    loadDynamic("./images/thumbnails/call.png"),
    loadDynamic("./images/thumbnails/fist.png"),
    loadDynamic("./images/thumbnails/bandaged.png"),
    loadDynamic("./images/thumbnails/flowers.png"),
    loadDynamic("./images/thumbnails/heart.png"),
    loadDynamic("./images/thumbnails/liking.png"),
    loadDynamic("./images/thumbnails/party.png"),
    loadDynamic("./images/thumbnails/poke.png"),
    loadDynamic("./images/thumbnails/superlike.png"),
    loadDynamic("./images/thumbnails/victory.png"))
  val NUM_SECTIONS = 10
  val NUM_ROWS_PER_SECTION = 10

  def getThumbIdx = {
    Math.floor(Math.random() * THUMB_URLS.length).toInt
  }


  def getDataSource = {
    val dataSource = createListViewDataSource[String, String](rowHasChanged = (r1: String, r2: String) => r1 != r2)

    val dataBlob = (0 to 100).map(i => s"Cell $i").toJSArray
    dataSource.cloneWithRows(dataBlob)
  }

  case class State(datasource: ListViewDataSource[String, String] = getDataSource)


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      ListView[String, String](
        contentContainerStyle = styles.list,
        dataSource = state.datasource,
        pageSize = 3,
        renderRow = renderRow _,
        initialListSize = 21,
        scrollRenderAheadDistance = 500
      )()
    }


    def renderRow(rowData: String, sectionID: String | Int, rowID: String | Int, highlightRow: js.Function2[String | Int, String | Int, _]) = {
      val imageSource = THUMB_URLS(rowData.hashCode % THUMB_URLS.length)
      View()(
       View(style = styles.row)(
         Image(style = styles.thumb, sourceDynamic = imageSource)(),
         Text(style = styles.text)(rowData)
       )
      )
    }

    def hashCode(str: String) = {
      var hash = 15
      //      (str.length to 0 by -1).foreach(i => hash = (()))
    }

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = () => createElementNoProps(ctor)

  object styles extends UniversalStyleSheet {

    val list = style(
      justifyContent.spaceAround,
      flexDirection.row,
      flexWrap.wrap
    )

    val row = style(
      justifyContent := "center",
      padding := 5,
      margin := 3,
      width := 100,
      height := 100,
      backgroundColor := "#F6F6F6",
      alignItems := "center",
      borderWidth := 1,
      borderRadius := 5,
      borderColor := "#CCC"
    )

    val thumb = style(
      width := 64,
      height := 64
    )

    val text = style(
      flex := 1,
      marginTop := 5,
      fontWeight := "bold"
    )

  }


  override def title: String = "ListView - Grid Layout"

  override def description: String = "Flexbox grid layout."
}
