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
  def getRelayTypedConstructor[P <: RelayComponentProps,S](ctor: js.Dynamic, clz: Class[_ <: ReactComponentJS[P,S]]) = {
    ctor.asInstanceOf[RelayTypedConstructor[P,S]]
  }


  def createRelayElement[P <: RelayComponentProps,S](container: RelayContainer[P,S],
                               props: P
                                ) = createRelayElementWithChildren(container, props)()


  def createRelayElementWithChildren[P <: RelayComponentProps,S](container: => RelayContainer[P,S],
                                           props: P
                                            )(children: ReactNode*): ReactElementU[_, _] = {
    React.createElement(
      container, props,
      children: _*).asInstanceOf[ReactElementU[_, _]]
  }


}
