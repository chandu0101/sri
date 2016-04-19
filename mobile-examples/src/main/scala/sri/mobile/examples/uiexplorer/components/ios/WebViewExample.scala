package sri.mobile.examples.uiexplorer.components.ios

import sri.core.ReactComponent
import sri.mobile.WebViewEvent
import sri.mobile.all._
import sri.mobile.components.{WebViewSource, NavigationState, WebView, WebViewM}
import sri.mobile.examples.uiexplorer.{UIExplorerPageLazyLoad, UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.{TextInputEvent, ReactEvent}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object WebViewExample extends UIExample {

  val HEADER = "#3b5998"
  val BGWASH = "rgba(255,255,255,0.8)"
  val DISABLED_WASH = "rgba(255,255,255,0.25)"
  val TEXT_INPUT_REF = "urlInput"
  val WEBVIEW_REF = "webview"
  val DEFAULT_URL = "https://m.facebook.com"


  case class State(url: String = DEFAULT_URL, status: String = " No PageLoaded", backButtonEnabled: Boolean = false, forwardButtonEnabled: Boolean = true, loading: Boolean = true)


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = UIExplorerPageLazyLoad(
      UIExplorerBlock(title = "WebView")(
        View(style = styles.container)(
          View(style = styles.addressBarRow)(
            TouchableHighlight(onPress = goBack _)(
              View(style = if (state.backButtonEnabled) styles.navButton else styles.disabledButton)(
                Text()("<")
              )
            ),
            TouchableHighlight(onPress = goForward _)(
              View(style = if (state.forwardButtonEnabled) styles.navButton else styles.disabledButton)(
                Text()(">")
              )
            ),
            TextInput(ref = storeTextInputRef _, autoCapitalize = AutoCapitalize.NONE, value = state.url, onSubmitEditing = onSubmitEditing _,
              onChange = handleTextInputChange _,
              clearButtonMode = "while-editing",
              style = styles.addressBarTextInput)(),
            TouchableOpacity(onPress = pressGoButton _, style = styles.goButton)(
              Text()("Go!")
            )
          ),
          WebView(ref = storeWebViewRef _,
            automaticallyAdjustContentInsets = false,
            style = styles.webView,
            source = WebViewSource(state.url),
            onNavigationStateChange = onNavigationStateChange _,
            startInLoadingState = true
          )(),
          View(style = styles.statusBar)(
            Text(style = styles.statusBarText)(state.status)
          )
        )
      )
    )

    var inputText = ""

    var webViewMounted: WebViewM = null

    var textInputMounted: TextInputM = null


    def storeWebViewRef(ref: WebViewM) = {
      webViewMounted = ref
    }

    def storeTextInputRef(ref: TextInputM) = {
      textInputMounted = ref
    }


    def handleTextInputChange(event: ReactEvent[TextInputEvent]) = {
      inputText = event.nativeEvent.text
    }

    def goBack = if (webViewMounted != null) webViewMounted.goBack()

    def goForward = if (webViewMounted != null) webViewMounted.goForward()

    def reload = if (webViewMounted != null) webViewMounted.reload()

    def onNavigationStateChange(navState: NavigationState) = {
      setState(state.copy(url = navState.url, loading = navState.loading, backButtonEnabled = navState.canGoBack, forwardButtonEnabled = navState.canGoForward, status = navState.title))
    }

    def pressGoButton = {
      val url = inputText.toLowerCase
      if (url == state.url) reload
      else setState(state.copy(url = url))
      if (textInputMounted != null) textInputMounted.blur()
    }

    def onSubmitEditing(event: ReactEvent[TextInputEvent]) = pressGoButton

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = () =>   createElementNoProps(ctor)

  object styles extends UniversalStyleSheet {

    val container = style(flex := 1,
      backgroundColor := HEADER)

    val addressBarRow = style(flexDirection.row,
      padding := 8)

    val webView = style(
      backgroundColor := BGWASH,
      height := 350
    )

    val addressBarTextInput = style(
      backgroundColor := BGWASH,
      borderColor := "transparent",
      borderRadius := 3,
      borderWidth := 1,
      height := 24,
      paddingLeft := 10,
      paddingTop := 3,
      flex := 1,
      fontSize := 14
    )

    def buttonCommon(bg: String) = style(
      padding := 3,
      alignItems.center,
      justifyContent.center,
      backgroundColor := bg,
      borderColor := "transparent",
      borderRadius := 3
    )

    val navButton = styleE(buttonCommon(BGWASH))(
      width := 20,
      marginRight := 3)

    val disabledButton = styleE(buttonCommon(DISABLED_WASH))(
      width := 20,
      marginRight := 3)

    val goButton = styleE(buttonCommon(BGWASH))(
      height := 24,
      marginLeft := 8,
      alignSelf.stretch
    )

    val statusBar = style(
      flexDirection.row,
      alignItems.center,
      paddingLeft := 5,
      height := 22
    )

    val statusBarText = style(
      color := "white",
      fontSize := 13
    )

    val spinner = style(
      width := 20,
      marginRight := 6
    )

  }

  override def title: String = "WebView"

  override def description: String = "Base component to display sri.web content"
}
