package sri

import sri.core.CoreAll

import scala.scalajs.js

package object universal {

  trait UniversalAll extends CoreAll{

    val IOS_OS = "ios"

    val ANDROID_OS = "android"

    val isIOSPlatform: Boolean = !js.isUndefined(ReactUniversal.Platform) && ReactUniversal.Platform.OS == IOS_OS

    val isAndroidPlatform: Boolean = !js.isUndefined(ReactUniversal.Platform) && ReactUniversal.Platform.OS == ANDROID_OS

    val isWebPlatform: Boolean = !js.isUndefined(ReactUniversal.Platform) && ReactUniversal.Platform.OS == "browser"

  }

  object all extends UniversalAll


}
