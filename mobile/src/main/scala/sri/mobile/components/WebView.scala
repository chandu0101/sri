package sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.mobile.{WebViewEvent, ReactNative}
import sri.universal.ReactEvent
import sri.universal.components.EdgeInsets

import scala.scalajs.js

case class WebView(contentInset: js.UndefOr[EdgeInsets] = js.undefined,
                   url: String,
                   style: js.UndefOr[js.Any] = js.undefined,
                   javaScriptEnabled: js.UndefOr[Boolean] = js.undefined,
                   ref: js.UndefOr[WebViewM => _] = js.undefined,
                   injectedJavaScript: js.UndefOr[String] = js.undefined,
                   scalesPageToFit: js.UndefOr[Boolean] = js.undefined,
                   key: js.UndefOr[String] = js.undefined,
                   scrollEnabled: js.UndefOr[Boolean] = js.undefined,
                   onNavigationStateChange: js.UndefOr[NavigationState => Unit] = js.undefined,
                   bounces: js.UndefOr[Boolean] = js.undefined,
                   domStorageEnabled: js.UndefOr[Boolean] = js.undefined,
                   renderLoading: js.UndefOr[js.Function] = js.undefined,
                   automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
                   onError: js.UndefOr[js.Dynamic => Unit] = js.undefined,
                   onLoadStart: js.UndefOr[js.Dynamic => Unit] = js.undefined,
                   source: js.UndefOr[js.Object] = js.undefined,
                   onLoadEnd: js.UndefOr[() => _] = js.undefined,
                   onLoad: js.UndefOr[() => _] = js.undefined,
                   renderError: js.UndefOr[js.Function] = js.undefined,
                   html: js.UndefOr[String] = js.undefined,
                   startInLoadingState: js.UndefOr[Boolean] = js.undefined) {

  def apply() = {
    val props = JSMacro[WebView](this)
    React.createElement(ReactNative.WebView, props)
  }

}

@js.native
trait NavigationState extends js.Object {

  def url: String = js.native

  def title: String = js.native

  def loading: Boolean = js.native

  def canGoBack: Boolean = js.native

  def canGoForward: Boolean = js.native

}

@js.native
trait WebViewM extends js.Object {

  def reload(): Unit = js.native

  def updateNavigationState(event: ReactEvent[WebViewEvent]): NavigationState = js.native

  def getWebWiewHandle(): js.Dynamic = js.native

  def goForward(): Unit = js.native

  def goBack(): Unit = js.native

  def onLoadingStart(event: ReactEvent[WebViewEvent]): Unit = js.native

  def onLoadingError(event: ReactEvent[WebViewEvent]): Unit = js.native

  def onLoadingFinish(event: ReactEvent[WebViewEvent]): Unit = js.native

}
