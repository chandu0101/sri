package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.{NEvent, ReactNative}

import scala.scalajs.js

case class WebView(contentInset: js.UndefOr[EdgeInsets] = js.undefined,
                   url: String,
                   style: js.UndefOr[js.Any] = js.undefined,
                   javaScriptEnabledAndroid: js.UndefOr[Boolean] = js.undefined,
                   ref: js.UndefOr[WebViewM => _] = js.undefined,
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
                   startInLoadingState: js.UndefOr[Boolean] = js.undefined) {

  def apply() = {
    val props = JSMacro[WebView](this)
    ReactNative.createElement(ReactNative.WebView,props)
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

  def updateNavigationState(event: NEvent): NavigationState = js.native

  def getWebWiewHandle(): js.Dynamic = js.native

  def goForward(): Unit = js.native

  def goBack(): Unit = js.native

  def onLoadingStart(event: NEvent): Unit = js.native

  def onLoadingError(event: NEvent): Unit = js.native

  def onLoadingFinish(event: NEvent): Unit = js.native

}
