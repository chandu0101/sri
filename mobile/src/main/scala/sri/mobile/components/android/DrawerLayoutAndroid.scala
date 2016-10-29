package sri.mobile.components.android

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement, ReactNode}
import sri.mobile.{DrawerLayoutAndroidEvent, ReactNative}
import sri.universal.ReactEvent

import scala.scalajs.js
import scala.scalajs.js.{UndefOr => U, undefined}


case class DrawerLayoutAndroid(key: U[String] = undefined,
                               style: U[js.Any] = undefined,
                               ref: U[DrawerLayoutAndroidM => _] = undefined,
                               drawerPosition: U[DrawerPosition] = undefined,
                               drawerWidth: U[Double] = undefined,
                               statusBarBackgroundColor: U[String] = undefined,
                               onDrawerSlide: U[ReactEvent[DrawerLayoutAndroidEvent] => _] = undefined,
                               onDrawerStateChanged: U[String => _] = undefined,
                               onDrawerOpen: U[() => _] = undefined,
                               onDrawerClose: U[() => _] = undefined,
                               renderNavigationView: U[() => ReactElement]
                                ) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[DrawerLayoutAndroid](this)
    val f = React.createFactory(ReactNative.DrawerLayoutAndroid)
    f(props, children: _*)
  }

}

@js.native
trait DrawerLayoutAndroidM extends js.Object

object DrawerLayoutAndroidS {

  val positions = ReactNative.DrawerLayoutAndroid.asInstanceOf[js.Dynamic].positions
}


class DrawerPosition private(val value: js.Dynamic) extends AnyVal

object DrawerPosition {

  val LEFT = new DrawerPosition(DrawerLayoutAndroidS.positions.Left)

  val RIGHT = new DrawerPosition(DrawerLayoutAndroidS.positions.Right)
}

class DrawerLayoutAndroidKeyBoardDismissMode private(val value: String) extends AnyVal


object DrawerLayoutAndroidKeyBoardDismissMode {

  val NONE = new DrawerLayoutAndroidKeyBoardDismissMode("none")

  val ON_DRAG = new DrawerLayoutAndroidKeyBoardDismissMode("on-drag")
}

class DrawerLockMode private(val value: String) extends AnyVal

object DrawerLockMode {

  val UNLOCKED = new DrawerLockMode("unlocked")
  val LOCKED_CLOSED = new DrawerLockMode("locked-closed")
  val LOCKED_OPEN = new DrawerLockMode("locked-open")


}
