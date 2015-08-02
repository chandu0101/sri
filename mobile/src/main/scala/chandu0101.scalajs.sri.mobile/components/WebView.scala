package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.{NEvent, ReactNative}

import scala.scalajs.js

/**
 *
 *
 * key: PropTypes.string,
    ref: PropTypes.string,
    style: PropTypes.js.Any,
 automaticallyAdjustContentInsets: PropTypes.bool,
     bounces: PropTypes.bool,
    contentInset: PropTypes.EdgeInsets,
    html: PropTypes.string,
    injectedJavaScript: PropTypes.string,
    javaScriptEnabledAndroid: PropTypes.bool,
       onNavigationStateChange: PropTypes.NavigationState => Unit,
    renderError: PropTypes.func,
    renderLoading: PropTypes.func,
    scalesPageToFit: PropTypes.bool,
    scrollEnabled: PropTypes.bool,
    startInLoadingState: PropTypes.bool,
    url: PropTypes.string.isRequired,

 */


object WebView {

  def apply(contentInset: js.UndefOr[EdgeInsets] = js.undefined,
            url: String,
            style: js.UndefOr[js.Any] = js.undefined,
            javaScriptEnabledAndroid: js.UndefOr[Boolean] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            injectedJavaScript: js.UndefOr[String] = js.undefined,
            scalesPageToFit: js.UndefOr[Boolean] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            scrollEnabled: js.UndefOr[Boolean] = js.undefined,
            onNavigationStateChange: js.UndefOr[NavigationState => Unit] = js.undefined,
            bounces: js.UndefOr[Boolean] = js.undefined,
            renderLoading: js.UndefOr[js.Function] = js.undefined,
            automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
            renderError: js.UndefOr[js.Function] = js.undefined,
            html: js.UndefOr[String] = js.undefined,
            startInLoadingState: js.UndefOr[Boolean] = js.undefined) = {

    val p = js.Dynamic.literal()
    contentInset.foreach(v => p.updateDynamic("contentInset")(v.toJson))
    p.updateDynamic("url")(url)
    style.foreach(v => p.updateDynamic("style")(v))
    javaScriptEnabledAndroid.foreach(v => p.updateDynamic("javaScriptEnabledAndroid")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    injectedJavaScript.foreach(v => p.updateDynamic("injectedJavaScript")(v))
    scalesPageToFit.foreach(v => p.updateDynamic("scalesPageToFit")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    scrollEnabled.foreach(v => p.updateDynamic("scrollEnabled")(v))
    onNavigationStateChange.foreach(v => p.updateDynamic("onNavigationStateChange")(v))
    bounces.foreach(v => p.updateDynamic("bounces")(v))
    renderLoading.foreach(v => p.updateDynamic("renderLoading")(v))
    automaticallyAdjustContentInsets.foreach(v => p.updateDynamic("automaticallyAdjustContentInsets")(v))
    renderError.foreach(v => p.updateDynamic("renderError")(v))
    html.foreach(v => p.updateDynamic("html")(v))
    startInLoadingState.foreach(v => p.updateDynamic("startInLoadingState")(v))

    val f = ReactNative.createFactory(ReactNative.WebView)
    f(p).asInstanceOf[ReactElement]
  }

}


trait NavigationState extends js.Object {

  def url: String = js.native

  def title: String = js.native

  def loading: Boolean = js.native

  def canGoBack: Boolean = js.native

  def canGoForward: Boolean = js.native

}

trait WebViewM extends js.Object {

  def reload(): Unit = js.native

  def updateNavigationState(event: NEvent): NavigationState = js.native

  def getWebWiewHandle(): js.Dynamic = js.native

  def goForward(): Unit = js.native

  def goBack(): Unit = js.native

  def onLoadingStart(event: NEvent): Unit = js.native

  def onLoadingError(event: NEvent): Unit = js.native

  def onLoadingFinish(event: NEvent): Unit = js.native

}
