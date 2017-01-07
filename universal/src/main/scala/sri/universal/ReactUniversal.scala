package sri.universal

import sri.core.ReactClass
import sri.universal.apis._
import sri.universal.navigation.NavigationExperimental

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}




@js.native
trait ReactUniversal extends js.Object {
  //components
  val Text: ReactClass = js.native
  val View: ReactClass = js.native
  val KeyboardAvoidingView: ReactClass = js.native
  val TextInput: ReactClass = js.native
  val TouchableWithoutFeedback: ReactClass = js.native
  val TouchableHighlight: ReactClass = js.native
  val TouchableOpacity: ReactClass = js.native
  val Image: ReactClass = js.native
  val ScrollView: ReactClass = js.native
  val ListView: ReactClass = js.native
  val SwipeableListView: ReactClass = js.native
  val Navigator: ReactClass = js.native
  val Picker: ReactClass = js.native
  val Modal: ReactClass = js.native
  val Switch: ReactClass = js.native
  val Button: ReactClass = js.native
  val RefreshControl: ReactClass = js.native
  val Incremental: ReactClass = js.native
  val IncrementalGroup: ReactClass = js.native
  val IncrementalPresenter: ReactClass = js.native
  val WindowedListView: ReactClass = js.native
  val Slider: ReactClass = js.native
  val ActivityIndicator: ReactClass = js.native


  val NavigationExperimental: NavigationExperimental = js.native


  // apis
  //
  val StyleSheet: StyleSheet = js.native
  val AsyncStorage: AsyncStorageJS = js.native
  val AppRegistry: AppRegistry = js.native
  val Keyboard: Keyboard = js.native
  //  val CameraRoll: CameraRoll = js.native
  //  val InteractionManager: InteractionManager = js.native
  //  val LinkingIOS: LinkingIOS = js.native
  //  val NetInfo: NetInfo = js.native
  //  val LayoutAnimation: js.Dynamic = js.native
  val PixelRatio: PixelRatio = js.native
  val DeviceEventEmitter: DeviceEventEmitter = js.native
  val Animated: Animated = js.native
  //  val PushNotificationIOS: PushNotificationIOS = js.native
  val PanResponder: PanResponder = js.native
  //  val StatusBarIOS: js.Dynamic = js.native
  //  val VibrationIOS: VibrationIOS = js.native
  //  val Dimensions: js.Dynamic = js.native

  //misc
  val Platform: ReactPlatForm = js.native

}

@js.native
@JSImport("react-native", JSImport.Namespace)
object ReactUniversal extends ReactUniversal

