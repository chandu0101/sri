package sri.web.examples.routerexample

import sri.web.all._
import sri.web.examples.styles.Theme
import sri.web.vdom.htmltags._

import scala.scalajs.js.{UndefOr => U}
import scala.util.Try


object ItemDetailsScreen {

  val Component = (id: Int) => {
    div(style = Theme.flexOneAndDirectionRow)(
      ItemsLeftNav(),
      div(style = Theme.flexOneAndCenter)(
        span(style = Theme.bigText)(s"${if (id >= 0) s"Item details of :: $id" else "Item not found"}")
      )
    )
  }

  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int) = createStatelessFunctionElement(Component, id)

}
