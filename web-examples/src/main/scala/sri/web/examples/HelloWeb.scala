package sri.web.examples

import sri.web.all._
import sri.web.router
import sri.web.router.WebRouterComponent
import sri.web.styles.WebStyleSheet
import sri.web.vdom.htmltags._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object HelloWeb {


  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {
    def render() = {
      div(style = styles.container)(
        span(style = styles.text)(s"Welcome to Sri Web"),
        img(style = styles.image, src = "http://www.scala-js.org/images/scala-js-logo-256.png"),
        span(style = styles.text)("Scala.js - Future of app development!")
      )
    }

  }

  object styles extends WebStyleSheet {

    val container = style(flex := 1,
       display.flex,
       flexDirection.column,
      backgroundColor := "rgb(175, 9, 119)",
      justifyContent.center,
      alignItems.center)

    val image = style(width := 256, height := 256, margin := 20)

    val text = style(fontWeight.bold,
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
