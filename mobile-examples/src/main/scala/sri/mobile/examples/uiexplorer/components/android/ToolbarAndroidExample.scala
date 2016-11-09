package sri.mobile.examples.uiexplorer.components.android

import sri.core._
import sri.mobile.all._
import sri.mobile.components.android.{ToolbarAndroid, ToolbarAndroidAction, ToolbarAndroidActionShow}
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components.{Switch, Text, View}
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object ToolbarAndroidExample extends UIExample {

  override val title: String = "ToolbarAndroid"

  override val description: String = "Examples of using the Android toolbar"

  val createImage = load[js.Dynamic]("./images/ic_create_black_48dp.png")

  val settingsImage = load[js.Dynamic]("./images/ic_settings_black_48dp.png")

  val blackMenuImage = load[js.Dynamic]("./images/ic_menu_black_24dp.png")

  val launcherImage = load[js.Dynamic]("./images/launcher_icon.png")


  val toolbarActions = List(
    ToolbarAndroidAction(title = "Create", icon = createImage, show = ToolbarAndroidActionShow.ALWAYS),
    ToolbarAndroidAction(title = "Filter"),
    ToolbarAndroidAction(title = "Settings", icon = settingsImage, show = ToolbarAndroidActionShow.ALWAYS)
  )

  case class State(actionText: String = "Example app with toolbar component", toolbarSwitch: Boolean = false, titleColor: String = "#3b5998", subtitleColor: String = "#6a7180")

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      UIExplorerPage(
        UIExplorerBlock("Toolbar with title/subtitle and actions")(
          ToolbarAndroid(actions = toolbarActions,
            style = styles.toolbar,
            title = "Toolbar",
            navIconDynamic = blackMenuImage,
            onActionSelected = onActionSelected _,
            subtitle = state.actionText)(),
          Text()(state.actionText)
        ),
        UIExplorerBlock("Toolbar with logo & custom title view (a View with Switch+Text)")(
          ToolbarAndroid(logoDynamic = launcherImage, style = styles.toolbar)(
            View(style = styles.view1)(
              Switch(value = state.toolbarSwitch, onValueChange = handleSwitchChange _)(),
              Text()(s"a switch")
            )
          )
        ),
        UIExplorerBlock("Toolbar with no icon")(
          ToolbarAndroid(actions = toolbarActions, style = styles.toolbar, subtitle = "there is no icon here")()
        ),
        UIExplorerBlock("Toolbar with navIcon & logo, no title")(
          ToolbarAndroid(actions = toolbarActions, style = styles.toolbar, logoDynamic = launcherImage, navIconDynamic = blackMenuImage)()
        ),
        UIExplorerBlock("Toolbar with custom title colors")(
          ToolbarAndroid(
            style = styles.toolbar,
            navIconDynamic = blackMenuImage,
            title = "Wow such a toolbar",
            subtitle = "Much Native",
            subtitleColor = state.subtitleColor,
            titleColor = state.titleColor)(),
          Text()("Touch the icon to reset the custom colors to the default (theme-provided) ones.")
        )
      )
    }

    def onActionSelected(position: Int) = {
      val text = toolbarActions(position).title
      setState(state.copy(actionText = text))
    }

    def handleSwitchChange(value: Boolean) = {
      setState(state.copy(toolbarSwitch = value))
    }

  }

  val component = () => makeElement[Component]

  object styles extends UniversalStyleSheet {

    val toolbar = style(backgroundColor := "#e9eaed", height := 56)

    val view1 = style(height := 56, flexDirection.row, alignItems.center)
  }

}
