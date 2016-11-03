# Interop With Third Party Components

If you want to use a reactjs component in your scalajs-react project then you must define a wrapper for js component.

## Example
 Let say we have a JS component , Name : AwesomeJSComp , props ..
 ```js
   propTypes: {
     numberOfLines: React.PropTypes.number.isRequired,
     onPress: React.PropTypes.func, // function with zero args
     suppressHighlighting: React.PropTypes.bool,
     testID: React.PropTypes.string,
   }

   ```
 To create a wrapper first we must map js types to scala types

 ```scala
   numberOfLines: Int,
   onPress: js.UndefOr[() => Unit] = js.undefined,
   suppressHighlighting: js.UndefOr[Bool] = js.undefined,
   testID: js.UndefOr[String] = js.undefined
 ```
 make sure you have js.UndefOr[T]  for non required  fields.we also need a method which converts our scala fields to js.Object

 ```scala
  def toJS = {
   val p = js.Dynamic.literal()
   p.updateDynamic("numberOfLines")(numberOfLines)
   onPress.foreach(v => p.updateDynamic("onPress")(v))
   suppressHighlighting.foreach(v => p.updateDynamic("suppressHighlighting")(v))
   testID.foreach(v => p.updateDynamic("testID")(v))
   p
  }

 ```

 that's it, now we have all required bits , just composing bits is pending.lets do that

 ```scala

 case class AwesomeJSCompWrapper( numberOfLines: Int,
                                   onPress: js.UndefOr[() => Unit] = js.undefined,
                                   suppressHighlighting: js.UndefOr[Bool] = js.undefined,
                                   testID: js.UndefOr[String] = js.undefined) {
   def toJS = {
     val p = js.Dynamic.literal()
     p.updateDynamic("numberOfLines")(numberOfLines)
     onPress.foreach(v => p.updateDynamic("onPress")(v))
     suppressHighlighting.foreach(v => p.updateDynamic("suppressHighlighting")(v))
     testID.foreach(v => p.updateDynamic("testID")(v))
     p
    }

    def apply(children : ReactNode*) = {
     val f = React.createFactory(js.Dynamic.Global.AwesomeJSComp) // access real js component , make sure you wrap with createFactory (this is needed from 0.13 onwards)
     f(toJS, children: _*)
    }

 }

 ```

 hola you successfully created wrapper! :)

 To use this add original js comp source to jsDependencies in sbt build file/or what ever build tool you use.

 now you can use AwesomeJSCmpWrapper like a normal  component

 ```scala
def render() = View(key= "1")(AwesomeJSCmpWrapper(numberOfLines = 3,testID = "id"))
  ```



## Refs

 Some times we may want to call public(exposed) methods of mounted react component's , we use refs to achieve this

 Lets assume that our AwesomeJSComp has public method hideMe()

 JS World :

 ```js
     // pseudo code
    <div>
     <AwesomeJSComp ref = "awesomecomp",..props > </AwesomeJSComp>
    </div>

    function test() {
     this.refs.awesomecomp.hideMe()
    }

 ```

 Scala World :

 To achieve same thing in scala world ,add a new field ref to our AwesomeJSCompWrapper and then create a facade
  for public methods of AwesomeJSComp

 ```scala
 trait AwesomeJSCompWrapperM extends js.Object {
   def hideMe() : Unit = js.native

   ... more public methods
 }
 ```
 scala example :
 ```scala
 object Parent {
  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = View(key = "4")(AwesomeJSCompWrapperM(ref = storeChildRef _))
    var childRef: AwesomeJSCompWrapperM = _
    def storeChildRef(cref: AwesomeJSCompWrapperM) = {
      childRef = cref // store reference to use later
      childRef.hideMe() // invoke actions
    }
  }
  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) =
    makeElementNoProps[Component](key = key, ref = ref)
}


 ```

##Real World Examples

https://github.com/chandu0101/sri/tree/master/universal/src/main/scala/sri/universal/components

https://github.com/chandu0101/sri/tree/master/mobile/src/main/scala/sri/mobile/components