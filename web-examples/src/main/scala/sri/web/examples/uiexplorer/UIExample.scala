package sri.web.examples.uiexplorer

import sri.core.ReactElement

trait UIExample {

  def title : String
  def description : String
  def element : ReactElement
}
