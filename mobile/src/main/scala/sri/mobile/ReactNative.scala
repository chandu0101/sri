package sri.mobile

import sri.core._
import sri.mobile.apis._
import sri.mobile.apis.android.{BackAndroid, IntentAndroid, ToastAndroid}
import sri.mobile.apis.ios._
import sri.mobile.components.android.{TimerPickerAndroid, DatePickerAndroid}
import sri.mobile.modules.NativeModules
import sri.universal.ReactUniversal
import sri.universal.apis.{Alert, Clipboard, LayoutAnimation, NetInfo}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait ReactNative extends ReactUniversal {


  //components
  val ActivityIndicatorIOS: ReactClass = js.native
  val DatePickerIOS: ReactClass = js.native
  val MapView: ReactClass = js.native
  val NavigatorIOS: ReactClass = js.native
  val SliderIOS: ReactClass = js.native
  val SwitchIOS: ReactClass = js.native
  val TabBarItemIOS: ReactClass = js.native
  val WebView: ReactClass = js.native
  val TabBarIOS: ReactClass = js.native
  val SegmentedControlIOS: ReactClass = js.native
  val DrawerLayoutAndroid: ReactClass = js.native
  val ProgressBarAndroid: ReactClass = js.native
  val ProgressViewIOS: ReactClass = js.native
  val PickerIOS: ReactClass = js.native
  val SwitchAndroid: ReactClass = js.native
  val ToolbarAndroid: ReactClass = js.native
  val TouchableNativeFeedback: ReactClass = js.native
  val ViewPagerAndroid: ReactClass = js.native
  val DatePickerAndroid: DatePickerAndroid = js.native
  val TimerPickerAndroid: TimerPickerAndroid = js.native
  val StatusBar: ReactClass = js.native


  // apis

  val Alert: Alert = js.native
  val Clipboard: Clipboard = js.native
  val AlertIOS: AlertIOS = js.native
  val StyleSheet: StyleSheet = js.native
  val AppStateIOS: AppStateIOS = js.native
  val AppState: AppState = js.native
  val CameraRoll: CameraRoll = js.native
  val InteractionManager: InteractionManager = js.native
  val LinkingIOS: LinkingIOS = js.native
  val NetInfo: NetInfo = js.native
  val LayoutAnimation: LayoutAnimation = js.native
  val PushNotificationIOS: PushNotificationIOS = js.native
  val PanResponder: PanResponder = js.native
  val StatusBarIOS: js.Dynamic = js.native
  val VibrationIOS: VibrationIOS = js.native
  val Dimensions: Dimensions = js.native
  val Animated: js.Dynamic = js.native
  val IntentAndroid: IntentAndroid = js.native
  val Linking: Linking = js.native
  val ToastAndroid: ToastAndroid = js.native
  val BackAndroid: BackAndroid = js.native
  val UIManager: UIManager = js.native

  // native stuff
  val NativeModules: NativeModules = js.native


}

@js.native
trait ReactPlatForm extends js.Object {
  val OS: String = js.native
  val Version: Double = js.native
}

@js.native
@JSName("ReactNative")
object ReactNative extends ReactNative

