package sri.mobile.examples.router.components

import sri.core.ElementFactory._
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U}


object ThirdModuleHomeScreen {

  val Component = () => {
    View(style = styles.container)(
     Text()("Third Module Home Screen")
    )
  }

  def apply(key: js.UndefOr[String] = js.undefined) = createStatelessFunctionElementNoProps(Component, key = key)
}
