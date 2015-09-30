package sri.relay

import sri.core._
import sri.relay.container.RelayContainer

import scala.scalajs.js

object RelayElementFactory {

  /**
   *
   * @param ctor
   * @param clz
   * @return
   */
  def getTypedConstructor[C <: ReactComponent[_, _]](ctor: js.Dynamic, clz: Class[C]) = {
    ctor.asInstanceOf[ReactComponentConstructor[C]]
  }


  def createRelayElement[C <: RelayComponent[_,_]](container: RelayContainer[C],
                               props: js.Any,
                               key: js.UndefOr[String] = js.undefined,
                               ref: js.Function1[C, _] = null
                                ) = createRelayElementWithChildren(container, props, key, ref)()


  def createRelayElementWithChildren[C <: RelayComponent[_,_]](container: => RelayContainer[_],
                                           props: js.Any,
                                           key: js.UndefOr[String] = js.undefined,
                                           ref: js.Function1[_ <: C, _] = null
                                            )(children: ReactNode*): ReactElementU[_, _] = {
    val finalProps  = JSProps(key, if (ref != null) ref else js.undefined, props).asInstanceOf[js.Dynamic]
    val fragmentNames = container.getFragmentNames()
    fragmentNames.foreach(s => finalProps.updateDynamic(s)(null))
    React.createElement(
      container, finalProps,
      children: _*).asInstanceOf[ReactElementU[_, _]]
  }

}
