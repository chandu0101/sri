package sri.test.router

import sri.test.components.Text
import sri.web.all._

import scala.scalajs.js.{UndefOr => U}
import scala.util.Try


object ItemDetailsScreen {

  val Component = (id: Int) => {

    Text()(s"${if (id >= 0) s"Item details of :: $id" else "Item not found"}")
  }

  def parser(placeholder: String) = Try(placeholder.toInt).getOrElse(-1)

  def apply(id: Int) = createStatelessFunctionElement(Component, id)

}
