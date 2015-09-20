package sri.mobile.examples.uiexplorer.components.ios

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.components._
import sri.mobile.components.ios.{TabBarIOS, TabBarItemIOS}
import sri.mobile.styles.MobileStyleSheet
import sri.mobile.examples.uiexplorer.UIExample

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


object TabBarIOSExample extends UIExample {

  val BLUE_TAB = "blueTab"
  val RED_TAB = "redTab"
  val GREEN_TAB = "greenTab"

  case class State(selectedTab: String = BLUE_TAB, notifCount: Int = 0, presses: Int = 0)


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {
    initialState(State())

    def render() = {
      val badgeValue = if (state.notifCount > 0) state.notifCount.toString else null
      TabBarIOS()(
        TabBarItemIOS(key = BLUE_TAB, icon = getImage("favorites"), selected = (state.selectedTab == BLUE_TAB), onPress = () => selectTab(BLUE_TAB))(
          renderContent("#414A8C", "Scala-JS Blue Tab")
        ),
        TabBarItemIOS(key = RED_TAB, badge = badgeValue, icon = getImage("history"), selected = (state.selectedTab == RED_TAB), onPress = () => selectTab(RED_TAB))(
          renderContent("#783E33", "Scala-JS Red Tab")
        ),
        TabBarItemIOS(key = GREEN_TAB, icon = getImage("favorites"), selected = (state.selectedTab == GREEN_TAB), onPress = () => selectTab(GREEN_TAB))(
          renderContent("#21551C", "Scala-JS Green Tab")
        )
      )
    }

    def renderContent(color: String, pageText: String) = {
      View(style = js.Array(styles.tabContent, json(backgroundColor = color)))(
        Text(style = styles.tabText)(pageText),
        Text(style = styles.tabText)(s"${state.presses} re-renders of this tab")
      )
    }

    def getImage(imageUri: String) = ImageSource(uri = imageUri)

    def selectTab(name: String) = name match {
      case BLUE_TAB => setState(state.copy(selectedTab = name))
      case RED_TAB => setState(state.copy(selectedTab = name, notifCount = state.notifCount + 1))
      case GREEN_TAB => setState(state.copy(selectedTab = name, presses = state.presses + 1))
    }
  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  val component = createElementNoProps(factory)


  object styles extends MobileStyleSheet {

    val tabContent = style(flex := 1, alignItems.center)

    val tabText = style(color := "white", margin := 50)

  }


  override def title: String = "TabBarIOS"


  override def description: String = "Tab-based navigation."
}
