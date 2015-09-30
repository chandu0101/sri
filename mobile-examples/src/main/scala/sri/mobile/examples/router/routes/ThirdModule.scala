package sri.mobile.examples.router.routes

import sri.mobile.examples.router.components.{ThirdModuleSecondScreen, ThirdModuleHomeScreen}
import sri.mobile.router.{DynamicPage, StaticPage, MobileRouterModuleConfig}


object ThirdModule extends MobileRouterModuleConfig{

  object Home extends StaticPage

  object Second extends StaticPage


  staticRoute(Home,"Third Module Home",ThirdModuleHomeScreen())
  staticRoute(Second,"Third Module Second",ThirdModuleSecondScreen())

}
