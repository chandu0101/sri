package sri

import scala.scalajs.js

package object relay {

  /**
   * typed version of js.concstructorOf[ C <: ReactJSComponent]
   * @tparam P
   * @tparam S
   */
  @js.native
  trait RelayTypedConstructor[P <: RelayComponentProps, S] extends js.Object
}