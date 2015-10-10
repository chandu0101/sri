package sri.mobile.components

import sri.core.ReactElement
import sri.mobile._
import sri.universal._
import sri.universal.all._
import sri.universal.components._
import sri.universal.router.{NavigatorRoute, UniversalRouterComponent}
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


object DefaultNavigationBar {


  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Props, Unit] {
    def render() = {
      val backbutton: ReactElement = if (showBackButton()) TouchableOpacity(onPress = () => navigateBack())(View(style = props.style.navBarLeftButton)(Text(style = props.style.navBarButtonText)("Back"))) else View(style = props.style.navBarLeftButton)()
      View(style = props.style.navBar)(
        backbutton,
        Text(style = props.style.navBarTitleText)(props.route.title),
        View(style = props.style.navBarLeftButton)()
      )
    }
  }

  /**
   * style for navigation bar
   */
  trait Style extends SriStyleSheet {

    def navBar = style(
      flexDirection.row,
      backgroundColor := "rgb(248, 248, 248)",
      paddingTop := 30,
      height := 64,
      paddingBottom := 10,
      borderBottomWidth := 1.0 / ReactNative.PixelRatio.get(),
      borderBottomColor := "rgb(200, 199, 204)"
    )

    def navBarTitleText = style(
      color := "black",
      fontWeight.bold,
      textAlign.center,
      flex := 2,
      fontSize := 16)

    def navBarLeftButton = style(
      paddingLeft := 10,
      width := 50,
      overflow.hidden
    )

    def navBarButtonText = style(
      fontSize := 16,
      textAlign.center,
      flex := 2,
      color := "rgb(21, 125, 251)")

  }

  object IOSTheme extends Style {

    override val navBar = super.navBar

    override val navBarTitleText = super.navBarTitleText

    override val navBarLeftButton = super.navBarLeftButton

    override val navBarButtonText = super.navBarButtonText

  }

  object AndroidTheme extends Style {

    override val navBar = styleE(super.navBar)(height := 54, backgroundColor := "#a9a9a9", paddingTop := 15)

    override val navBarTitleText = styleE(super.navBarTitleText)(color := "white")

    override val navBarLeftButton = super.navBarLeftButton

    override val navBarButtonText = styleE(super.navBarButtonText)(color := "white")


  }

  val defaultTheme = if (isIOSPlatform) IOSTheme else AndroidTheme

  case class Props(route: NavigatorRoute, style: Style)

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(route: NavigatorRoute, style: Style = defaultTheme, key: U[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, props = Props(route, style), key = key, ref = ref)

}
