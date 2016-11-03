package sri.core

import scala.scalajs.js
import scala.scalajs.js.ConstructorTag

trait ElementFactoryLegacy {
  /**
    * add types to js constructor
    */
  @deprecated("Use getTypedConstructor[Component]", "0.6.0")
  def getTypedConstructor[P, S](ctor: js.Dynamic, clz: Class[_ <: ReactComponent[P, S]]) = {
    ctor.asInstanceOf[ReactTypedConstructor[P, S]]
  }

  /**
    * helper method to create ReactElements for components with props
    */
  @deprecated("Use makeElement[Component](props)", "0.6.0")
  def createElement[P, S](ctor: ReactTypedConstructor[P, S],
                          props: P,
                          key: js.UndefOr[String] = js.undefined,
                          ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                         ) = createElementWithChildren(ctor, props, key, ref)()

  /**
    * helper method to create ReactElements for components with no props
    */
  @deprecated("Use makeElementNoProps[Component]", "0.6.0")
  def createElementNoProps[P, S](ctor: ReactTypedConstructor[P, S],
                                 key: js.UndefOr[String] = js.undefined,
                                 ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                ) = createElementNoPropsWithChildren(ctor, key, ref)()

  /**
    * helper method to create ReactElements for components with props  and children
    */
  @deprecated("Use makeElementWithChildren[Component](props)", "0.6.0")
  def createElementWithChildren[P, S](ctor: ReactTypedConstructor[P, S],
                                      props: P,
                                      key: js.UndefOr[String] = js.undefined,
                                      ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                     )(children: ReactNode*): ReactElementU[P, S] =
    React.createElement(ctor, JSProps(key, if (ref != null) ref else js.undefined, props), children: _*).asInstanceOf[ReactElementU[P, S]]

  /**
    * helper method to create ReactElements for components with no props and children
    */
  @deprecated("Use makeElementNoPropsWithChildren[Component]()", "0.6.0")
  def createElementNoPropsWithChildren[P, S](ctor: ReactTypedConstructor[P, S],
                                             key: js.UndefOr[String] = js.undefined,
                                             ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                            )(children: ReactNode*): ReactElementU[P, S] =
    React.createElement(ctor, JSProps(key, if (ref != null) ref else js.undefined, ()), children: _*).asInstanceOf[ReactElementU[P, S]]
}

trait ElementFactory {
  /**
    * add types to js constructor
    */
  def getTypedConstructor[C <: ReactComponentBase : ConstructorTag] =
    js.constructorTag[C].constructor.asInstanceOf[ReactTypedConstructor[C#Props, C#State]]

  /**
    * helper method to create ReactElements for components with props
    */
  def makeElement[C <: ReactComponentBase : ConstructorTag](
                                                             props: C#Props,
                                                             key: js.UndefOr[String] = js.undefined,
                                                             ref: js.Function1[C, Unit] = null
                                                           ) = makeElementWithChildren[C](props, key, ref)()

  /**
    * helper method to create ReactElements for components with no props
    */
  def makeElement[C <: ReactComponentBase { type Props = Unit } : ConstructorTag] =
    makeElementNoPropsWithChildren[C]()()


  /**
    * helper method to create ReactElements for components with no props
    */
  def makeElementNoProps[C <: ReactComponentBase { type Props = Unit } : ConstructorTag](
                                                                                          key: js.UndefOr[String] = js.undefined,
                                                                                          ref: js.Function1[C, Unit] = null
                                                                                        ) = makeElementNoPropsWithChildren(key, ref)()

  /**
    * helper method to create ReactElements for components with props and children
    */
  def makeElementWithChildren[C <: ReactComponentBase : ConstructorTag](
                                                                         props: C#Props,
                                                                         key: js.UndefOr[String] = js.undefined,
                                                                         ref: js.Function1[C, Unit] = null
                                                                       )(children: ReactNode*): ReactElementU[C#Props, C#State] =
    React.createElement(js.constructorTag[C].constructor, JSProps(key, if (ref != null) ref else js.undefined, props), children: _*).asInstanceOf[ReactElementU[C#Props, C#State]]

  /**
    * helper method to create ReactElements for components with no props and children
    */
  def makeElementNoPropsWithChildren[C <: ReactComponentBase : ConstructorTag](
                                                                                key: js.UndefOr[String] = js.undefined,
                                                                                ref: js.Function1[C, Unit] = null
                                                                              )(children: ReactNode*): ReactElementU[C#Props, C#State] =
    React.createElement(js.constructorTag[C].constructor, JSProps(key, if (ref != null) ref else js.undefined, ()), children: _*)
      .asInstanceOf[ReactElementU[C#Props, C#State]]

  def createStatelessFunctionElement[P](func: P => ReactElement, props: P, key: js.UndefOr[String] = js.undefined) = {
    React.createElement((jsp: JSProps[P]) => func(jsp.sprops), JSProps(key = key, sprops = props))
  }

  def createStatelessFunctionElementNoProps(func: () => ReactElement, key: js.UndefOr[String] = js.undefined) = {
    React.createElement((jsp: JSProps[_]) => func(), JSProps(key = key, sprops = null))
  }

  def createStatelessFunctionElementWithChildren[P](func: (P, ReactElement) => ReactElement, props: P, key: js.UndefOr[String] = js.undefined)(children: ReactNode*) = {
    React.createElement((jsp: JSProps[P]) => func(jsp.sprops, jsp.children), JSProps(key = key, sprops = props), children: _*)
  }

  def createStatelessFunctionElementNoPropsWithChildren(func: ReactElement => ReactElement, key: js.UndefOr[String] = js.undefined)(children: ReactNode*) = {
    React.createElement((jsp: JSProps[_]) => func(jsp.children), JSProps(key = key, sprops = null), children: _*)
  }

  /**
    * use this method when you want  js.Object as props
    */
  def createStatelessFunctionElementJS[P <: ReactJSProps](func: P => ReactElement, props: P) = {
    React.createElement(func, props)
  }

  /**
    * use this method when you want  js.Object as props
    */
  def createStatelessFunctionElementJSWithChildren[P <: ReactJSProps](func: P => ReactElement, props: P)(children: ReactNode*) = {
    React.createElement(func, props, children: _*)
  }


}

object ElementFactory extends ElementFactory with ElementFactoryLegacy