package sri.relay.store

import sri.relay.query.RelayQueryFragment
import sri.relay.tools.RelayInternalTypes.DataID

import scala.scalajs.js

object GraphQLFragmentPointer {
  //todo multivalue
  //def createForRoot(store: RelayRecordStore, query: RelayQueryRoot): js.UndefOr[FragmentPointerObject | Seq[js.UndefOr[FragmentPointerObject]] = js.native
}

/**
 * Fragment pointers encapsulate the fetched data for a fragment reference. They
 * are opaque tokens that are used by Relay containers to read data that is then
 * passed to the underlying React component.
 */
@js.native
class GraphQLFragmentPointer(dataIDOrIDs: Seq[DataID], fragment: RelayQueryFragment) extends js.Object {
  //todo multivalue
  //class GraphQLFragmentPointer(dataIDOrIDs: DataID | Seq[DataID], fragment: RelayQueryFragment) extends js.Object {
  /**
   * Get the data ID for a singular query fragment.
   */
  def getDataID: DataID = js.native

  /**
   * Get the data ID for a plural query fragment.
   */
  def getDataIDs: Seq[DataID] = js.native

  def getFragment: RelayQueryFragment = js.native

  def equals(that: GraphQLFragmentPointer): Boolean = js.native

  /**
   * unstable
   *
   * For debugging only, do not rely on this for comparing values at runtime.
   * Instead, use `pointer.getFragment().getFragmentID()`.
   */
  override def toString: String = js.native
}

