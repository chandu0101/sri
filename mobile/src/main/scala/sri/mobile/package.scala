
package sri

import sri.core.{React, ReactElementU}
import sri.mobile.apis.WindowDimensions
import sri.universal.UniversalAll
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g, literal => json}


package object mobile {

  trait MobileAll extends UniversalAll {


    def windowDimensions = ReactNative.Dimensions.get("window").asInstanceOf[WindowDimensions]

  }

  object all extends MobileAll
  
  private[mobile] val JSMacro = chandu0101.macros.tojs.JSMacro
  private[mobile] type U[T] = js.UndefOr[T]
  private[mobile] val undefined = js.undefined


}