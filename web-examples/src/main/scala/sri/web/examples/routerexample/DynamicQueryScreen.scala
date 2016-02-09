package sri.web.examples.routerexample

import sri.universal.components._
import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.router
import sri.web.router.WebRouterComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, UndefOr => U, undefined}
import scala.util.Try


object DynamicQueryScreen {


  @ScalaJSDefined
  class Component extends WebRouterComponent[Int, Unit] {
    def render() = {
      View(style = Theme.flexOneAndCenter)(
        Text(style = Theme.bigText)(s"Welcome to Dynamic Query Screen, Passed Id : $props  and passed Query  : ${JSON.stringify(currentRoute.query.getOrElse(js.Dictionary()))}")
      )
    }
  }


  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  ctor.contextTypes = router.routerContextTypes

  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, id, key = key, ref = ref)
}
