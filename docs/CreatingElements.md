# Creating Elements 

We cannot directly use component classes to construct `ReactElement`s, because (from React documentation): 

>We can't just create an instance of the class using the constructor and use that as an element because a single element can be inserted into the DOM in several places. We need to create an instance of that class for each insertion point of the element. This is why elements are not instances of the class.

[New React Element Factories and JSX](https://gist.github.com/sebmarkbage/d7bce729f38730399d28)

React uses [JSX](https://facebook.github.io/react/docs/jsx-in-depth.html) to create elements from component classes. Since we can't use JSX,  we (all third party langs that compile to JS and interface with react) need a different approach here.

Sri comes with a few helpers methods to achieve this.  [ElementFactory](https://github.com/chandu0101/sri/blob/master/core/src/main/scala/sri/core/ElementFactory.scala)

## Examples


#### Component with No Props 


```scala

// 1) using companion object

@ScalaJSDefined
class HelloMessage extends ReactComponent[Unit, Unit] {
  def render() = {
    View(...view_props)("Hello Sri")
  }
}

object HelloMessage {
  def apply() = makeElementNoProps[HelloMessage]()
  or
  def apply() = makeElement[HelloMessage]
}


or

// 2) enclosing component in a singleton
object HelloMessage {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      View(...view_props)("Hello Sri")
    }
  }

  def apply() = makeElementNoProps[Component]()
  or
  def apply() = makeElement[Component]
}


//usage
HelloMessage()

//both 1&2 results same,choose whatever you like. I'll be using (2) in rest of the examples.

```

#### Component with No Props and with Children


```scala

object HelloMessage {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      View(...view_props)("Hello Sri", children)
    }
  }

  def apply(children: ReactNode*) = makeElementNoPropsWithChildren[Component]()(children: _*)

}

```

#### Component with No Props and with Key/Ref


```scala

object HelloMessage {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      View(...view_props)("Hello Sri")
    }
  }

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)

}

```

#### Component with No Props and with Key/Ref,Children


```scala

object HelloMessage {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit,Unit] {
    def render() = {
      View(...view_props)("Hello Sri",children)
    }
  }

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null)(children: ReactNode*) = makeElementNoPropsWithChildren[Component](key = key, ref = ref)(children: _*)

}

```

#### Component with Props 


```scala

object HelloMessage {

  case class Props(name: String)

  @ScalaJSDefined
  class Component extends ReactComponent[Props,Unit] {
    def render() = {
      View(...view_props)(s"Hello ${props.name}")
    }
  }

  def apply(name: String) = makeElement[Component](Props(name)

}


```

#### Component with  Props and Children


```scala

object HelloMessage {

  case class Props(name: String)

  @ScalaJSDefined
  class Component extends ReactComponent[Props,Unit] {
    def render() = {
      View(...view_props)(s"Hello ${props.name}",children)
    }
  }

  def apply(name: String)(children: ReactNode*) = makeElementWithChildren[Component](Props(name))(children: _*)

}

```

#### Component with  Props and  Key/Ref


```scala

object HelloMessage {

  case class Props(name: String)

  @ScalaJSDefined
  class Component extends ReactComponent[Props,Unit] {
    def render() = {
      View(...view_props)(s"Hello ${props.name}")
    }
  }

  def apply(name: String,key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElement[Component](Props(name),key = key, ref = ref)

}

```

#### Component with Props and  Key/Ref,Children


```scala

object HelloMessage {

  case class Props(name: String)

  @ScalaJSDefined
  class Component extends ReactComponent[Props,Unit] {
    def render() = {
      View(...view_props)(s"Hello ${props.name}",children)
    }
  }

  def apply(name: String,key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null)(children: ReactNode*) = makeElementWithChildren[Component](Props(name),key = key, ref = ref)(children: _*)

}

```


