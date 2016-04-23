package sri

import sri.universal.UniversalAll

import scala.scalajs.js

package object web {

  private[web] type U[T] = js.UndefOr[T]
  private[web] val undefined = js.undefined

  type NEvent = js.Dynamic

  trait WebAll extends UniversalAll with ReactEventAliases

  object all extends WebAll
}
