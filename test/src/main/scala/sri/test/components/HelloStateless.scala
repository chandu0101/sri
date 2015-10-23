package sri.test.components

import sri.core.{ReactElement, ReactNode}
import sri.universal.all._
import sri.universal.components._


object HelloStateless {

  val component = (props: String) => Text(testID = "st-test")(props)

  def apply(props: String) = createStatelessElement(component, props)
}

object HelloStatelessChildren {

  val component = (props: String, children: ReactElement) => Text(testID = "st-test")(props, children)

  def apply(props: String)(children: ReactNode*) = createStatelessElementWithChildren(component, props)(children: _*)
}
