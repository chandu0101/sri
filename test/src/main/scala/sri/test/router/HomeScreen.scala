package sri.test.router

import sri.test.components.Text
import sri.universal.components._
import sri.web.all._
import sri.web.router.{WebRouterComponent, WebRouterCtrl}
import sri.web.styles.WebStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object HomeScreen {

  /**
    * this hack is only for testing don't do this in real world :)
    */
  var ctrl: WebRouterCtrl = null


  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {
    def render() = Text()("home")

    override def componentDidMount(): Unit = {
      ctrl = getRouterCtrl()
    }
  }

  js.constructorOf[Component].contextTypes = sri.web.router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)

}
