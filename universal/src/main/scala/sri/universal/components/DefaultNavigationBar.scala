package sri.universal.components

import sri.core._
import sri.universal._
import sri.universal.all._
import sri.universal.router.{NavigatorRoute, UniversalRouterComponent}
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object DefaultNavigationBar {

  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Props, Unit] {
    def render() = {
       val route = currentRoute
      View(style = props.style.navBar)(
        if (route.leftButton.isDefined) route.leftButton.get()
        else if (props.leftButton != null) props.leftButton
        else {
          View(style = props.style.navBarLeftButton)(
            previousRoute.isDefined ?= TouchableOpacity(onPress = () => navigateBack())(Text(style = props.style.navBarButtonText)("Back"))
          )
        },
        Text(style = props.style.navBarTitleText)(route.title),
        if (route.rightButton.isDefined) route.rightButton.get()
        else if (props.rightButton != null) props.rightButton
        else View(style = props.style.navBarRightButton)()
      )
    }
  }

  /**
   * style for navigation bar
   */
  trait Style extends UniversalStyleSheet {

    def navBar = style(
      flexDirection.row,
      backgroundColor := "rgb(248, 248, 248)",
      paddingTop := 30,
      height := 64,
      paddingBottom := 10,
      borderBottomWidth := 1.0 / ReactUniversal.PixelRatio.get(),
      borderBottomColor := "rgb(200, 199, 204)"
    )

    def navBarTitleText = style(
      color := "black",
      fontWeight._500,
      textAlign.center,
      flex := 1,
      fontSize := 16)

    def navBarLeftButton = style(
      width := 70,
      overflow.hidden,
      flexDirection.row,
      alignItems.center,
      marginLeft := 10,
      justifyContent.flexStart
    )

    def navBarRightButton = style(
      width := 70,
      overflow.hidden,
      flexDirection.row,
      alignItems.center,
      marginRight := 10,
      justifyContent.flexEnd
    )

    def navBarButtonText = style(
      fontSize := 16,
      textAlign.center,
      color := "rgb(21, 125, 251)")

  }

  object IOSTheme extends Style {

    override val navBar = super.navBar

    override val navBarTitleText = super.navBarTitleText

    override val navBarLeftButton = super.navBarLeftButton

    override val navBarRightButton = super.navBarRightButton

    override val navBarButtonText = super.navBarButtonText

  }

  object AndroidTheme extends Style {

    override val navBar = styleE(super.navBar)(height := 54,
      backgroundColor := "#a9a9a9",
      paddingTop := 15)

    override val navBarTitleText = styleE(super.navBarTitleText)(color := "white")

    override val navBarLeftButton = super.navBarLeftButton

    override val navBarRightButton = super.navBarRightButton

    override val navBarButtonText = styleE(super.navBarButtonText)(color := "white")

  }

  val defaultTheme = if (isIOSPlatform) IOSTheme else AndroidTheme

  case class Props(style: Style, leftButton: ReactElement = null, rightButton: ReactElement = null)


  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])
  ctor.contextTypes = router.routerContextTypes



  def apply(style: Style = defaultTheme, leftButton: ReactElement = null, rightButton: ReactElement = null, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, props = Props(style, leftButton, rightButton), key = key, ref = ref)

}
