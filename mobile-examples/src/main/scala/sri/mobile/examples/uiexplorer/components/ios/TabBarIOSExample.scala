package sri.mobile.examples.uiexplorer.components.ios

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.universal.components._
import sri.mobile.components.ios.{SystemIcon, TabBarIOS, TabBarIOSItem}
import sri.mobile.examples.uiexplorer.UIExample
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


object TabBarIOSExample extends UIExample {

  val BLUE_TAB = "blueTab"
  val RED_TAB = "redTab"
  val GREEN_TAB = "greenTab"


  var base64Icon = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEsAAABLCAQAAACSR7JhAAADtUlEQVR4Ac3YA2Bj6QLH0XPT1Fzbtm29tW3btm3bfLZtv7e2ObZnms7d8Uw098tuetPzrxv8wiISrtVudrG2JXQZ4VOv+qUfmqCGGl1mqLhoA52oZlb0mrjsnhKpgeUNEs91Z0pd1kvihA3ULGVHiQO2narKSHKkEMulm9VgUyE60s1aWoMQUbpZOWE+kaqs4eLEjdIlZTcFZB0ndc1+lhB1lZrIuk5P2aib1NBpZaL+JaOGIt0ls47SKzLC7CqrlGF6RZ09HGoNy1lYl2aRSWL5GuzqWU1KafRdoRp0iOQEiDzgZPnG6DbldcomadViflnl/cL93tOoVbsOLVM2jylvdWjXolWX1hmfZbGR/wjypDjFLSZIRov09BgYmtUqPQPlQrPapecLgTIy0jMgPKtTeob2zWtrGH3xvjUkPCtNg/tm1rjwrMa+mdUkPd3hWbH0jArPGiU9ufCsNNWFZ40wpwn+62/66R2RUtoso1OB34tnLOcy7YB1fUdc9e0q3yru8PGM773vXsuZ5YIZX+5xmHwHGVvlrGPN6ZSiP1smOsMMde40wKv2VmwPPVXNut4sVpUreZiLBHi0qln/VQeI/LTMYXpsJtFiclUN+5HVZazim+Ky+7sAvxWnvjXrJFneVtLWLyPJu9K3cXLWeOlbMTlrIelbMDlrLenrjEQOtIF+fuI9xRp9ZBFp6+b6WT8RrxEpdK64BuvHgDk+vUy+b5hYk6zfyfs051gRoNO1usU12WWRWL73/MMEy9pMi9qIrR4ZpV16Rrvduxazmy1FSvuFXRkqTnE7m2kdb5U8xGjLw/spRr1uTov4uOgQE+0N/DvFrG/Jt7i/FzwxbA9kDanhf2w+t4V97G8lrT7wc08aA2QNUkuTfW/KimT01wdlfK4yEw030VfT0RtZbzjeMprNq8m8tnSTASrTLti64oBNdpmMQm0eEwvfPwRbUBywG5TzjPCsdwk3IeAXjQblLCoXnDVeoAz6SfJNk5TTzytCNZk/POtTSV40NwOFWzw86wNJRpubpXsn60NJFlHeqlYRbslqZm2jnEZ3qcSKgm0kTli3zZVS7y/iivZTweYXJ26Y+RTbV1zh3hYkgyFGSTKPfRVbRqWWVReaxYeSLarYv1Qqsmh1s95S7G+eEWK0f3jYKTbV6bOwepjfhtafsvUsqrQvrGC8YhmnO9cSCk3yuY984F1vesdHYhWJ5FvASlacshUsajFt2mUM9pqzvKGcyNJW0arTKN1GGGzQlH0tXwLDgQTurS8eIQAAAABJRU5ErkJggg=="

  case class State(selectedTab: String = BLUE_TAB, notifCount: Int = 0, presses: Int = 0)


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {
    initialState(State())

    def render() = {
      val badgeValue = if (state.notifCount > 0) state.notifCount.toString else null
      TabBarIOS()(
        TabBarIOSItem(key = BLUE_TAB, icon = ImageSource(uri = base64Icon,scale = 3.0), selected = (state.selectedTab == BLUE_TAB), onPress = () => selectTab(BLUE_TAB))(
          renderContent("#414A8C", "Scala-JS Blue Tab")
        ),
        TabBarIOSItem(key = RED_TAB, badge = badgeValue, systemIcon = SystemIcon.HISTORY, selected = (state.selectedTab == RED_TAB), onPress = () => selectTab(RED_TAB))(
          renderContent("#783E33", "Scala-JS Red Tab")
        ),
        TabBarIOSItem(key = GREEN_TAB, systemIcon = SystemIcon.MORE, selected = (state.selectedTab == GREEN_TAB), onPress = () => selectTab(GREEN_TAB))(
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


  object styles extends SriStyleSheet {

    val tabContent = style(flex := 1, alignItems.center)

    val tabText = style(color := "white", margin := 50)

  }


  override def title: String = "TabBarIOS"


  override def description: String = "Tab-based navigation."
}
