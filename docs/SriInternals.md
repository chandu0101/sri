# Sri Internals

The main goal of Sri is to be in line with React as much as possible. Currently Sri contains 5 main modules: core, addons, universal, web, mobile.


## Core

This module is a scala.js wrapper for original React [core](https://github.com/facebook/react) (no dom/react-native). Use this module if you're creating wrappers for other renderers (react-art, react-canvas etc).

It contains core React API facade and type safe wrapper for react ES6 components. 


## Universal

This module is specific to Sri. When developing web and mobile apps, use this module as a dependency for shared code.
     
It contains components and api's that work both on mobile (ios and android) and web. To be more specific, these are react-native components and apis that both work ios and android (web version is backed by https://github.com/taobaofed/react-web).
     
    
## Web 
     
This module is a scala.js wrapper for `react-dom`. Use this module to develop web/browser based apps.

## Mobile

This module is a scala.js wrapper for [react-native](https://facebook.github.io/react-native/). Use this module to develop mobile apps.

## Addons

Scala.js wrappers for react-addons-*

