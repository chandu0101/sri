package sri.web.examples.routerexample

import sri.universal.components._
import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.router
import sri.web.router.WebRouterComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, UndefOr => U, undefined}


object StaticStateScreen {


   @ScalaJSDefined
   class Component extends WebRouterComponent[Unit, Unit] {
     def render() = {
       View(style = Theme.flexOneAndCenter)(
         Text(style = Theme.bigText)(s"Welcome to StaticState Screen, State you passed is : ${JSON.stringify(currentRoute.state.getOrElse(js.Dictionary()))}")
       )
     }
   }


   val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

   ctor.contextTypes = router.routerContextTypes

   def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)
 }
