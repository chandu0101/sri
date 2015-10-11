package sri.mobile.examples.uiexplorer.components.ios

import sri.core.ElementFactory._
import sri.core.ReactComponent
import sri.mobile.components.ios.{PickerIOS, PickerItemIOS}
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined


object PickerIOSExample extends UIExample {

  case class CarMake(name: String, models: js.Array[String])

  case class State(carMake: String = "cadillac", modelIndex: Int = 3)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      val make = CAR_MAKES_AND_MODELS.selectDynamic(state.carMake)
      val selectionString = s"${make.name.toString} ${make.models.asInstanceOf[js.Array[String]]((state.modelIndex))}"
      UIExplorerPage(
        UIExplorerBlock("PickerIOS")(
          View()(
            Text()("Please choose a make for your car :"),
            PickerIOS(selectedValue = state.carMake,
              onValueChange = handleCarMakeChange)(
                js.Object.keys(CAR_MAKES_AND_MODELS.asInstanceOf[js.Object]).map(key => {
                  PickerItemIOS(key = key, value = key, label = CAR_MAKES_AND_MODELS.selectDynamic(key).name.toString)()
                })
              ),
            Text()(s"Please choose a model of ${make.selectDynamic("name")} :"),
            PickerIOS(key = state.carMake, selectedValue = state.modelIndex,
              onValueChange = handleCarModelChange)(
                CAR_MAKES_AND_MODELS.selectDynamic(state.carMake).models.asInstanceOf[js.Array[String]].zipWithIndex
                  .map {
                  case (modelName, index) => PickerItemIOS(
                    key = s"${state.carMake}_${index.toString}",
                    value = index,
                    label = modelName
                  )()
                }
              ),
            Text()(s"You selected : ${selectionString}")
          )
        )
      )
    }

    val handleCarMakeChange: js.Function1[String, _] = (carMake: String) => {
      setState(state.copy(carMake = carMake, modelIndex = 0))
    }

    val handleCarModelChange: js.Function1[Int, _] = (modelIndex: Int) => {
      setState(state.copy(modelIndex = modelIndex))
    }
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(ctor)


  object styles extends UniversalStyleSheet {


  }

  override def title: String = "PickerIOS"

  override def description: String = "Render lists of selectable options with UIPickerView."

  val CAR_MAKES_AND_MODELS = json(
    amc = json(
      name = "AMC",
      models = js.Array("AMX", "Concord", "Eagle", "Gremlin", "Matador", "Pacer")
    ),
    alfa = json(
      name = "Alfa-Romeo",
      models = js.Array("159", "4C", "Alfasud", "Brera", "GTV6", "Giulia", "MiTo", "Spider")
    ),
    aston = json(
      name = "Aston Martin",
      models = js.Array("DB5", "DB9", "DBS", "Rapide", "Vanquish", "Vantage")
    ),
    audi = json(
      name = "Audi",
      models = js.Array("90", "4000", "5000", "A3", "A4", "A5", "A6", "A7", "A8", "Q5", "Q7")
    ),
    austin = json(
      name = "Austin",
      models = js.Array("America", "Maestro", "Maxi", "Mini", "Montego", "Princess")
    ),
    borgward = json(
      name = "Borgward",
      models = js.Array("Hansa", "Isabella", "P100")
    ),
    buick = json(
      name = "Buick",
      models = js.Array("Electra", "LaCrosse", "LeSabre", "Park Avenue", "Regal",
        "Roadmaster", "Skylark")
    ),
    cadillac = json(
      name = "Cadillac",
      models = js.Array("Catera", "Cimarron", "Eldorado", "Fleetwood", "Sedan de Ville")
    ),
    chevrolet = json(
      name = "Chevrolet",
      models = js.Array("Astro", "Aveo", "Bel Air", "Captiva", "Cavalier", "Chevelle",
        "Corvair", "Corvette", "Cruze", "Nova", "SS", "Vega", "Volt")
    )
  )
}
