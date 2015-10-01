package sri.web

import scala.scalajs.js

package object components {
  private[components] type U[T] = js.UndefOr[T]
  private[components] val undefined = js.undefined
}
