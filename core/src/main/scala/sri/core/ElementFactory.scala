package sri.core

import scala.scalajs.js

trait ElementFactory {

  /**
   * creates and returns factory for given component constructor
   * @param ctor
   * @param clz
   * @tparam P
   * @tparam S
   * @return
   */
  def getComponentFactory[P, S](ctor: js.Dynamic, clz: Class[_ <: ReactJSComponent[P, S]]) = {
    React.createFactory(ctor).asInstanceOf[ReactComponentFactory[P, S]]
  }



  def getStatelessFactory[P](fn: js.Function1[P, ReactElement]) = React.createFactory((props: JSProps[P]) => fn(props.sprops)).asInstanceOf[ReactComponentFactory[P, _]]

  /**
   * helper method to create ReactElements for components with props
   * @param factory component factory created using  getComponentFactory method
   * @param props props of react component
   * @param key
   * @param ref
   * @tparam P
   * @tparam S
   * @return
   */
  def createElement[P, S](factory: ReactComponentFactory[P, S],
                          props: P,
                          key: js.UndefOr[String] = js.undefined,
                          ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                           ) = createElementWithChildren(factory, props, key, ref)()


  /**
   * helper method to create ReactElements for components with no props
   * @param factory component factory created using  getComponentFactory method
   * @param key
   * @param ref
   * @tparam P
   * @tparam S
   * @return
   */
  def createElementNoProps[P, S](factory: => ReactComponentFactory[P, S],
                                 key: js.UndefOr[String] = js.undefined,
                                 ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                  ) = createElementNoPropsWithChildren(factory, key, ref)()

  /**
   * helper method to create ReactElements for components with props  and children
   * @param factory component factory created using  getComponentFactory method
   * @param props
   * @param key
   * @param ref
   * @param children
   * @tparam P
   * @tparam S
   * @return
   */
  def createElementWithChildren[P, S](factory: => ReactComponentFactory[P, S],
                                      props: P,
                                      key: js.UndefOr[String] = js.undefined,
                                      ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                       )(children: ReactNode*): ReactElementU[P, S] =
    factory(
      JSProps(key, if (ref != null) ref else js.undefined, props),
      children: _*)


  /**
   * helper method to create ReactElements for components with no props and children
   * @param factory component factory created using  getComponentFactory method
   * @param key
   * @param ref
   * @param children
   * @tparam P
   * @tparam S
   * @return
   */
  def createElementNoPropsWithChildren[P, S](factory: ReactComponentFactory[P, S],
                                             key: js.UndefOr[String] = js.undefined,
                                             ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                              )(children: ReactNode*): ReactElementU[P, S] =
    factory(
      JSProps(key, if (ref != null) ref else js.undefined, ()),
      children: _*)


}

object ElementFactory extends ElementFactory