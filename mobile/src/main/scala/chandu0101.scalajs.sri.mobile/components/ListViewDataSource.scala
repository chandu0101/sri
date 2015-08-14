package chandu0101.scalajs.sri.mobile.components

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{Array => JArray, UndefOr}


@JSName("React.ListView.DataSource")
class ListViewDataSource[T,H] extends js.Object {

  def this(params: js.Object) = this()

  def cloneWithRows(dataBlob: JArray[T], rowIdentities: JArray[String] = ???): ListViewDataSource[T,H] = js.native

  @JSName("cloneWithRows")
  def cloneWithRowsWithObject(dataBlob: js.Dictionary[Any], rowIdentities: JArray[String] = ???): ListViewDataSource[T,_] = js.native

  def cloneWithRowsAndSections(dataBlob: Any, sectionIdentities: JArray[String] = ???, rowIdentities: JArray[JArray[String]] = ???): ListViewDataSource[T,H] = js.native

  def getRowCount(): Int = js.native

  def rowShouldUpdate(sectionIndex: Int, rowIndex: Int): Boolean = js.native

  def getRowData(sectionIndex: Int, rowIndex: Int): js.Dynamic = js.native

  def getRowIDForFlatIndex(index: Int): UndefOr[String] = js.native

  def getSectionIDForFlatIndex(index: Int): UndefOr[String] = js.native

  def getSectionLengths(): JArray[Int] = js.native

  def sectionHeaderShouldUpdate(sectionIndex: Int): Boolean = js.native

  def getSectionHeaderData(sectionIndex: Int): H = js.native

}
