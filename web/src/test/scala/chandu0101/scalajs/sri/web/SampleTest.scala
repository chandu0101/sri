package sri.web

import org.scalatest.FunSuite
import sri.core.ReactJSComponent

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class Hello extends ReactJSComponent

class SampleTest extends FunSuite{


  test("sample") {
    println(s"here here here ${new Hello()}")
    assert(2 == 2)
  }
}
