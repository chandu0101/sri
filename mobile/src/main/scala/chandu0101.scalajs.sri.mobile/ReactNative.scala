package chandu0101.scalajs.sri.mobile


import chandu0101.scalajs.sri.core._
import chandu0101.scalajs.sri.mobile.apis._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

trait ReactNative extends React {


  //components
  val Text: ReactClass = js.native
  val View: ReactClass = js.native
  val TextInput: ReactClass = js.native
  val TouchableWithoutFeedback: ReactClass = js.native
  val TouchableHighlight: ReactClass = js.native
  val TouchableOpacity: ReactClass = js.native
  val ActivityIndicatorIOS: ReactClass = js.native
  val DatePickerIOS: ReactClass = js.native
  val Image: ReactClass = js.native
  val ScrollView: ReactClass = js.native
  val ListView: ReactClass = js.native
  val MapView: ReactClass = js.native
  val Navigator: ReactClass = js.native
  val NavigatorIOS: ReactClass = js.native
  val PickerIOS: ReactClass = js.native
  val SliderIOS: ReactClass = js.native
  val SwitchIOS: ReactClass = js.native
  val TabBarItemIOS: ReactClass = js.native
  val WebView: ReactClass = js.native
  val TabBarIOS: ReactClass = js.native
  val SegmentedControlIOS: ReactClass = js.native

  // apis

  val AlertIOS: AlertIOS = js.native
  val AppRegistry: AppRegistry = js.native
  val StyleSheet: StyleSheet = js.native
  val AppStateIOS: AppStateIOS = js.native
  val AsyncStorage: AsyncStorageJS = js.native
  val CameraRoll: CameraRoll = js.native
  val InteractionManager: InteractionManager = js.native
  val LinkingIOS: LinkingIOS = js.native
  val NetInfo: NetInfo = js.native
  val LayoutAnimation: js.Dynamic = js.native
  val PixelRatio: PixelRatio = js.native
  val PushNotificationIOS: PushNotificationIOS = js.native
  val PanResponder: PanResponder = js.native
  val StatusBarIOS: js.Dynamic = js.native
  val VibrationIOS: VibrationIOS = js.native
  val Dimensions: js.Dynamic = js.native

//  @JSName("React.Component")


}


@JSName("React")
object ReactNative extends ReactNative {
  class Component[P, S] extends js.Object {

    @JSName("props") private var jsProps: JSProps[P] = js.native

    @JSName("state") private var jsState: JSState[S] = js.native

    var refs: js.Dynamic = js.native

    @JSName("setState") def jsSetState(newState: JSState[S]): Unit = js.native

    @JSName ("setState") def jsSetState(callback: js.Function2[S, P, S]): Unit = js.native

    def forceUpdate(callback: js.Function = ???): Unit = js.native

    def componentWillMount(): Unit = js.native

    def componentDidMount(): Unit = js.native

    def componentWillUnmount(): Unit = js.native

    @JSName("componentWillReceiveProps") def jsComponentWillReceiveProps(nextProps: JSProps[P]): Unit = js.native

    @JSName("shouldComponentUpdate") def jsShouldComponentUpdate(nextProps: JSProps[P], nextState: JSState[S]): Boolean = js.native

    @JSName("componentWillUpdate") def jsComponentWillUpdate(nextProps: JSProps[P], nextState: JSState[S]): Unit = js.native

    @JSName("componentDidUpdate") def jsComponentDidUpdate(prevProps: JSProps[P], prevState: JSState[S]): Unit = js.native

  }
}

@JSName("React.Component")
class View2[P,S] extends js.Object

@JSName("React.Component")
class ReactJSComponent2[P, S] extends js.Object {

  @JSName("props")  var jsProps: JSProps[P] = js.native

  @JSName("state")  var jsState: JSState[S] = js.native

  var refs: js.Dynamic = js.native

  def render() : ReactElement  = js.native

  @JSName("setState") def jsSetState(newState: JSState[S]): Unit = js.native

  @JSName ("setState") def jsSetState(callback: js.Function2[S, P, S]): Unit = js.native

  def forceUpdate(callback: js.Function = ???): Unit = js.native

  def componentWillMount(): Unit = js.native

  def componentDidMount(): Unit = js.native

  def componentWillUnmount(): Unit = js.native

  @JSName("componentWillReceiveProps") def jsComponentWillReceiveProps(nextProps: JSProps[P]): Unit = js.native

  @JSName("shouldComponentUpdate") def jsShouldComponentUpdate(nextProps: JSProps[P], nextState: JSState[S]): Boolean = js.native

  @JSName("componentWillUpdate") def jsComponentWillUpdate(nextProps: JSProps[P], nextState: JSState[S]): Unit = js.native

  @JSName("componentDidUpdate") def jsComponentDidUpdate(prevProps: JSProps[P], prevState: JSState[S]): Unit = js.native

}
