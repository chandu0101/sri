package sri.mobile.examples.router.components

import sri.core._
import sri.mobile.ReactNative
import sri.mobile.apis.android.ToastAndroid
import sri.universal.components._
import sri.mobile.all._
import sri.universal.router.{NavigatorRoute, UniversalRouterCtrl}
import sri.universal.styles.UniversalStyleSheet
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}


object RightButton {

  @ScalaJSDefined
  class Component extends ReactComponent[Props, Unit] {
    def render() = TouchableOpacity(onPress = onRightPress _,
      style = styles.rightButton)(
        Text(style = styles.text)(s"Press Me"))

    def onRightPress() = {
      val message = s"You just pressed ${props.route.title} screen right button!"
     if(isIOSPlatform)  ReactNative.AlertIOS.alert("Cool", message)
      else ToastAndroid.show(message,ToastAndroid.LONG)
    }
  }

  object styles extends UniversalStyleSheet {

    val rightButton = style(marginRight := 10)

    val text = style(color := "white")
  }

  case class Props(route: NavigatorRoute)

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(route: NavigatorRoute, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, Props(route), key = key, ref = ref)

}
