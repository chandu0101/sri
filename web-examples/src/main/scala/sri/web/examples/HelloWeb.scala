package sri.web.examples

import org.scalajs.dom
import sri.core.ElementFactory._
import sri.core.{ReactElement, ReactComponent}
import sri.web.nativeweb._
import scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined}

object HelloWeb {


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      View()(
        Navigator(ref = storeNavRef _ ,
          initialRoute = json(title = "Home",component = () => View()("Hello")),
          renderScene = renderScene _
         )()
      )
    }

    def storeNavRef(nref : NavigatorM) = {
       dom.window.console.log(nref)
    }

    def renderScene(route : js.Dynamic,nav : NavigatorM) = {
      js.Dynamic.global.nav = nav
      dom.window.console.log(nav)
      println(s"rendring babe ${route.title}")
      route.component().asInstanceOf[ReactElement]
    }
  }

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(factory, key = key, ref = ref)
}
