package sri.web.examples

import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet
import sri.web.all._
import sri.web.examples.AppRouter.{ContactPage, SecondPage}
import sri.web.router
import sri.web.router.WebRouterComponent

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U}

object HelloWeb {


  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {
    def render() = {
      View(style = styles.container)(
        Text(style = styles.text)(s"Welcome to Sri Web"),
        TouchableOpacity(style = styles.button, onPress = onButtonPress _)(
          View()(
            Text()(s"Second Button")
          )
        ),
        TouchableHighlight(style = styles.button, onPress = onButtonPress2 _)(
          View()(
            Text()(s"Contact Button Button")
          )
        ),
        Image(style = styles.image, source = ImageSource(uri = "http://www.scala-js.org/images/scala-js-logo-256.png"))(),
        Text(style = styles.text)("Scala.js - Future of app development!")
      )
    }

    def onButtonPress() = {
      navigateTo(SecondPage)
    }

    def onButtonPress2() = {
      navigateToDynamic(ContactPage,"1")
    }

  }

  object styles extends UniversalStyleSheet {

    val container = style(flexOne,
      backgroundColor := "rgb(175, 9, 119)",
      justifyContent.center,
      alignItems.center)

    val image = style(width := 256, height := 256, margin := 20)

    val text = style(fontWeight._500,
      fontSize := 18,
      color := "white")

    val button = style(width := 100,
      height := 100,
      borderLeftWidth := 2,
      borderRightWidth := 2,
      borderTopWidth := 2,
      borderBottomWidth := 2,
      borderColor := "red",
      margin := 40)

  }


  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])
  ctor.contextTypes = router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)
}
