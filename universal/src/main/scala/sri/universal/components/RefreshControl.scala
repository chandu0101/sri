package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.universal.ReactUniversal

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class RefreshControl(key: U[String] = undefined,
                          style: U[js.Any] = undefined,
                          ref: U[RefreshControlM => _] = undefined,
                          onRefresh: U[() => _] = undefined,
                          refreshing: U[Boolean] = undefined,
                          tintColor: U[String] = undefined,
                          title: U[String] = undefined,
                          enabled: U[Boolean] = undefined,
                          colors: U[Seq[String]] = undefined,
                          progressBackgroundColor: U[String] = undefined,
                          size: U[RefreshControlSize] = undefined
                           ) {

  def apply() = {
    val props = JSMacro[RefreshControl](this)
    React.createElement(ReactUniversal.RefreshControl, props)
  }

}

object RefreshControl {

  val SIZE = ReactUniversal.RefreshControl.asInstanceOf[js.Dynamic].SIZE
}


class RefreshControlSize private(val value: js.Dynamic) extends AnyVal

object RefreshControlSize {

  val DEFAULT = new RefreshControlSize(RefreshControl.SIZE.DEFAULT)

  val LARGE = new RefreshControlSize(RefreshControl.SIZE.LARGE)

}

@js.native
trait RefreshControlM extends js.Object
