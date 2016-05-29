# sri

[![Join the chat at https://gitter.im/chandu0101/sri](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/chandu0101/sri?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Sri (Scala React interface) is a scalajs library to build truly native cross platform (mobile (ios and android) and web) applications. It is based on [reactjs](http://facebook.github.io/react/) and [react-native](https://facebook.github.io/react-native/), so you must be familiar with them in order to use this library.


![sri](/docs/sri.png)

![moviesapp](/docs/moviesapp.gif)

# Index
- [Mobile](#mobile)
- [Web](#web)
- [Relay](#relay)
- [Documentation](#documentation)
- [Examples](#examples)
- [Templates](#templates)

#Mobile
Use this module to build iOS/Android mobile applications:

```scala
libraryDependencies += "com.github.chandu0101.sri" %%% "mobile" % "0.5.0"
```

#Web
Use this module to build browser based applications:

```scala
libraryDependencies += "com.github.chandu0101.sri" %%% "web" % "0.5.0"
```

#Relay
Use this module to add relay support to your applications:
```scala
libraryDependencies += "com.github.chandu0101.sri" %%% "relay" % "0.5.0"
```
#Documentation
 - [Sri Internals](/docs/SriInternals.md)
 - [Defining Components](/docs/DefiningComponents.md)
 - [Functions as Stateless Components](/docs/StatelessFunctionComponents.md)
 - [Pure Components](/docs/PureComponents.md)
 - [Creating Elements](/docs/CreatingElements.md)
 - [Refs To Components](/docs/RefsToComponents.md)
 - [DOM dsl](/docs/DOMDSL.md)
 - [Universal Styles](/docs/UniversalStyles.md)
 - [Universal Router](/docs/UniversalRouter.md)
 - [Web Router](/docs/WebRouter.md)
 - [Interop With Third Party Components](/docs/InteropWithThirdParty.md)
 - [Known Issues](/docs/KnownIssues.md)
 
#Examples
  - [Mobile Examples](/mobile-examples)
  - [Web Examples](/web-examples)
  - [Relay Web Examples](/relay-web-examples)
  - [Sri Diode Example](https://github.com/chandu0101/sri-diode-example)
  - [Sangria-Graphql Example](https://github.com/chandu0101/sri-sangria-example)

#Templates
  - [Mobile App(iOS and Android) Template](https://github.com/chandu0101/sri-mobile-template)
  - [Web App Template](https://github.com/chandu0101/sri-web-template)
  - [Web MaterialUI Template](https://github.com/chandu0101/sri-web-materialui-template)
