package sri.test

import org.scalatest.FunSuite
import sri.core.ReactElement

class BaseTest extends FunSuite {

  def getRenderedOutput(comp: ReactElement) = {
    val shallowRendere = ReactTestUtils.createRenderer()
    shallowRendere.render(comp)
    shallowRendere.getRenderOutput()
  }

}
