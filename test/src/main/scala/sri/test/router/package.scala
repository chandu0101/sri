package sri.test

import sri.web.router.{History, HistoryOptions}

import scala.scalajs.js

package object router {

  def memoryHistory(options: js.UndefOr[HistoryOptions] = js.undefined) = if (options.isDefined && options.get.basename.isDefined) History.useQueries(History.useBasename(History.createHashHistory))(options)
  else History.useQueries(History.createMemoryHistory)(options)
}
