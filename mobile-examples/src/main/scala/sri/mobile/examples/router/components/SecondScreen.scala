package sri.mobile.examples.router.components

import sri.core.ElementFactory._
import sri.core.{ReactComponent, ReactElement}
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object SecondScreen {

  val Component  = () => { View(style = styles.container)(
      Text()("Second screen ")
    )
  }
  def apply() = createStatelessFunctionElementNoProps(Component)
}

