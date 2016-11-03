package sri.mobile.examples.router.components

import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.apis.android.ToastAndroid
import sri.universal.components._
import sri.universal.router
import sri.universal.router.UniversalRouterComponent
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined}


object RightButton {

  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Unit, Unit] {
    def render() = {
      TouchableOpacity(onPress = onRightPress _,
        style = styles.rightButton)(
        Text(style = styles.text)(s"Press Me"))
    }

    def onRightPress() = {
      val message = s"You just pressed ${currentRoute.title} screen right button!"
      if (isIOSPlatform) ReactNative.AlertIOS.alert("Cool", message)
      else ReactNative.ToastAndroid.show(message, ReactNative.ToastAndroid.LONG)
    }
  }

  object styles extends UniversalStyleSheet {

    val rightButton = style(marginRight := 10)

    val text = style(color := "white")
  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)

}
