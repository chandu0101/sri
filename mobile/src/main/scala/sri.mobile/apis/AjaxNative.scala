package sri.mobile.apis

import org.scalajs.dom
import org.scalajs.dom.Blob
import org.scalajs.dom.ext.AjaxException

import scala.concurrent.{Future, Promise}
import scala.scalajs.js
import scala.scalajs.js.typedarray.ArrayBufferView

//TODO remove this once this merged and published : https://github.com/scala-js/scala-js-dom/pull/151
/**
 * Wraps an XMLHttpRequest to provide an easy one-line way of making
 * an Ajax call, returning a Future.
 */
object AjaxNative {
  /**
   * Supported data formats for Ajax are implicitly converted to InputData
   */
  @js.native
  sealed trait InputData extends js.Any

  object InputData {
    implicit def str2ajax(s: String): InputData = s.asInstanceOf[InputData]

    implicit def arrayBufferView2ajax(b: ArrayBufferView): InputData = b.asInstanceOf[InputData]

    implicit def blob2ajax(b: Blob): InputData = b.asInstanceOf[InputData]

//    implicit def byteBuffer2ajax(data: ByteBuffer): InputData = {
//      if (data.hasTypedArray()) {
//        // get relevant part of the underlying typed array
//        data.typedArray().subarray(data.position, data.limit)
//      } else {
//        // fall back to copying the data
//        val tempBuffer = ByteBuffer.allocateDirect(data.remaining)
//        val origPosition = data.position
//        tempBuffer.put(data)
//        data.position(origPosition)
//        tempBuffer.typedArray()
//      }
//    }
  }

  def get(url: String,
          data: InputData = null,
          timeout: Int = 0,
          headers: Map[String, String] = Map.empty,
          withCredentials: Boolean = false,
          responseType: String = "") = {
    apply("GET", url, data, timeout, headers, withCredentials, responseType)
  }

  def post(url: String,
           data: InputData = null,
           timeout: Int = 0,
           headers: Map[String, String] = Map.empty,
           withCredentials: Boolean = false,
           responseType: String = "") = {
    apply("POST", url, data, timeout, headers, withCredentials, responseType)
  }

  def put(url: String,
          data: InputData = null,
          timeout: Int = 0,
          headers: Map[String, String] = Map.empty,
          withCredentials: Boolean = false,
          responseType: String = "") = {
    apply("PUT", url, data, timeout, headers, withCredentials, responseType)
  }

  def delete(url: String,
             data: InputData = null,
             timeout: Int = 0,
             headers: Map[String, String] = Map.empty,
             withCredentials: Boolean = false,
             responseType: String = "") = {
    apply("DELETE", url, data, timeout, headers, withCredentials, responseType)
  }

  def apply(method: String,
            url: String,
            data: InputData,
            timeout: Int,
            headers: Map[String, String],
            withCredentials: Boolean,
            responseType: String): Future[dom.XMLHttpRequest] = {
    val req = new dom.XMLHttpRequest()
    val promise = Promise[dom.XMLHttpRequest]()

    req.onreadystatechange = {(e: dom.Event) =>
      if (req.readyState.toInt == 4){
        if ((req.status >= 200 && req.status < 300) || req.status == 304)
          promise.success(req)
        else
          promise.failure(AjaxException(req))
      }
    }
    req.open(method, url)
    req.responseType = responseType
    req.timeout = timeout
    req.withCredentials = withCredentials
    headers.foreach(x => req.setRequestHeader(x._1, x._2))
    req.send(data)
    promise.future
  }
}
