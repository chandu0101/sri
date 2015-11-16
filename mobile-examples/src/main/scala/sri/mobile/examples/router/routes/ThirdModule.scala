package sri.mobile.examples.router.routes

import sri.mobile.examples.router.RouterExampleApp
import sri.mobile.examples.router.components.{ThirdModuleHomeScreen, ThirdModuleSecondScreen}
import sri.universal.router._


object ThirdModule extends UniversalRouterModuleConfig {

  object Home extends StaticPage

  object Second extends StaticPage

  staticRoute(Home, "Third Module Home", ThirdModuleHomeScreen(),rightButton = RouterExampleApp.sampleRightButton)
  staticRoute(Second, "Third Module Second", ThirdModuleSecondScreen(),rightButton = RouterExampleApp.sampleRightButton)

}
