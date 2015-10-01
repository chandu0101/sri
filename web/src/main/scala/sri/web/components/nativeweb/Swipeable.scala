package sri.web.components
package nativeweb

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}

import scala.scalajs.js

case class Swipeable(ref: U[SwipeableM => _] = undefined,
                     key: U[String] = undefined,
                     style: U[js.Any] = undefined,
                     delta: U[Double] = undefined,
                     flickThreshold: U[Double] = undefined,
                     onSwiped: U[(SyntheticTouchEvent, Double, Double, Boolean) => _] = undefined,
                     onSwipedDown: U[(SyntheticTouchEvent, Double, Boolean) => _] = undefined,
                     onSwipedLeft: U[(SyntheticTouchEvent, Double, Boolean) => _] = undefined,
                     onSwipedUp: U[(SyntheticTouchEvent, Double, Boolean) => _] = undefined,
                     onSwipedRight: U[(SyntheticTouchEvent, Double, Boolean) => _] = undefined,
                     onSwipingDown: U[(SyntheticTouchEvent, Double, Boolean) => _] = undefined,
                     onSwipingLeft: U[(SyntheticTouchEvent, Double, Boolean) => _] = undefined,
                     onSwipingRight: U[(SyntheticTouchEvent, Double, Boolean) => _] = undefined,
                     onSwipingUp: U[(SyntheticTouchEvent, Double, Boolean) => _] = undefined
                      ) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[Swipeable](this)
    React.createElement(ReactNativeWeb.Swipeable, props, children: _*)
  }

}

@js.native
trait SyntheticTouchEvent extends js.Object

@js.native
trait SwipeableM extends js.Object