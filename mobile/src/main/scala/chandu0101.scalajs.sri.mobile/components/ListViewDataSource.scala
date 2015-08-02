package chandu0101.scalajs.sri.mobile.components

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{Array => JArray, UndefOr}

/**
 * Created by chandrasekharkode on 4/1/15.
 */
@JSName("ListViewDataSource")
class ListViewDataSource[T] extends js.Object {

  def this(params: js.Object) = this()

  def cloneWithRows(dataBlob: JArray[T], rowIdentities: JArray[String] = ???): ListViewDataSource[T] = js.native

  @JSName("cloneWithRows")
  def cloneWithRowsWithObject(dataBlob: js.Dictionary[Any], rowIdentities: JArray[String] = ???): ListViewDataSource[T] = js.native

  def cloneWithRowsAndSections(dataBlob: Any, sectionIdentities: JArray[String] = ???, rowIdentities: JArray[JArray[String]] = ???): ListViewDataSource[T] = js.native

  def getRowCount(): Int = js.native

  def rowShouldUpdate(sectionIndex: Int, rowIndex: Int): Boolean = js.native

  def getRowData(sectionIndex: Int, rowIndex: Int): js.Dynamic = js.native

  def getRowIDForFlatIndex(index: Int): UndefOr[String] = js.native

  def getSectionIDForFlatIndex(index: Int): UndefOr[String] = js.native

  def getSectionLengths(): JArray[Int] = js.native

  def sectionHeaderShouldUpdate(sectionIndex: Int): Boolean = js.native

  def getSectionHeaderData(sectionIndex: Int): js.Dynamic = js.native

}
