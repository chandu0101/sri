package chandu0101.scalajs.sri.mobile


import chandu0101.scalajs.sri.core._
import chandu0101.scalajs.sri.mobile.apis._
import chandu0101.scalajs.sri.mobile.modules.NativeModules

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
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
  val Modal: ReactClass = js.native

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

  // native stuff
  val NativeModules: NativeModules = js.native


}


@js.native
@JSName("React")
object ReactNative extends ReactNative

