package sri.mobile.examples.uiexplorer.apis

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.components.ios.{PickerIOS, PickerItemIOS}
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.apis.{AsyncStorage, AsyncStorageException}
import sri.universal.components._
import sri.universal.styles.SriStyleSheet

import scala.async.Async.{async, await}
import scala.scalajs.concurrent.JSExecutionContext.Implicits.runNow
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object AsyncStorageExample extends UIExample {

  val STORAGE_KEY = "@AsyncStorageExample:key"
  val COLORS = js.Array("red", "orange", "yellow", "green", "blue")

  case class State(selectedValue: String = COLORS.head, messages: js.Array[String] = js.Array())

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      println(s"In render result ${state.selectedValue} , setting info")
      UIExplorerPage(
        UIExplorerBlock("Basics - getItem, setItem, removeItem")(
          View()(
            PickerIOS(selectedValue = state.selectedValue, onValueChange = onValueChange)(
              COLORS.map(v => PickerItemIOS(key = v, value = v, label = v)())
            ),
            Text()("Selected : ",
              Text(style = styles.getColorStyle(state.selectedValue))(state.selectedValue)
            ),
            Text()(" "),
            Text(onPress = removeStorage _)("Press here to remove from storage"),
            Text()(" "),
            Text()("Messages : "),
            View()(
              state.messages.map(m => Text()(m))
            )
          )
        )
      )
    }

    def appendMessage(message: String) = {
      setState(state.copy(messages = state.messages.+:(message)))
    }

    val saveError: PartialFunction[Throwable, _] = {
      case (ex: Throwable) => {
        appendMessage(s"AsyncStorage Error ${ex.asInstanceOf[AsyncStorageException].err.message.toString}")
      }
    }


    override def componentDidMount(): Unit = {
      async {
        val result = await(AsyncStorage.getItem(STORAGE_KEY))
        if (result != null) {
          println(s"got result $result , setting info")
          setState(state.copy(selectedValue = result, messages = js.Array(s"Recovered selection from disk : ${result}")))
        } else {
          appendMessage(s"Initialized with no selection on disk")
        }
      }.recover(saveError)
    }

    val onValueChange: js.Function1[String, _] = (selectedValue: String) => {
      setState(state.copy(selectedValue = selectedValue))
      async {
        val result = await(AsyncStorage.setItem(STORAGE_KEY, selectedValue))
        appendMessage(s"Saved selection to disk ${selectedValue}")
      }.recover(saveError)
    }

    def removeStorage: Unit = async {
      val result = await(AsyncStorage.removeItem(STORAGE_KEY))
      appendMessage(s"Selection Removed from Disk")
    }.recover(saveError)
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(ctor)


  object styles extends SriStyleSheet {

    def getColorStyle(c: String) = style(color := c)
  }

  override def title: String = "AsyncStorage"

  override def description: String = "Asynchronous local disk storage."
}
