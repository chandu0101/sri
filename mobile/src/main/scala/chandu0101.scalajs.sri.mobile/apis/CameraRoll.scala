package chandu0101.scalajs.sri.mobile.apis

import scala.scalajs.js

trait CameraRoll extends js.Object{

  def saveImageWithTag(tag :String,successCallback : js.Function,errorCallback : js.Function):Unit = js.native
  def getPhotos(params : js.Object,callback : js.Function,errorCallback : js.Function):Unit = js.native

}
