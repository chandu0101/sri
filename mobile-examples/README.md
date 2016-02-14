# Mobile Examples

# React Native Playground

```scala

// in root(sri)

 sbt ~fastOptMobile (DEV mode)
   
   or
   
 sbt ~fullOptMobile (Prod Mode)

 // this will generate index.ios.js and index.android.js files
 
```

1) go to https://rnplay.org/ ->  Signin  -> NewApp -> name it as `SriMobile`

2) Replace content of index.io.js and index.android.js files with content from files that are generated using sbt ~fullOptMobile


# Simulator/Device 

-> Install Node.js 4.0 or greater using [nvm](https://github.com/creationix/nvm#installation)

```
//root(sri) directory
sbt ~fullOptMobile
//open new  terminal
cd mobile-examples
npm install
npm start
```

## Mac

-> `brew install watchman`

-> `npm install -g react-native-cli`

#####  iOS

`react-native run-ios`

or

Open  `mobile-examples/ios/SriMobile.xcodeproj` in xcode(> 6.3) and hit the run button

##### Android
Follow this guide : https://facebook.github.io/react-native/docs/android-setup.html

in mobile-examples folder run `react-native run-android`

## Windows and Linux

http://suyogkc.com.np/react-native-for-windowslinux/
