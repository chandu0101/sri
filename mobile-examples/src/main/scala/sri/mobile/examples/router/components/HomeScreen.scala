package sri.mobile.examples.router.components

import sri.core.ElementFactory._
import sri.core.ReactElement
import sri.mobile.examples.router.RouterExampleApp.{Fourth, Second}
import sri.mobile.examples.router.routes.ThirdModule
import sri.universal.components._
import sri.universal.router
import sri.universal.router.{SriRouterComponent, _}
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined

object HomeScreen {

  @ScalaJSDefined
  class Component extends SriRouterComponent[Unit, Unit] {
    override def render(): ReactElement = View(style = styles.container)(
      View(style = styles.row)(
        getStaticBlock("Static Second Screen", Second),
        getStaticBlock("Static Module Third Home Screen", ThirdModule.Home)
      ),
      View(style = styles.row)(
        getStaticBlock("Static Module Third Second Screen", ThirdModule.Second),
        getDynamicBlock("Dynamic Fourth Screen")
      )

    )

    def getStaticBlock(text: String, page: StaticPage) = {
      TouchableHighlight(style = styles.block,
        underlayColor = "grey",
        key = text,
        onPress = () => navigateToStatic(page))(
          Text(style = styles.text)(text)
        )
    }

    def getDynamicBlock(text: String) = {
      TouchableHighlight(style = styles.block,
        underlayColor = "grey",
        key = text,
        onPress = () => navigateToDynamic(Fourth, Person("Sri"), "Sri"))(
          Text(style = styles.text)(text)
        )
    }

    def onTextClick() = {
      navigateToStatic(Second)
    }
  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply() = createElementNoProps(ctor)
}

object styles extends SriStyleSheet {

  val container = style(flexOne,
    //        alignItems.center,
    justifyContent.center,
    //    backgroundColor := "purple"
    backgroundColor := "#ED4721"
  )
  val row = style(
    flex := 1,
    flexDirection.row,
    //    flexWrap.wrap,
    margin := 10)

  val block = style(
    flex := 1,
    alignSelf.stretch,
    margin := 10,
    padding := 10,
    borderRadius := 10,
    shadowColor := "black",
    shadowOpacity := 0.5,
    shadowRadius := 2,
    shadowOffset := json(height = 1, width = 0),
    backgroundColor := "#343536",
    justifyContent.center
  )

  val text = style(fontSize := 16,
    overflow.hidden,
    textAlign.center,
    color := "grey",
    fontWeight._500)

}