# PureComponents

`React makes use of a virtual DOM, which is a descriptor of a DOM subtree rendered in the browser. This parallel representation allows React to avoid creating DOM nodes and accessing existing ones, which is slower than operations on JavaScript objects. When a component's props or state change, React decides whether an actual DOM update is necessary by constructing a new virtual DOM and comparing it to the old one. Only in the case they are not equal, will React reconcile the DOM, applying as few mutations as possible.

On top of this, React provides a component lifecycle function, shouldComponentUpdate, which is triggered before the re-rendering process starts (virtual DOM comparison and possible eventual DOM reconciliation), giving the developer the ability to short circuit this process.`

Sri comes with few helper classes that already have `shouldComponentUpdate` implemented.


##### ReactComponentPureRef[P `<:` AnyRef,S `<:` AnyRef]

Use this class when your component have immutable Props and State.It uses scala 'reference equality`(eq,ne) to check whether props/sate updated.

Example : 

```scala

case class Props(id : String)

case class State(count : Int)

class MyComponent extends ReactComponentPureRef[Props,State] {
 .....
}

```

##### ReactComponentPureRefP[P `<:` AnyRef]

Use this class when your component have immutable Props but no State.It uses scala 'reference equality`(eq,ne) to check whether props are updated or not.

Example :

```scala

case class Props(id : String)

class MyComponent extends ReactComponentPureRefP[Props] {
 .....
}

```

##### ReactComponentPureRefS[S `<:` AnyRef]

Use this class when your component have immutable State but no Props.It uses scala 'reference equality`(eq,ne) to check whether state is updated or not.

Example :

```scala

case class State(id : String)

class MyComponent extends ReactComponentPureRefS[State] {
 .....
}

```

##### ReactComponentPureValue[P,S]

Use this class when your component have value classes(Boolean,Int,Double ..) as Props and State.It uses scala 'value equality`(==,!=) to check whether props/sate updated.

Example :

```scala

class MyComponent extends ReactComponentPureValue[Int,Boolean] {
 .....
}

```

##### ReactComponentPureValueP[P]

Use this class when your component have value class(Boolean,Int,Double ..) as Props but no State.It uses scala 'value equality`(==,!=) to check whether props are updated or not.

Example :

```scala

class MyComponent extends ReactComponentPureValueP[Int] {
 .....
}

```

##### ReactComponentPureValueS[S]

Use this class when your component have value class(Boolean,Int,Double ..) as State but no Props.It uses scala 'value equality`(==,!=) to check whether state is updated or not.

Example :

```scala

class MyComponent extends ReactComponentPureValueS[Boolean] {
 .....
}

```

##### Note : 

For other use cases you can roll your own helpers 
 
```scala 
@ScalaJSDefined
abstract class MyCustomPureHelper[P, S] extends ReactComponent[P, S] {
  @JSName("sShouldComponentUpdate")
  override def shouldComponentUpdate(nextProps: => P, nextState: => S): Boolean = {
    // your custom logic to check props/state changed
  }
}

```

but ***Keep in mind that React will invoke this function pretty often, so the implementation has to be fast.***
