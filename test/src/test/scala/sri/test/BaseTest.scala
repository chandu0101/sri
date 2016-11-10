package sri.test

import org.scalactic.source.Position
import org.scalatest.{BeforeAndAfter, FunSuite, Tag}
import sri.core.{ReactComponent, ReactElement}

import scala.scalajs.js.JavaScriptException

class BaseTest extends FunSuite with BeforeAndAfter{

  def getRenderedOutput(element: ReactElement) = {
    val shallowRendere = getShallowRenderer(element)
    shallowRendere.getRenderOutput()
  }

  def getShallowRenderer(element: ReactElement) = {
    val shallowRendere = ReactTestUtils.createRenderer()
    shallowRendere.render(element)
    shallowRendere
  }
  
  def getMountedInstance[T <: ReactComponent[_,_]](element : ReactElement): T = {
    getShallowRenderer(element).getMountedInstance[T]()
  }

  override protected def test(testName: String, testTags: org.scalatest.Tag*)(testFun: => Any)(implicit pos: Position) = {
    super.test(testName, testTags: _*)(try testFun catch {
      case jse @ JavaScriptException(e) =>
        println(e)
        jse.printStackTrace()
        throw jse
    })
  }

}
