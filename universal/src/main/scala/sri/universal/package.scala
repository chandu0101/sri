package sri

import scala.scalajs.js

package object universal {

  type NEvent = js.Dynamic

  val IOS_OS = "ios"

  val ANDROID_OS = "android"

  val isIOSPlatform: Boolean = ReactUniversal.Platform.OS == IOS_OS

  val isAndroidPlatform: Boolean = ReactUniversal.Platform.OS == ANDROID_OS

  val isWebPlatform: Boolean = js.isUndefined(ReactUniversal.Platform)
}
