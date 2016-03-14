package sri.universal.navigation

import scala.scalajs.js

/**
 * make sure you check for null cases even its defined.
 */
@js.native
trait NavigationStateUtils extends js.Object {

  def getParent(state: NavigationState): js.UndefOr[NavigationParentState] = js.native

  def get(state: NavigationState, key: String): js.UndefOr[NavigationState] = js.native

  def indexOf(state: NavigationState, key: String): js.UndefOr[Integer] = js.native

  def push(state: NavigationState, newChildState: NavigationState): NavigationParentState = js.native

  def pop(state: NavigationParentState): NavigationParentState = js.native

  def reset(state: NavigationState, nextChildren: js.Array[NavigationState] = ???, nextIndex: Int = ???): NavigationState = js.native

  def set(state: NavigationState = ???, key: String, nextChildren: js.Array[NavigationState], nextIndex: Int): NavigationState = js.native

  def jumpToIndex(state: NavigationState, index: Int): NavigationState = js.native

  def jumpTo(state: NavigationState, key: String): NavigationState = js.native

  def replaceAt(state: NavigationState, key: String, newState: NavigationState): NavigationState = js.native

  def replaceAtIndex(state: NavigationState, index: Int, newState: NavigationState): NavigationState = js.native


}
