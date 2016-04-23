package sri

import sri.core.{React, ReactElementU, CoreAll}
import sri.universal.components.{ListViewDataSourceInput, ListViewDataSource}

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.Dynamic.{literal => json}

package object universal {

  trait UniversalAll extends CoreAll {

    lazy val isIOSPlatform: Boolean = !js.isUndefined(ReactUniversal.Platform) && ReactUniversal.Platform.OS == "ios"

    lazy val isAndroidPlatform: Boolean = !js.isUndefined(ReactUniversal.Platform) && ReactUniversal.Platform.OS == "android"

    lazy val isWebPlatform: Boolean = !js.isUndefined(ReactUniversal.Platform) && ReactUniversal.Platform.OS == "web"

    def createListViewDataSource[R, H](rowHasChanged: js.Function2[R, R, Boolean],
                                       sectionHeaderHasChanged: js.Function2[H, H, Boolean] = null,
                                       getRowData: js.Function3[_, String | Int, String | Int, _] = null,
                                       getSectionHeaderData: js.Function2[_, String | Int, _] = null
                                        ): ListViewDataSource[R, H] = {

      new ListViewDataSource[R, H](new ListViewDataSourceInput[R, H](rowHasChanged = rowHasChanged,
        sectionHeaderHasChanged = if (sectionHeaderHasChanged != null) sectionHeaderHasChanged else js.undefined,
        getRowData = if (getRowData != null) getRowData else js.undefined,
        getSectionHeaderData = if (getSectionHeaderData != null) getSectionHeaderData else js.undefined))
    }

    /**
     * use this method to create root component of sri.mobile, use the output to register..
     * @param rootComponent
     * @return
     */
    def createReactNativeRoot[P, S](rootComponent: => ReactElementU[P, S], name: String = "SriMobileApp") = {
      React.createClass(json(render = () => rootComponent, displayName = name))
    }

  }

  object all extends UniversalAll


}
