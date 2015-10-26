package sri

import scala.scalajs.js

package object desktop {

  object all extends universal.UniversalAll {

    val process = js.Dynamic.global.process

  }
}
