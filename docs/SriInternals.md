# Sri Internals

The main goal of Sri is in line with React as much as possible. Currently Sri contains 7 main modules: core, addons, universal, web, mobile, desktop, and relay.


# Core

This module is a scala.js wrapper for original React core (no dom/react-native). Use this module if you're creating wrappers for other renderers (react-art, react-canvas etc).

It contains core React API facade and type safe wrapper for react ES6 components. 

# Universal

This module is specific to Sri. When developing web and mobile app, use this module as dependency for shared code.
     
It contains components and api's that work both on mobile (ios and android) and web. To be more specific, these are react-native components and apis that both work ios and android (web version is backed by https://github.com/KodersLab/react-native-for-web).
     
    
# Web 
     
This module is a scala.js wrapper for `react-dom`. Use this module to develop web/browser based apps.

Web module has no dom dsl (see [Why no DOM dsl](WhyNoDOMDSL.md)), but it includes some basic building blocks  provided in universal module: View, Text, TextInput, Image, Touchable*, ScrollView that are high level components built based on div, span, input, img, button (https://github.com/KodersLab/react-native-for-web). I believe these primitives covers more than 80% use cases in our web apps. For the rest of uses, roll your own project specific high level/reusable component.
      
# Mobile

This module is scala.js wrapper for `react-native`. Use this module to develop mobile apps.


# Relay

This module is scala.js wrapper for `react-relay`. Use this module if you want to add relay magic to your react (web/mobile) app.


# Desktop

This module is scala.js wrapper for [Electron](http://electron.atom.io/). Use this module to develop desktop apps.Check [examples](https://github.com/chandu0101/sri-desktop-examples) for more information


# Addons

Scala.js wrappers for react-addons-*

