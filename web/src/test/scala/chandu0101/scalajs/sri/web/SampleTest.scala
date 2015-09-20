package sri.web

import sri.core.ReactJSComponent
import org.scalatest.FunSuite

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class Hello extends ReactJSComponent

class SampleTest extends FunSuite{


  test("sample") {
    println(s"here here here ${new Hello()}")
    assert(2 == 2)
  }
}
