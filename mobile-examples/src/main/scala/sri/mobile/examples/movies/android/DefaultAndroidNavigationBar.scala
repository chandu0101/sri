package sri.mobile.examples.movies.android

import sri.mobile.all._
import sri.mobile.apis.android.BackAndroid
import sri.mobile.components.android.ToolbarAndroid
import sri.universal.components._
import sri.universal.router
import sri.universal.router.{NavigatorRoute, SriRouterComponent, SriRouterCtrl}
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object DefaultAndroidNavigationBar {

  var rctrl: SriRouterCtrl = _

  BackAndroid.addEventListener("hardwareBackPress", () => {
    if (rctrl != null && rctrl.navigator.getCurrentRoutes().length > 1) {
      rctrl.navigator.pop()
      true
    } else false
  })

  @ScalaJSDefined
  class Component extends SriRouterComponent[Props, Unit] {
    def render() = {
      val androidback: js.UndefOr[ImageSource] = if (showBackButton()) ImageSource.fromJson(js.Dynamic.global.require("image!android_back_white")) else js.undefined
      ToolbarAndroid(
        style = props.style.toolbar,
        actions = Seq(),
        navIcon = androidback,
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
  trait Style extends SriStyleSheet {

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

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(route: NavigatorRoute, style: Style = DefaultTheme, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, props = Props(route, style), key = key, ref = ref)

}
