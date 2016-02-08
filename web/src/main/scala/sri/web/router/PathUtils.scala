package sri.web.router

import sri.core._


trait PathUtils {

  def createStaticPath(path: String) = s"/${path.removeForwardSlashes}"

  def createDynamicPath(path: String) = s"/${path.removeForwardSlashes}/"

  def createStaticModulePath(basename: String, path: String) = if(path.nonEmpty && path != FORWARD_SLASH) s"/${basename.removeForwardSlashes}/${path.removeForwardSlashes}" else s"/${basename.removeForwardSlashes}"

  def createDynamicModulePath(basename: String, path: String) = if(path.removeForwardSlashes.nonEmpty) s"/${basename.removeForwardSlashes}/${path.removeForwardSlashes}/" else s"/${basename.removeForwardSlashes}/"
}
