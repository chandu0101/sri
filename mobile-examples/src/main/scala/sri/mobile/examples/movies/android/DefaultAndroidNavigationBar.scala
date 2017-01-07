package sri.mobile.examples.movies.android

import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.components.android.ToolbarAndroid
import sri.mobile.examples.images.AndroidBackWhiteImage
import sri.universal.router
import sri.universal.router.{NavigatorRoute, UniversalRouterComponent, UniversalRouterCtrl}
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object DefaultAndroidNavigationBar {

  var rctrl: UniversalRouterCtrl = _

  ReactNative.BackAndroid.addEventListener("hardwareBackPress", () => {
    if (rctrl != null && rctrl.navigator.getCurrentRoutes().length > 1) {
      rctrl.navigator.pop()
      true
    } else false
  })

  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Props, Unit] {
    def render() = {
      val androidback: js.UndefOr[js.Any] = if (previousRoute.isDefined) AndroidBackWhiteImage else js.undefined
      ToolbarAndroid(
        style = props.style.toolbar,
        actions = Seq(),
        navIconDynamic = androidback,
        onIconClicked = () => navigateBack(),
        titleColor = "white",
        title = props.route.title.toString)()
    }

    override def componentDidMount(): Unit = {
      rctrl = getRouterCtrl()
    }
  }

  /**
    * style for navigation bar
    */
  trait Style extends UniversalStyleSheet {

    def toolbar = style(
      height := 56,
      backgroundColor := "#a9a9a9"
    )

  }

  object DefaultTheme extends Style {
    override val toolbar = super.toolbar
  }

  case class Props(route: NavigatorRoute, style: Style)

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(route: NavigatorRoute, style: Style = DefaultTheme, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component](props = Props(route, style), key = key, ref = ref)

}
