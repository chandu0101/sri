# Sri Internals

The main goal of Sri is inline with react as much as possible, currently sri contains 5 main modules core,universal,web,mobile,relay


# Core

This module is scala.js wrapper for original react core(no dom/ react-native) , use this module if you're creating wrappers for other renderer's (react-art,react-canvas etc)

It contains core React API facade and type safe wrapper for react ES6 components. 

# Universal

This module is specific to sri,when you developing web and mobile app then for shared folder use this module as dependency.
     
It contains components and api's that work both on mobile(ios and android) and web , to be more specific these are react-native components and apis that both work ios and android , web version is backed by https://github.com/KodersLab/react-native-for-web
     
    
# Web 
     
This module is scala.js wrapper for `react-dom` , use this module to develop web/browser based apps

Web module has no dom-dsl - [Why no DOM dsl](WhyNoDOMDSL.md) , but some basic building blocks are provided in universal module View,Text,TextInput,Image,Touchable*,ScrollView these are high level components built based on div,span,input,img,button (https://github.com/KodersLab/react-native-for-web) . I believe these primitives covers more than 80 % use cases in our web apps for rest of uses roll your own project specific high level/reusable component
      
# Mobile

This module is scala.js wrapper for `react-native`, use this module to develop mobile apps


# Relay

This module is scala.js wrapper for `react-relay` , use this module if you want to add relay magic to your react(web/mobile) app