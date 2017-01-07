# UniversalRouter

Universal router works on both platforms (web and ios).

##### Defining Pages
  Even though the router gives a feel of switching between different pages, at the core they are just react components mounting and unmounting. A component can be Static (which doesn't take any props from the parent) or Dynamic (which takes props from the parent). We'll use same idea to define our pages.
  
```scala
object HomePage extends StaticPage
object AboutPage extends StaticPage
object UserDetailsPage extends DynamicPage[User]
```

##### Defining Routes
Now let's define routes/configs for pages defined above. We will use  `UniversalRouterConfig` trait for this.

```scala
object config extends UniversalRouterConfig {
    override val initialRoute = defineInitialRoute(HomePage, "Home", HomeComponent())

    staticRoute(AboutPage, "About", AboutComponent())

    dynamicRoute(UserDetailsPage, (u: User) => UserDetailsCOmponent(u))

    override val notFound: (StaticPage, NavigatorRoute) = initialRoute

    override def renderScene(route: NavigatorRoute,ctrl: UniversalRouterCtrl): ReactElement = {
      View(style = MobileStyleSheet.wholeContainer)(
        DefaultNavigationBar(route),
        super.renderScene(route)
      )
    }
}
```

please check source code of [UniversalRouterConfig](universal/src/main/scala/sri/universal/router/UniversalRouterConfig.scala) for more information.

#### Accessing `RouterControl`

If you closely observe the `renderScene` method, there is no control available to pass down to children. Yeah, its tedious task to pass down to each children which is a constant for a router. Therefore, the `RouterControl` object is stored in [react context](http://facebook.github.io/react/docs/context.html). Now, all children component can access the router control instance from the context. Universal Router comes with a helper class `UniversalRouterComponent`. If you want the router features in any react component, just extend `UniversalRouterComponent` instead of `ReactComponent`

Example :

```scala

  @ScalaJSDefined
  class Component extends UniversalRouterComponent[js.Dynamic, Unit] {
    def render() = {
      View()(
        TouchableHighlight(key = "th", onPress = () => navigateTo(AboutPage))(Text()("Go to About Page")),
        TouchableHighlight(key = "th", onPress = () => navigateTo(UserDetailsPage,props.user,props.user.name))(Text()(s"Go to User ${props.user.name} "))
      )
    }
  }

  // please note that you must define contextTypes on component. Once scalajs support [static fields](https://github.com/scala-js/scala-js/issues/1902),  we can move this logic to `UniversalRouterComponent`
  js.constructorOf[Component].contextTypes = router.routerContextTypes

```



## Examples 
[RouterExampleApp.scala](https://github.com/chandu0101/sri/blob/master/mobile-examples/src/main/scala/sri/mobile/examples/router/RouterExampleApp.scala)

[MoviesApp.scala](https://github.com/chandu0101/sri/blob/master/mobile-examples/src/main/scala/sri/mobile/examples/movies/MoviesApp.scala)

[UIExplorerApp.scala](https://github.com/chandu0101/sri/blob/master/mobile-examples/src/main/scala/sri/mobile/examples/uiexplorer/UIExplorerApp.scala)

