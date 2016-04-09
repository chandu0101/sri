package sri.mobile.examples.uiexplorer.components.android

import sri.mobile.ViewPagerAndroidEvent
import sri.mobile.components.android.{ViewPagerAndroid, ViewPagerAndroidM, SwitchAndroid}
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.ReactEvent
import sri.universal.styles.UniversalStyleSheet
import sri.core._
import sri.universal.components._
import sri.mobile.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}

import scala.scalajs.js
import scala.scalajs.js.{Function1, UndefOr}
import scala.scalajs.js.annotation.ScalaJSDefined

object ViewPagerAndroidExample extends UIExample {

  override val title: String = "ViewPagerAndroid"

  override val description: String = "Container that allows to flip left and right between child views."

  val PAGES = 5

  val BGCOLOR = Seq("#fdc08e", "#fff6b9", "#99d1b7", "#dde5fe", "#f79273")

  val IMAGE_URIS = Seq(
    "http://apod.nasa.gov/apod/image/1410/20141008tleBaldridge001h990.jpg",
    "http://apod.nasa.gov/apod/image/1409/volcanicpillar_vetter_960.jpg",
    "http://apod.nasa.gov/apod/image/1409/m27_snyder_960.jpg",
    "http://apod.nasa.gov/apod/image/1409/PupAmulti_rot0.jpg",
    "http://apod.nasa.gov/apod/image/1510/lunareclipse_27Sep_beletskycrop4.jpg"
  )

  object LikeCount {

    case class State(likes: Int = 7)


    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {
      initialState(State())

      def render() = {
        val thumbsUp = "\uD83D\uDC4D"
        View(style = styles.likeContainer)(
          TouchableOpacity(onPress = onClick _, style = styles.likeButton)(
            Text(style = styles.likesText)(s"$thumbsUp Like")
          ),
          Text(style = styles.likesText)(s"${state.likes} likes")
        )
      }

      def onClick() = {
        setState(state.copy(likes = state.likes + 1))
      }

    }

    val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

    def apply(key: UndefOr[String] = js.undefined, ref: Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)


  }


  object Button {

    val Component = (props: Props) => TouchableWithoutFeedback(onPress = () => handlePress(props))(
      View(style = styles.getButtonEnabledStyle(props.enabled))(
        Text(style = styles.buttonText)(props.text)
      )
    )

    def handlePress(props: Props) = {
      if (props.enabled && props.onPress != null) props.onPress()
    }

    case class Props(enabled: Boolean, onPress: () => _, text: String)

    def apply(enabled: Boolean, onPress: () => _, text: String) = createStatelessFunctionElement(Component, Props(enabled, onPress, text))

  }

  object ProgressBar {

    val Component = (props: Props) => {
      val fractionalPosition = props.progress.position + props.progress.offset
      val progressBarSize = (fractionalPosition / (PAGES - 1)) * props.size
      View(style = styles.progressBarContainerDynamic(props.size))(
        View(style = styles.progressBarDynamic(progressBarSize))()
      )
    }

    case class Props(progress: Progress, size: Int)


    def apply(progress: Progress, size: Int) = createStatelessFunctionElement(Component, Props(progress, size))

  }

  case class Progress(position: Double, offset: Double)

  case class State(page: Int = 0, animationAreEnabled: Boolean = true, progress: Progress = Progress(0, 0), scrollState: String = "")

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {

      val pages = (0 until PAGES).toList.map(i => {

        View(style = styles.pageStyle(i), key = i.toString)(
          Image(style = styles.image, source = ImageSource(uri = IMAGE_URIS(i % BGCOLOR.length)))(),
          LikeCount()
        )
      })

//      UIExplorerPage(
        View(style = styles.container)(
          ViewPagerAndroid(style = styles.viewPager,
           ref = storeViewPagerRef _,
           initialPage = 0,
           onPageScroll = onPageScroll _,
           onPageSelected = onPageSelected _,
           onPageScrollStateChanged = onPageScrollStateChanged _)(pages),
          View( style = styles.buttons)(
           if(state.animationAreEnabled) Button(text = "Turn off animations" , enabled = true,onPress = () => setState(state.copy(animationAreEnabled = false)))
          else Button(text = "Turn animations back on" , enabled = true,onPress = () => setState(state.copy(animationAreEnabled = true))),
           Text(style = styles.scrollStateText)(s"ScrollState : ${state.scrollState}")
          ),
         View(style = styles.buttons)(
           Button(text = "Start",enabled = state.page > 0 ,onPress = () =>  go(0)),
           Button(text = "Prev",enabled = state.page > 0 ,onPress = () =>  move(-1)),
           Text(style = styles.buttonText)(s" Page ${state.page + 1} / ${PAGES} "),
           ProgressBar(size = 100,progress = state.progress),
           Button(text = "Next",enabled = state.page < (PAGES - 1) ,onPress = () =>  move(1)),
           Button(text = "Last",enabled = state.page < (PAGES - 1) ,onPress = () =>  go(PAGES -1))
         )
        )
//      )
    }

    var viewPagerRef: ViewPagerAndroidM = null

    def storeViewPagerRef(ref : ViewPagerAndroidM) = {
      viewPagerRef = ref
    }

    def onPageSelected(e: ReactEvent[ViewPagerAndroidEvent]) = {
      setState(state.copy(page = e.nativeEvent.position))
    }

    def onPageScroll(e: ReactEvent[ViewPagerAndroidEvent]) = {
      setState(state.copy(progress = Progress(e.nativeEvent.position, e.nativeEvent.offset)))
    }

    def onPageScrollStateChanged(scrollState: String) = setState(state.copy(scrollState = scrollState))

    def move(delta: Int) = {
      val page = state.page + delta
      go(page)
    }

    def go(page: Int) = {
      if (state.animationAreEnabled) viewPagerRef.setPage(page)
      else viewPagerRef.setPageWithoutAnimation(page)
      setState(state.copy(page = page))
    }

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = () =>  createElementNoProps(ctor)


  object styles extends UniversalStyleSheet {

    val buttons = style(
      flexDirection := "row",
      height := 30,
      backgroundColor := "black",
      alignItems := "center",
      justifyContent := "space-between"
    )
    val button = style(
      flex := 1,
      width := 0,
      margin := 5,
      borderColor := "gray",
      borderWidth := 1,
      backgroundColor := "gray"
    )
    val buttonDisabled = style(
      backgroundColor := "black",
      opacity := 0.5
    )
    val buttonText = style(
      color := "white"
    )
    val scrollStateText = style(
      color := "#99d1b7"
    )
    val container = style(
      flex := 1,
      backgroundColor := "white"
    )
    val image = style(
      width := 300,
      height := 200,
      padding := 20
    )
    val likeButton = style(
      backgroundColor := "rgba(0, 0, 0, 0.1)",
      borderColor := "#333333",
      borderWidth := 1,
      borderRadius := 5,
      flex := 1,
      margin := 8,
      padding := 8
    )
    val likeContainer = style(
      flexDirection := "row"
    )
    val likesText = style(
      flex := 1,
      fontSize := 18,
      alignSelf := "center"
    )
    val progressBarContainer = style(
      height := 10,
      margin := 10,
      borderColor := "#eeeeee",
      borderWidth := 2
    )
    val progressBar = style(
      alignSelf := "flex-start",
      flex := 1,
      backgroundColor := "#eeeeee"
    )
    val viewPager = style(
      flex := 1
    )

    def getButtonEnabledStyle(enabled: Boolean) = {
      if (enabled) styleE(button)()
      else styleE(button)(backgroundColor := "black",
        opacity := 0.5)

    }

    def progressBarContainerDynamic(size: Int) = styleE(progressBarContainer)(width := size)

    def progressBarDynamic(size: Double) = styleE(progressBar)(width := size)

    def pageStyle(i: Int) = {
      val c = BGCOLOR(i % BGCOLOR.length)
      style(backgroundColor := c,
        alignItems.center,
        padding := 20)
    }
  }

}
