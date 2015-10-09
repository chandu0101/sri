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
  def getComponentConstructor[C <: ReactComponent[_, _]](ctor: js.Dynamic, clz: Class[C]) = {
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
    val finalProps  = props.asInstanceOf[js.Dynamic]
     key.foreach(v => finalProps.updateDynamic("key")(v))
    if(ref != null ) finalProps.updateDynamic("ref")(ref)
    React.createElement(
      container, finalProps,
      children: _*).asInstanceOf[ReactElementU[_, _]]
  }

}
